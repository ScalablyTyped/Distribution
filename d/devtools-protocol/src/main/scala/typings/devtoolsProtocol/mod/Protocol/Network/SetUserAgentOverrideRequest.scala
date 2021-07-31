package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Emulation.UserAgentMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUserAgentOverrideRequest extends StObject {
  
  /**
    * Browser langugage to emulate.
    */
  var acceptLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The platform navigator.platform should return.
    */
  var platform: js.UndefOr[String] = js.undefined
  
  /**
    * User agent to use.
    */
  var userAgent: String
  
  /**
    * To be sent in Sec-CH-UA-* headers and returned in navigator.userAgentData
    */
  var userAgentMetadata: js.UndefOr[UserAgentMetadata] = js.undefined
}
object SetUserAgentOverrideRequest {
  
  @scala.inline
  def apply(userAgent: String): SetUserAgentOverrideRequest = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserAgentOverrideRequest]
  }
  
  @scala.inline
  implicit class SetUserAgentOverrideRequestMutableBuilder[Self <: SetUserAgentOverrideRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: String): Self = StObject.set(x, "acceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "acceptLanguage", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentMetadata(value: UserAgentMetadata): Self = StObject.set(x, "userAgentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentMetadataUndefined: Self = StObject.set(x, "userAgentMetadata", js.undefined)
  }
}
