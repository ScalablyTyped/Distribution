package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadStartEventArgs extends js.Object {
  /** true, if the event should be canceled; otherwise, false
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the name of the file being displayed in the PDF viewer.
    */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the status about the download is started.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DownloadStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    fileName: java.lang.String = null,
    model: js.Any = null,
    status: java.lang.String = null,
    `type`: java.lang.String = null
  ): DownloadStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (model != null) __obj.updateDynamic("model")(model)
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DownloadStartEventArgs]
  }
}

