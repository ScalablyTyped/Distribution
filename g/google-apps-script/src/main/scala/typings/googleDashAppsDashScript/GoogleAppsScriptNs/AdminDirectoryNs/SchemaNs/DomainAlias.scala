package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainAlias extends js.Object {
  var creationTime: js.UndefOr[String] = js.undefined
  var domainAliasName: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var parentDomainName: js.UndefOr[String] = js.undefined
  var verified: js.UndefOr[Boolean] = js.undefined
}

object DomainAlias {
  @scala.inline
  def apply(
    creationTime: String = null,
    domainAliasName: String = null,
    etag: String = null,
    kind: String = null,
    parentDomainName: String = null,
    verified: js.UndefOr[Boolean] = js.undefined
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

