package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyedAppState extends StObject {
  
  /**
    * Additional field intended for machine-readable data. For example, a number or JSON object. To prevent XSS, we recommend removing any HTML from the data before displaying it.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key indicating what the app is providing a state for. The content of the key is set by the app's developer. To prevent XSS, we recommend removing any HTML from the key before displaying it. This field will always be present.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free-form, human-readable message describing the app state. For example, an error message. To prevent XSS, we recommend removing any HTML from the message before displaying it.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Severity of the app state. This field will always be present.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp of when the app set the state in milliseconds since epoch. This field will always be present.
    */
  var stateTimestampMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaKeyedAppState {
  
  inline def apply(): SchemaKeyedAppState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyedAppState]
  }
  
  extension [Self <: SchemaKeyedAppState](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStateTimestampMillis(value: String): Self = StObject.set(x, "stateTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setStateTimestampMillisNull: Self = StObject.set(x, "stateTimestampMillis", null)
    
    inline def setStateTimestampMillisUndefined: Self = StObject.set(x, "stateTimestampMillis", js.undefined)
  }
}
