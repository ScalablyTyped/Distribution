package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsLatLongOptions extends js.Object {
  var checkDMS: js.UndefOr[Boolean] = js.undefined
}

object IsLatLongOptions {
  @scala.inline
  def apply(checkDMS: js.UndefOr[Boolean] = js.undefined): IsLatLongOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkDMS)) __obj.updateDynamic("checkDMS")(checkDMS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLatLongOptions]
  }
}

