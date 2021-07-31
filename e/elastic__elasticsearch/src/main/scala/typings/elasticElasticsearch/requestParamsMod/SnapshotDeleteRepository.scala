package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotDeleteRepository
  extends StObject
     with Generic {
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var repository: String | js.Array[String]
  
  var timeout: js.UndefOr[String] = js.undefined
}
object SnapshotDeleteRepository {
  
  @scala.inline
  def apply(repository: String | js.Array[String]): SnapshotDeleteRepository = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDeleteRepository]
  }
  
  @scala.inline
  implicit class SnapshotDeleteRepositoryMutableBuilder[Self <: SnapshotDeleteRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setRepository(value: String | js.Array[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryVarargs(value: String*): Self = StObject.set(x, "repository", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
