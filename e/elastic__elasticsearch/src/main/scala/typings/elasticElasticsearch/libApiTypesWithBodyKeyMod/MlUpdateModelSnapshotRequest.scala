package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Retain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateModelSnapshotRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Retain] = js.undefined
  
  var job_id: Id
  
  var snapshot_id: Id
}
object MlUpdateModelSnapshotRequest {
  
  inline def apply(job_id: Id, snapshot_id: Id): MlUpdateModelSnapshotRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateModelSnapshotRequest]
  }
  
  extension [Self <: MlUpdateModelSnapshotRequest](x: Self) {
    
    inline def setBody(value: Retain): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: Id): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
