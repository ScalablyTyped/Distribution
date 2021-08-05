package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Action defined by the plan
  */
trait PlanDefinitionAction
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'cardinalityBehavior'.
    */
  var _cardinalityBehavior: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'goalId'.
    */
  var _goalId: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'groupingBehavior'.
    */
  var _groupingBehavior: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'precheckBehavior'.
    */
  var _precheckBehavior: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'requiredBehavior'.
    */
  var _requiredBehavior: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'selectionBehavior'.
    */
  var _selectionBehavior: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'textEquivalent'.
    */
  var _textEquivalent: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * A sub-action
    */
  var action: js.UndefOr[js.Array[PlanDefinitionAction]] = js.undefined
  
  /**
    * single | multiple
    */
  var cardinalityBehavior: js.UndefOr[code] = js.undefined
  
  /**
    * Code representing the meaning of the action or sub-actions
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Whether or not the action is applicable
    */
  var condition: js.UndefOr[js.Array[PlanDefinitionActionCondition]] = js.undefined
  
  /**
    * Description of the activity to be performed
    */
  var definition: js.UndefOr[Reference] = js.undefined
  
  /**
    * Short description of the action
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Supporting documentation for the intended performer of the action
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * Dynamic aspects of the definition
    */
  var dynamicValue: js.UndefOr[js.Array[PlanDefinitionActionDynamicValue]] = js.undefined
  
  /**
    * What goals this action supports
    */
  var goalId: js.UndefOr[js.Array[id]] = js.undefined
  
  /**
    * visual-group | logical-group | sentence-group
    */
  var groupingBehavior: js.UndefOr[code] = js.undefined
  
  /**
    * Input data requirements
    */
  var input: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  
  /**
    * User-visible label for the action (e.g. 1. or A.)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Output data definition
    */
  var output: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  
  /**
    * Who should participate in the action
    */
  var participant: js.UndefOr[js.Array[PlanDefinitionActionParticipant]] = js.undefined
  
  /**
    * yes | no
    */
  var precheckBehavior: js.UndefOr[code] = js.undefined
  
  /**
    * Why the action should be performed
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Relationship to another action
    */
  var relatedAction: js.UndefOr[js.Array[PlanDefinitionActionRelatedAction]] = js.undefined
  
  /**
    * must | could | must-unless-documented
    */
  var requiredBehavior: js.UndefOr[code] = js.undefined
  
  /**
    * any | all | all-or-none | exactly-one | at-most-one | one-or-more
    */
  var selectionBehavior: js.UndefOr[code] = js.undefined
  
  /**
    * Static text equivalent of the action, used if the dynamic aspects cannot be interpreted by the receiving system
    */
  var textEquivalent: js.UndefOr[String] = js.undefined
  
  /**
    * When the action should take place
    */
  var timingDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When the action should take place
    */
  var timingDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * When the action should take place
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When the action should take place
    */
  var timingRange: js.UndefOr[Range] = js.undefined
  
  /**
    * When the action should take place
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * User-visible title
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Transform to apply the template
    */
  var transform: js.UndefOr[Reference] = js.undefined
  
  /**
    * When the action should be triggered
    */
  var triggerDefinition: js.UndefOr[js.Array[TriggerDefinition]] = js.undefined
  
  /**
    * create | update | remove | fire-event
    */
  var `type`: js.UndefOr[Coding] = js.undefined
}
object PlanDefinitionAction {
  
