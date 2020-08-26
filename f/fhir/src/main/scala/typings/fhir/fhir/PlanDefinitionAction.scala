package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class PlanDefinitionActionOps[Self <: PlanDefinitionAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_cardinalityBehavior(value: Element): Self = this.set("_cardinalityBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_cardinalityBehavior: Self = this.set("_cardinalityBehavior", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_goalIdVarargs(value: Element*): Self = this.set("_goalId", js.Array(value :_*))
    @scala.inline
    def set_goalId(value: js.Array[Element]): Self = this.set("_goalId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_goalId: Self = this.set("_goalId", js.undefined)
    @scala.inline
    def set_groupingBehavior(value: Element): Self = this.set("_groupingBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_groupingBehavior: Self = this.set("_groupingBehavior", js.undefined)
    @scala.inline
    def set_label(value: Element): Self = this.set("_label", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_label: Self = this.set("_label", js.undefined)
    @scala.inline
    def set_precheckBehavior(value: Element): Self = this.set("_precheckBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_precheckBehavior: Self = this.set("_precheckBehavior", js.undefined)
    @scala.inline
    def set_requiredBehavior(value: Element): Self = this.set("_requiredBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_requiredBehavior: Self = this.set("_requiredBehavior", js.undefined)
    @scala.inline
    def set_selectionBehavior(value: Element): Self = this.set("_selectionBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_selectionBehavior: Self = this.set("_selectionBehavior", js.undefined)
    @scala.inline
    def set_textEquivalent(value: Element): Self = this.set("_textEquivalent", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_textEquivalent: Self = this.set("_textEquivalent", js.undefined)
    @scala.inline
    def set_timingDateTime(value: Element): Self = this.set("_timingDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_timingDateTime: Self = this.set("_timingDateTime", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def setActionVarargs(value: PlanDefinitionAction*): Self = this.set("action", js.Array(value :_*))
    @scala.inline
    def setAction(value: js.Array[PlanDefinitionAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setCardinalityBehavior(value: code): Self = this.set("cardinalityBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardinalityBehavior: Self = this.set("cardinalityBehavior", js.undefined)
    @scala.inline
    def setCodeVarargs(value: CodeableConcept*): Self = this.set("code", js.Array(value :_*))
    @scala.inline
    def setCode(value: js.Array[CodeableConcept]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setConditionVarargs(value: PlanDefinitionActionCondition*): Self = this.set("condition", js.Array(value :_*))
    @scala.inline
    def setCondition(value: js.Array[PlanDefinitionActionCondition]): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setDefinition(value: Reference): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDocumentationVarargs(value: RelatedArtifact*): Self = this.set("documentation", js.Array(value :_*))
    @scala.inline
    def setDocumentation(value: js.Array[RelatedArtifact]): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setDynamicValueVarargs(value: PlanDefinitionActionDynamicValue*): Self = this.set("dynamicValue", js.Array(value :_*))
    @scala.inline
    def setDynamicValue(value: js.Array[PlanDefinitionActionDynamicValue]): Self = this.set("dynamicValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicValue: Self = this.set("dynamicValue", js.undefined)
    @scala.inline
    def setGoalIdVarargs(value: id*): Self = this.set("goalId", js.Array(value :_*))
    @scala.inline
    def setGoalId(value: js.Array[id]): Self = this.set("goalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoalId: Self = this.set("goalId", js.undefined)
    @scala.inline
    def setGroupingBehavior(value: code): Self = this.set("groupingBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingBehavior: Self = this.set("groupingBehavior", js.undefined)
    @scala.inline
    def setInputVarargs(value: DataRequirement*): Self = this.set("input", js.Array(value :_*))
    @scala.inline
    def setInput(value: js.Array[DataRequirement]): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOutputVarargs(value: DataRequirement*): Self = this.set("output", js.Array(value :_*))
    @scala.inline
    def setOutput(value: js.Array[DataRequirement]): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setParticipantVarargs(value: PlanDefinitionActionParticipant*): Self = this.set("participant", js.Array(value :_*))
    @scala.inline
    def setParticipant(value: js.Array[PlanDefinitionActionParticipant]): Self = this.set("participant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipant: Self = this.set("participant", js.undefined)
    @scala.inline
    def setPrecheckBehavior(value: code): Self = this.set("precheckBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecheckBehavior: Self = this.set("precheckBehavior", js.undefined)
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = this.set("reason", js.Array(value :_*))
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRelatedActionVarargs(value: PlanDefinitionActionRelatedAction*): Self = this.set("relatedAction", js.Array(value :_*))
    @scala.inline
    def setRelatedAction(value: js.Array[PlanDefinitionActionRelatedAction]): Self = this.set("relatedAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedAction: Self = this.set("relatedAction", js.undefined)
    @scala.inline
    def setRequiredBehavior(value: code): Self = this.set("requiredBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredBehavior: Self = this.set("requiredBehavior", js.undefined)
    @scala.inline
    def setSelectionBehavior(value: code): Self = this.set("selectionBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionBehavior: Self = this.set("selectionBehavior", js.undefined)
    @scala.inline
    def setTextEquivalent(value: String): Self = this.set("textEquivalent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEquivalent: Self = this.set("textEquivalent", js.undefined)
    @scala.inline
    def setTimingDateTime(value: dateTime): Self = this.set("timingDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingDateTime: Self = this.set("timingDateTime", js.undefined)
    @scala.inline
    def setTimingDuration(value: Duration): Self = this.set("timingDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingDuration: Self = this.set("timingDuration", js.undefined)
    @scala.inline
    def setTimingPeriod(value: Period): Self = this.set("timingPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingPeriod: Self = this.set("timingPeriod", js.undefined)
    @scala.inline
    def setTimingRange(value: Range): Self = this.set("timingRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingRange: Self = this.set("timingRange", js.undefined)
    @scala.inline
    def setTimingTiming(value: Timing): Self = this.set("timingTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingTiming: Self = this.set("timingTiming", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransform(value: Reference): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTriggerDefinitionVarargs(value: TriggerDefinition*): Self = this.set("triggerDefinition", js.Array(value :_*))
    @scala.inline
    def setTriggerDefinition(value: js.Array[TriggerDefinition]): Self = this.set("triggerDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerDefinition: Self = this.set("triggerDefinition", js.undefined)
    @scala.inline
    def setType(value: Coding): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

