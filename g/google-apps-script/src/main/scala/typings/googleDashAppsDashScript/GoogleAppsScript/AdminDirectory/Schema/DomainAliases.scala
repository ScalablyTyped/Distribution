package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainAliases extends js.Object {
  var domainAliases: js.UndefOr[js.Array[DomainAlias]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object DomainAliases {
  @scala.inline
  def apply(domainAliases: js.Array[DomainAlias] = null, etag: String = null, kind: String = null): DomainAliases = {
    val __obj = js.Dynamic.literal()
    if (domainAliases != null) __obj.updateDynamic("domainAliases")(domainAliases.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAliases]
  }
}

