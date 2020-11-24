package typings.elasticElasticsearch.requestParamsMod

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
  implicit class SecurityGetUserOps[Self <: SecurityGetUser] (val x: Self) extends AnyVal {
    
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
    def setUsernameVarargs(value: String*): Self = this.set("username", js.Array(value :_*))
    
    @scala.inline
    def setUsername(value: String | js.Array[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
