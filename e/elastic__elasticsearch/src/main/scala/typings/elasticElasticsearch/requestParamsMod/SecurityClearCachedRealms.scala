package typings.elasticElasticsearch.requestParamsMod

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
  implicit class SecurityClearCachedRealmsOps[Self <: SecurityClearCachedRealms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRealmsVarargs(value: String*): Self = this.set("realms", js.Array(value :_*))
    
    @scala.inline
    def setRealms(value: String | js.Array[String]): Self = this.set("realms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernamesVarargs(value: String*): Self = this.set("usernames", js.Array(value :_*))
    
    @scala.inline
    def setUsernames(value: String | js.Array[String]): Self = this.set("usernames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernames: Self = this.set("usernames", js.undefined)
  }
}
