package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object LabelColor {
  @scala.inline
  def apply(backgroundColor: java.lang.String = null, textColor: java.lang.String = null): LabelColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[LabelColor]
  }
}

