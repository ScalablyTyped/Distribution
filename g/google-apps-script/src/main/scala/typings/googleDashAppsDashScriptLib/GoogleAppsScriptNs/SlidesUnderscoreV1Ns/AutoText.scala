package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A TextElement kind that represents auto text.
trait AutoText extends js.Object {
  // The rendered content of this auto text, if available.
  var content: java.lang.String
  // The styling applied to this auto text.
  var style: TextStyle
  // The type of this auto text.
  var `type`: AutoTextType
}

object AutoText {
  @scala.inline
  def apply(content: java.lang.String, style: TextStyle, `type`: AutoTextType): AutoText = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AutoText]
  }
}

