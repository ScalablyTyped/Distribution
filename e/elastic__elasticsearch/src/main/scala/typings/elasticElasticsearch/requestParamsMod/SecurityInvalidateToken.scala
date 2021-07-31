package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInvalidateToken[T]
  extends StObject
     with Generic {
  
  var body: T
}
object SecurityInvalidateToken {
  
  @scala.inline
  def apply[T](body: T): SecurityInvalidateToken[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInvalidateToken[T]]
  }
  
  @scala.inline
  implicit class SecurityInvalidateTokenMutableBuilder[Self <: SecurityInvalidateToken[?], T] (val x: Self & SecurityInvalidateToken[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
