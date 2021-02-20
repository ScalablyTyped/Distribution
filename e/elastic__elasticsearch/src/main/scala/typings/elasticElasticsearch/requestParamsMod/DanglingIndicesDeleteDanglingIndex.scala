package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DanglingIndicesDeleteDanglingIndex extends Generic {
  
  var accept_data_loss: js.UndefOr[Boolean] = js.native
  
  var index_uuid: String = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object DanglingIndicesDeleteDanglingIndex {
  
  @scala.inline
  def apply(index_uuid: String): DanglingIndicesDeleteDanglingIndex = {
    val __obj = js.Dynamic.literal(index_uuid = index_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DanglingIndicesDeleteDanglingIndex]
  }
  
  @scala.inline
  implicit class DanglingIndicesDeleteDanglingIndexMutableBuilder[Self <: DanglingIndicesDeleteDanglingIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept_data_loss(value: Boolean): Self = StObject.set(x, "accept_data_loss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_data_lossUndefined: Self = StObject.set(x, "accept_data_loss", js.undefined)
    
    @scala.inline
    def setIndex_uuid(value: String): Self = StObject.set(x, "index_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
