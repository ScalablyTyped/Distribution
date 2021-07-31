package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotDeleteRepositoryParams
  extends StObject
     with GenericParams {
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var repository: String
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}
object SnapshotDeleteRepositoryParams {
  
  @scala.inline
  def apply(repository: String): SnapshotDeleteRepositoryParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDeleteRepositoryParams]
  }
  
  @scala.inline
  implicit class SnapshotDeleteRepositoryParamsMutableBuilder[Self <: SnapshotDeleteRepositoryParams] (val x: Self) extends AnyVal {
    
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
