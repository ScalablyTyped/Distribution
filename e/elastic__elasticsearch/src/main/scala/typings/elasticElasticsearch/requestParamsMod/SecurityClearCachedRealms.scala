package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityClearCachedRealms extends Generic {
  
  var realms: String | js.Array[String] = js.native
  
  var usernames: js.UndefOr[String | js.Array[String]] = js.native
}
object SecurityClearCachedRealms {
  
  @scala.inline
  def apply(realms: String | js.Array[String]): SecurityClearCachedRealms = {
    val __obj = js.Dynamic.literal(realms = realms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRealms]
  }
  
  @scala.inline
  implicit class SecurityClearCachedRealmsMutableBuilder[Self <: SecurityClearCachedRealms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRealms(value: String | js.Array[String]): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmsVarargs(value: String*): Self = StObject.set(x, "realms", js.Array(value :_*))
    
    @scala.inline
    def setUsernames(value: String | js.Array[String]): Self = StObject.set(x, "usernames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernamesUndefined: Self = StObject.set(x, "usernames", js.undefined)
    
    @scala.inline
    def setUsernamesVarargs(value: String*): Self = StObject.set(x, "usernames", js.Array(value :_*))
  }
}
