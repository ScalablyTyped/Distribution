package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHeaderSource
  extends StObject
     with BackboneElement {
  
  var _endpoint: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _software: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * An e-mail, phone, website or other contact point to use to resolve issues with message communications.
    */
  var contact: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * The id may be a non-resolvable URI for systems that do not use standard network-based addresses.
    */
  var endpoint: String
  
  /**
    * Human-readable name for the source system.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * May include configuration or other information useful in debugging.
    */
  var software: js.UndefOr[String] = js.undefined
  
  /**
    * Can convey versions of multiple systems in situations where a message passes through multiple hands.
    */
  var version: js.UndefOr[String] = js.undefined
}
object MessageHeaderSource {
  
  inline def apply(endpoint: String): MessageHeaderSource = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageHeaderSource] (val x: Self) extends AnyVal {
    
    inline def setContact(value: ContactPoint): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
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
