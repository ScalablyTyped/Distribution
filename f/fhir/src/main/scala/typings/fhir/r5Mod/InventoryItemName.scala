package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItemName
  extends StObject
     with BackboneElement {
  
  var _language: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * The language that the item name is expressed in.
    */
  var language: String
  
  /**
    * The name or designation that the item is given.
    */
  var name: String
  
  /**
    * The type of name e.g. 'brand-name', 'functional-name', 'common-name'.
    */
  var nameType: Coding
}
object InventoryItemName {
  
  inline def apply(language: String, name: String, nameType: Coding): InventoryItemName = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameType = nameType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItemName] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameType(value: Coding): Self = StObject.set(x, "nameType", value.asInstanceOf[js.Any])
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
