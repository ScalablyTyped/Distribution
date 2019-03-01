package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorEventArgs extends js.Object {
  /** returns the error details
    */
  var msg: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxErrorEventArgs {
  @scala.inline
  def apply(msg: java.lang.String = null): AjaxErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (msg != null) __obj.updateDynamic("msg")(msg)
    __obj.asInstanceOf[AjaxErrorEventArgs]
  }
}

