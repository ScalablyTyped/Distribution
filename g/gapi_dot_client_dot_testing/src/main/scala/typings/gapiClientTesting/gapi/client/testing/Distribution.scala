package typings.gapiClientTesting.gapi.client.testing

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
  def apply(marketShare: js.UndefOr[Double] = js.undefined, measurementTime: String = null): Distribution = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(marketShare)) __obj.updateDynamic("marketShare")(marketShare.get.asInstanceOf[js.Any])
    if (measurementTime != null) __obj.updateDynamic("measurementTime")(measurementTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
}

