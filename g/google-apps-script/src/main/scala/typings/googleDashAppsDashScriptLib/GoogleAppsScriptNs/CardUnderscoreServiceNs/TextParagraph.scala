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
  def apply(setText: java.lang.String => TextParagraph): TextParagraph = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[TextParagraph]
  }
}

