package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowErrorEventArgs extends js.Object {
  /** true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the detailed error information.
    */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /** returns the error code.
    */
  var errorCode: js.UndefOr[java.lang.String] = js.undefined
  /** returns the error message.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object ShowErrorEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    detail: java.lang.String = null,
    errorCode: java.lang.String = null,
    message: java.lang.String = null
  ): ShowErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ShowErrorEventArgs]
  }
}

