package typings.fhir.r4bMod

import typings.fhir.fhirStrings.`all-or-none`
import typings.fhir.fhirStrings.`at-most-one`
import typings.fhir.fhirStrings.`exactly-one`
import typings.fhir.fhirStrings.`logical-group`
import typings.fhir.fhirStrings.`must-unless-documented`
import typings.fhir.fhirStrings.`one-or-more`
import typings.fhir.fhirStrings.`sentence-group`
import typings.fhir.fhirStrings.`visual-group`
import typings.fhir.fhirStrings.all
import typings.fhir.fhirStrings.any
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.could
import typings.fhir.fhirStrings.multiple
import typings.fhir.fhirStrings.must
import typings.fhir.fhirStrings.no
import typings.fhir.fhirStrings.routine
import typings.fhir.fhirStrings.single
import typings.fhir.fhirStrings.stat
import typings.fhir.fhirStrings.urgent
import typings.fhir.fhirStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionAction
  extends StObject
     with BackboneElement {
  
  var _cardinalityBehavior: js.UndefOr[Element] = js.undefined
  
  var _definitionCanonical: js.UndefOr[Element] = js.undefined
  
  var _definitionUri: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _goalId: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _groupingBehavior: js.UndefOr[Element] = js.undefined
  
  var _precheckBehavior: js.UndefOr[Element] = js.undefined
  
  var _prefix: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _requiredBehavior: js.UndefOr[Element] = js.undefined
  
  var _selectionBehavior: js.UndefOr[Element] = js.undefined
  
  var _subjectCanonical: js.UndefOr[Element] = js.undefined
  
  var _textEquivalent: js.UndefOr[Element] = js.undefined
  
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _transform: js.UndefOr[Element] = js.undefined
  
  /**
    * Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
    */
  var action: js.UndefOr[js.Array[PlanDefinitionAction]] = js.undefined
  
  /**
    * Defines whether the action can be selected multiple times.
    */
  var cardinalityBehavior: js.UndefOr[single | multiple] = js.undefined
  
  /**
    * A code that provides a meaning, grouping, or classification for the action or action group. For example, a section may have a LOINC code for the section of a documentation template. In pharmaceutical quality, an action (Test) such as pH could be classified as a physical property.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * When multiple conditions of the same kind are present, the effects are combined using AND semantics, so the overall condition is true only if all the conditions are true.
    */
  var condition: js.UndefOr[js.Array[PlanDefinitionActionCondition]] = js.undefined
  
  /**
    * Note that the definition is optional, and if no definition is specified, a dynamicValue with a root ($this) path can be used to define the entire resource dynamically.
    */
  var definitionCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Note that the definition is optional, and if no definition is specified, a dynamicValue with a root ($this) path can be used to define the entire resource dynamically.
    */
  var definitionUri: js.UndefOr[String] = js.undefined
  
  /**
    * A brief description of the action used to provide a summary to display to the user.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * Dynamic values are applied in the order in which they are defined in the PlanDefinition resource. Note that when dynamic values are also specified by a referenced ActivityDefinition, the dynamicValues from the ActivityDefinition are applied first, followed by the dynamicValues specified here. In addition, if both a transform and dynamic values are specific, the dynamic values are applied to the result of the transform.
    */
  var dynamicValue: js.UndefOr[js.Array[PlanDefinitionActionDynamicValue]] = js.undefined
  
  /**
    * Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition. In pharmaceutical quality, a goal represents acceptance criteria (Goal) for a given action (Test), so the goalId would be the unique id of a defined goal element establishing the acceptance criteria for the action.
    */
  var goalId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Defines the grouping behavior for the action and its children.
    */
  var groupingBehavior: js.UndefOr[`visual-group` | `logical-group` | `sentence-group`] = js.undefined
  
  /**
    * Defines input data requirements for the action.
    */
  var input: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  
  /**
    * Defines the outputs of the action, if any.
    */
  var output: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  
  /**
    * Indicates who should participate in performing the action described.
    */
  var participant: js.UndefOr[js.Array[PlanDefinitionActionParticipant]] = js.undefined
  
  /**
    * Defines whether the action should usually be preselected.
    */
  var precheckBehavior: js.UndefOr[yes | no] = js.undefined
  
  /**
    * A user-visible prefix for the action.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates how quickly the action should be addressed with respect to other actions.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * This is different than the clinical evidence documentation, it's an actual business description of the reason for performing the action.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * When an action depends on multiple actions, the meaning is that all actions are dependencies, rather than that any of the actions are a dependency.
    */
  var relatedAction: js.UndefOr[js.Array[PlanDefinitionActionRelatedAction]] = js.undefined
  
  /**
    * Defines the required behavior for the action.
    */
  var requiredBehavior: js.UndefOr[must | could | `must-unless-documented`] = js.undefined
  
  /**
    * Defines the selection behavior for the action and its children.
    */
  var selectionBehavior: js.UndefOr[any | all | `all-or-none` | `exactly-one` | `at-most-one` | `one-or-more`] = js.undefined
  
  /**
    * The subject of an action overrides the subject at a parent action or on the root of the PlanDefinition if specified.
    * In addition, because the subject needs to be resolved during realization, use of subjects in actions (or in the ActivityDefinition referenced by the action) resolves based on the set of subjects supplied in context and by type (i.e. the patient subject would resolve to a resource of type Patient).
    */
  var subjectCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * The subject of an action overrides the subject at a parent action or on the root of the PlanDefinition if specified.
    * In addition, because the subject needs to be resolved during realization, use of subjects in actions (or in the ActivityDefinition referenced by the action) resolves based on the set of subjects supplied in context and by type (i.e. the patient subject would resolve to a resource of type Patient).
    */
  var subjectCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The subject of an action overrides the subject at a parent action or on the root of the PlanDefinition if specified.
    * In addition, because the subject needs to be resolved during realization, use of subjects in actions (or in the ActivityDefinition referenced by the action) resolves based on the set of subjects supplied in context and by type (i.e. the patient subject would resolve to a resource of type Patient).
    */
  var subjectReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that might not be capable of interpreting it dynamically.
    */
  var textEquivalent: js.UndefOr[String] = js.undefined
  
  /**
    * An optional value describing when the action should be performed.
    */
  var timingAge: js.UndefOr[Age] = js.undefined
  
  /**
    * An optional value describing when the action should be performed.
    */
  var timingDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * An optional value describing when the action should be performed.
    */
  var timingDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * An optional value describing when the action should be performed.
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * An optional value describing when the action should be performed.
    */
  var timingRange: js.UndefOr[Range] = js.undefined
  
  /**
    * An optional value describing when the action should be performed.
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The textual description of the action displayed to a user. For example, when the action is a test to be performed, the title would be the title of the test such as Assay by HPLC.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Note that when a referenced ActivityDefinition also defines a transform, the transform specified here generally takes precedence. In addition, if both a transform and dynamic values are specific, the dynamic values are applied to the result of the transform.
    */
  var transform: js.UndefOr[String] = js.undefined
  
  /**
    * A description of when the action should be triggered.
    */
  var trigger: js.UndefOr[js.Array[TriggerDefinition]] = js.undefined
  
  /**
    * The type of action to perform (create, update, remove).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object PlanDefinitionAction {
  
  inline def apply(): PlanDefinitionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanDefinitionAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[PlanDefinitionAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: PlanDefinitionAction*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setCardinalityBehavior(value: single | multiple): Self = StObject.set(x, "cardinalityBehavior", value.asInstanceOf[js.Any])
    
    inline def setCardinalityBehaviorUndefined: Self = StObject.set(x, "cardinalityBehavior", js.undefined)
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setCondition(value: js.Array[PlanDefinitionActionCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: PlanDefinitionActionCondition*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setDefinitionCanonical(value: String): Self = StObject.set(x, "definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def setDefinitionCanonicalUndefined: Self = StObject.set(x, "definitionCanonical", js.undefined)
    
    inline def setDefinitionUri(value: String): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUriUndefined: Self = StObject.set(x, "definitionUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentation(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "documentation", js.Array(value*))
    
    inline def setDynamicValue(value: js.Array[PlanDefinitionActionDynamicValue]): Self = StObject.set(x, "dynamicValue", value.asInstanceOf[js.Any])
    
    inline def setDynamicValueUndefined: Self = StObject.set(x, "dynamicValue", js.undefined)
    
    inline def setDynamicValueVarargs(value: PlanDefinitionActionDynamicValue*): Self = StObject.set(x, "dynamicValue", js.Array(value*))
    
    inline def setGoalId(value: js.Array[String]): Self = StObject.set(x, "goalId", value.asInstanceOf[js.Any])
    
    inline def setGoalIdUndefined: Self = StObject.set(x, "goalId", js.undefined)
    
    inline def setGoalIdVarargs(value: String*): Self = StObject.set(x, "goalId", js.Array(value*))
    
    inline def setGroupingBehavior(value: `visual-group` | `logical-group` | `sentence-group`): Self = StObject.set(x, "groupingBehavior", value.asInstanceOf[js.Any])
    
    inline def setGroupingBehaviorUndefined: Self = StObject.set(x, "groupingBehavior", js.undefined)
    
    inline def setInput(value: js.Array[DataRequirement]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: DataRequirement*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setOutput(value: js.Array[DataRequirement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: DataRequirement*): Self = StObject.set(x, "output", js.Array(value*))
    
    inline def setParticipant(value: js.Array[PlanDefinitionActionParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: PlanDefinitionActionParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPrecheckBehavior(value: yes | no): Self = StObject.set(x, "precheckBehavior", value.asInstanceOf[js.Any])
    
    inline def setPrecheckBehaviorUndefined: Self = StObject.set(x, "precheckBehavior", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRelatedAction(value: js.Array[PlanDefinitionActionRelatedAction]): Self = StObject.set(x, "relatedAction", value.asInstanceOf[js.Any])
    
    inline def setRelatedActionUndefined: Self = StObject.set(x, "relatedAction", js.undefined)
    
    inline def setRelatedActionVarargs(value: PlanDefinitionActionRelatedAction*): Self = StObject.set(x, "relatedAction", js.Array(value*))
    
    inline def setRequiredBehavior(value: must | could | `must-unless-documented`): Self = StObject.set(x, "requiredBehavior", value.asInstanceOf[js.Any])
    
    inline def setRequiredBehaviorUndefined: Self = StObject.set(x, "requiredBehavior", js.undefined)
    
    inline def setSelectionBehavior(value: any | all | `all-or-none` | `exactly-one` | `at-most-one` | `one-or-more`): Self = StObject.set(x, "selectionBehavior", value.asInstanceOf[js.Any])
    
    inline def setSelectionBehaviorUndefined: Self = StObject.set(x, "selectionBehavior", js.undefined)
    
    inline def setSubjectCanonical(value: String): Self = StObject.set(x, "subjectCanonical", value.asInstanceOf[js.Any])
    
    inline def setSubjectCanonicalUndefined: Self = StObject.set(x, "subjectCanonical", js.undefined)
    
    inline def setSubjectCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "subjectCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSubjectCodeableConceptUndefined: Self = StObject.set(x, "subjectCodeableConcept", js.undefined)
    
    inline def setSubjectReference(value: Reference): Self = StObject.set(x, "subjectReference", value.asInstanceOf[js.Any])
    
    inline def setSubjectReferenceUndefined: Self = StObject.set(x, "subjectReference", js.undefined)
    
    inline def setTextEquivalent(value: String): Self = StObject.set(x, "textEquivalent", value.asInstanceOf[js.Any])
    
    inline def setTextEquivalentUndefined: Self = StObject.set(x, "textEquivalent", js.undefined)
    
    inline def setTimingAge(value: Age): Self = StObject.set(x, "timingAge", value.asInstanceOf[js.Any])
    
    inline def setTimingAgeUndefined: Self = StObject.set(x, "timingAge", js.undefined)
    
    inline def setTimingDateTime(value: String): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    inline def setTimingDuration(value: Duration): Self = StObject.set(x, "timingDuration", value.asInstanceOf[js.Any])
    
    inline def setTimingDurationUndefined: Self = StObject.set(x, "timingDuration", js.undefined)
    
    inline def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    inline def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    inline def setTimingRange(value: Range): Self = StObject.set(x, "timingRange", value.asInstanceOf[js.Any])
    
    inline def setTimingRangeUndefined: Self = StObject.set(x, "timingRange", js.undefined)
    
    inline def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    inline def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTrigger(value: js.Array[TriggerDefinition]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setTriggerVarargs(value: TriggerDefinition*): Self = StObject.set(x, "trigger", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_cardinalityBehavior(value: Element): Self = StObject.set(x, "_cardinalityBehavior", value.asInstanceOf[js.Any])
    
    inline def set_cardinalityBehaviorUndefined: Self = StObject.set(x, "_cardinalityBehavior", js.undefined)
    
    inline def set_definitionCanonical(value: Element): Self = StObject.set(x, "_definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def set_definitionCanonicalUndefined: Self = StObject.set(x, "_definitionCanonical", js.undefined)
    
    inline def set_definitionUri(value: Element): Self = StObject.set(x, "_definitionUri", value.asInstanceOf[js.Any])
    
    inline def set_definitionUriUndefined: Self = StObject.set(x, "_definitionUri", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_goalId(value: js.Array[Element]): Self = StObject.set(x, "_goalId", value.asInstanceOf[js.Any])
    
    inline def set_goalIdUndefined: Self = StObject.set(x, "_goalId", js.undefined)
    
    inline def set_goalIdVarargs(value: Element*): Self = StObject.set(x, "_goalId", js.Array(value*))
    
    inline def set_groupingBehavior(value: Element): Self = StObject.set(x, "_groupingBehavior", value.asInstanceOf[js.Any])
    
    inline def set_groupingBehaviorUndefined: Self = StObject.set(x, "_groupingBehavior", js.undefined)
    
    inline def set_precheckBehavior(value: Element): Self = StObject.set(x, "_precheckBehavior", value.asInstanceOf[js.Any])
    
    inline def set_precheckBehaviorUndefined: Self = StObject.set(x, "_precheckBehavior", js.undefined)
    
    inline def set_prefix(value: Element): Self = StObject.set(x, "_prefix", value.asInstanceOf[js.Any])
    
    inline def set_prefixUndefined: Self = StObject.set(x, "_prefix", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_requiredBehavior(value: Element): Self = StObject.set(x, "_requiredBehavior", value.asInstanceOf[js.Any])
    
    inline def set_requiredBehaviorUndefined: Self = StObject.set(x, "_requiredBehavior", js.undefined)
    
    inline def set_selectionBehavior(value: Element): Self = StObject.set(x, "_selectionBehavior", value.asInstanceOf[js.Any])
    
    inline def set_selectionBehaviorUndefined: Self = StObject.set(x, "_selectionBehavior", js.undefined)
    
    inline def set_subjectCanonical(value: Element): Self = StObject.set(x, "_subjectCanonical", value.asInstanceOf[js.Any])
    
    inline def set_subjectCanonicalUndefined: Self = StObject.set(x, "_subjectCanonical", js.undefined)
    
    inline def set_textEquivalent(value: Element): Self = StObject.set(x, "_textEquivalent", value.asInstanceOf[js.Any])
    
    inline def set_textEquivalentUndefined: Self = StObject.set(x, "_textEquivalent", js.undefined)
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_transform(value: Element): Self = StObject.set(x, "_transform", value.asInstanceOf[js.Any])
    
    inline def set_transformUndefined: Self = StObject.set(x, "_transform", js.undefined)
  }
}
