package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerFormsFormDataResponse extends js.Object {
  
  /**
    * An array containing PowerForm data.
    */
  var envelopes: js.UndefOr[js.Array[PowerFormFormDataEnvelope]] = js.native
}
object PowerFormsFormDataResponse {
  
  @scala.inline
  def apply(): PowerFormsFormDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormsFormDataResponse]
  }
  
  @scala.inline
  implicit class PowerFormsFormDataResponseOps[Self <: PowerFormsFormDataResponse] (val x: Self) extends AnyVal {
    
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
    def setEnvelopesVarargs(value: PowerFormFormDataEnvelope*): Self = this.set("envelopes", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopes(value: js.Array[PowerFormFormDataEnvelope]): Self = this.set("envelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopes: Self = this.set("envelopes", js.undefined)
  }
}
