package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatement2Implementation
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * The organization responsible for the management of the instance and oversight of the data on the server at the specified URL.
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  
  /**
    * Information about the specific installation that this capability statement relates to.
    */
  var description: String
  
  /**
    * An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
    */
  var url: js.UndefOr[String] = js.undefined
}
object CapabilityStatement2Implementation {
  
  inline def apply(description: String): CapabilityStatement2Implementation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatement2Implementation]
  }
  
  extension [Self <: CapabilityStatement2Implementation](x: Self) {
    
    inline def setCustodian(value: Reference): Self = StObject.set(x, "custodian", value.asInstanceOf[js.Any])
    
    inline def setCustodianUndefined: Self = StObject.set(x, "custodian", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
