package typings.gcsDashResumableDashUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scopes extends js.Object {
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Scopes {
  @scala.inline
  def apply(scopes: js.Array[String] = null): Anon_Scopes = {
    val __obj = js.Dynamic.literal()
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[Anon_Scopes]
  }
}

