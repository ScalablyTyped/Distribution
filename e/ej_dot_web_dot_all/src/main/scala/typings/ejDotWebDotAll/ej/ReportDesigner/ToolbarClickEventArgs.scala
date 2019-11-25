package typings.ejDotWebDotAll.ej.ReportDesigner

import typings.ejDotWebDotAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarClickEventArgs extends js.Object {
  /** Name of clicked item.
    */
  var click: js.UndefOr[String] = js.undefined
  /** DOM of the clicked target.
    */
  var target: js.UndefOr[JQuery] = js.undefined
}

object ToolbarClickEventArgs {
  @scala.inline
  def apply(click: String = null, target: JQuery = null): ToolbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarClickEventArgs]
  }
}

