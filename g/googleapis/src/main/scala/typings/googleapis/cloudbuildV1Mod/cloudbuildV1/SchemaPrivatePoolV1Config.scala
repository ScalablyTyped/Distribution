package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivatePoolV1Config extends StObject {
  
  /**
    * Network configuration for the pool.
    */
  var networkConfig: js.UndefOr[SchemaNetworkConfig] = js.undefined
  
  /**
    * Machine configuration for the workers in the pool.
    */
  var workerConfig: js.UndefOr[SchemaWorkerConfig] = js.undefined
}
object SchemaPrivatePoolV1Config {
  
  inline def apply(): SchemaPrivatePoolV1Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivatePoolV1Config]
  }
  
  extension [Self <: SchemaPrivatePoolV1Config](x: Self) {
    
    inline def setNetworkConfig(value: SchemaNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setWorkerConfig(value: SchemaWorkerConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
