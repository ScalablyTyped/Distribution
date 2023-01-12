package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionMapping
  extends StObject
     with Element {
  
  var _identity: js.UndefOr[Element] = js.undefined
  
  var _language: js.UndefOr[Element] = js.undefined
  
  var _map: js.UndefOr[Element] = js.undefined
  
  /**
    * An internal reference to the definition of a mapping.
    */
  var identity: String
  
  /**
    * Identifies the computable language in which mapping.map is expressed.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Expresses what part of the target specification corresponds to this element.
    */
  var map: String
}
object ElementDefinitionMapping {
  
  inline def apply(identity: String, map: String): ElementDefinitionMapping = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDefinitionMapping] (val x: Self) extends AnyVal {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def set_identity(value: Element): Self = StObject.set(x, "_identity", value.asInstanceOf[js.Any])
    
    inline def set_identityUndefined: Self = StObject.set(x, "_identity", js.undefined)
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    inline def set_map(value: Element): Self = StObject.set(x, "_map", value.asInstanceOf[js.Any])
    
    inline def set_mapUndefined: Self = StObject.set(x, "_map", js.undefined)
  }
}
