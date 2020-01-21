package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorEventArgs extends js.Object {
  /** returns the error details
    */
  var msg: js.UndefOr[String] = js.undefined
}

object AjaxErrorEventArgs {
  @scala.inline
  def apply(msg: String = null): AjaxErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxErrorEventArgs]
  }
}

