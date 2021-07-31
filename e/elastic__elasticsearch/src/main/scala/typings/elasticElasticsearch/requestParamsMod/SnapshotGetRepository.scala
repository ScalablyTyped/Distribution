package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotGetRepository
  extends StObject
     with Generic {
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var repository: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SnapshotGetRepository {
  
  @scala.inline
  def apply(): SnapshotGetRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotGetRepository]
  }
  
  @scala.inline
  implicit class SnapshotGetRepositoryMutableBuilder[Self <: SnapshotGetRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setRepository(value: String | js.Array[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    @scala.inline
    def setRepositoryVarargs(value: String*): Self = StObject.set(x, "repository", js.Array(value :_*))
  }
}
