package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class MessageHeaderSourceMutableBuilder[Self <: MessageHeaderSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: ContactPoint): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setEndpoint(value: uri): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSoftware(value: String): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_software(value: Element): Self = StObject.set(x, "_software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_softwareUndefined: Self = StObject.set(x, "_software", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
