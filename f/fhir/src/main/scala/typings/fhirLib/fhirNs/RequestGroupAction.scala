package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Proposed actions, if any
     */

trait RequestGroupAction extends BackboneElement {
  /**
           * Contains extended information for property 'cardinalityBehavior'.
           */
  var _cardinalityBehavior: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
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
           * Sub action
           */
  var action: js.UndefOr[js.Array[RequestGroupAction]] = js.undefined
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
  var condition: js.UndefOr[js.Array[RequestGroupActionCondition]] = js.undefined
  /**
           * Short description of the action
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Supporting documentation for the intended performer of the action
           */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
           * visual-group | logical-group | sentence-group
           */
  var groupingBehavior: js.UndefOr[code] = js.undefined
  /**
           * User-visible label for the action (e.g. 1. or A.)
           */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Who should perform the action
           */
  var participant: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * yes | no
           */
  var precheckBehavior: js.UndefOr[code] = js.undefined
  /**
           * Relationship to another action
           */
  var relatedAction: js.UndefOr[js.Array[RequestGroupActionRelatedAction]] = js.undefined
  /**
           * must | could | must-unless-documented
           */
  var requiredBehavior: js.UndefOr[code] = js.undefined
  /**
           * The target of the action
           */
  var resource: js.UndefOr[Reference] = js.undefined
  /**
           * any | all | all-or-none | exactly-one | at-most-one | one-or-more
           */
  var selectionBehavior: js.UndefOr[code] = js.undefined
  /**
           * Static text equivalent of the action, used if the dynamic aspects cannot be interpreted by the receiving system
           */
  var textEquivalent: js.UndefOr[java.lang.String] = js.undefined
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
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
           * create | update | remove | fire-event
           */
  var `type`: js.UndefOr[Coding] = js.undefined
}

