package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCreateRepositoryParams extends GenericParams {
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var repository: String = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var verify: js.UndefOr[Boolean] = js.native
}
object SnapshotCreateRepositoryParams {
  
  @scala.inline
  def apply(repository: String): SnapshotCreateRepositoryParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreateRepositoryParams]
  }
  
  @scala.inline
  implicit class SnapshotCreateRepositoryParamsMutableBuilder[Self <: SnapshotCreateRepositoryParams] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}
