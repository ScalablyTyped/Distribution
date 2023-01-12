package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DanglingIndicesImportDanglingIndexRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var accept_data_loss: Boolean
  
  var index_uuid: Uuid
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object DanglingIndicesImportDanglingIndexRequest {
  
  inline def apply(accept_data_loss: Boolean, index_uuid: Uuid): DanglingIndicesImportDanglingIndexRequest = {
    val __obj = js.Dynamic.literal(accept_data_loss = accept_data_loss.asInstanceOf[js.Any], index_uuid = index_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DanglingIndicesImportDanglingIndexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DanglingIndicesImportDanglingIndexRequest] (val x: Self) extends AnyVal {
    
    inline def setAccept_data_loss(value: Boolean): Self = StObject.set(x, "accept_data_loss", value.asInstanceOf[js.Any])
    
    inline def setIndex_uuid(value: Uuid): Self = StObject.set(x, "index_uuid", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
