package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotClone[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var repository: String
  
  var snapshot: String
  
  var target_snapshot: String
}
object SnapshotClone {
  
  inline def apply[T](body: T, repository: String, snapshot: String, target_snapshot: String): SnapshotClone[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], target_snapshot = target_snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotClone[T]]
  }
  
  extension [Self <: SnapshotClone[?], T](x: Self & SnapshotClone[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setTarget_snapshot(value: String): Self = StObject.set(x, "target_snapshot", value.asInstanceOf[js.Any])
  }
}
