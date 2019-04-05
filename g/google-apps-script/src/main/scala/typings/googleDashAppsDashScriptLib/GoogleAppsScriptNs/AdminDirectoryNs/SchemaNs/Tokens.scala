package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokens extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Token]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Tokens {
  @scala.inline
  def apply(etag: java.lang.String = null, items: js.Array[Token] = null, kind: java.lang.String = null): Tokens = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Tokens]
  }
}

