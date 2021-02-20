package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGetUser extends Generic {
  
  var username: js.UndefOr[String | js.Array[String]] = js.native
}
object SecurityGetUser {
  
  @scala.inline
  def apply(): SecurityGetUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetUser]
  }
  
  @scala.inline
  implicit class SecurityGetUserMutableBuilder[Self <: SecurityGetUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String | js.Array[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setUsernameVarargs(value: String*): Self = StObject.set(x, "username", js.Array(value :_*))
  }
}
