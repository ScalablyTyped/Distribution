package typings.ejDotWebDotAll.ej.ReportDesigner

import typings.ejDotWebDotAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenReportClickEventArgs extends js.Object {
  /** Name of selected item.
    */
  var select: js.UndefOr[String] = js.undefined
  /** DOM of the clicked target.
    */
  var target: js.UndefOr[JQuery] = js.undefined
}

object OpenReportClickEventArgs {
  @scala.inline
  def apply(select: String = null, target: JQuery = null): OpenReportClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (select != null) __obj.updateDynamic("select")(select)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[OpenReportClickEventArgs]
  }
}

