package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object LabelColor {
  @scala.inline
  def apply(backgroundColor: String = null, textColor: String = null): LabelColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[LabelColor]
  }
}

