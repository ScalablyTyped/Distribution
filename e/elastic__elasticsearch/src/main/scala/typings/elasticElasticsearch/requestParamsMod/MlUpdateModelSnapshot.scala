package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateModelSnapshot[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var job_id: String
  
  var snapshot_id: String
}
object MlUpdateModelSnapshot {
  
  @scala.inline
  def apply[T](body: T, job_id: String, snapshot_id: String): MlUpdateModelSnapshot[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateModelSnapshot[T]]
  }
  
  @scala.inline
  implicit class MlUpdateModelSnapshotMutableBuilder[Self <: MlUpdateModelSnapshot[?], T] (val x: Self & MlUpdateModelSnapshot[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot_id(value: String): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
