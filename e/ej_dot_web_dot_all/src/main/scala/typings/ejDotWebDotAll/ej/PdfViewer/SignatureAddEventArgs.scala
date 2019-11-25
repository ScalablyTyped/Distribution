package typings.ejDotWebDotAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureAddEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the signature is added.
    */
  var pageNumber: js.UndefOr[Double] = js.undefined
  /** Returns the bounds of the signature added in the page of the PDF document.
    */
  var signatureBound: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the settings of the signature added to the PDF document.
    */
  var signatureSettings: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SignatureAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    pageNumber: Int | Double = null,
    signatureBound: js.Array[_] = null,
    signatureSettings: js.Any = null,
    `type`: String = null
  ): SignatureAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (signatureBound != null) __obj.updateDynamic("signatureBound")(signatureBound.asInstanceOf[js.Any])
    if (signatureSettings != null) __obj.updateDynamic("signatureSettings")(signatureSettings.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureAddEventArgs]
  }
}

