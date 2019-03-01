package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureResizeEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the signature is added.
    */
  var pageNumber: js.UndefOr[scala.Double] = js.undefined
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SignatureResizeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    pageNumber: scala.Int | scala.Double = null,
    signatureCurrentBound: js.Array[_] = null,
    signaturePreviousBound: js.Array[_] = null,
    signatureSettings: js.Any = null,
    `type`: java.lang.String = null
  ): SignatureResizeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (signatureCurrentBound != null) __obj.updateDynamic("signatureCurrentBound")(signatureCurrentBound)
    if (signaturePreviousBound != null) __obj.updateDynamic("signaturePreviousBound")(signaturePreviousBound)
    if (signatureSettings != null) __obj.updateDynamic("signatureSettings")(signatureSettings)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SignatureResizeEventArgs]
  }
}

