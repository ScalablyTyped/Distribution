package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about individual election officials.
  */
@js.native
trait SchemaElectionOfficial extends js.Object {
  
  /**
    * The email address of the election official.
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * The fax number of the election official.
    */
  var faxNumber: js.UndefOr[String] = js.native
  
  /**
    * The full name of the election official.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The office phone number of the election official.
    */
  var officePhoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The title of the election official.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaElectionOfficial {
  
  @scala.inline
  def apply(): SchemaElectionOfficial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectionOfficial]
  }
  
  @scala.inline
  implicit class SchemaElectionOfficialOps[Self <: SchemaElectionOfficial] (val x: Self) extends AnyVal {
    
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
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setFaxNumber(value: String): Self = this.set("faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxNumber: Self = this.set("faxNumber", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOfficePhoneNumber(value: String): Self = this.set("officePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficePhoneNumber: Self = this.set("officePhoneNumber", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
