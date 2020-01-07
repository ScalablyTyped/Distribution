package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IsDefault extends js.Object {
  var isDefault: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
}

object Anon_IsDefault {
  @scala.inline
  def apply(isDefault: js.UndefOr[Boolean] = js.undefined, url: String = null): Anon_IsDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsDefault]
  }
}

