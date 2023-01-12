package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrShardStats extends StObject {
  
  var bytes_read: long
  
  var failed_read_requests: long
  
  var failed_write_requests: long
  
  var fatal_exception: js.UndefOr[ErrorCause] = js.undefined
  
  var follower_aliases_version: VersionNumber
  
  var follower_global_checkpoint: long
  
  var follower_index: String
  
  var follower_mapping_version: VersionNumber
  
  var follower_max_seq_no: SequenceNumber
  
  var follower_settings_version: VersionNumber
  
  var last_requested_seq_no: SequenceNumber
  
  var leader_global_checkpoint: long
  
  var leader_index: String
  
  var leader_max_seq_no: SequenceNumber
  
  var operations_read: long
  
  var operations_written: long
  
  var outstanding_read_requests: integer
  
  var outstanding_write_requests: integer
  
  var read_exceptions: js.Array[CcrReadException]
  
  var remote_cluster: String
  
  var shard_id: integer
  
  var successful_read_requests: long
  
  var successful_write_requests: long
  
  var time_since_last_read: js.UndefOr[Duration] = js.undefined
  
  var time_since_last_read_millis: DurationValue[UnitMillis]
  
  var total_read_remote_exec_time: js.UndefOr[Duration] = js.undefined
  
  var total_read_remote_exec_time_millis: DurationValue[UnitMillis]
  
  var total_read_time: js.UndefOr[Duration] = js.undefined
  
  var total_read_time_millis: DurationValue[UnitMillis]
  
  var total_write_time: js.UndefOr[Duration] = js.undefined
  
  var total_write_time_millis: DurationValue[UnitMillis]
  
  var write_buffer_operation_count: long
  
  var write_buffer_size_in_bytes: ByteSize
}
object CcrShardStats {
  
