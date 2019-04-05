package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aliases extends js.Object {
  var aliases: js.UndefOr[js.Array[js.Object]] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Aliases {
  @scala.inline
  def apply(aliases: js.Array[js.Object] = null, etag: java.lang.String = null, kind: java.lang.String = null): Aliases = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Aliases]
  }
}

