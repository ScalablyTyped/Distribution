package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityHasPrivileges[T] extends Generic {
  
  var body: T = js.native
  
  var user: js.UndefOr[String] = js.native
}
object SecurityHasPrivileges {
  
  @scala.inline
  def apply[T](body: T): SecurityHasPrivileges[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivileges[T]]
  }
  
  @scala.inline
  implicit class SecurityHasPrivilegesMutableBuilder[Self <: SecurityHasPrivileges[_], T] (val x: Self with SecurityHasPrivileges[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
