package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRun extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[TextStyle] = js.undefined
}

object TextRun {
  @scala.inline
  def apply(content: String = null, style: TextStyle = null): TextRun = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRun]
  }
}

