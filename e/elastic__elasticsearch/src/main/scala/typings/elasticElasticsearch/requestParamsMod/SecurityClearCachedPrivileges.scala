package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityClearCachedPrivileges extends Generic {
  
  var application: String | js.Array[String] = js.native
}
object SecurityClearCachedPrivileges {
  
  @scala.inline
  def apply(application: String | js.Array[String]): SecurityClearCachedPrivileges = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedPrivileges]
  }
  
  @scala.inline
  implicit class SecurityClearCachedPrivilegesOps[Self <: SecurityClearCachedPrivileges] (val x: Self) extends AnyVal {
    
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
    def setApplicationVarargs(value: String*): Self = this.set("application", js.Array(value :_*))
    
    @scala.inline
    def setApplication(value: String | js.Array[String]): Self = this.set("application", value.asInstanceOf[js.Any])
  }
}
