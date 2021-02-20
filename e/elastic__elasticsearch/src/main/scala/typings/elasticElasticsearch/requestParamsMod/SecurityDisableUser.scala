package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityDisableUser extends Generic {
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.native
  
  var username: String = js.native
}
object SecurityDisableUser {
  
  @scala.inline
  def apply(username: String): SecurityDisableUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDisableUser]
  }
  
  @scala.inline
  implicit class SecurityDisableUserMutableBuilder[Self <: SecurityDisableUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
