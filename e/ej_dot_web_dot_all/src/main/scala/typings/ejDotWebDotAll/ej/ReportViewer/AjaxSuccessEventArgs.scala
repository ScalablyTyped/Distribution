package typings.ejDotWebDotAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSuccessEventArgs extends js.Object {
  /** returns the success data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
}

object AjaxSuccessEventArgs {
  @scala.inline
  def apply(data: js.Any = null): AjaxSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSuccessEventArgs]
  }
}

