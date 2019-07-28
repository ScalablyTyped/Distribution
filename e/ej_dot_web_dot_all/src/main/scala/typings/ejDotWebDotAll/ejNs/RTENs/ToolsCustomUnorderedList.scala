package typings.ejDotWebDotAll.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolsCustomUnorderedList extends js.Object {
  /** Specifies the styles for customUnorderedList item.
    */
  var css: js.UndefOr[String] = js.undefined
  /** Specifies the image for customUnorderedList item.
    */
  var listImage: js.UndefOr[String] = js.undefined
  /** Specifies the list style for customUnorderedList item.
    */
  var listStyle: js.UndefOr[String] = js.undefined
  /** Specifies the name for customUnorderedList item.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies the text for customUnorderedList item.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the title for customUnorderedList item.
    */
  var tooltip: js.UndefOr[String] = js.undefined
}

object ToolsCustomUnorderedList {
  @scala.inline
  def apply(
    css: String = null,
    listImage: String = null,
    listStyle: String = null,
    name: String = null,
    text: String = null,
    tooltip: String = null
  ): ToolsCustomUnorderedList = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css)
    if (listImage != null) __obj.updateDynamic("listImage")(listImage)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (name != null) __obj.updateDynamic("name")(name)
    if (text != null) __obj.updateDynamic("text")(text)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ToolsCustomUnorderedList]
  }
}

