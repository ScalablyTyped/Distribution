package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemoryInfo extends StObject {
  
  /**
    * Total internal storage on device in bytes.
    */
  var totalInternalStorage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total RAM on device in bytes.
    */
  var totalRam: js.UndefOr[String | Null] = js.undefined
}
object SchemaMemoryInfo {
  
  inline def apply(): SchemaMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryInfo]
  }
  
  extension [Self <: SchemaMemoryInfo](x: Self) {
    
    inline def setTotalInternalStorage(value: String): Self = StObject.set(x, "totalInternalStorage", value.asInstanceOf[js.Any])
    
    inline def setTotalInternalStorageNull: Self = StObject.set(x, "totalInternalStorage", null)
    
    inline def setTotalInternalStorageUndefined: Self = StObject.set(x, "totalInternalStorage", js.undefined)
    
    inline def setTotalRam(value: String): Self = StObject.set(x, "totalRam", value.asInstanceOf[js.Any])
    
    inline def setTotalRamNull: Self = StObject.set(x, "totalRam", null)
    
    inline def setTotalRamUndefined: Self = StObject.set(x, "totalRam", js.undefined)
  }
}
