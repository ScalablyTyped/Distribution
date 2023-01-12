package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotGetRepositoryParams
  extends StObject
     with GenericParams {
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var repository: NameList
}
object SnapshotGetRepositoryParams {
  
  inline def apply(repository: NameList): SnapshotGetRepositoryParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotGetRepositoryParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotGetRepositoryParams] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setRepository(value: NameList): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryVarargs(value: String*): Self = StObject.set(x, "repository", js.Array(value*))
  }
}
