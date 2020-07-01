package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsJSONOptions extends js.Object {
  var allow_primitives: js.UndefOr[Boolean] = js.undefined
}

object IsJSONOptions {
  @scala.inline
  def apply(allow_primitives: js.UndefOr[Boolean] = js.undefined): IsJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_primitives)) __obj.updateDynamic("allow_primitives")(allow_primitives.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsJSONOptions]
  }
}

