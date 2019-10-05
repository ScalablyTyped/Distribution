package typings.ejDotWebDotAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLoadEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF document name displaying in the PDF viewer.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DocumentLoadEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    model: js.Any = null,
    `type`: String = null
  ): DocumentLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DocumentLoadEventArgs]
  }
}

