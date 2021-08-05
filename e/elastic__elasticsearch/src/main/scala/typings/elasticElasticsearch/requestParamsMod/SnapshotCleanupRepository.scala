package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCleanupRepository
  extends StObject
     with Generic {
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var repository: String
  
  var timeout: js.UndefOr[String] = js.undefined
}
object SnapshotCleanupRepository {
  
  inline def apply(repository: String): SnapshotCleanupRepository = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCleanupRepository]
  }
  
  extension [Self <: SnapshotCleanupRepository](x: Self) {
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
