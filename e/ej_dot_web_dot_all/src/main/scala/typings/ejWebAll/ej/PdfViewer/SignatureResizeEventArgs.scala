package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureResizeEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the page number in which the signature is added.
    */
  var pageNumber: js.UndefOr[Double] = js.native
  
  /** Returns the current bounds of the signature resized in the page of the PDF document.
    */
  var signatureCurrentBound: js.UndefOr[js.Array[_]] = js.native
  
  /** Returns the previous bounds of the signature resized in the page of the PDF document.
    */
  var signaturePreviousBound: js.UndefOr[js.Array[_]] = js.native
  
  /** Returns the settings of the signature added to the PDF document.
    */
  var signatureSettings: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object SignatureResizeEventArgs {
  
  @scala.inline
  def apply(): SignatureResizeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureResizeEventArgs]
  }
  
  @scala.inline
  implicit class SignatureResizeEventArgsOps[Self <: SignatureResizeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setSignatureCurrentBoundVarargs(value: js.Any*): Self = this.set("signatureCurrentBound", js.Array(value :_*))
    
    @scala.inline
    def setSignatureCurrentBound(value: js.Array[_]): Self = this.set("signatureCurrentBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureCurrentBound: Self = this.set("signatureCurrentBound", js.undefined)
    
    @scala.inline
    def setSignaturePreviousBoundVarargs(value: js.Any*): Self = this.set("signaturePreviousBound", js.Array(value :_*))
    
    @scala.inline
    def setSignaturePreviousBound(value: js.Array[_]): Self = this.set("signaturePreviousBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignaturePreviousBound: Self = this.set("signaturePreviousBound", js.undefined)
    
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
