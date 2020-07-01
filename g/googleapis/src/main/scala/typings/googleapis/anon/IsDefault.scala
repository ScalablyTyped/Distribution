package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsDefault extends js.Object {
  var isDefault: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
}

object IsDefault {
  @scala.inline
  def apply(isDefault: js.UndefOr[Boolean] = js.undefined, url: String = null): IsDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDefault]
  }
}

