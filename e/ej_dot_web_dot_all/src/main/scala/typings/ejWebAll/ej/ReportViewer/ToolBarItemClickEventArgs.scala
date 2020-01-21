package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarItemClickEventArgs extends js.Object {
  /** returns the Toolbar item rendered index
    */
  var Index: js.UndefOr[String] = js.undefined
  /** returns the CSS class name specified for the toolbar item
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** returns the Toolbar item rendered group index
    */
  var groupIndex: js.UndefOr[String] = js.undefined
  /** returns the toolbar clicked item name .
    */
  var target: js.UndefOr[String] = js.undefined
  /** returns the Toolbar item value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ToolBarItemClickEventArgs {
  @scala.inline
  def apply(
    Index: String = null,
    cssClass: String = null,
    groupIndex: String = null,
    target: String = null,
    value: String = null
  ): ToolBarItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Index != null) __obj.updateDynamic("Index")(Index.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarItemClickEventArgs]
  }
}

