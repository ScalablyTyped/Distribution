package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityInvalidateApiKey[T] extends Generic {
  
  var body: T = js.native
}
object SecurityInvalidateApiKey {
  
  @scala.inline
  def apply[T](body: T): SecurityInvalidateApiKey[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInvalidateApiKey[T]]
  }
  
  @scala.inline
  implicit class SecurityInvalidateApiKeyMutableBuilder[Self <: SecurityInvalidateApiKey[_], T] (val x: Self with SecurityInvalidateApiKey[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
