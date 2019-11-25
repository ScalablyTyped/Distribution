package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoText extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AutoText {
  @scala.inline
  def apply(
    content: String = null,
    style: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.TextStyle = null,
    `type`: String = null
  ): AutoText = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoText]
  }
}

