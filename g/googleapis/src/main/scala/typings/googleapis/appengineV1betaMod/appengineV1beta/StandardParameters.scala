package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardParameters extends js.Object {
  
  /**
    * V1 error format.
    */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /**
    * OAuth access token.
    */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * Data format for response.
    */
  var alt: js.UndefOr[String] = js.native
  
  /**
    * JSONP
    */
  var callback: js.UndefOr[String] = js.native
  
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * API key. Your API key identifies your project and provides you with API
    * access, quota, and reports. Required unless you provide an OAuth 2.0
    * token.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * OAuth 2.0 token for the current user.
    */
  var oauth_token: js.UndefOr[String] = js.native
  
  /**
    * Returns response with indentations and line breaks.
    */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /**
    * Available to use for quota purposes for server-side applications. Can be
    * any arbitrary string assigned to a user, but should not exceed 40
    * characters.
    */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Legacy upload protocol for media (e.g. "media", "multipart").
    */
  var uploadType: js.UndefOr[String] = js.native
  
  /**
    * Upload protocol for media (e.g. "raw", "multipart").
    */
  var upload_protocol: js.UndefOr[String] = js.native
}
object StandardParameters {
  
  @scala.inline
  def apply(): StandardParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardParameters]
  }
  
  @scala.inline
  implicit class StandardParametersOps[Self <: StandardParameters] (val x: Self) extends AnyVal {
    
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
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}
