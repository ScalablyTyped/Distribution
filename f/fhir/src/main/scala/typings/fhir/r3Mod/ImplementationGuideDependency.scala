package typings.fhir.r3Mod

import typings.fhir.fhirStrings.inclusion
import typings.fhir.fhirStrings.reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideDependency
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * For information about processing included guides, see [Including Guides]{implementationguide.html#include}.
    */
  var `type`: reference | inclusion
  
  /**
    * When a guide is published, and the type is 'include', this will be a relative reference within the guide.
    */
  var uri: String
}
object ImplementationGuideDependency {
  
  inline def apply(`type`: reference | inclusion, uri: String): ImplementationGuideDependency = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuideDependency] (val x: Self) extends AnyVal {
    
    inline def setType(value: reference | inclusion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
