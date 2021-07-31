package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInvalidateApiKey[T]
  extends StObject
     with Generic {
  
  var body: T
}
object SecurityInvalidateApiKey {
  
  @scala.inline
  def apply[T](body: T): SecurityInvalidateApiKey[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInvalidateApiKey[T]]
  }
  
  @scala.inline
  implicit class SecurityInvalidateApiKeyMutableBuilder[Self <: SecurityInvalidateApiKey[?], T] (val x: Self & SecurityInvalidateApiKey[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
