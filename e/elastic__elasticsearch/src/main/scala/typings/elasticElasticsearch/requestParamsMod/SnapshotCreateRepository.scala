package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCreateRepository[T] extends Generic {
  
  var body: T = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var repository: String = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var verify: js.UndefOr[Boolean] = js.native
}
object SnapshotCreateRepository {
  
  @scala.inline
  def apply[T](body: T, repository: String): SnapshotCreateRepository[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreateRepository[T]]
  }
  
  @scala.inline
  implicit class SnapshotCreateRepositoryMutableBuilder[Self <: SnapshotCreateRepository[_], T] (val x: Self with SnapshotCreateRepository[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}
