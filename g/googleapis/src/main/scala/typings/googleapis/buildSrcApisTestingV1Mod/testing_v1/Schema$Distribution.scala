package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about the relative number of devices running a given configuration of
  * the Android platform.
  */
@js.native
trait Schema$Distribution extends js.Object {
  /**
    * Output only. The estimated fraction (0-1) of the total market with this
    * configuration.
    */
  var marketShare: js.UndefOr[Double] = js.native
  /**
    * Output only. The time this distribution was measured.
    */
  var measurementTime: js.UndefOr[String] = js.native
}

object Schema$Distribution {
  @scala.inline
  def apply(marketShare: Int | Double = null, measurementTime: String = null): Schema$Distribution = {
    val __obj = js.Dynamic.literal()
    if (marketShare != null) __obj.updateDynamic("marketShare")(marketShare.asInstanceOf[js.Any])
    if (measurementTime != null) __obj.updateDynamic("measurementTime")(measurementTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Distribution]
  }
}

