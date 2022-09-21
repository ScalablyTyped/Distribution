package typings.fhir.r4Mod

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

trait RequestGroupAction
  extends StObject
     with BackboneElement {
  
  var _cardinalityBehavior: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _groupingBehavior: js.UndefOr[Element] = js.undefined
  
  var _precheckBehavior: js.UndefOr[Element] = js.undefined
  
  var _prefix: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _requiredBehavior: js.UndefOr[Element] = js.undefined
  
  var _selectionBehavior: js.UndefOr[Element] = js.undefined
  
  var _textEquivalent: js.UndefOr[Element] = js.undefined
  
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Sub actions.
    */
  var action: js.UndefOr[js.Array[RequestGroupAction]] = js.undefined
  
  /**
    * Defines whether the action can be selected multiple times.
    */
  var cardinalityBehavior: js.UndefOr[single | multiple] = js.undefined
  
  /**
    * A code that provides meaning for the action or action group. For example, a section may have a LOINC code for a section of a documentation template.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * When multiple conditions of the same kind are present, the effects are combined using AND semantics, so the overall condition is true only if all of the conditions are true.
    */
  var condition: js.UndefOr[js.Array[RequestGroupActionCondition]] = js.undefined
  
  /**
    * A short description of the action used to provide a summary to display to the user.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * Defines the grouping behavior for the action and its children.
    */
  var groupingBehavior: js.UndefOr[`visual-group` | `logical-group` | `sentence-group`] = js.undefined
  
  /**
    * The participant that should perform or be responsible for this action.
    */
  var participant: js.UndefOr[js.Array[Reference]] = js.undefined
  
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
    * A relationship to another action such as "before" or "30-60 minutes after start of".
    */
  var relatedAction: js.UndefOr[js.Array[RequestGroupActionRelatedAction]] = js.undefined
  
  /**
    * Defines expectations around whether an action is required.
    */
  var requiredBehavior: js.UndefOr[must | could | `must-unless-documented`] = js.undefined
  
  /**
    * The target resource SHALL be a [Request](request.html) resource with a Request.intent set to "option".
    */
  var resource: js.UndefOr[Reference] = js.undefined
  
  /**
    * Defines the selection behavior for the action and its children.
    */
  var selectionBehavior: js.UndefOr[any | all | `all-or-none` | `exactly-one` | `at-most-one` | `one-or-more`] = js.undefined
  
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
    * The title of the action displayed to a user.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of action to perform (create, update, remove).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object RequestGroupAction {
  
  inline def apply(): RequestGroupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestGroupAction]
  }
  
  extension [Self <: RequestGroupAction](x: Self) {
    
    inline def setAction(value: js.Array[RequestGroupAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: RequestGroupAction*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setCardinalityBehavior(value: single | multiple): Self = StObject.set(x, "cardinalityBehavior", value.asInstanceOf[js.Any])
    
    inline def setCardinalityBehaviorUndefined: Self = StObject.set(x, "cardinalityBehavior", js.undefined)
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setCondition(value: js.Array[RequestGroupActionCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: RequestGroupActionCondition*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentation(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "documentation", js.Array(value*))
    
    inline def setGroupingBehavior(value: `visual-group` | `logical-group` | `sentence-group`): Self = StObject.set(x, "groupingBehavior", value.asInstanceOf[js.Any])
    
    inline def setGroupingBehaviorUndefined: Self = StObject.set(x, "groupingBehavior", js.undefined)
    
    inline def setParticipant(value: js.Array[Reference]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: Reference*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPrecheckBehavior(value: yes | no): Self = StObject.set(x, "precheckBehavior", value.asInstanceOf[js.Any])
    
    inline def setPrecheckBehaviorUndefined: Self = StObject.set(x, "precheckBehavior", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRelatedAction(value: js.Array[RequestGroupActionRelatedAction]): Self = StObject.set(x, "relatedAction", value.asInstanceOf[js.Any])
    
    inline def setRelatedActionUndefined: Self = StObject.set(x, "relatedAction", js.undefined)
    
    inline def setRelatedActionVarargs(value: RequestGroupActionRelatedAction*): Self = StObject.set(x, "relatedAction", js.Array(value*))
    
    inline def setRequiredBehavior(value: must | could | `must-unless-documented`): Self = StObject.set(x, "requiredBehavior", value.asInstanceOf[js.Any])
    
    inline def setRequiredBehaviorUndefined: Self = StObject.set(x, "requiredBehavior", js.undefined)
    
    inline def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSelectionBehavior(value: any | all | `all-or-none` | `exactly-one` | `at-most-one` | `one-or-more`): Self = StObject.set(x, "selectionBehavior", value.asInstanceOf[js.Any])
    
    inline def setSelectionBehaviorUndefined: Self = StObject.set(x, "selectionBehavior", js.undefined)
    
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
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_cardinalityBehavior(value: Element): Self = StObject.set(x, "_cardinalityBehavior", value.asInstanceOf[js.Any])
    
    inline def set_cardinalityBehaviorUndefined: Self = StObject.set(x, "_cardinalityBehavior", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
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
    
    inline def set_textEquivalent(value: Element): Self = StObject.set(x, "_textEquivalent", value.asInstanceOf[js.Any])
    
    inline def set_textEquivalentUndefined: Self = StObject.set(x, "_textEquivalent", js.undefined)
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
