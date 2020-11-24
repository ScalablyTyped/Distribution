package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSecuritypoliciesGetrule extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The priority of the rule to get from the security policy.
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Name of the security policy to which the queried rule belongs.
    */
  var securityPolicy: js.UndefOr[String] = js.native
}
object ParamsResourceSecuritypoliciesGetrule {
  
  @scala.inline
  def apply(): ParamsResourceSecuritypoliciesGetrule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSecuritypoliciesGetrule]
  }
  
  @scala.inline
  implicit class ParamsResourceSecuritypoliciesGetruleOps[Self <: ParamsResourceSecuritypoliciesGetrule] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: String): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPolicy: Self = this.set("securityPolicy", js.undefined)
  }
}
