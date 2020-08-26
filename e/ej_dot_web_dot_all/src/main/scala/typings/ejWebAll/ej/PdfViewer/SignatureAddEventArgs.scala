package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureAddEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the page number in which the signature is added.
    */
  var pageNumber: js.UndefOr[Double] = js.native
  /** Returns the bounds of the signature added in the page of the PDF document.
    */
  var signatureBound: js.UndefOr[js.Array[_]] = js.native
  /** Returns the settings of the signature added to the PDF document.
    */
  var signatureSettings: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object SignatureAddEventArgs {
  @scala.inline
  def apply(): SignatureAddEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureAddEventArgs]
  }
  @scala.inline
  implicit class SignatureAddEventArgsOps[Self <: SignatureAddEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    @scala.inline
    def setSignatureBoundVarargs(value: js.Any*): Self = this.set("signatureBound", js.Array(value :_*))
    @scala.inline
    def setSignatureBound(value: js.Array[_]): Self = this.set("signatureBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureBound: Self = this.set("signatureBound", js.undefined)
    @scala.inline
    def setSignatureSettings(value: js.Any): Self = this.set("signatureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureSettings: Self = this.set("signatureSettings", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

