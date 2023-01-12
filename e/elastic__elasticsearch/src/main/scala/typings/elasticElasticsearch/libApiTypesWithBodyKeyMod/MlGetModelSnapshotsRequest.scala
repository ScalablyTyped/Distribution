package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetModelSnapshotsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Desc] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var job_id: Id
  
  var size: js.UndefOr[integer] = js.undefined
  
  var snapshot_id: js.UndefOr[Id] = js.undefined
}
object MlGetModelSnapshotsRequest {
  
  inline def apply(job_id: Id): MlGetModelSnapshotsRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetModelSnapshotsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetModelSnapshotsRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Desc): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSnapshot_id(value: Id): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_idUndefined: Self = StObject.set(x, "snapshot_id", js.undefined)
  }
}
