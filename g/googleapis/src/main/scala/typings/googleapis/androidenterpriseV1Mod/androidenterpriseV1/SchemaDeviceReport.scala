package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceReport extends StObject {
  
  /**
    * List of app states set by managed apps on the device. App states are defined by the app's developers. This field will always be present.
    */
  var appState: js.UndefOr[js.Array[SchemaAppState]] = js.undefined
  
  /**
    * The timestamp of the last report update in milliseconds since epoch. This field will always be present.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceReport {
  
  inline def apply(): SchemaDeviceReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceReport]
  }
  
  extension [Self <: SchemaDeviceReport](x: Self) {
    
    inline def setAppState(value: js.Array[SchemaAppState]): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
    
    inline def setAppStateUndefined: Self = StObject.set(x, "appState", js.undefined)
    
    inline def setAppStateVarargs(value: SchemaAppState*): Self = StObject.set(x, "appState", js.Array(value*))
    
    inline def setLastUpdatedTimestampMillis(value: String): Self = StObject.set(x, "lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampMillisNull: Self = StObject.set(x, "lastUpdatedTimestampMillis", null)
    
    inline def setLastUpdatedTimestampMillisUndefined: Self = StObject.set(x, "lastUpdatedTimestampMillis", js.undefined)
  }
}
