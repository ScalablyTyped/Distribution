package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1SwitchControl extends StObject {
  
  /**
    * The control type, either switch or checkbox.
    */
  var controlType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the switch widget that's used in `formInput`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The action when the switch state is changed.
    */
  var onChangeAction: js.UndefOr[SchemaGoogleAppsCardV1Action] = js.undefined
  
  /**
    * If the switch is selected.
    */
  var selected: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value is what is passed back in the callback.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1SwitchControl {
  
  inline def apply(): SchemaGoogleAppsCardV1SwitchControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1SwitchControl]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1SwitchControl](x: Self) {
    
    inline def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setControlTypeNull: Self = StObject.set(x, "controlType", null)
    
    inline def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChangeAction(value: SchemaGoogleAppsCardV1Action): Self = StObject.set(x, "onChangeAction", value.asInstanceOf[js.Any])
    
    inline def setOnChangeActionUndefined: Self = StObject.set(x, "onChangeAction", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedNull: Self = StObject.set(x, "selected", null)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
