package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryRecoveryBytes extends StObject {
  
  var percent: Percentage
  
  var recovered: js.UndefOr[ByteSize] = js.undefined
  
  var recovered_from_snapshot: js.UndefOr[ByteSize] = js.undefined
  
  var recovered_from_snapshot_in_bytes: js.UndefOr[ByteSize] = js.undefined
  
  var recovered_in_bytes: ByteSize
  
  var reused: js.UndefOr[ByteSize] = js.undefined
  
  var reused_in_bytes: ByteSize
  
  var total: js.UndefOr[ByteSize] = js.undefined
  
  var total_in_bytes: ByteSize
}
object IndicesRecoveryRecoveryBytes {
  
  inline def apply(
    percent: Percentage,
    recovered_in_bytes: ByteSize,
    reused_in_bytes: ByteSize,
    total_in_bytes: ByteSize
  ): IndicesRecoveryRecoveryBytes = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], recovered_in_bytes = recovered_in_bytes.asInstanceOf[js.Any], reused_in_bytes = reused_in_bytes.asInstanceOf[js.Any], total_in_bytes = total_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryRecoveryBytes]
  }
  
  extension [Self <: IndicesRecoveryRecoveryBytes](x: Self) {
    
    inline def setPercent(value: Percentage): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setRecovered(value: ByteSize): Self = StObject.set(x, "recovered", value.asInstanceOf[js.Any])
    
    inline def setRecoveredUndefined: Self = StObject.set(x, "recovered", js.undefined)
    
    inline def setRecovered_from_snapshot(value: ByteSize): Self = StObject.set(x, "recovered_from_snapshot", value.asInstanceOf[js.Any])
    
    inline def setRecovered_from_snapshotUndefined: Self = StObject.set(x, "recovered_from_snapshot", js.undefined)
    
    inline def setRecovered_from_snapshot_in_bytes(value: ByteSize): Self = StObject.set(x, "recovered_from_snapshot_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setRecovered_from_snapshot_in_bytesUndefined: Self = StObject.set(x, "recovered_from_snapshot_in_bytes", js.undefined)
    
    inline def setRecovered_in_bytes(value: ByteSize): Self = StObject.set(x, "recovered_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setReused(value: ByteSize): Self = StObject.set(x, "reused", value.asInstanceOf[js.Any])
    
    inline def setReusedUndefined: Self = StObject.set(x, "reused", js.undefined)
    
    inline def setReused_in_bytes(value: ByteSize): Self = StObject.set(x, "reused_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: ByteSize): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setTotal_in_bytes(value: ByteSize): Self = StObject.set(x, "total_in_bytes", value.asInstanceOf[js.Any])
  }
}
