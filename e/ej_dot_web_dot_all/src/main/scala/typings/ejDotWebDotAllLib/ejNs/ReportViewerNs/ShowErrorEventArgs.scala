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

