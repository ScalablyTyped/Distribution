package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * In-line definition of activity
     */

trait CarePlanActivityDetail extends BackboneElement {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'prohibited'.
           */
  var _prohibited: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'scheduledString'.
           */
  var _scheduledString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'statusReason'.
           */
  var _statusReason: js.UndefOr[Element] = js.undefined
  /**
           * diet | drug | encounter | observation | procedure | supply | other
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Detail type of activity
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * How to consume/day?
           */
  var dailyAmount: js.UndefOr[Quantity] = js.undefined
  /**
           * Protocol or definition
           */
  var definition: js.UndefOr[Reference] = js.undefined
  /**
           * Extra info describing activity to perform
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Goals this activity relates to
           */
  var goal: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Where it should happen
           */
  var location: js.UndefOr[Reference] = js.undefined
  /**
           * Who will be responsible?
           */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * What is to be administered/supplied
           */
  var productCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * What is to be administered/supplied
           */
  var productReference: js.UndefOr[Reference] = js.undefined
  /**
           * Do NOT do
           */
  var prohibited: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * How much to administer/supply/consume
           */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Why activity should be done or why activity was prohibited
           */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Condition triggering need for activity
           */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * When activity is to occur
           */
  var scheduledPeriod: js.UndefOr[Period] = js.undefined
  /**
           * When activity is to occur
           */
  var scheduledString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When activity is to occur
           */
  var scheduledTiming: js.UndefOr[Timing] = js.undefined
  /**
           * not-started | scheduled | in-progress | on-hold | completed | cancelled | unknown
           */
  var status: code
  /**
           * Reason for current status
           */
  var statusReason: js.UndefOr[java.lang.String] = js.undefined
}

