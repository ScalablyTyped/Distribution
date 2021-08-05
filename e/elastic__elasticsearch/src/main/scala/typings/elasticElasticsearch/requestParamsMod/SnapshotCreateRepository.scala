package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCreateRepository[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var repository: String
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var verify: js.UndefOr[Boolean] = js.undefined
}
object SnapshotCreateRepository {
  
  inline def apply[T](body: T, repository: String): SnapshotCreateRepository[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreateRepository[T]]
  }
  
  extension [Self <: SnapshotCreateRepository[?], T](x: Self & SnapshotCreateRepository[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    
    inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}
