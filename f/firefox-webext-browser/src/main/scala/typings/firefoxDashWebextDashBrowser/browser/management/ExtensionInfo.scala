package typings.firefoxDashWebextDashBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an installed extension. */
trait ExtensionInfo extends js.Object {
  /** The description of this extension. */
  var description: String
  /** A reason the item is disabled. */
  var disabledReason: js.UndefOr[ExtensionDisabledReason] = js.undefined
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean
  /** The URL of the homepage of this extension. */
  var homepageUrl: js.UndefOr[String] = js.undefined
  /** Returns a list of host based permissions. */
  var hostPermissions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual
    * image at that url may be larger or smaller than what was declared, so you might consider using explicit
    * width and height attributes on img tags referencing these images. See the manifest documentation on icons
    * for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.undefined
  /** The extension's unique identifier. */
  var id: String
  /** How the extension was installed. */
  var installType: ExtensionInstallType
  /** Whether this extension can be disabled or uninstalled by the user. */
  var mayDisable: Boolean
  /** The name of this extension. */
  var name: String
  /** The url for the item's options page, if it has one. */
  var optionsUrl: String
  /** Returns a list of API based permissions. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
  /** A short version of the name of this extension. */
  var shortName: js.UndefOr[String] = js.undefined
  /** The type of this extension, 'extension' or 'theme'. */
  var `type`: ExtensionType
  /** The update URL of this extension. */
  var updateUrl: js.UndefOr[String] = js.undefined
  /** The version of this extension. */
  var version: String
  /** The version name of this extension if the manifest specified one. */
  var versionName: js.UndefOr[String] = js.undefined
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    id: String,
    installType: ExtensionInstallType,
    mayDisable: Boolean,
    name: String,
    optionsUrl: String,
    `type`: ExtensionType,
    version: String,
    disabledReason: ExtensionDisabledReason = null,
    homepageUrl: String = null,
    hostPermissions: js.Array[String] = null,
    icons: js.Array[IconInfo] = null,
    permissions: js.Array[String] = null,
    shortName: String = null,
    updateUrl: String = null,
    versionName: String = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsUrl = optionsUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    if (homepageUrl != null) __obj.updateDynamic("homepageUrl")(homepageUrl.asInstanceOf[js.Any])
    if (hostPermissions != null) __obj.updateDynamic("hostPermissions")(hostPermissions.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
}

