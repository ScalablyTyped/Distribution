package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessDetail extends js.Object {
  /** If a native process other than the app crashed. */
  var otherNativeCrash: js.UndefOr[Boolean] = js.undefined
}

object SuccessDetail {
  @scala.inline
  def apply(otherNativeCrash: js.UndefOr[Boolean] = js.undefined): SuccessDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(otherNativeCrash)) __obj.updateDynamic("otherNativeCrash")(otherNativeCrash.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessDetail]
  }
}

