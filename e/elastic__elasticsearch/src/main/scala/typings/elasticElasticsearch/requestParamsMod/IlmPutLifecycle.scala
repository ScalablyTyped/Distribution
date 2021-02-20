package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IlmPutLifecycle[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var policy: String = js.native
}
object IlmPutLifecycle {
  
  @scala.inline
  def apply[T](policy: String): IlmPutLifecycle[T] = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmPutLifecycle[T]]
  }
  
  @scala.inline
  implicit class IlmPutLifecycleMutableBuilder[Self <: IlmPutLifecycle[_], T] (val x: Self with IlmPutLifecycle[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
