package typings
package firefoxDashWebextDashBrowserLib.browserNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an installed extension. */
trait ExtensionInfo extends js.Object {
  /** The description of this extension. */
  var description: java.lang.String
  /** A reason the item is disabled. */
  var disabledReason: js.UndefOr[ExtensionDisabledReason] = js.undefined
  /** Whether it is currently enabled or disabled. */
  var enabled: scala.Boolean
  /** The URL of the homepage of this extension. */
  var homepageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Returns a list of host based permissions. */
  var hostPermissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual
    * image at that url may be larger or smaller than what was declared, so you might consider using explicit
    * width and height attributes on img tags referencing these images. See the manifest documentation on icons
    * for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.undefined
  /** The extension's unique identifier. */
  var id: java.lang.String
  /** How the extension was installed. */
  var installType: ExtensionInstallType
  /** Whether this extension can be disabled or uninstalled by the user. */
  var mayDisable: scala.Boolean
  /** The name of this extension. */
  var name: java.lang.String
  /** The url for the item's options page, if it has one. */
  var optionsUrl: java.lang.String
  /** Returns a list of API based permissions. */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A short version of the name of this extension. */
  var shortName: js.UndefOr[java.lang.String] = js.undefined
  /** The type of this extension, 'extension' or 'theme'. */
  var `type`: ExtensionType
  /** The update URL of this extension. */
  var updateUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The version of this extension. */
  var version: java.lang.String
  /** The version name of this extension if the manifest specified one. */
  var versionName: js.UndefOr[java.lang.String] = js.undefined
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: java.lang.String,
    enabled: scala.Boolean,
    id: java.lang.String,
    installType: ExtensionInstallType,
    mayDisable: scala.Boolean,
    name: java.lang.String,
    optionsUrl: java.lang.String,
    `type`: ExtensionType,
    version: java.lang.String,
    disabledReason: ExtensionDisabledReason = null,
    homepageUrl: java.lang.String = null,
    hostPermissions: js.Array[java.lang.String] = null,
    icons: js.Array[IconInfo] = null,
    permissions: js.Array[java.lang.String] = null,
    shortName: java.lang.String = null,
    updateUrl: java.lang.String = null,
    versionName: java.lang.String = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description, enabled = enabled, id = id, installType = installType, mayDisable = mayDisable, name = name, optionsUrl = optionsUrl, version = version)
    __obj.updateDynamic("type")(`type`)
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason)
    if (homepageUrl != null) __obj.updateDynamic("homepageUrl")(homepageUrl)
    if (hostPermissions != null) __obj.updateDynamic("hostPermissions")(hostPermissions)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (shortName != null) __obj.updateDynamic("shortName")(shortName)
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl)
    if (versionName != null) __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[ExtensionInfo]
  }
}

