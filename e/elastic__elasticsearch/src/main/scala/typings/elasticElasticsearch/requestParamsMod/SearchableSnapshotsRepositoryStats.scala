package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchableSnapshotsRepositoryStats extends Generic {
  
  var repository: String = js.native
}
object SearchableSnapshotsRepositoryStats {
  
  @scala.inline
  def apply(repository: String): SearchableSnapshotsRepositoryStats = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsRepositoryStats]
  }
  
  @scala.inline
  implicit class SearchableSnapshotsRepositoryStatsMutableBuilder[Self <: SearchableSnapshotsRepositoryStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
