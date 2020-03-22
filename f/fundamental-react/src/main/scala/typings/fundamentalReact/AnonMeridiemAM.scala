package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeridiemAM extends js.Object {
  var meridiemAM: js.UndefOr[String] = js.undefined
  var meridiemPM: js.UndefOr[String] = js.undefined
}

object AnonMeridiemAM {
  @scala.inline
  def apply(meridiemAM: String = null, meridiemPM: String = null): AnonMeridiemAM = {
    val __obj = js.Dynamic.literal()
    if (meridiemAM != null) __obj.updateDynamic("meridiemAM")(meridiemAM.asInstanceOf[js.Any])
    if (meridiemPM != null) __obj.updateDynamic("meridiemPM")(meridiemPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeridiemAM]
  }
}

