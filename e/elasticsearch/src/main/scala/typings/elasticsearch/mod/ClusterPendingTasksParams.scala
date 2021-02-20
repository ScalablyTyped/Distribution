package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterPendingTasksParams extends GenericParams {
  
  var local: js.UndefOr[Boolean] = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
}
object ClusterPendingTasksParams {
  
  @scala.inline
  def apply(): ClusterPendingTasksParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterPendingTasksParams]
  }
  
  @scala.inline
  implicit class ClusterPendingTasksParamsMutableBuilder[Self <: ClusterPendingTasksParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
  }
}
