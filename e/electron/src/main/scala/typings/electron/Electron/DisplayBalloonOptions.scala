package typings.electron.Electron

import typings.electron.electronStrings.custom
import typings.electron.electronStrings.error
import typings.electron.electronStrings.info
import typings.electron.electronStrings.none
import typings.electron.electronStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayBalloonOptions extends js.Object {
  var content: String
  /**
    * Icon to use when `iconType` is `custom`.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  /**
    * Can be `none`, `info`, `warning`, `error` or `custom`. Default is `custom`.
    */
  var iconType: js.UndefOr[none | info | warning | error | custom] = js.undefined
  /**
    * The large version of the icon should be used. Default is `true`. Maps to
    * `NIIF_LARGE_ICON`.
    */
  var largeIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not play the associated sound. Default is `false`. Maps to `NIIF_NOSOUND`.
    */
  var noSound: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not display the balloon notification if the current user is in "quiet time".
    * Default is `false`. Maps to `NIIF_RESPECT_QUIET_TIME`.
    */
  var respectQuietTime: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object DisplayBalloonOptions {
  @scala.inline
  def apply(
    content: String,
    title: String,
    icon: NativeImage_ | String = null,
    iconType: none | info | warning | error | custom = null,
    largeIcon: js.UndefOr[Boolean] = js.undefined,
    noSound: js.UndefOr[Boolean] = js.undefined,
    respectQuietTime: js.UndefOr[Boolean] = js.undefined
  ): DisplayBalloonOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (!js.isUndefined(largeIcon)) __obj.updateDynamic("largeIcon")(largeIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSound)) __obj.updateDynamic("noSound")(noSound.get.asInstanceOf[js.Any])
    if (!js.isUndefined(respectQuietTime)) __obj.updateDynamic("respectQuietTime")(respectQuietTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayBalloonOptions]
  }
}

