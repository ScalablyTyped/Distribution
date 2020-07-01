package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsBase64Options extends js.Object {
  var urlSafe: js.UndefOr[Boolean] = js.undefined
}

object IsBase64Options {
  @scala.inline
  def apply(urlSafe: js.UndefOr[Boolean] = js.undefined): IsBase64Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(urlSafe)) __obj.updateDynamic("urlSafe")(urlSafe.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsBase64Options]
  }
}

