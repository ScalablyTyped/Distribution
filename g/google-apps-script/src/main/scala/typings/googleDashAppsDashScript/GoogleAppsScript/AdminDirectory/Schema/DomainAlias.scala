package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

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
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (domainAliasName != null) __obj.updateDynamic("domainAliasName")(domainAliasName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (parentDomainName != null) __obj.updateDynamic("parentDomainName")(parentDomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAlias]
  }
}

