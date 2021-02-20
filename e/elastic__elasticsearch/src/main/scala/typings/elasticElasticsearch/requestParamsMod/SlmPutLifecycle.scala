package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlmPutLifecycle[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var policy_id: String = js.native
}
object SlmPutLifecycle {
  
  @scala.inline
  def apply[T](policy_id: String): SlmPutLifecycle[T] = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmPutLifecycle[T]]
  }
  
  @scala.inline
  implicit class SlmPutLifecycleMutableBuilder[Self <: SlmPutLifecycle[_], T] (val x: Self with SlmPutLifecycle[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setPolicy_id(value: String): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
  }
}
