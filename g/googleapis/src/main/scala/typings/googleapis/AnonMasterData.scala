package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMasterData extends js.Object {
  var masterData: js.UndefOr[Double] = js.native
}

object AnonMasterData {
  @scala.inline
  def apply(masterData: Int | Double = null): AnonMasterData = {
    val __obj = js.Dynamic.literal()
    if (masterData != null) __obj.updateDynamic("masterData")(masterData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMasterData]
  }
}

