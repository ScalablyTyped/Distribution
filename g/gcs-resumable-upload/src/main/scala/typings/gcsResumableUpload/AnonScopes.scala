package typings.gcsResumableUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopes extends js.Object {
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonScopes {
  @scala.inline
  def apply(scopes: js.Array[String] = null): AnonScopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopes]
  }
}

