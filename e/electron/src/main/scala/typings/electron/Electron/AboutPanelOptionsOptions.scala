package typings.electron.Electron

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
    * Path to the app's icon. Will be shown as 64x64 pixels while retaining aspect
    * ratio.
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
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (credits != null) __obj.updateDynamic("credits")(credits.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutPanelOptionsOptions]
  }
}