  inline def apply(
    bytes_read: long,
    failed_read_requests: long,
    failed_write_requests: long,
    follower_aliases_version: VersionNumber,
    follower_global_checkpoint: long,
    follower_index: String,
    follower_mapping_version: VersionNumber,
    follower_max_seq_no: SequenceNumber,
    follower_settings_version: VersionNumber,
    last_requested_seq_no: SequenceNumber,
    leader_global_checkpoint: long,
    leader_index: String,
    leader_max_seq_no: SequenceNumber,
    operations_read: long,
    operations_written: long,
    outstanding_read_requests: integer,
    outstanding_write_requests: integer,
    read_exceptions: js.Array[CcrReadException],
    remote_cluster: String,
    shard_id: integer,
    successful_read_requests: long,
    successful_write_requests: long,
    time_since_last_read_millis: DurationValue[UnitMillis],
    total_read_remote_exec_time_millis: DurationValue[UnitMillis],
    total_read_time_millis: DurationValue[UnitMillis],
    total_write_time_millis: DurationValue[UnitMillis],
    write_buffer_operation_count: long,
    write_buffer_size_in_bytes: ByteSize
  ): CcrShardStats = {
    val __obj = js.Dynamic.literal(bytes_read = bytes_read.asInstanceOf[js.Any], failed_read_requests = failed_read_requests.asInstanceOf[js.Any], failed_write_requests = failed_write_requests.asInstanceOf[js.Any], follower_aliases_version = follower_aliases_version.asInstanceOf[js.Any], follower_global_checkpoint = follower_global_checkpoint.asInstanceOf[js.Any], follower_index = follower_index.asInstanceOf[js.Any], follower_mapping_version = follower_mapping_version.asInstanceOf[js.Any], follower_max_seq_no = follower_max_seq_no.asInstanceOf[js.Any], follower_settings_version = follower_settings_version.asInstanceOf[js.Any], last_requested_seq_no = last_requested_seq_no.asInstanceOf[js.Any], leader_global_checkpoint = leader_global_checkpoint.asInstanceOf[js.Any], leader_index = leader_index.asInstanceOf[js.Any], leader_max_seq_no = leader_max_seq_no.asInstanceOf[js.Any], operations_read = operations_read.asInstanceOf[js.Any], operations_written = operations_written.asInstanceOf[js.Any], outstanding_read_requests = outstanding_read_requests.asInstanceOf[js.Any], outstanding_write_requests = outstanding_write_requests.asInstanceOf[js.Any], read_exceptions = read_exceptions.asInstanceOf[js.Any], remote_cluster = remote_cluster.asInstanceOf[js.Any], shard_id = shard_id.asInstanceOf[js.Any], successful_read_requests = successful_read_requests.asInstanceOf[js.Any], successful_write_requests = successful_write_requests.asInstanceOf[js.Any], time_since_last_read_millis = time_since_last_read_millis.asInstanceOf[js.Any], total_read_remote_exec_time_millis = total_read_remote_exec_time_millis.asInstanceOf[js.Any], total_read_time_millis = total_read_time_millis.asInstanceOf[js.Any], total_write_time_millis = total_write_time_millis.asInstanceOf[js.Any], write_buffer_operation_count = write_buffer_operation_count.asInstanceOf[js.Any], write_buffer_size_in_bytes = write_buffer_size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrShardStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrShardStats] (val x: Self) extends AnyVal {
    
    inline def setBytes_read(value: long): Self = StObject.set(x, "bytes_read", value.asInstanceOf[js.Any])
    
    inline def setFailed_read_requests(value: long): Self = StObject.set(x, "failed_read_requests", value.asInstanceOf[js.Any])
    
    inline def setFailed_write_requests(value: long): Self = StObject.set(x, "failed_write_requests", value.asInstanceOf[js.Any])
    
    inline def setFatal_exception(value: ErrorCause): Self = StObject.set(x, "fatal_exception", value.asInstanceOf[js.Any])
    
    inline def setFatal_exceptionUndefined: Self = StObject.set(x, "fatal_exception", js.undefined)
    
    inline def setFollower_aliases_version(value: VersionNumber): Self = StObject.set(x, "follower_aliases_version", value.asInstanceOf[js.Any])
    
    inline def setFollower_global_checkpoint(value: long): Self = StObject.set(x, "follower_global_checkpoint", value.asInstanceOf[js.Any])
    
    inline def setFollower_index(value: String): Self = StObject.set(x, "follower_index", value.asInstanceOf[js.Any])
    
    inline def setFollower_mapping_version(value: VersionNumber): Self = StObject.set(x, "follower_mapping_version", value.asInstanceOf[js.Any])
    
    inline def setFollower_max_seq_no(value: SequenceNumber): Self = StObject.set(x, "follower_max_seq_no", value.asInstanceOf[js.Any])
    
    inline def setFollower_settings_version(value: VersionNumber): Self = StObject.set(x, "follower_settings_version", value.asInstanceOf[js.Any])
    
    inline def setLast_requested_seq_no(value: SequenceNumber): Self = StObject.set(x, "last_requested_seq_no", value.asInstanceOf[js.Any])
    
    inline def setLeader_global_checkpoint(value: long): Self = StObject.set(x, "leader_global_checkpoint", value.asInstanceOf[js.Any])
    
    inline def setLeader_index(value: String): Self = StObject.set(x, "leader_index", value.asInstanceOf[js.Any])
    
    inline def setLeader_max_seq_no(value: SequenceNumber): Self = StObject.set(x, "leader_max_seq_no", value.asInstanceOf[js.Any])
    
    inline def setOperations_read(value: long): Self = StObject.set(x, "operations_read", value.asInstanceOf[js.Any])
    
    inline def setOperations_written(value: long): Self = StObject.set(x, "operations_written", value.asInstanceOf[js.Any])
    
    inline def setOutstanding_read_requests(value: integer): Self = StObject.set(x, "outstanding_read_requests", value.asInstanceOf[js.Any])
    
    inline def setOutstanding_write_requests(value: integer): Self = StObject.set(x, "outstanding_write_requests", value.asInstanceOf[js.Any])
    
    inline def setRead_exceptions(value: js.Array[CcrReadException]): Self = StObject.set(x, "read_exceptions", value.asInstanceOf[js.Any])
    
    inline def setRead_exceptionsVarargs(value: CcrReadException*): Self = StObject.set(x, "read_exceptions", js.Array(value*))
    
    inline def setRemote_cluster(value: String): Self = StObject.set(x, "remote_cluster", value.asInstanceOf[js.Any])
    
    inline def setShard_id(value: integer): Self = StObject.set(x, "shard_id", value.asInstanceOf[js.Any])
    
    inline def setSuccessful_read_requests(value: long): Self = StObject.set(x, "successful_read_requests", value.asInstanceOf[js.Any])
    
    inline def setSuccessful_write_requests(value: long): Self = StObject.set(x, "successful_write_requests", value.asInstanceOf[js.Any])
    
    inline def setTime_since_last_read(value: Duration): Self = StObject.set(x, "time_since_last_read", value.asInstanceOf[js.Any])
    
    inline def setTime_since_last_readUndefined: Self = StObject.set(x, "time_since_last_read", js.undefined)
    
    inline def setTime_since_last_read_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "time_since_last_read_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_read_remote_exec_time(value: Duration): Self = StObject.set(x, "total_read_remote_exec_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_read_remote_exec_timeUndefined: Self = StObject.set(x, "total_read_remote_exec_time", js.undefined)
    
    inline def setTotal_read_remote_exec_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_read_remote_exec_time_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_read_time(value: Duration): Self = StObject.set(x, "total_read_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_read_timeUndefined: Self = StObject.set(x, "total_read_time", js.undefined)
    
    inline def setTotal_read_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_read_time_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_write_time(value: Duration): Self = StObject.set(x, "total_write_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_write_timeUndefined: Self = StObject.set(x, "total_write_time", js.undefined)
    
    inline def setTotal_write_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_write_time_millis", value.asInstanceOf[js.Any])
    
    inline def setWrite_buffer_operation_count(value: long): Self = StObject.set(x, "write_buffer_operation_count", value.asInstanceOf[js.Any])
    
    inline def setWrite_buffer_size_in_bytes(value: ByteSize): Self = StObject.set(x, "write_buffer_size_in_bytes", value.asInstanceOf[js.Any])
  }
}
