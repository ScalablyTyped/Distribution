package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotVerifyRepositoryParams extends GenericParams {
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var repository: String = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
}
object SnapshotVerifyRepositoryParams {
  
  @scala.inline
  def apply(repository: String): SnapshotVerifyRepositoryParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotVerifyRepositoryParams]
  }
  
  @scala.inline
  implicit class SnapshotVerifyRepositoryParamsMutableBuilder[Self <: SnapshotVerifyRepositoryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
