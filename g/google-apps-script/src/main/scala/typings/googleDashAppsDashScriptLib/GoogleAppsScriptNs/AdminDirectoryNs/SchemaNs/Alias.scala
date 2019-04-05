package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var primaryEmail: js.UndefOr[java.lang.String] = js.undefined
}

object Alias {
  @scala.inline
  def apply(
    alias: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    primaryEmail: java.lang.String = null
  ): Alias = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail)
    __obj.asInstanceOf[Alias]
  }
}

