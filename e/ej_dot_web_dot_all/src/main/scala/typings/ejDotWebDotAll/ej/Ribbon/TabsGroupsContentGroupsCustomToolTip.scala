package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroupsContentGroupsCustomToolTip extends js.Object {
  /** Sets content to the custom tooltip. Text and HTML support are provided for content.
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.undefined
  /** Sets icon to the custom tooltip content.
    * @Default {null}
    */
  var prefixIcon: js.UndefOr[String] = js.undefined
  /** Sets title to the custom tooltip. Text and HTML support are provided for title and the title is in bold for text format.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.undefined
}

object TabsGroupsContentGroupsCustomToolTip {
  @scala.inline
  def apply(content: String = null, prefixIcon: String = null, title: String = null): TabsGroupsContentGroupsCustomToolTip = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (prefixIcon != null) __obj.updateDynamic("prefixIcon")(prefixIcon.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsGroupsContentGroupsCustomToolTip]
  }
}

