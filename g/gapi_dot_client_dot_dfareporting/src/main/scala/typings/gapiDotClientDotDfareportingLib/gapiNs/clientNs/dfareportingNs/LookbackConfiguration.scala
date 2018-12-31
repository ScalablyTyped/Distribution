package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookbackConfiguration extends js.Object {
  /**
    * Lookback window, in days, from the last time a given user clicked on one of your ads. If you enter 0, clicks will not be considered as triggering
    * events for floodlight tracking. If you leave this field blank, the default value for your account will be used. Acceptable values are 0 to 90,
    * inclusive.
    */
  var clickDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Lookback window, in days, from the last time a given user viewed one of your ads. If you enter 0, impressions will not be considered as triggering
    * events for floodlight tracking. If you leave this field blank, the default value for your account will be used. Acceptable values are 0 to 90,
    * inclusive.
    */
  var postImpressionActivitiesDuration: js.UndefOr[scala.Double] = js.undefined
}

