package typings.ejDotWebDotAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolsCustomOrderedList extends js.Object {
  /** Specifies the styles for customOrderedList item.
    */
  var css: js.UndefOr[String] = js.undefined
  /** Specifies the image for customOrderedList item.
    */
  var listImage: js.UndefOr[String] = js.undefined
  /** Specifies the list style for customOrderedList item.
    */
  var listStyle: js.UndefOr[String] = js.undefined
  /** Specifies the name for customOrderedList item.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies the text for customOrderedList item.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the title for customOrderedList item.
    */
  var tooltip: js.UndefOr[String] = js.undefined
}

object ToolsCustomOrderedList {
  @scala.inline
  def apply(
    css: String = null,
    listImage: String = null,
    listStyle: String = null,
    name: String = null,
    text: String = null,
    tooltip: String = null
  ): ToolsCustomOrderedList = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (listImage != null) __obj.updateDynamic("listImage")(listImage.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolsCustomOrderedList]
  }
}

