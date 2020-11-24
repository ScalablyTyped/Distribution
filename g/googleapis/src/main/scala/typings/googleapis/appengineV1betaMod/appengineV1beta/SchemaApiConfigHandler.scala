package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Endpoints
  * (https://cloud.google.com/appengine/docs/python/endpoints/) configuration
  * for API handlers.
  */
@js.native
trait SchemaApiConfigHandler extends js.Object {
  
  /**
    * Action to take when users access resources that require authentication.
    * Defaults to redirect.
    */
  var authFailAction: js.UndefOr[String] = js.native
  
  /**
    * Level of login required to access this resource. Defaults to optional.
    */
  var login: js.UndefOr[String] = js.native
  
  /**
    * Path to the script from the application root directory.
    */
  var script: js.UndefOr[String] = js.native
  
  /**
    * Security (HTTPS) enforcement for this URL.
    */
  var securityLevel: js.UndefOr[String] = js.native
  
  /**
    * URL to serve the endpoint at.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaApiConfigHandler {
  
  @scala.inline
  def apply(): SchemaApiConfigHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiConfigHandler]
  }
  
  @scala.inline
  implicit class SchemaApiConfigHandlerOps[Self <: SchemaApiConfigHandler] (val x: Self) extends AnyVal {
    
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
    def setAuthFailAction(value: String): Self = this.set("authFailAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthFailAction: Self = this.set("authFailAction", js.undefined)
    
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setSecurityLevel(value: String): Self = this.set("securityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityLevel: Self = this.set("securityLevel", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
