package typings.downshift.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPropsCommonOptions extends js.Object {
  var suppressRefError: js.UndefOr[Boolean] = js.undefined
}

object GetPropsCommonOptions {
  @scala.inline
  def apply(suppressRefError: js.UndefOr[Boolean] = js.undefined): GetPropsCommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suppressRefError)) __obj.updateDynamic("suppressRefError")(suppressRefError.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropsCommonOptions]
  }
}

