package typings.elasticElasticsearch.requestParamsMod

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
  implicit class SnapshotCloneOps[Self <: SnapshotClone[_], T] (val x: Self with SnapshotClone[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: String): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_snapshot(value: String): Self = this.set("target_snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
  }
}
