package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroupsContentGroupsCustomToolTip extends js.Object {
  /** Sets content to the custom tooltip. Text and HTML support are provided for content.
    * @Default {null}
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Sets icon to the custom tooltip content.
    * @Default {null}
    */
  var prefixIcon: js.UndefOr[java.lang.String] = js.undefined
  /** Sets title to the custom tooltip. Text and HTML support are provided for title and the title is in bold for text format.
    * @Default {null}
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TabsGroupsContentGroupsCustomToolTip {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    prefixIcon: java.lang.String = null,
    title: java.lang.String = null
  ): TabsGroupsContentGroupsCustomToolTip = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (prefixIcon != null) __obj.updateDynamic("prefixIcon")(prefixIcon)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TabsGroupsContentGroupsCustomToolTip]
  }
}

