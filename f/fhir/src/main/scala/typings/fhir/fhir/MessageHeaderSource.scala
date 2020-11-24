package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message source application
  */
@js.native
trait MessageHeaderSource extends BackboneElement {
  
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'software'.
    */
  var _software: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Human contact for problems
    */
  var contact: js.UndefOr[ContactPoint] = js.native
  
  /**
    * Actual message source address or id
    */
  var endpoint: uri = js.native
  
  /**
    * Name of system
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Name of software running the system
    */
  var software: js.UndefOr[String] = js.native
  
  /**
    * Version of software running
    */
  var version: js.UndefOr[String] = js.native
}
object MessageHeaderSource {
  
  @scala.inline
  def apply(endpoint: uri): MessageHeaderSource = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderSource]
  }
  
  @scala.inline
  implicit class MessageHeaderSourceOps[Self <: MessageHeaderSource] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: uri): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endpoint(value: Element): Self = this.set("_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_endpoint: Self = this.set("_endpoint", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_software(value: Element): Self = this.set("_software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_software: Self = this.set("_software", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setContact(value: ContactPoint): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSoftware(value: String): Self = this.set("software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftware: Self = this.set("software", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
