package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domains extends js.Object {
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var domainAliases: js.UndefOr[js.Array[DomainAlias]] = js.undefined
  var domainName: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var verified: js.UndefOr[scala.Boolean] = js.undefined
}

object Domains {
  @scala.inline
  def apply(
    creationTime: java.lang.String = null,
    domainAliases: js.Array[DomainAlias] = null,
    domainName: java.lang.String = null,
    etag: java.lang.String = null,
    isPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    verified: js.UndefOr[scala.Boolean] = js.undefined
  ): Domains = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (domainAliases != null) __obj.updateDynamic("domainAliases")(domainAliases)
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[Domains]
  }
}

