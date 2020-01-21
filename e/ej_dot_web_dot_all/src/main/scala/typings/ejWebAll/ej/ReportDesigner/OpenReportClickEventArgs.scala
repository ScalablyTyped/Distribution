package typings.ejWebAll.ej.ReportDesigner

import typings.ejWebAll.JQuery
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
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenReportClickEventArgs]
  }
}

