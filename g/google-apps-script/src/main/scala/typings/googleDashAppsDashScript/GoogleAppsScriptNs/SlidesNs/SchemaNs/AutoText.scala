package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoText extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.TextStyle] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AutoText {
  @scala.inline
  def apply(
    content: String = null,
    style: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.TextStyle = null,
    `type`: String = null
  ): AutoText = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AutoText]
  }
}

