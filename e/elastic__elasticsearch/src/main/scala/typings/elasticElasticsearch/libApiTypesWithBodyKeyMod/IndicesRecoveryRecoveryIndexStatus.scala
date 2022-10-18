package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryRecoveryIndexStatus extends StObject {
  
  var bytes: js.UndefOr[IndicesRecoveryRecoveryBytes] = js.undefined
  
  var files: IndicesRecoveryRecoveryFiles
  
  var size: IndicesRecoveryRecoveryBytes
  
  var source_throttle_time: js.UndefOr[Duration] = js.undefined
  
  var source_throttle_time_in_millis: DurationValue[UnitMillis]
  
  var target_throttle_time: js.UndefOr[Duration] = js.undefined
  
  var target_throttle_time_in_millis: DurationValue[UnitMillis]
  
  var total_time: js.UndefOr[Duration] = js.undefined
  
  var total_time_in_millis: DurationValue[UnitMillis]
}
object IndicesRecoveryRecoveryIndexStatus {
  
  inline def apply(
    files: IndicesRecoveryRecoveryFiles,
    size: IndicesRecoveryRecoveryBytes,
    source_throttle_time_in_millis: DurationValue[UnitMillis],
    target_throttle_time_in_millis: DurationValue[UnitMillis],
    total_time_in_millis: DurationValue[UnitMillis]
  ): IndicesRecoveryRecoveryIndexStatus = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source_throttle_time_in_millis = source_throttle_time_in_millis.asInstanceOf[js.Any], target_throttle_time_in_millis = target_throttle_time_in_millis.asInstanceOf[js.Any], total_time_in_millis = total_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryRecoveryIndexStatus]
  }
  
  extension [Self <: IndicesRecoveryRecoveryIndexStatus](x: Self) {
    
    inline def setBytes(value: IndicesRecoveryRecoveryBytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setFiles(value: IndicesRecoveryRecoveryFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setSize(value: IndicesRecoveryRecoveryBytes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSource_throttle_time(value: Duration): Self = StObject.set(x, "source_throttle_time", value.asInstanceOf[js.Any])
    
    inline def setSource_throttle_timeUndefined: Self = StObject.set(x, "source_throttle_time", js.undefined)
    
    inline def setSource_throttle_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "source_throttle_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTarget_throttle_time(value: Duration): Self = StObject.set(x, "target_throttle_time", value.asInstanceOf[js.Any])
    
    inline def setTarget_throttle_timeUndefined: Self = StObject.set(x, "target_throttle_time", js.undefined)
    
    inline def setTarget_throttle_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "target_throttle_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_time(value: Duration): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_timeUndefined: Self = StObject.set(x, "total_time", js.undefined)
    
    inline def setTotal_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_millis", value.asInstanceOf[js.Any])
  }
}
