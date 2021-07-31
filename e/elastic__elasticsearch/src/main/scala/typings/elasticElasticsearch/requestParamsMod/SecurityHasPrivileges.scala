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
  
  @scala.inline
  def apply[T](body: T): SecurityHasPrivileges[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivileges[T]]
  }
  
  @scala.inline
  implicit class SecurityHasPrivilegesMutableBuilder[Self <: SecurityHasPrivileges[?], T] (val x: Self & SecurityHasPrivileges[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
