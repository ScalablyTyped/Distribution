package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItemDescription
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _language: js.UndefOr[Element] = js.undefined
  
  /**
    * Textual description of the item.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The language for the item description, when an item must be described in different languages and those languages may be authoritative and not translations of a 'main' language.
    */
  var language: js.UndefOr[String] = js.undefined
}
object InventoryItemDescription {
  
  inline def apply(): InventoryItemDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItemDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItemDescription] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
  }
}
