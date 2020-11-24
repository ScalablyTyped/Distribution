package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectSalesforceField extends js.Object {
  
  var dsAttribute: js.UndefOr[String] = js.native
  
  /**
    * A URL that links to the information in the DocuSign field.
    */
  var dsLink: js.UndefOr[String] = js.native
  
  var dsNode: js.UndefOr[String] = js.native
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.native
  
  var sfField: js.UndefOr[String] = js.native
  
  /**
    * The name of the Salesforce field.
    */
  var sfFieldName: js.UndefOr[String] = js.native
  
  /**
    * The name of the Salesforce folder.
    */
  var sfFolder: js.UndefOr[String] = js.native
  
  var sfLockedValue: js.UndefOr[String] = js.native
}
object ConnectSalesforceField {
  
  @scala.inline
  def apply(): ConnectSalesforceField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectSalesforceField]
  }
  
  @scala.inline
  implicit class ConnectSalesforceFieldOps[Self <: ConnectSalesforceField] (val x: Self) extends AnyVal {
    
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
    def setDsAttribute(value: String): Self = this.set("dsAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDsAttribute: Self = this.set("dsAttribute", js.undefined)
    
    @scala.inline
    def setDsLink(value: String): Self = this.set("dsLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDsLink: Self = this.set("dsLink", js.undefined)
    
    @scala.inline
    def setDsNode(value: String): Self = this.set("dsNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDsNode: Self = this.set("dsNode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSfField(value: String): Self = this.set("sfField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSfField: Self = this.set("sfField", js.undefined)
    
    @scala.inline
    def setSfFieldName(value: String): Self = this.set("sfFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSfFieldName: Self = this.set("sfFieldName", js.undefined)
    
    @scala.inline
    def setSfFolder(value: String): Self = this.set("sfFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSfFolder: Self = this.set("sfFolder", js.undefined)
    
    @scala.inline
    def setSfLockedValue(value: String): Self = this.set("sfLockedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSfLockedValue: Self = this.set("sfLockedValue", js.undefined)
  }
}
