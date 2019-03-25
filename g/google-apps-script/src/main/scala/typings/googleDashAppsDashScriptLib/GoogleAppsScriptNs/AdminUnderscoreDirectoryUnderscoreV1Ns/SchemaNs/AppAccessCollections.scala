package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppAccessCollections extends js.Object {
  var blockedApiAccessBuckets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enforceSettingsForAndroidDrive: js.UndefOr[scala.Boolean] = js.undefined
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
  var trustDomainOwnedApps: js.UndefOr[scala.Boolean] = js.undefined
}

object AppAccessCollections {
  @scala.inline
  def apply(
    blockedApiAccessBuckets: js.Array[java.lang.String] = null,
    enforceSettingsForAndroidDrive: js.UndefOr[scala.Boolean] = js.undefined,
    errorMessage: java.lang.String = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    resourceId: java.lang.String = null,
    resourceName: java.lang.String = null,
    trustDomainOwnedApps: js.UndefOr[scala.Boolean] = js.undefined
  ): AppAccessCollections = {
    val __obj = js.Dynamic.literal()
    if (blockedApiAccessBuckets != null) __obj.updateDynamic("blockedApiAccessBuckets")(blockedApiAccessBuckets)
    if (!js.isUndefined(enforceSettingsForAndroidDrive)) __obj.updateDynamic("enforceSettingsForAndroidDrive")(enforceSettingsForAndroidDrive)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (!js.isUndefined(trustDomainOwnedApps)) __obj.updateDynamic("trustDomainOwnedApps")(trustDomainOwnedApps)
    __obj.asInstanceOf[AppAccessCollections]
  }
}

