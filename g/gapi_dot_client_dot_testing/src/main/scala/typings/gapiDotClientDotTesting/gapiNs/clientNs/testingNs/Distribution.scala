package typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  /**
    * The estimated fraction (0-1) of the total market with this configuration.
    * @OutputOnly
    */
  var marketShare: js.UndefOr[Double] = js.undefined
  /**
    * The time this distribution was measured.
    * @OutputOnly
    */
  var measurementTime: js.UndefOr[String] = js.undefined
}

object Distribution {
  @scala.inline
  def apply(marketShare: Int | Double = null, measurementTime: String = null): Distribution = {
    val __obj = js.Dynamic.literal()
    if (marketShare != null) __obj.updateDynamic("marketShare")(marketShare.asInstanceOf[js.Any])
    if (measurementTime != null) __obj.updateDynamic("measurementTime")(measurementTime)
    __obj.asInstanceOf[Distribution]
  }
}

