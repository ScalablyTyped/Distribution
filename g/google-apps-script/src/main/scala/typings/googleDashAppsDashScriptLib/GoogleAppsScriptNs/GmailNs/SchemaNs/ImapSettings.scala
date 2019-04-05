package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapSettings extends js.Object {
  var autoExpunge: js.UndefOr[scala.Boolean] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var expungeBehavior: js.UndefOr[java.lang.String] = js.undefined
  var maxFolderSize: js.UndefOr[scala.Double] = js.undefined
}

object ImapSettings {
  @scala.inline
  def apply(
    autoExpunge: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expungeBehavior: java.lang.String = null,
    maxFolderSize: scala.Int | scala.Double = null
  ): ImapSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpunge)) __obj.updateDynamic("autoExpunge")(autoExpunge)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expungeBehavior != null) __obj.updateDynamic("expungeBehavior")(expungeBehavior)
    if (maxFolderSize != null) __obj.updateDynamic("maxFolderSize")(maxFolderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapSettings]
  }
}

