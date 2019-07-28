package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineFill extends js.Object {
  var solidFill: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.SolidFill] = js.undefined
}

object LineFill {
  @scala.inline
  def apply(solidFill: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.SolidFill = null): LineFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill)
    __obj.asInstanceOf[LineFill]
  }
}

