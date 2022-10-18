package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPlacementConfig extends StObject {
  
  var dataLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object CustomPlacementConfig {
  
  inline def apply(): CustomPlacementConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPlacementConfig]
  }
  
  extension [Self <: CustomPlacementConfig](x: Self) {
    
    inline def setDataLocations(value: js.Array[String]): Self = StObject.set(x, "dataLocations", value.asInstanceOf[js.Any])
    
    inline def setDataLocationsUndefined: Self = StObject.set(x, "dataLocations", js.undefined)
    
    inline def setDataLocationsVarargs(value: String*): Self = StObject.set(x, "dataLocations", js.Array(value*))
  }
}
