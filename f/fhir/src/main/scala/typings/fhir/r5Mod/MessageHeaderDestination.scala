package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageHeaderDestination
  extends StObject
     with BackboneElement {
  
  var _endpointUrl: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * The url may be a non-resolvable URI for systems that do not use standard network-based addresses.
    */
  var endpointReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The url may be a non-resolvable URI for systems that do not use standard network-based addresses.
    */
  var endpointUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Human-readable name for the target system.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.
    */
  var receiver: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the target end system in situations where the initial message transmission is to an intermediary system.
    */
  var target: js.UndefOr[Reference] = js.undefined
}
object MessageHeaderDestination {
  
  inline def apply(): MessageHeaderDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageHeaderDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageHeaderDestination] (val x: Self) extends AnyVal {
    
    inline def setEndpointReference(value: Reference): Self = StObject.set(x, "endpointReference", value.asInstanceOf[js.Any])
    
    inline def setEndpointReferenceUndefined: Self = StObject.set(x, "endpointReference", js.undefined)
    
    inline def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
    
    inline def setEndpointUrlUndefined: Self = StObject.set(x, "endpointUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReceiver(value: Reference): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def set_endpointUrl(value: Element): Self = StObject.set(x, "_endpointUrl", value.asInstanceOf[js.Any])
    
    inline def set_endpointUrlUndefined: Self = StObject.set(x, "_endpointUrl", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
