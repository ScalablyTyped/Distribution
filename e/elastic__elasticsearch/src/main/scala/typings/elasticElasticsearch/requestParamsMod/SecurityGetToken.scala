package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetToken[T]
  extends StObject
     with Generic {
  
  var body: T
}
object SecurityGetToken {
  
  @scala.inline
  def apply[T](body: T): SecurityGetToken[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetToken[T]]
  }
  
  @scala.inline
  implicit class SecurityGetTokenMutableBuilder[Self <: SecurityGetToken[?], T] (val x: Self & SecurityGetToken[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
