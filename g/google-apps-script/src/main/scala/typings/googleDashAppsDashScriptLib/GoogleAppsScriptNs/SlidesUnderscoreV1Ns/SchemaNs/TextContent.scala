package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContent extends js.Object {
  var lists: js.UndefOr[js.Object] = js.undefined
  var textElements: js.UndefOr[js.Array[TextElement]] = js.undefined
}

object TextContent {
  @scala.inline
  def apply(lists: js.Object = null, textElements: js.Array[TextElement] = null): TextContent = {
    val __obj = js.Dynamic.literal()
    if (lists != null) __obj.updateDynamic("lists")(lists)
    if (textElements != null) __obj.updateDynamic("textElements")(textElements)
    __obj.asInstanceOf[TextContent]
  }
}

