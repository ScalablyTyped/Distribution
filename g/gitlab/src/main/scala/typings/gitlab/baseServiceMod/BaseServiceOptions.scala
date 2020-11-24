package typings.gitlab.baseServiceMod

import typings.gitlab.gitlabNumbers.`3`
import typings.gitlab.gitlabNumbers.`4`
import typings.gitlab.gitlabStrings.execution
import typings.gitlab.gitlabStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseServiceOptions extends js.Object {
  
  var camelize: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var jobToken: js.UndefOr[String] = js.native
  
  var oauthToken: js.UndefOr[String] = js.native
  
  var profileMode: js.UndefOr[execution | memory] = js.native
  
  var profileToken: js.UndefOr[String] = js.native
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  var requestTimeout: js.UndefOr[Double] = js.native
  
  var requester: js.UndefOr[Requester] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[`3` | `4`] = js.native
}
object BaseServiceOptions {
  
  @scala.inline
  def apply(): BaseServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseServiceOptions]
  }
  
  @scala.inline
  implicit class BaseServiceOptionsOps[Self <: BaseServiceOptions] (val x: Self) extends AnyVal {
    
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
    def setCamelize(value: Boolean): Self = this.set("camelize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamelize: Self = this.set("camelize", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setJobToken(value: String): Self = this.set("jobToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobToken: Self = this.set("jobToken", js.undefined)
    
    @scala.inline
    def setOauthToken(value: String): Self = this.set("oauthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauthToken: Self = this.set("oauthToken", js.undefined)
    
    @scala.inline
    def setProfileMode(value: execution | memory): Self = this.set("profileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileMode: Self = this.set("profileMode", js.undefined)
    
    @scala.inline
    def setProfileToken(value: String): Self = this.set("profileToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileToken: Self = this.set("profileToken", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    
    @scala.inline
    def setRequester(value: Requester): Self = this.set("requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: `3` | `4`): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
