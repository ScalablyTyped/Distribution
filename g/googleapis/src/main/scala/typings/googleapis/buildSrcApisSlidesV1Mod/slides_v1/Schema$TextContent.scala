package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The general text content. The text must reside in a compatible shape (e.g.
  * text box or rectangle) or a table cell in a page.
  */
@js.native
trait Schema$TextContent extends js.Object {
  /**
    * The bulleted lists contained in this text, keyed by list ID.
    */
  var lists: js.UndefOr[StringDictionary[Schema$List]] = js.native
  /**
    * The text contents broken down into its component parts, including styling
    * information. This property is read-only.
    */
  var textElements: js.UndefOr[js.Array[Schema$TextElement]] = js.native
}

object Schema$TextContent {
  @scala.inline
  def apply(lists: StringDictionary[Schema$List] = null, textElements: js.Array[Schema$TextElement] = null): Schema$TextContent = {
    val __obj = js.Dynamic.literal()
    if (lists != null) __obj.updateDynamic("lists")(lists.asInstanceOf[js.Any])
    if (textElements != null) __obj.updateDynamic("textElements")(textElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextContent]
  }
}

