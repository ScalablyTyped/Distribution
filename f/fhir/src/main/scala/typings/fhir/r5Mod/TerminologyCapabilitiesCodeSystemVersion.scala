package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilitiesCodeSystemVersion
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _compositional: js.UndefOr[Element] = js.undefined
  
  var _isDefault: js.UndefOr[Element] = js.undefined
  
  var _language: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _property: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * For version-less code systems, there should be a single version with no identifier.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * If the compositional grammar defined by the code system is supported.
    */
  var compositional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filter Properties supported.
    */
  var filter: js.UndefOr[js.Array[TerminologyCapabilitiesCodeSystemVersionFilter]] = js.undefined
  
  /**
    * If this is the default version for this code system.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Language Displays supported.
    */
  var language: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Properties supported for $lookup.
    */
  var property: js.UndefOr[js.Array[String]] = js.undefined
}
object TerminologyCapabilitiesCodeSystemVersion {
  
  inline def apply(): TerminologyCapabilitiesCodeSystemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminologyCapabilitiesCodeSystemVersion]
  }
  
  extension [Self <: TerminologyCapabilitiesCodeSystemVersion](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCompositional(value: Boolean): Self = StObject.set(x, "compositional", value.asInstanceOf[js.Any])
    
    inline def setCompositionalUndefined: Self = StObject.set(x, "compositional", js.undefined)
    
    inline def setFilter(value: js.Array[TerminologyCapabilitiesCodeSystemVersionFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: TerminologyCapabilitiesCodeSystemVersionFilter*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setLanguage(value: js.Array[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLanguageVarargs(value: String*): Self = StObject.set(x, "language", js.Array(value*))
    
    inline def setProperty(value: js.Array[String]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: String*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_compositional(value: Element): Self = StObject.set(x, "_compositional", value.asInstanceOf[js.Any])
    
    inline def set_compositionalUndefined: Self = StObject.set(x, "_compositional", js.undefined)
    
    inline def set_isDefault(value: Element): Self = StObject.set(x, "_isDefault", value.asInstanceOf[js.Any])
    
    inline def set_isDefaultUndefined: Self = StObject.set(x, "_isDefault", js.undefined)
    
    inline def set_language(value: js.Array[Element]): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    inline def set_languageVarargs(value: Element*): Self = StObject.set(x, "_language", js.Array(value*))
    
    inline def set_property(value: js.Array[Element]): Self = StObject.set(x, "_property", value.asInstanceOf[js.Any])
    
    inline def set_propertyUndefined: Self = StObject.set(x, "_property", js.undefined)
    
    inline def set_propertyVarargs(value: Element*): Self = StObject.set(x, "_property", js.Array(value*))
  }
}
