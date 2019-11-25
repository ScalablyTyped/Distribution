package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Action defined by the plan
  */
trait PlanDefinitionAction extends BackboneElement {
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
  @scala.inline
  def apply(
    _cardinalityBehavior: Element = null,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _goalId: js.Array[Element] = null,
    _groupingBehavior: Element = null,
    _id: Element = null,
    _label: Element = null,
    _precheckBehavior: Element = null,
    _requiredBehavior: Element = null,
    _selectionBehavior: Element = null,
    _textEquivalent: Element = null,
    _timingDateTime: Element = null,
    _title: Element = null,
    action: js.Array[PlanDefinitionAction] = null,
    cardinalityBehavior: code = null,
    code: js.Array[CodeableConcept] = null,
    condition: js.Array[PlanDefinitionActionCondition] = null,
    definition: Reference = null,
    description: String = null,
    documentation: js.Array[RelatedArtifact] = null,
    dynamicValue: js.Array[PlanDefinitionActionDynamicValue] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    goalId: js.Array[id] = null,
    groupingBehavior: code = null,
    id: String = null,
    input: js.Array[DataRequirement] = null,
    label: String = null,
    modifierExtension: js.Array[Extension] = null,
    output: js.Array[DataRequirement] = null,
    participant: js.Array[PlanDefinitionActionParticipant] = null,
    precheckBehavior: code = null,
    reason: js.Array[CodeableConcept] = null,
    relatedAction: js.Array[PlanDefinitionActionRelatedAction] = null,
    requiredBehavior: code = null,
    selectionBehavior: code = null,
    textEquivalent: String = null,
    timingDateTime: dateTime = null,
    timingDuration: Duration = null,
    timingPeriod: Period = null,
    timingRange: Range = null,
    timingTiming: Timing = null,
    title: String = null,
    transform: Reference = null,
    triggerDefinition: js.Array[TriggerDefinition] = null,
    `type`: Coding = null
  ): PlanDefinitionAction = {
    val __obj = js.Dynamic.literal()
    if (_cardinalityBehavior != null) __obj.updateDynamic("_cardinalityBehavior")(_cardinalityBehavior.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_goalId != null) __obj.updateDynamic("_goalId")(_goalId.asInstanceOf[js.Any])
    if (_groupingBehavior != null) __obj.updateDynamic("_groupingBehavior")(_groupingBehavior.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_label != null) __obj.updateDynamic("_label")(_label.asInstanceOf[js.Any])
    if (_precheckBehavior != null) __obj.updateDynamic("_precheckBehavior")(_precheckBehavior.asInstanceOf[js.Any])
    if (_requiredBehavior != null) __obj.updateDynamic("_requiredBehavior")(_requiredBehavior.asInstanceOf[js.Any])
    if (_selectionBehavior != null) __obj.updateDynamic("_selectionBehavior")(_selectionBehavior.asInstanceOf[js.Any])
    if (_textEquivalent != null) __obj.updateDynamic("_textEquivalent")(_textEquivalent.asInstanceOf[js.Any])
    if (_timingDateTime != null) __obj.updateDynamic("_timingDateTime")(_timingDateTime.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (cardinalityBehavior != null) __obj.updateDynamic("cardinalityBehavior")(cardinalityBehavior.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (dynamicValue != null) __obj.updateDynamic("dynamicValue")(dynamicValue.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (goalId != null) __obj.updateDynamic("goalId")(goalId.asInstanceOf[js.Any])
    if (groupingBehavior != null) __obj.updateDynamic("groupingBehavior")(groupingBehavior.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (participant != null) __obj.updateDynamic("participant")(participant.asInstanceOf[js.Any])
    if (precheckBehavior != null) __obj.updateDynamic("precheckBehavior")(precheckBehavior.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (relatedAction != null) __obj.updateDynamic("relatedAction")(relatedAction.asInstanceOf[js.Any])
    if (requiredBehavior != null) __obj.updateDynamic("requiredBehavior")(requiredBehavior.asInstanceOf[js.Any])
    if (selectionBehavior != null) __obj.updateDynamic("selectionBehavior")(selectionBehavior.asInstanceOf[js.Any])
    if (textEquivalent != null) __obj.updateDynamic("textEquivalent")(textEquivalent.asInstanceOf[js.Any])
    if (timingDateTime != null) __obj.updateDynamic("timingDateTime")(timingDateTime.asInstanceOf[js.Any])
    if (timingDuration != null) __obj.updateDynamic("timingDuration")(timingDuration.asInstanceOf[js.Any])
    if (timingPeriod != null) __obj.updateDynamic("timingPeriod")(timingPeriod.asInstanceOf[js.Any])
    if (timingRange != null) __obj.updateDynamic("timingRange")(timingRange.asInstanceOf[js.Any])
    if (timingTiming != null) __obj.updateDynamic("timingTiming")(timingTiming.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (triggerDefinition != null) __obj.updateDynamic("triggerDefinition")(triggerDefinition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionAction]
  }
}

