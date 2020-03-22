package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConstants.AnonDev
import typings.expoConstants.AnonDictkey
import typings.expoConstants.AnonIcon
import typings.expoConstants.AnonTool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppManifest
  extends /* key */ StringDictionary[js.Any] {
  var bundleUrl: String
  var debuggerHost: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var developer: js.UndefOr[AnonTool] = js.undefined
  var entryPoint: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[AnonIcon] = js.undefined
  var logUrl: js.UndefOr[String] = js.undefined
  var mainModuleName: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notification: js.UndefOr[AnonDictkey] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var packagerOpts: js.UndefOr[AnonDev] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  /** Published Apps Only */
  var revisionId: js.UndefOr[String] = js.undefined
  var sdkVersion: js.UndefOr[String] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var xde: js.UndefOr[Boolean] = js.undefined
}

object AppManifest {
  @scala.inline
  def apply(
    bundleUrl: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    debuggerHost: String = null,
    description: String = null,
    developer: AnonTool = null,
    entryPoint: String = null,
    icon: String = null,
    loading: AnonIcon = null,
    logUrl: String = null,
    mainModuleName: String = null,
    name: String = null,
    notification: AnonDictkey = null,
    orientation: String = null,
    packagerOpts: AnonDev = null,
    primaryColor: String = null,
    revisionId: String = null,
    sdkVersion: String = null,
    slug: String = null,
    version: String = null,
    xde: js.UndefOr[Boolean] = js.undefined
  ): AppManifest = {
    val __obj = js.Dynamic.literal(bundleUrl = bundleUrl.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (debuggerHost != null) __obj.updateDynamic("debuggerHost")(debuggerHost.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (developer != null) __obj.updateDynamic("developer")(developer.asInstanceOf[js.Any])
    if (entryPoint != null) __obj.updateDynamic("entryPoint")(entryPoint.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl.asInstanceOf[js.Any])
    if (mainModuleName != null) __obj.updateDynamic("mainModuleName")(mainModuleName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (packagerOpts != null) __obj.updateDynamic("packagerOpts")(packagerOpts.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (sdkVersion != null) __obj.updateDynamic("sdkVersion")(sdkVersion.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(xde)) __obj.updateDynamic("xde")(xde.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppManifest]
  }
}

