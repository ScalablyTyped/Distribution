package typings.googleAuthLibrary

import org.scalablytyped.runtime.Instantiable0
import typings.googleAuthLibrary.loginticketMod.TokenPayload
import typings.googleAuthLibrary.transportersMod.DefaultTransporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Envelope extends StObject {
    
    var envelope: js.UndefOr[String] = js.native
    
    var payload: js.UndefOr[TokenPayload] = js.native
  }
  object Envelope {
    
    @scala.inline
    def apply(): Envelope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Envelope]
    }
    
    @scala.inline
    implicit class EnvelopeMutableBuilder[Self <: Envelope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvelope(value: String): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
      
      @scala.inline
      def setPayload(value: TokenPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    var headers: js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.Headers] = js.native
    
    var uri: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: typings.googleAuthLibrary.oauth2clientMod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait TypeofDefaultTransporter extends Instantiable0[DefaultTransporter] {
    
    /**
      * Default user agent.
      */
    val USER_AGENT: String = js.native
  }
  
  @js.native
  trait Xgoogiamauthorityselector extends StObject {
    
    var `x-goog-iam-authority-selector`: String = js.native
    
    var `x-goog-iam-authorization-token`: String = js.native
  }
  object Xgoogiamauthorityselector {
    
    @scala.inline
    def apply(`x-goog-iam-authority-selector`: String, `x-goog-iam-authorization-token`: String): Xgoogiamauthorityselector = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xgoogiamauthorityselector]
    }
    
    @scala.inline
    implicit class XgoogiamauthorityselectorMutableBuilder[Self <: Xgoogiamauthorityselector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setX-goog-iam-authority-selector`(value: String): Self = StObject.set(x, "x-goog-iam-authority-selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-goog-iam-authorization-token`(value: String): Self = StObject.set(x, "x-goog-iam-authorization-token", value.asInstanceOf[js.Any])
    }
  }
}
