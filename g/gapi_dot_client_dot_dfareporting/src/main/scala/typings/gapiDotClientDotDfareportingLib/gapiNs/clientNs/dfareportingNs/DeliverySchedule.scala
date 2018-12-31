package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliverySchedule extends js.Object {
  /** Limit on the number of times an individual user can be served the ad within a specified period of time. */
  var frequencyCap: js.UndefOr[FrequencyCap] = js.undefined
  /**
    * Whether or not hard cutoff is enabled. If true, the ad will not serve after the end date and time. Otherwise the ad will continue to be served until it
    * has reached its delivery goals.
    */
  var hardCutoff: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Impression ratio for this ad. This ratio determines how often each ad is served relative to the others. For example, if ad A has an impression ratio of
    * 1 and ad B has an impression ratio of 3, then DCM will serve ad B three times as often as ad A. Acceptable values are 1 to 10, inclusive.
    */
  var impressionRatio: js.UndefOr[java.lang.String] = js.undefined
  /** Serving priority of an ad, with respect to other ads. The lower the priority number, the greater the priority with which it is served. */
  var priority: js.UndefOr[java.lang.String] = js.undefined
}

