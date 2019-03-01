package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContent extends js.Object {
  /** The bulleted lists contained in this text, keyed by list ID. */
  var lists: js.UndefOr[stdLib.Record[java.lang.String, List]] = js.undefined
  /**
    * The text contents broken down into its component parts, including styling
    * information. This property is read-only.
    */
  var textElements: js.UndefOr[js.Array[TextElement]] = js.undefined
}

object TextContent {
  @scala.inline
  def apply(lists: stdLib.Record[java.lang.String, List] = null, textElements: js.Array[TextElement] = null): TextContent = {
    val __obj = js.Dynamic.literal()
    if (lists != null) __obj.updateDynamic("lists")(lists)
    if (textElements != null) __obj.updateDynamic("textElements")(textElements)
    __obj.asInstanceOf[TextContent]
  }
}

