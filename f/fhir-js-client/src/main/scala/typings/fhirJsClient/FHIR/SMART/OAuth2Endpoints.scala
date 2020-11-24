package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The OAuth2 endpoints (Registration URI, Authorize URI, Token URI)
  */
@js.native
trait OAuth2Endpoints extends js.Object {
  
  /**
    * OAuth2 Authorize URI
    */
  var authorize_uri: js.UndefOr[String] = js.native
  
  /**
    * OAuth2 Registration URI
    */
  var registration_uri: js.UndefOr[String] = js.native
  
  /**
    * OAuth2 Token URI
    */
  var token_uri: js.UndefOr[String] = js.native
}
object OAuth2Endpoints {
  
  @scala.inline
  def apply(): OAuth2Endpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Endpoints]
  }
  
  @scala.inline
  implicit class OAuth2EndpointsOps[Self <: OAuth2Endpoints] (val x: Self) extends AnyVal {
    
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
    def setAuthorize_uri(value: String): Self = this.set("authorize_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorize_uri: Self = this.set("authorize_uri", js.undefined)
    
    @scala.inline
    def setRegistration_uri(value: String): Self = this.set("registration_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistration_uri: Self = this.set("registration_uri", js.undefined)
    
    @scala.inline
    def setToken_uri(value: String): Self = this.set("token_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_uri: Self = this.set("token_uri", js.undefined)
  }
}
