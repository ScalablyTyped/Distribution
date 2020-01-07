package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MasterData extends js.Object {
  var masterData: js.UndefOr[Double] = js.native
}

object Anon_MasterData {
  @scala.inline
  def apply(masterData: Int | Double = null): Anon_MasterData = {
    val __obj = js.Dynamic.literal()
    if (masterData != null) __obj.updateDynamic("masterData")(masterData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MasterData]
  }
}

