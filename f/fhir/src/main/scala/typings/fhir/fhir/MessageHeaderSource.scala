package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message source application
  */
trait MessageHeaderSource
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'software'.
    */
  var _software: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Human contact for problems
    */
  var contact: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * Actual message source address or id
    */
  var endpoint: uri
  
  /**
    * Name of system
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Name of software running the system
    */
  var software: js.UndefOr[String] = js.undefined
  
  /**
    * Version of software running
    */
  var version: js.UndefOr[String] = js.undefined
}
object MessageHeaderSource {
  
  inline def apply(endpoint: uri): MessageHeaderSource = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderSource]
  }
  
  extension [Self <: MessageHeaderSource](x: Self) {
    
    inline def setContact(value: ContactPoint): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setEndpoint(value: uri): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSoftware(value: String): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_endpoint(value: Element): Self = StObject.set(x, "_endpoint", value.asInstanceOf[js.Any])
    
    inline def set_endpointUndefined: Self = StObject.set(x, "_endpoint", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_software(value: Element): Self = StObject.set(x, "_software", value.asInstanceOf[js.Any])
    
    inline def set_softwareUndefined: Self = StObject.set(x, "_software", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
