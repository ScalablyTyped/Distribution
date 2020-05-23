package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureResizeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the signature is added.
    */
  var pageNumber: js.UndefOr[Double] = js.undefined
  /** Returns the current bounds of the signature resized in the page of the PDF document.
    */
  var signatureCurrentBound: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the previous bounds of the signature resized in the page of the PDF document.
    */
  var signaturePreviousBound: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the settings of the signature added to the PDF document.
    */
  var signatureSettings: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SignatureResizeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    pageNumber: js.UndefOr[Double] = js.undefined,
    signatureCurrentBound: js.Array[_] = null,
    signaturePreviousBound: js.Array[_] = null,
    signatureSettings: js.Any = null,
    `type`: String = null
  ): SignatureResizeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(pageNumber)) __obj.updateDynamic("pageNumber")(pageNumber.get.asInstanceOf[js.Any])
    if (signatureCurrentBound != null) __obj.updateDynamic("signatureCurrentBound")(signatureCurrentBound.asInstanceOf[js.Any])
    if (signaturePreviousBound != null) __obj.updateDynamic("signaturePreviousBound")(signaturePreviousBound.asInstanceOf[js.Any])
    if (signatureSettings != null) __obj.updateDynamic("signatureSettings")(signatureSettings.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureResizeEventArgs]
  }
}

