package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1SelectionInput extends StObject {
  
  /**
    * An array of the selected items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleAppsCardV1SelectionItem]] = js.undefined
  
  /**
    * The label displayed ahead of the switch control.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the text input which is used in `formInput`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, the form is submitted when the selection changes. If not specified, you must specify a separate button.
    */
  var onChangeAction: js.UndefOr[SchemaGoogleAppsCardV1Action] = js.undefined
  
  /**
    * The type of the selection.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1SelectionInput {
  
  inline def apply(): SchemaGoogleAppsCardV1SelectionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1SelectionInput]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1SelectionInput](x: Self) {
    
    inline def setItems(value: js.Array[SchemaGoogleAppsCardV1SelectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGoogleAppsCardV1SelectionItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChangeAction(value: SchemaGoogleAppsCardV1Action): Self = StObject.set(x, "onChangeAction", value.asInstanceOf[js.Any])
    
    inline def setOnChangeActionUndefined: Self = StObject.set(x, "onChangeAction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
