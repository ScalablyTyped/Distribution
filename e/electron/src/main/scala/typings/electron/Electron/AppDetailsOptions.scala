package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppDetailsOptions extends js.Object {
  /**
    * Index of the icon in `appIconPath`. Ignored when `appIconPath` is not set.
    * Default is `0`.
    */
  var appIconIndex: js.UndefOr[Double] = js.undefined
  /**
    * Window's Relaunch Icon.
    */
  var appIconPath: js.UndefOr[String] = js.undefined
  /**
    * Window's App User Model ID. It has to be set, otherwise the other options will
    * have no effect.
    */
  var appId: js.UndefOr[String] = js.undefined
  /**
    * Window's Relaunch Command.
    */
  var relaunchCommand: js.UndefOr[String] = js.undefined
  /**
    * Window's Relaunch Display Name.
    */
  var relaunchDisplayName: js.UndefOr[String] = js.undefined
}

object AppDetailsOptions {
  @scala.inline
  def apply(
    appIconIndex: js.UndefOr[Double] = js.undefined,
    appIconPath: String = null,
    appId: String = null,
    relaunchCommand: String = null,
    relaunchDisplayName: String = null
  ): AppDetailsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appIconIndex)) __obj.updateDynamic("appIconIndex")(appIconIndex.get.asInstanceOf[js.Any])
    if (appIconPath != null) __obj.updateDynamic("appIconPath")(appIconPath.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (relaunchCommand != null) __obj.updateDynamic("relaunchCommand")(relaunchCommand.asInstanceOf[js.Any])
    if (relaunchDisplayName != null) __obj.updateDynamic("relaunchDisplayName")(relaunchDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppDetailsOptions]
  }
}

