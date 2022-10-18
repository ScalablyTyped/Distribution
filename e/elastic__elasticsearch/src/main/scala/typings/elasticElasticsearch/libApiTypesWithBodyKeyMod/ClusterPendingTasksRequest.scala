package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPendingTasksRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
}
object ClusterPendingTasksRequest {
  
  inline def apply(): ClusterPendingTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterPendingTasksRequest]
  }
  
  extension [Self <: ClusterPendingTasksRequest](x: Self) {
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
  }
}
