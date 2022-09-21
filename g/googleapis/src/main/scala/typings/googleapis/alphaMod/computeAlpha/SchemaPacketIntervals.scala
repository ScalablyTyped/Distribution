package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPacketIntervals extends StObject {
  
  /**
    * Average observed inter-packet interval in milliseconds.
    */
  var avgMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * From how long ago in the past these intervals were observed.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum observed inter-packet interval in milliseconds.
    */
  var maxMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum observed inter-packet interval in milliseconds.
    */
  var minMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of inter-packet intervals from which these statistics were derived.
    */
  var numIntervals: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of packets for which inter-packet intervals were computed.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaPacketIntervals {
  
  inline def apply(): SchemaPacketIntervals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPacketIntervals]
  }
  
  extension [Self <: SchemaPacketIntervals](x: Self) {
    
    inline def setAvgMs(value: String): Self = StObject.set(x, "avgMs", value.asInstanceOf[js.Any])
    
    inline def setAvgMsNull: Self = StObject.set(x, "avgMs", null)
    
    inline def setAvgMsUndefined: Self = StObject.set(x, "avgMs", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMaxMs(value: String): Self = StObject.set(x, "maxMs", value.asInstanceOf[js.Any])
    
    inline def setMaxMsNull: Self = StObject.set(x, "maxMs", null)
    
    inline def setMaxMsUndefined: Self = StObject.set(x, "maxMs", js.undefined)
    
    inline def setMinMs(value: String): Self = StObject.set(x, "minMs", value.asInstanceOf[js.Any])
    
    inline def setMinMsNull: Self = StObject.set(x, "minMs", null)
    
    inline def setMinMsUndefined: Self = StObject.set(x, "minMs", js.undefined)
    
    inline def setNumIntervals(value: String): Self = StObject.set(x, "numIntervals", value.asInstanceOf[js.Any])
    
    inline def setNumIntervalsNull: Self = StObject.set(x, "numIntervals", null)
    
    inline def setNumIntervalsUndefined: Self = StObject.set(x, "numIntervals", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
