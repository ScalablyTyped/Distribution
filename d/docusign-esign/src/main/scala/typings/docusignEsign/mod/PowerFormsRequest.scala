package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerFormsRequest extends js.Object {
  
  /**
    * An array of PowerForm objects.
    */
  var powerForms: js.UndefOr[js.Array[/* Contains details about a PowerForm. */ PowerForm]] = js.native
}
object PowerFormsRequest {
  
  @scala.inline
  def apply(): PowerFormsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormsRequest]
  }
  
  @scala.inline
  implicit class PowerFormsRequestOps[Self <: PowerFormsRequest] (val x: Self) extends AnyVal {
    
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
    def setPowerFormsVarargs(value: (/* Contains details about a PowerForm. */ PowerForm)*): Self = this.set("powerForms", js.Array(value :_*))
    
    @scala.inline
    def setPowerForms(value: js.Array[/* Contains details about a PowerForm. */ PowerForm]): Self = this.set("powerForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerForms: Self = this.set("powerForms", js.undefined)
  }
}
