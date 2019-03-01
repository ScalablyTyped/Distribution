package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolsCustomUnorderedList extends js.Object {
  /** Specifies the styles for customUnorderedList item.
    */
  var css: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the image for customUnorderedList item.
    */
  var listImage: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the list style for customUnorderedList item.
    */
  var listStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name for customUnorderedList item.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text for customUnorderedList item.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the title for customUnorderedList item.
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object ToolsCustomUnorderedList {
  @scala.inline
  def apply(
    css: java.lang.String = null,
    listImage: java.lang.String = null,
    listStyle: java.lang.String = null,
    name: java.lang.String = null,
    text: java.lang.String = null,
    tooltip: java.lang.String = null
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

