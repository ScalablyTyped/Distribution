package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schemas extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var schemas: js.UndefOr[js.Array[Schema]] = js.undefined
}

object Schemas {
  @scala.inline
  def apply(etag: java.lang.String = null, kind: java.lang.String = null, schemas: js.Array[Schema] = null): Schemas = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[Schemas]
  }
}

