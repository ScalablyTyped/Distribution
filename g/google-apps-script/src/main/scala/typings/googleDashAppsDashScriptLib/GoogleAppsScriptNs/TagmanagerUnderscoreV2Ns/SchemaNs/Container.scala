package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var domainName: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var publicId: js.UndefOr[java.lang.String] = js.undefined
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  var usageContext: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    containerId: java.lang.String = null,
    domainName: js.Array[java.lang.String] = null,
    fingerprint: java.lang.String = null,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    path: java.lang.String = null,
    publicId: java.lang.String = null,
    tagManagerUrl: java.lang.String = null,
    usageContext: js.Array[java.lang.String] = null
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

