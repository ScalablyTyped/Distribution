package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutPanelOptionsOptions extends js.Object {
  /**
    * The app's name.
    */
  var applicationName: js.UndefOr[String] = js.undefined
  /**
    * The app's version.
    */
  var applicationVersion: js.UndefOr[String] = js.undefined
  /**
    * Copyright information.
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * Credit information.
    */
  var credits: js.UndefOr[String] = js.undefined
  /**
    * Path to the app's icon.
    */
  var iconPath: js.UndefOr[String] = js.undefined
  /**
    * The app's build version number.
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * The app's website.
    */
  var website: js.UndefOr[String] = js.undefined
}

object AboutPanelOptionsOptions {
  @scala.inline
  def apply(
    applicationName: String = null,
    applicationVersion: String = null,
    copyright: String = null,
    credits: String = null,
    iconPath: String = null,
    version: String = null,
    website: String = null
  ): AboutPanelOptionsOptions = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (credits != null) __obj.updateDynamic("credits")(credits)
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath)
    if (version != null) __obj.updateDynamic("version")(version)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[AboutPanelOptionsOptions]
  }
}

