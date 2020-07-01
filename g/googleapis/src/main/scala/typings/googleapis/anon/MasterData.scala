package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasterData extends js.Object {
  var masterData: js.UndefOr[Double] = js.native
}

object MasterData {
  @scala.inline
  def apply(masterData: js.UndefOr[Double] = js.undefined): MasterData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(masterData)) __obj.updateDynamic("masterData")(masterData.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterData]
  }
}

