package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsRepositoryStats
  extends StObject
     with Generic {
  
  var repository: String
}
object SearchableSnapshotsRepositoryStats {
  
  inline def apply(repository: String): SearchableSnapshotsRepositoryStats = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsRepositoryStats]
  }
  
  extension [Self <: SearchableSnapshotsRepositoryStats](x: Self) {
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
