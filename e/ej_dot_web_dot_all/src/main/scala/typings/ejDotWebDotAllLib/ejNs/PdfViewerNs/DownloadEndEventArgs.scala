package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadEndEventArgs extends js.Object {
  /** true, if the event should be canceled; otherwise, false
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the name of the file being displayed in the PDF viewer.
    */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the status about the download is completed or aborted.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

