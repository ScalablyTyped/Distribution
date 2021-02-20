package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUserAgentOverrideRequest extends StObject {
  
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
