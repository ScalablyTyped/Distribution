package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Action defined by the plan
  */
@js.native
trait PlanDefinitionAction extends BackboneElement {
  
  /**
    * Contains extended information for property 'cardinalityBehavior'.
    */
  var _cardinalityBehavior: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'goalId'.
    */
  var _goalId: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'groupingBehavior'.
    */
  var _groupingBehavior: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'precheckBehavior'.
    */
  var _precheckBehavior: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'requiredBehavior'.
    */
  var _requiredBehavior: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'selectionBehavior'.
    */
  var _selectionBehavior: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'textEquivalent'.
    */
  var _textEquivalent: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * A sub-action
    */
  var action: js.UndefOr[js.Array[PlanDefinitionAction]] = js.native
  
  /**
    * single | multiple
    */
  var cardinalityBehavior: js.UndefOr[code] = js.native
  
  /**
    * Code representing the meaning of the action or sub-actions
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Whether or not the action is applicable
    */
  var condition: js.UndefOr[js.Array[PlanDefinitionActionCondition]] = js.native
  
  /**
    * Description of the activity to be performed
    */
  var definition: js.UndefOr[Reference] = js.native
  
  /**
    * Short description of the action
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Supporting documentation for the intended performer of the action
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  
  /**
    * Dynamic aspects of the definition
    */
  var dynamicValue: js.UndefOr[js.Array[PlanDefinitionActionDynamicValue]] = js.native
  
  /**
    * What goals this action supports
    */
  var goalId: js.UndefOr[js.Array[id]] = js.native
  
  /**
    * visual-group | logical-group | sentence-group
    */
  var groupingBehavior: js.UndefOr[code] = js.native
  
  /**
    * Input data requirements
    */
  var input: js.UndefOr[js.Array[DataRequirement]] = js.native
  
  /**
    * User-visible label for the action (e.g. 1. or A.)
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Output data definition
    */
  var output: js.UndefOr[js.Array[DataRequirement]] = js.native
  
  /**
    * Who should participate in the action
    */
  var participant: js.UndefOr[js.Array[PlanDefinitionActionParticipant]] = js.native
  
  /**
    * yes | no
    */
  var precheckBehavior: js.UndefOr[code] = js.native
  
  /**
    * Why the action should be performed
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Relationship to another action
    */
  var relatedAction: js.UndefOr[js.Array[PlanDefinitionActionRelatedAction]] = js.native
  
  /**
    * must | could | must-unless-documented
    */
  var requiredBehavior: js.UndefOr[code] = js.native
  
  /**
    * any | all | all-or-none | exactly-one | at-most-one | one-or-more
    */
  var selectionBehavior: js.UndefOr[code] = js.native
  
  /**
    * Static text equivalent of the action, used if the dynamic aspects cannot be interpreted by the receiving system
    */
  var textEquivalent: js.UndefOr[String] = js.native
  
  /**
    * When the action should take place
    */
  var timingDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * When the action should take place
    */
  var timingDuration: js.UndefOr[Duration] = js.native
  
  /**
    * When the action should take place
    */
  var timingPeriod: js.UndefOr[Period] = js.native
  
  /**
    * When the action should take place
    */
  var timingRange: js.UndefOr[Range] = js.native
  
  /**
    * When the action should take place
    */
  var timingTiming: js.UndefOr[Timing] = js.native
  
  /**
    * User-visible title
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Transform to apply the template
    */
  var transform: js.UndefOr[Reference] = js.native
  
  /**
    * When the action should be triggered
    */
  var triggerDefinition: js.UndefOr[js.Array[TriggerDefinition]] = js.native
  
  /**
    * create | update | remove | fire-event
    */
  var `type`: js.UndefOr[Coding] = js.native
}
object PlanDefinitionAction {
  
