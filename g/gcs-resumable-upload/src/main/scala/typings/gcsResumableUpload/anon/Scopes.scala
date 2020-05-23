package typings.gcsResumableUpload.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scopes extends js.Object {
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object Scopes {
  @scala.inline
  def apply(scopes: js.Array[String] = null): Scopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopes]
  }
}

