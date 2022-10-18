package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryShardRecovery extends StObject {
  
  var id: long
  
  var index: IndicesRecoveryRecoveryIndexStatus
  
  var primary: Boolean
  
  var source: IndicesRecoveryRecoveryOrigin
  
  var stage: String
  
  var start: js.UndefOr[IndicesRecoveryRecoveryStartStatus] = js.undefined
  
  var start_time: js.UndefOr[DateTime] = js.undefined
  
  var start_time_in_millis: EpochTime[UnitMillis]
  
  var stop_time: js.UndefOr[DateTime] = js.undefined
  
  var stop_time_in_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var target: IndicesRecoveryRecoveryOrigin
  
  var total_time: js.UndefOr[Duration] = js.undefined
  
  var total_time_in_millis: DurationValue[UnitMillis]
  
  var translog: IndicesRecoveryTranslogStatus
  
  var `type`: String
  
  var verify_index: IndicesRecoveryVerifyIndex
}
object IndicesRecoveryShardRecovery {
  
  inline def apply(
    id: long,
    index: IndicesRecoveryRecoveryIndexStatus,
    primary: Boolean,
    source: IndicesRecoveryRecoveryOrigin,
    stage: String,
    start_time_in_millis: EpochTime[UnitMillis],
    target: IndicesRecoveryRecoveryOrigin,
    total_time_in_millis: DurationValue[UnitMillis],
    translog: IndicesRecoveryTranslogStatus,
    `type`: String,
    verify_index: IndicesRecoveryVerifyIndex
  ): IndicesRecoveryShardRecovery = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], total_time_in_millis = total_time_in_millis.asInstanceOf[js.Any], translog = translog.asInstanceOf[js.Any], verify_index = verify_index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryShardRecovery]
  }
  
  extension [Self <: IndicesRecoveryShardRecovery](x: Self) {
    
    inline def setId(value: long): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndicesRecoveryRecoveryIndexStatus): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSource(value: IndicesRecoveryRecoveryOrigin): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStart(value: IndicesRecoveryRecoveryStartStatus): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStart_time(value: DateTime): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setStop_time(value: DateTime): Self = StObject.set(x, "stop_time", value.asInstanceOf[js.Any])
    
    inline def setStop_timeUndefined: Self = StObject.set(x, "stop_time", js.undefined)
    
    inline def setStop_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "stop_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setStop_time_in_millisUndefined: Self = StObject.set(x, "stop_time_in_millis", js.undefined)
    
    inline def setTarget(value: IndicesRecoveryRecoveryOrigin): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTotal_time(value: Duration): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_timeUndefined: Self = StObject.set(x, "total_time", js.undefined)
    
    inline def setTotal_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTranslog(value: IndicesRecoveryTranslogStatus): Self = StObject.set(x, "translog", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerify_index(value: IndicesRecoveryVerifyIndex): Self = StObject.set(x, "verify_index", value.asInstanceOf[js.Any])
  }
}
