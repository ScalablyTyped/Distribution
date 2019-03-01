package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextParagraph extends js.Object {
  def setText(text: java.lang.String): TextParagraph
}

object TextParagraph {
  @scala.inline
  def apply(setText: js.Function1[java.lang.String, TextParagraph]): TextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setText")(setText)
    __obj.asInstanceOf[TextParagraph]
  }
}

