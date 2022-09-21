package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskUtilization extends StObject {
  
  /**
    * Target bytes read per second.
    */
  var targetReadBytesPerSecond: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Target ops read per seconds.
    */
  var targetReadOpsPerSecond: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Target bytes written per second.
    */
  var targetWriteBytesPerSecond: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Target ops written per second.
    */
  var targetWriteOpsPerSecond: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDiskUtilization {
  
  inline def apply(): SchemaDiskUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskUtilization]
  }
  
  extension [Self <: SchemaDiskUtilization](x: Self) {
    
    inline def setTargetReadBytesPerSecond(value: Double): Self = StObject.set(x, "targetReadBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetReadBytesPerSecondNull: Self = StObject.set(x, "targetReadBytesPerSecond", null)
    
    inline def setTargetReadBytesPerSecondUndefined: Self = StObject.set(x, "targetReadBytesPerSecond", js.undefined)
    
    inline def setTargetReadOpsPerSecond(value: Double): Self = StObject.set(x, "targetReadOpsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetReadOpsPerSecondNull: Self = StObject.set(x, "targetReadOpsPerSecond", null)
    
    inline def setTargetReadOpsPerSecondUndefined: Self = StObject.set(x, "targetReadOpsPerSecond", js.undefined)
    
    inline def setTargetWriteBytesPerSecond(value: Double): Self = StObject.set(x, "targetWriteBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetWriteBytesPerSecondNull: Self = StObject.set(x, "targetWriteBytesPerSecond", null)
    
    inline def setTargetWriteBytesPerSecondUndefined: Self = StObject.set(x, "targetWriteBytesPerSecond", js.undefined)
    
    inline def setTargetWriteOpsPerSecond(value: Double): Self = StObject.set(x, "targetWriteOpsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetWriteOpsPerSecondNull: Self = StObject.set(x, "targetWriteOpsPerSecond", null)
    
    inline def setTargetWriteOpsPerSecondUndefined: Self = StObject.set(x, "targetWriteOpsPerSecond", js.undefined)
  }
}
