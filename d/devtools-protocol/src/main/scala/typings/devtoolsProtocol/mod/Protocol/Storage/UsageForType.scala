package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageForType extends StObject {
  
  /**
    * Name of storage type.
    */
  var storageType: StorageType
  
  /**
    * Storage usage (bytes).
    */
  var usage: Double
}
object UsageForType {
  
  inline def apply(storageType: StorageType, usage: Double): UsageForType = {
    val __obj = js.Dynamic.literal(storageType = storageType.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageForType]
  }
  
  extension [Self <: UsageForType](x: Self) {
    
    inline def setStorageType(value: StorageType): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