  @scala.inline
  def apply(): PlanDefinitionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionAction]
  }
  
  @scala.inline
  implicit class PlanDefinitionActionMutableBuilder[Self <: PlanDefinitionAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[PlanDefinitionAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: PlanDefinitionAction*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setCardinalityBehavior(value: code): Self = StObject.set(x, "cardinalityBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardinalityBehaviorUndefined: Self = StObject.set(x, "cardinalityBehavior", js.undefined)
    
    @scala.inline
    def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    @scala.inline
    def setCondition(value: js.Array[PlanDefinitionActionCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setConditionVarargs(value: PlanDefinitionActionCondition*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDocumentation(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    @scala.inline
    def setDynamicValue(value: js.Array[PlanDefinitionActionDynamicValue]): Self = StObject.set(x, "dynamicValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicValueUndefined: Self = StObject.set(x, "dynamicValue", js.undefined)
    
    @scala.inline
    def setDynamicValueVarargs(value: PlanDefinitionActionDynamicValue*): Self = StObject.set(x, "dynamicValue", js.Array(value :_*))
    
    @scala.inline
    def setGoalId(value: js.Array[id]): Self = StObject.set(x, "goalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalIdUndefined: Self = StObject.set(x, "goalId", js.undefined)
    
    @scala.inline
    def setGoalIdVarargs(value: id*): Self = StObject.set(x, "goalId", js.Array(value :_*))
    
    @scala.inline
    def setGroupingBehavior(value: code): Self = StObject.set(x, "groupingBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingBehaviorUndefined: Self = StObject.set(x, "groupingBehavior", js.undefined)
    
    @scala.inline
    def setInput(value: js.Array[DataRequirement]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: DataRequirement*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Array[DataRequirement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setOutputVarargs(value: DataRequirement*): Self = StObject.set(x, "output", js.Array(value :_*))
    
    @scala.inline
    def setParticipant(value: js.Array[PlanDefinitionActionParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    @scala.inline
    def setParticipantVarargs(value: PlanDefinitionActionParticipant*): Self = StObject.set(x, "participant", js.Array(value :_*))
    
    @scala.inline
    def setPrecheckBehavior(value: code): Self = StObject.set(x, "precheckBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecheckBehaviorUndefined: Self = StObject.set(x, "precheckBehavior", js.undefined)
    
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    @scala.inline
    def setRelatedAction(value: js.Array[PlanDefinitionActionRelatedAction]): Self = StObject.set(x, "relatedAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedActionUndefined: Self = StObject.set(x, "relatedAction", js.undefined)
    
    @scala.inline
    def setRelatedActionVarargs(value: PlanDefinitionActionRelatedAction*): Self = StObject.set(x, "relatedAction", js.Array(value :_*))
    
    @scala.inline
    def setRequiredBehavior(value: code): Self = StObject.set(x, "requiredBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredBehaviorUndefined: Self = StObject.set(x, "requiredBehavior", js.undefined)
    
    @scala.inline
    def setSelectionBehavior(value: code): Self = StObject.set(x, "selectionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionBehaviorUndefined: Self = StObject.set(x, "selectionBehavior", js.undefined)
    
    @scala.inline
    def setTextEquivalent(value: String): Self = StObject.set(x, "textEquivalent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEquivalentUndefined: Self = StObject.set(x, "textEquivalent", js.undefined)
    
    @scala.inline
    def setTimingDateTime(value: dateTime): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    @scala.inline
    def setTimingDuration(value: Duration): Self = StObject.set(x, "timingDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingDurationUndefined: Self = StObject.set(x, "timingDuration", js.undefined)
    
    @scala.inline
    def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    @scala.inline
    def setTimingRange(value: Range): Self = StObject.set(x, "timingRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingRangeUndefined: Self = StObject.set(x, "timingRange", js.undefined)
    
    @scala.inline
    def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransform(value: Reference): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTriggerDefinition(value: js.Array[TriggerDefinition]): Self = StObject.set(x, "triggerDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerDefinitionUndefined: Self = StObject.set(x, "triggerDefinition", js.undefined)
    
    @scala.inline
    def setTriggerDefinitionVarargs(value: TriggerDefinition*): Self = StObject.set(x, "triggerDefinition", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_cardinalityBehavior(value: Element): Self = StObject.set(x, "_cardinalityBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cardinalityBehaviorUndefined: Self = StObject.set(x, "_cardinalityBehavior", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_goalId(value: js.Array[Element]): Self = StObject.set(x, "_goalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_goalIdUndefined: Self = StObject.set(x, "_goalId", js.undefined)
    
    @scala.inline
    def set_goalIdVarargs(value: Element*): Self = StObject.set(x, "_goalId", js.Array(value :_*))
    
    @scala.inline
    def set_groupingBehavior(value: Element): Self = StObject.set(x, "_groupingBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupingBehaviorUndefined: Self = StObject.set(x, "_groupingBehavior", js.undefined)
    
    @scala.inline
    def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    @scala.inline
    def set_precheckBehavior(value: Element): Self = StObject.set(x, "_precheckBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_precheckBehaviorUndefined: Self = StObject.set(x, "_precheckBehavior", js.undefined)
    
    @scala.inline
    def set_requiredBehavior(value: Element): Self = StObject.set(x, "_requiredBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_requiredBehaviorUndefined: Self = StObject.set(x, "_requiredBehavior", js.undefined)
    
    @scala.inline
    def set_selectionBehavior(value: Element): Self = StObject.set(x, "_selectionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_selectionBehaviorUndefined: Self = StObject.set(x, "_selectionBehavior", js.undefined)
    
    @scala.inline
    def set_textEquivalent(value: Element): Self = StObject.set(x, "_textEquivalent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textEquivalentUndefined: Self = StObject.set(x, "_textEquivalent", js.undefined)
    
    @scala.inline
    def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
