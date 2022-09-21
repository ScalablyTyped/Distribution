package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkUtilization extends StObject {
  
  /**
    * Target bytes received per second.
    */
  var targetReceivedBytesPerSecond: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Target packets received per second.
    */
  var targetReceivedPacketsPerSecond: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Target bytes sent per second.
    */
  var targetSentBytesPerSecond: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Target packets sent per second.
    */
  var targetSentPacketsPerSecond: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNetworkUtilization {
  
  inline def apply(): SchemaNetworkUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkUtilization]
  }
  
  extension [Self <: SchemaNetworkUtilization](x: Self) {
    
    inline def setTargetReceivedBytesPerSecond(value: Double): Self = StObject.set(x, "targetReceivedBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetReceivedBytesPerSecondNull: Self = StObject.set(x, "targetReceivedBytesPerSecond", null)
    
    inline def setTargetReceivedBytesPerSecondUndefined: Self = StObject.set(x, "targetReceivedBytesPerSecond", js.undefined)
    
    inline def setTargetReceivedPacketsPerSecond(value: Double): Self = StObject.set(x, "targetReceivedPacketsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetReceivedPacketsPerSecondNull: Self = StObject.set(x, "targetReceivedPacketsPerSecond", null)
    
    inline def setTargetReceivedPacketsPerSecondUndefined: Self = StObject.set(x, "targetReceivedPacketsPerSecond", js.undefined)
    
    inline def setTargetSentBytesPerSecond(value: Double): Self = StObject.set(x, "targetSentBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetSentBytesPerSecondNull: Self = StObject.set(x, "targetSentBytesPerSecond", null)
    
    inline def setTargetSentBytesPerSecondUndefined: Self = StObject.set(x, "targetSentBytesPerSecond", js.undefined)
    
    inline def setTargetSentPacketsPerSecond(value: Double): Self = StObject.set(x, "targetSentPacketsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetSentPacketsPerSecondNull: Self = StObject.set(x, "targetSentPacketsPerSecond", null)
    
    inline def setTargetSentPacketsPerSecondUndefined: Self = StObject.set(x, "targetSentPacketsPerSecond", js.undefined)
  }
}
