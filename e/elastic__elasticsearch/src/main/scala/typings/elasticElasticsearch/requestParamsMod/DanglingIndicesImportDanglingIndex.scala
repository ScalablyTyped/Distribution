package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DanglingIndicesImportDanglingIndex
  extends StObject
     with Generic {
  
  var accept_data_loss: js.UndefOr[Boolean] = js.undefined
  
  var index_uuid: String
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object DanglingIndicesImportDanglingIndex {
  
  inline def apply(index_uuid: String): DanglingIndicesImportDanglingIndex = {
    val __obj = js.Dynamic.literal(index_uuid = index_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DanglingIndicesImportDanglingIndex]
  }
  
  extension [Self <: DanglingIndicesImportDanglingIndex](x: Self) {
    
    inline def setAccept_data_loss(value: Boolean): Self = StObject.set(x, "accept_data_loss", value.asInstanceOf[js.Any])
    
    inline def setAccept_data_lossUndefined: Self = StObject.set(x, "accept_data_loss", js.undefined)
    
    inline def setIndex_uuid(value: String): Self = StObject.set(x, "index_uuid", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
