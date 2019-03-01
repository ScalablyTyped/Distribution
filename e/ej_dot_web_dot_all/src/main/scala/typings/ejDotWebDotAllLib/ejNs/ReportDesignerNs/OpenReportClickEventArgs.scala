package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenReportClickEventArgs extends js.Object {
  /** Name of selected item.
    */
  var select: js.UndefOr[java.lang.String] = js.undefined
  /** DOM of the clicked target.
    */
  var target: js.UndefOr[ejDotWebDotAllLib.JQuery] = js.undefined
}

object OpenReportClickEventArgs {
  @scala.inline
  def apply(select: java.lang.String = null, target: ejDotWebDotAllLib.JQuery = null): OpenReportClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (select != null) __obj.updateDynamic("select")(select)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[OpenReportClickEventArgs]
  }
}

