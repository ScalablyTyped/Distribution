package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logical network location for application activity
  */
@js.native
trait AuditEventAgentNetwork extends BackboneElement {
  
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Identifier for the network access point of the user device
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * The type of network access point
    */
  var `type`: js.UndefOr[code] = js.native
}
object AuditEventAgentNetwork {
  
  @scala.inline
  def apply(): AuditEventAgentNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventAgentNetwork]
  }
  
  @scala.inline
  implicit class AuditEventAgentNetworkOps[Self <: AuditEventAgentNetwork] (val x: Self) extends AnyVal {
    
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
    def set_address(value: Element): Self = this.set("_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_address: Self = this.set("_address", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
