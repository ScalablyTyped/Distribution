package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchableSnapshotsMount[T] extends Generic {
  
  var body: T = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var repository: String = js.native
  
  var snapshot: String = js.native
  
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}
object SearchableSnapshotsMount {
  
  @scala.inline
  def apply[T](body: T, repository: String, snapshot: String): SearchableSnapshotsMount[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsMount[T]]
  }
  
  @scala.inline
  implicit class SearchableSnapshotsMountMutableBuilder[Self <: SearchableSnapshotsMount[_], T] (val x: Self with SearchableSnapshotsMount[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
