package typings.gapiAuth2.gapi.auth2

import typings.gapiAuth2.gapiAuth2Strings.consent
import typings.gapiAuth2.gapiAuth2Strings.select_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definitions by: John <https://github.com/jhcao23>
  * Interface that represents the different configuration parameters for the GoogleAuth.grantOfflineAccess(options) method.
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2offlineaccessoptions
  */
@js.native
trait OfflineAccessOptions extends js.Object {
  
  var app_package_name: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[select_account | consent] = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object OfflineAccessOptions {
  
  @scala.inline
  def apply(): OfflineAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfflineAccessOptions]
  }
  
  @scala.inline
  implicit class OfflineAccessOptionsOps[Self <: OfflineAccessOptions] (val x: Self) extends AnyVal {
    
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
    def setApp_package_name(value: String): Self = this.set("app_package_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp_package_name: Self = this.set("app_package_name", js.undefined)
    
    @scala.inline
    def setPrompt(value: select_account | consent): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
