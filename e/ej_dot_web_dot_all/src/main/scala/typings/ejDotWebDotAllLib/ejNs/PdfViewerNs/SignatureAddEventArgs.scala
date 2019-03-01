package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureAddEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the signature is added.
    */
  var pageNumber: js.UndefOr[scala.Double] = js.undefined
  /** Returns the bounds of the signature added in the page of the PDF document.
    */
  var signatureBound: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the settings of the signature added to the PDF document.
    */
  var signatureSettings: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SignatureAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    pageNumber: scala.Int | scala.Double = null,
    signatureBound: js.Array[_] = null,
    signatureSettings: js.Any = null,
    `type`: java.lang.String = null
  ): SignatureAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (signatureBound != null) __obj.updateDynamic("signatureBound")(signatureBound)
    if (signatureSettings != null) __obj.updateDynamic("signatureSettings")(signatureSettings)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SignatureAddEventArgs]
  }
}

