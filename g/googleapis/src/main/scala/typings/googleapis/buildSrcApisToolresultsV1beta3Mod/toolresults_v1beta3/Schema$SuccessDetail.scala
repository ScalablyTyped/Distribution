package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SuccessDetail extends js.Object {
  /**
    * If a native process other than the app crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
}

object Schema$SuccessDetail {
  @scala.inline
  def apply(otherNativeCrash: js.UndefOr[Boolean] = js.undefined): Schema$SuccessDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(otherNativeCrash)) __obj.updateDynamic("otherNativeCrash")(otherNativeCrash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuccessDetail]
  }
}