  inline def apply(): PlanDefinitionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionAction]
  }
  
  extension [Self <: PlanDefinitionAction](x: Self) {
    
    inline def setAction(value: js.Array[PlanDefinitionAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: PlanDefinitionAction*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    inline def setCardinalityBehavior(value: code): Self = StObject.set(x, "cardinalityBehavior", value.asInstanceOf[js.Any])
    
    inline def setCardinalityBehaviorUndefined: Self = StObject.set(x, "cardinalityBehavior", js.undefined)
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    inline def setCondition(value: js.Array[PlanDefinitionActionCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: PlanDefinitionActionCondition*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    inline def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentation(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    inline def setDynamicValue(value: js.Array[PlanDefinitionActionDynamicValue]): Self = StObject.set(x, "dynamicValue", value.asInstanceOf[js.Any])
    
    inline def setDynamicValueUndefined: Self = StObject.set(x, "dynamicValue", js.undefined)
    
    inline def setDynamicValueVarargs(value: PlanDefinitionActionDynamicValue*): Self = StObject.set(x, "dynamicValue", js.Array(value :_*))
    
    inline def setGoalId(value: js.Array[id]): Self = StObject.set(x, "goalId", value.asInstanceOf[js.Any])
    
    inline def setGoalIdUndefined: Self = StObject.set(x, "goalId", js.undefined)
    
    inline def setGoalIdVarargs(value: id*): Self = StObject.set(x, "goalId", js.Array(value :_*))
    
    inline def setGroupingBehavior(value: code): Self = StObject.set(x, "groupingBehavior", value.asInstanceOf[js.Any])
    
    inline def setGroupingBehaviorUndefined: Self = StObject.set(x, "groupingBehavior", js.undefined)
    
    inline def setInput(value: js.Array[DataRequirement]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: DataRequirement*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOutput(value: js.Array[DataRequirement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: DataRequirement*): Self = StObject.set(x, "output", js.Array(value :_*))
    
    inline def setParticipant(value: js.Array[PlanDefinitionActionParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: PlanDefinitionActionParticipant*): Self = StObject.set(x, "participant", js.Array(value :_*))
    
    inline def setPrecheckBehavior(value: code): Self = StObject.set(x, "precheckBehavior", value.asInstanceOf[js.Any])
    
    inline def setPrecheckBehaviorUndefined: Self = StObject.set(x, "precheckBehavior", js.undefined)
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    inline def setRelatedAction(value: js.Array[PlanDefinitionActionRelatedAction]): Self = StObject.set(x, "relatedAction", value.asInstanceOf[js.Any])
    
    inline def setRelatedActionUndefined: Self = StObject.set(x, "relatedAction", js.undefined)
    
    inline def setRelatedActionVarargs(value: PlanDefinitionActionRelatedAction*): Self = StObject.set(x, "relatedAction", js.Array(value :_*))
    
    inline def setRequiredBehavior(value: code): Self = StObject.set(x, "requiredBehavior", value.asInstanceOf[js.Any])
    
    inline def setRequiredBehaviorUndefined: Self = StObject.set(x, "requiredBehavior", js.undefined)
    
    inline def setSelectionBehavior(value: code): Self = StObject.set(x, "selectionBehavior", value.asInstanceOf[js.Any])
    
    inline def setSelectionBehaviorUndefined: Self = StObject.set(x, "selectionBehavior", js.undefined)
    
    inline def setTextEquivalent(value: String): Self = StObject.set(x, "textEquivalent", value.asInstanceOf[js.Any])
    
    inline def setTextEquivalentUndefined: Self = StObject.set(x, "textEquivalent", js.undefined)
    
    inline def setTimingDateTime(value: dateTime): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
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
    
    inline def setTransform(value: Reference): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTriggerDefinition(value: js.Array[TriggerDefinition]): Self = StObject.set(x, "triggerDefinition", value.asInstanceOf[js.Any])
    
    inline def setTriggerDefinitionUndefined: Self = StObject.set(x, "triggerDefinition", js.undefined)
    
    inline def setTriggerDefinitionVarargs(value: TriggerDefinition*): Self = StObject.set(x, "triggerDefinition", js.Array(value :_*))
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_cardinalityBehavior(value: Element): Self = StObject.set(x, "_cardinalityBehavior", value.asInstanceOf[js.Any])
    
    inline def set_cardinalityBehaviorUndefined: Self = StObject.set(x, "_cardinalityBehavior", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_goalId(value: js.Array[Element]): Self = StObject.set(x, "_goalId", value.asInstanceOf[js.Any])
    
    inline def set_goalIdUndefined: Self = StObject.set(x, "_goalId", js.undefined)
    
    inline def set_goalIdVarargs(value: Element*): Self = StObject.set(x, "_goalId", js.Array(value :_*))
    
    inline def set_groupingBehavior(value: Element): Self = StObject.set(x, "_groupingBehavior", value.asInstanceOf[js.Any])
    
    inline def set_groupingBehaviorUndefined: Self = StObject.set(x, "_groupingBehavior", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_precheckBehavior(value: Element): Self = StObject.set(x, "_precheckBehavior", value.asInstanceOf[js.Any])
    
    inline def set_precheckBehaviorUndefined: Self = StObject.set(x, "_precheckBehavior", js.undefined)
    
    inline def set_requiredBehavior(value: Element): Self = StObject.set(x, "_requiredBehavior", value.asInstanceOf[js.Any])
    
    inline def set_requiredBehaviorUndefined: Self = StObject.set(x, "_requiredBehavior", js.undefined)
    
    inline def set_selectionBehavior(value: Element): Self = StObject.set(x, "_selectionBehavior", value.asInstanceOf[js.Any])
    
    inline def set_selectionBehaviorUndefined: Self = StObject.set(x, "_selectionBehavior", js.undefined)
    
    inline def set_textEquivalent(value: Element): Self = StObject.set(x, "_textEquivalent", value.asInstanceOf[js.Any])
    
    inline def set_textEquivalentUndefined: Self = StObject.set(x, "_textEquivalent", js.undefined)
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
