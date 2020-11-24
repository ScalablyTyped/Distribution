package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DobInformationInput extends js.Object {
  
  /**
    * Specifies the recipient's date, month, and year of birth.
    */
  var dateOfBirth: js.UndefOr[String] = js.native
  
  /**
    * Specifies the display level for the recipient. Valid values are:
    * * `ReadOnly`
    * * `Editable`
    * * `DoNotDisplay`
    */
  var displayLevelCode: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that specifies whether the information must be returned in the response.
    */
  var receiveInResponse: js.UndefOr[String] = js.native
}
object DobInformationInput {
  
  @scala.inline
  def apply(): DobInformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DobInformationInput]
  }
  
  @scala.inline
  implicit class DobInformationInputOps[Self <: DobInformationInput] (val x: Self) extends AnyVal {
    
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
    def setDateOfBirth(value: String): Self = this.set("dateOfBirth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateOfBirth: Self = this.set("dateOfBirth", js.undefined)
    
    @scala.inline
    def setDisplayLevelCode(value: String): Self = this.set("displayLevelCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLevelCode: Self = this.set("displayLevelCode", js.undefined)
    
    @scala.inline
    def setReceiveInResponse(value: String): Self = this.set("receiveInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveInResponse: Self = this.set("receiveInResponse", js.undefined)
  }
}
