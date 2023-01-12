package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlModelSnapshot extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var job_id: Id
  
  var latest_record_time_stamp: js.UndefOr[integer] = js.undefined
  
  var latest_result_time_stamp: js.UndefOr[integer] = js.undefined
  
  var min_version: VersionString
  
  var model_size_stats: js.UndefOr[MlModelSizeStats] = js.undefined
  
  var retain: Boolean
  
  var snapshot_doc_count: long
  
  var snapshot_id: Id
  
  var timestamp: long
}
object MlModelSnapshot {
  
  inline def apply(
    job_id: Id,
    min_version: VersionString,
    retain: Boolean,
    snapshot_doc_count: long,
    snapshot_id: Id,
    timestamp: long
  ): MlModelSnapshot = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], min_version = min_version.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], snapshot_doc_count = snapshot_doc_count.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlModelSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlModelSnapshot] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setLatest_record_time_stamp(value: integer): Self = StObject.set(x, "latest_record_time_stamp", value.asInstanceOf[js.Any])
    
    inline def setLatest_record_time_stampUndefined: Self = StObject.set(x, "latest_record_time_stamp", js.undefined)
    
    inline def setLatest_result_time_stamp(value: integer): Self = StObject.set(x, "latest_result_time_stamp", value.asInstanceOf[js.Any])
    
    inline def setLatest_result_time_stampUndefined: Self = StObject.set(x, "latest_result_time_stamp", js.undefined)
    
    inline def setMin_version(value: VersionString): Self = StObject.set(x, "min_version", value.asInstanceOf[js.Any])
    
    inline def setModel_size_stats(value: MlModelSizeStats): Self = StObject.set(x, "model_size_stats", value.asInstanceOf[js.Any])
    
    inline def setModel_size_statsUndefined: Self = StObject.set(x, "model_size_stats", js.undefined)
    
    inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_doc_count(value: long): Self = StObject.set(x, "snapshot_doc_count", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: Id): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
