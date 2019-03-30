package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoText extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[TextStyle] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AutoText {
  @scala.inline
  def apply(content: java.lang.String = null, style: TextStyle = null, `type`: java.lang.String = null): AutoText = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AutoText]
  }
}

