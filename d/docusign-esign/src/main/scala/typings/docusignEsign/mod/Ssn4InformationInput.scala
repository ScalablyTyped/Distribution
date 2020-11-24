package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ssn4InformationInput extends js.Object {
  
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
  
  /**
    * The last four digits of the recipient's Social Security Number (SSN).
    */
  var ssn4: js.UndefOr[String] = js.native
}
object Ssn4InformationInput {
  
  @scala.inline
  def apply(): Ssn4InformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ssn4InformationInput]
  }
  
  @scala.inline
  implicit class Ssn4InformationInputOps[Self <: Ssn4InformationInput] (val x: Self) extends AnyVal {
    
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
    def setDisplayLevelCode(value: String): Self = this.set("displayLevelCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLevelCode: Self = this.set("displayLevelCode", js.undefined)
    
    @scala.inline
    def setReceiveInResponse(value: String): Self = this.set("receiveInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveInResponse: Self = this.set("receiveInResponse", js.undefined)
    
    @scala.inline
    def setSsn4(value: String): Self = this.set("ssn4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsn4: Self = this.set("ssn4", js.undefined)
  }
}
