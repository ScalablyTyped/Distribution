package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  /**
    * The estimated fraction (0-1) of the total market with this configuration.
    * @OutputOnly
    */
  var marketShare: js.UndefOr[scala.Double] = js.undefined
  /**
    * The time this distribution was measured.
    * @OutputOnly
    */
  var measurementTime: js.UndefOr[java.lang.String] = js.undefined
}

object Distribution {
  @scala.inline
  def apply(marketShare: scala.Int | scala.Double = null, measurementTime: java.lang.String = null): Distribution = {
    val __obj = js.Dynamic.literal()
    if (marketShare != null) __obj.updateDynamic("marketShare")(marketShare.asInstanceOf[js.Any])
    if (measurementTime != null) __obj.updateDynamic("measurementTime")(measurementTime)
    __obj.asInstanceOf[Distribution]
  }
}

