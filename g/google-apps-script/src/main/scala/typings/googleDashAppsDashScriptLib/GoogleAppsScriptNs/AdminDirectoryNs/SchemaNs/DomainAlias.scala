package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainAlias extends js.Object {
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var domainAliasName: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var parentDomainName: js.UndefOr[java.lang.String] = js.undefined
  var verified: js.UndefOr[scala.Boolean] = js.undefined
}

object DomainAlias {
  @scala.inline
  def apply(
    creationTime: java.lang.String = null,
    domainAliasName: java.lang.String = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    parentDomainName: java.lang.String = null,
    verified: js.UndefOr[scala.Boolean] = js.undefined
  ): DomainAlias = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (domainAliasName != null) __obj.updateDynamic("domainAliasName")(domainAliasName)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parentDomainName != null) __obj.updateDynamic("parentDomainName")(parentDomainName)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[DomainAlias]
  }
}

