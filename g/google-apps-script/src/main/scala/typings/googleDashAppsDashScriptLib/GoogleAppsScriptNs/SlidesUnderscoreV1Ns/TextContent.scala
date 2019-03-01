package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContent extends js.Object {
  // The bulleted lists contained in this text, keyed by list ID.
  var lists: js.Array[java.lang.String]
  // The text contents broken down into its component parts, including styling
  // information. This property is read-only.
  var text_elements: js.Array[TextElement]
}

object TextContent {
  @scala.inline
  def apply(lists: js.Array[java.lang.String], text_elements: js.Array[TextElement]): TextContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lists")(lists)
    __obj.updateDynamic("text_elements")(text_elements)
    __obj.asInstanceOf[TextContent]
  }
}

