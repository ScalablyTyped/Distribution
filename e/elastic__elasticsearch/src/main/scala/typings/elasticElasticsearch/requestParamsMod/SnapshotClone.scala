package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotClone[T] extends Generic {
  
  var body: T = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var repository: String = js.native
  
  var snapshot: String = js.native
  
  var target_snapshot: String = js.native
}
object SnapshotClone {
  
  @scala.inline
  def apply[T](body: T, repository: String, snapshot: String, target_snapshot: String): SnapshotClone[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], target_snapshot = target_snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotClone[T]]
  }
  
  @scala.inline
  implicit class SnapshotCloneMutableBuilder[Self <: SnapshotClone[_], T] (val x: Self with SnapshotClone[T]) extends AnyVal {
    
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
    def setTarget_snapshot(value: String): Self = StObject.set(x, "target_snapshot", value.asInstanceOf[js.Any])
  }
}
