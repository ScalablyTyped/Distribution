package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGetApiKey extends Generic {
  
  var id: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var owner: js.UndefOr[Boolean] = js.native
  
  var realm_name: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object SecurityGetApiKey {
  
  @scala.inline
  def apply(): SecurityGetApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetApiKey]
  }
  
  @scala.inline
  implicit class SecurityGetApiKeyMutableBuilder[Self <: SecurityGetApiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRealm_name(value: String): Self = StObject.set(x, "realm_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm_nameUndefined: Self = StObject.set(x, "realm_name", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
