package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorDefinition extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var foreground: js.UndefOr[java.lang.String] = js.undefined
}

object ColorDefinition {
  @scala.inline
  def apply(background: java.lang.String = null, foreground: java.lang.String = null): ColorDefinition = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (foreground != null) __obj.updateDynamic("foreground")(foreground)
    __obj.asInstanceOf[ColorDefinition]
  }
}

