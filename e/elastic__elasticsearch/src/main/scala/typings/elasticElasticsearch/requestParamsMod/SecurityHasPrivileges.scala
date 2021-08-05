package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivileges[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var user: js.UndefOr[String] = js.undefined
}
object SecurityHasPrivileges {
  
  inline def apply[T](body: T): SecurityHasPrivileges[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivileges[T]]
  }
  
  extension [Self <: SecurityHasPrivileges[?], T](x: Self & SecurityHasPrivileges[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
