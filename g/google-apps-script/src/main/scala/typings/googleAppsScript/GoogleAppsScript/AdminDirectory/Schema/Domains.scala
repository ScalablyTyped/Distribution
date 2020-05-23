package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domains extends js.Object {
  var creationTime: js.UndefOr[String] = js.undefined
  var domainAliases: js.UndefOr[js.Array[DomainAlias]] = js.undefined
  var domainName: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var verified: js.UndefOr[Boolean] = js.undefined
}

object Domains {
  @scala.inline
  def apply(
    creationTime: String = null,
    domainAliases: js.Array[DomainAlias] = null,
    domainName: String = null,
    etag: String = null,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): Domains = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (domainAliases != null) __obj.updateDynamic("domainAliases")(domainAliases.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domains]
  }
}

