package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarClickEventArgs extends js.Object {
  /** Name of clicked item.
    */
  var click: js.UndefOr[java.lang.String] = js.undefined
  /** DOM of the clicked target.
    */
  var target: js.UndefOr[ejDotWebDotAllLib.JQuery] = js.undefined
}

object ToolbarClickEventArgs {
  @scala.inline
  def apply(click: java.lang.String = null, target: ejDotWebDotAllLib.JQuery = null): ToolbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ToolbarClickEventArgs]
  }
}

