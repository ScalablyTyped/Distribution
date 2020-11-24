package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Emulation.UserAgentMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUserAgentOverrideRequest extends js.Object {
  
  /**
    * Browser langugage to emulate.
    */
  var acceptLanguage: js.UndefOr[String] = js.native
  
  /**
    * The platform navigator.platform should return.
    */
  var platform: js.UndefOr[String] = js.native
  
  /**
    * User agent to use.
    */
  var userAgent: String = js.native
  
  /**
    * To be sent in Sec-CH-UA-* headers and returned in navigator.userAgentData
    */
  var userAgentMetadata: js.UndefOr[UserAgentMetadata] = js.native
}
object SetUserAgentOverrideRequest {
  
  @scala.inline
  def apply(userAgent: String): SetUserAgentOverrideRequest = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserAgentOverrideRequest]
  }
  
  @scala.inline
  implicit class SetUserAgentOverrideRequestOps[Self <: SetUserAgentOverrideRequest] (val x: Self) extends AnyVal {
    
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
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguage(value: String): Self = this.set("acceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("acceptLanguage", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setUserAgentMetadata(value: UserAgentMetadata): Self = this.set("userAgentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgentMetadata: Self = this.set("userAgentMetadata", js.undefined)
  }
}
