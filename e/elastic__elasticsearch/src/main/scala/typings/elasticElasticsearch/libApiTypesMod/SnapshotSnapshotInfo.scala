package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotSnapshotInfo extends StObject {
  
  var data_streams: js.Array[String]
  
  var duration: js.UndefOr[Duration] = js.undefined
  
  var duration_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var end_time: js.UndefOr[DateTime] = js.undefined
  
  var end_time_in_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var failures: js.UndefOr[js.Array[SnapshotSnapshotShardFailure]] = js.undefined
  
  var feature_states: js.UndefOr[js.Array[SnapshotInfoFeatureState]] = js.undefined
  
  var include_global_state: js.UndefOr[Boolean] = js.undefined
  
  var index_details: js.UndefOr[Record[IndexName, SnapshotIndexDetails]] = js.undefined
  
  var indices: js.UndefOr[js.Array[IndexName]] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var repository: js.UndefOr[Name] = js.undefined
  
  var shards: js.UndefOr[ShardStatistics] = js.undefined
  
  var snapshot: Name
  
  var start_time: js.UndefOr[DateTime] = js.undefined
  
  var start_time_in_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var uuid: Uuid
  
  var version: js.UndefOr[VersionString] = js.undefined
  
  var version_id: js.UndefOr[VersionNumber] = js.undefined
}
object SnapshotSnapshotInfo {
  
  inline def apply(data_streams: js.Array[String], snapshot: Name, uuid: Uuid): SnapshotSnapshotInfo = {
    val __obj = js.Dynamic.literal(data_streams = data_streams.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSnapshotInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotSnapshotInfo] (val x: Self) extends AnyVal {
    
    inline def setData_streams(value: js.Array[String]): Self = StObject.set(x, "data_streams", value.asInstanceOf[js.Any])
    
    inline def setData_streamsVarargs(value: String*): Self = StObject.set(x, "data_streams", js.Array(value*))
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setDuration_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "duration_in_millis", value.asInstanceOf[js.Any])
    
    inline def setDuration_in_millisUndefined: Self = StObject.set(x, "duration_in_millis", js.undefined)
    
    inline def setEnd_time(value: DateTime): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    inline def setEnd_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "end_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setEnd_time_in_millisUndefined: Self = StObject.set(x, "end_time_in_millis", js.undefined)
    
    inline def setFailures(value: js.Array[SnapshotSnapshotShardFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: SnapshotSnapshotShardFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setFeature_states(value: js.Array[SnapshotInfoFeatureState]): Self = StObject.set(x, "feature_states", value.asInstanceOf[js.Any])
    
    inline def setFeature_statesUndefined: Self = StObject.set(x, "feature_states", js.undefined)
    
    inline def setFeature_statesVarargs(value: SnapshotInfoFeatureState*): Self = StObject.set(x, "feature_states", js.Array(value*))
    
    inline def setInclude_global_state(value: Boolean): Self = StObject.set(x, "include_global_state", value.asInstanceOf[js.Any])
    
    inline def setInclude_global_stateUndefined: Self = StObject.set(x, "include_global_state", js.undefined)
    
    inline def setIndex_details(value: Record[IndexName, SnapshotIndexDetails]): Self = StObject.set(x, "index_details", value.asInstanceOf[js.Any])
    
    inline def setIndex_detailsUndefined: Self = StObject.set(x, "index_details", js.undefined)
    
    inline def setIndices(value: js.Array[IndexName]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setShards(value: ShardStatistics): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: DateTime): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millisUndefined: Self = StObject.set(x, "start_time_in_millis", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUuid(value: Uuid): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_id(value: VersionNumber): Self = StObject.set(x, "version_id", value.asInstanceOf[js.Any])
    
    inline def setVersion_idUndefined: Self = StObject.set(x, "version_id", js.undefined)
  }
}
