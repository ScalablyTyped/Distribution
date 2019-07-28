package typings.ejDotWebDotAll.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadStartEventArgs extends js.Object {
  /** true, if the event should be canceled; otherwise, false
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the name of the file being displayed in the PDF viewer.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the status about the download is started.
    */
  var status: js.UndefOr[String] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DownloadStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    model: js.Any = null,
    status: String = null,
    `type`: String = null
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

