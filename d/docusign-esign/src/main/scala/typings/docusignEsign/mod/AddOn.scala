package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOn extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var active: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var addOnId: js.UndefOr[String] = js.native
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var name: js.UndefOr[String] = js.native
}
object AddOn {
  
  @scala.inline
  def apply(): AddOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOn]
  }
  
  @scala.inline
  implicit class AddOnOps[Self <: AddOn] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAddOnId(value: String): Self = this.set("addOnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOnId: Self = this.set("addOnId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
