package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A TextElement kind that represents a run of text that all has the same
// styling.
trait TextRun extends js.Object {
  // The text of this run.
  var content: java.lang.String
  // The styling applied to this run.
  var style: TextStyle
}

object TextRun {
  @scala.inline
  def apply(content: java.lang.String, style: TextStyle): TextRun = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TextRun]
  }
}

