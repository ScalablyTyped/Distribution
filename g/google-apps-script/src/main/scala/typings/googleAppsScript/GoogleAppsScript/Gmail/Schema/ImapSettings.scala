package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapSettings extends js.Object {
  var autoExpunge: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var expungeBehavior: js.UndefOr[String] = js.undefined
  var maxFolderSize: js.UndefOr[Double] = js.undefined
}

object ImapSettings {
  @scala.inline
  def apply(
    autoExpunge: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expungeBehavior: String = null,
    maxFolderSize: js.UndefOr[Double] = js.undefined
  ): ImapSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpunge)) __obj.updateDynamic("autoExpunge")(autoExpunge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (expungeBehavior != null) __obj.updateDynamic("expungeBehavior")(expungeBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFolderSize)) __obj.updateDynamic("maxFolderSize")(maxFolderSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapSettings]
  }
}

