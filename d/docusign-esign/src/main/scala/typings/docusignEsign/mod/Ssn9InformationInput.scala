package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ssn9InformationInput extends js.Object {
  
  /**
    * Specifies the display level for the recipient. Valid values are:
    * * `ReadOnly`
    * * `Editable`
    * * `DoNotDisplay`
    */
  var displayLevelCode: js.UndefOr[String] = js.native
  
  /**
    * The recipient's full Social Security Number (SSN).
    */
  var ssn9: js.UndefOr[String] = js.native
}
object Ssn9InformationInput {
  
  @scala.inline
  def apply(): Ssn9InformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ssn9InformationInput]
  }
  
  @scala.inline
  implicit class Ssn9InformationInputOps[Self <: Ssn9InformationInput] (val x: Self) extends AnyVal {
    
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
    def setSsn9(value: String): Self = this.set("ssn9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsn9: Self = this.set("ssn9", js.undefined)
  }
}
