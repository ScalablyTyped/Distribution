package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarItemClickEventArgs extends js.Object {
  /** returns the Toolbar item rendered index
    */
  var Index: js.UndefOr[java.lang.String] = js.undefined
  /** returns the CSS class name specified for the toolbar item
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** returns the Toolbar item rendered group index
    */
  var groupIndex: js.UndefOr[java.lang.String] = js.undefined
  /** returns the toolbar clicked item name .
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** returns the Toolbar item value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ToolBarItemClickEventArgs {
  @scala.inline
  def apply(
    Index: java.lang.String = null,
    cssClass: java.lang.String = null,
    groupIndex: java.lang.String = null,
    target: java.lang.String = null,
    value: java.lang.String = null
  ): ToolBarItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Index != null) __obj.updateDynamic("Index")(Index)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex)
    if (target != null) __obj.updateDynamic("target")(target)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ToolBarItemClickEventArgs]
  }
}

