package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1ActionParameter extends StObject {
  
  /**
    * The name of the parameter for the action script.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1ActionParameter {
  
  inline def apply(): SchemaGoogleAppsCardV1ActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1ActionParameter]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1ActionParameter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
