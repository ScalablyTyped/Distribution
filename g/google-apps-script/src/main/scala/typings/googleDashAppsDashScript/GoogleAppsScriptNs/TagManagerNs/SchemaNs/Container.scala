package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var domainName: js.UndefOr[js.Array[String]] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var publicId: js.UndefOr[String] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var usageContext: js.UndefOr[js.Array[String]] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    domainName: js.Array[String] = null,
    fingerprint: String = null,
    name: String = null,
    notes: String = null,
    path: String = null,
    publicId: String = null,
    tagManagerUrl: String = null,
    usageContext: js.Array[String] = null
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (path != null) __obj.updateDynamic("path")(path)
    if (publicId != null) __obj.updateDynamic("publicId")(publicId)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (usageContext != null) __obj.updateDynamic("usageContext")(usageContext)
    __obj.asInstanceOf[Container]
  }
}

