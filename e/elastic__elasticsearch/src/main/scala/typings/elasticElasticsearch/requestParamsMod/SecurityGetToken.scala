package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGetToken[T] extends Generic {
  
  var body: T = js.native
}
object SecurityGetToken {
  
  @scala.inline
  def apply[T](body: T): SecurityGetToken[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetToken[T]]
  }
  
  @scala.inline
  implicit class SecurityGetTokenMutableBuilder[Self <: SecurityGetToken[_], T] (val x: Self with SecurityGetToken[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
