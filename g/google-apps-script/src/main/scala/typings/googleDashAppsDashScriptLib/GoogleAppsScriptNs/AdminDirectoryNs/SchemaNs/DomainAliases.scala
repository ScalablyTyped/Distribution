package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainAliases extends js.Object {
  var domainAliases: js.UndefOr[js.Array[DomainAlias]] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DomainAliases {
  @scala.inline
  def apply(
    domainAliases: js.Array[DomainAlias] = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null
  ): DomainAliases = {
    val __obj = js.Dynamic.literal()
    if (domainAliases != null) __obj.updateDynamic("domainAliases")(domainAliases)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DomainAliases]
  }
}

