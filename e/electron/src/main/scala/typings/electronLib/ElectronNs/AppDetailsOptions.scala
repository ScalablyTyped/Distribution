package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppDetailsOptions extends js.Object {
  /**
    * Index of the icon in appIconPath. Ignored when appIconPath is not set. Default
    * is 0.
    */
  var appIconIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Window's .
    */
  var appIconPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Window's . It has to be set, otherwise the other options will have no effect.
    */
  var appId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Window's .
    */
  var relaunchCommand: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Window's .
    */
  var relaunchDisplayName: js.UndefOr[java.lang.String] = js.undefined
}

object AppDetailsOptions {
  @scala.inline
  def apply(
    appIconIndex: scala.Int | scala.Double = null,
    appIconPath: java.lang.String = null,
    appId: java.lang.String = null,
    relaunchCommand: java.lang.String = null,
    relaunchDisplayName: java.lang.String = null
  ): AppDetailsOptions = {
    val __obj = js.Dynamic.literal()
    if (appIconIndex != null) __obj.updateDynamic("appIconIndex")(appIconIndex.asInstanceOf[js.Any])
    if (appIconPath != null) __obj.updateDynamic("appIconPath")(appIconPath)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (relaunchCommand != null) __obj.updateDynamic("relaunchCommand")(relaunchCommand)
    if (relaunchDisplayName != null) __obj.updateDynamic("relaunchDisplayName")(relaunchDisplayName)
    __obj.asInstanceOf[AppDetailsOptions]
  }
}

