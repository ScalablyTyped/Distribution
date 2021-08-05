package typings.googleAuthLibrary

import org.scalablytyped.runtime.Instantiable0
import typings.googleAuthLibrary.loginticketMod.TokenPayload
import typings.googleAuthLibrary.transportersMod.DefaultTransporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Envelope extends StObject {
    
    var envelope: js.UndefOr[String] = js.undefined
    
    var payload: js.UndefOr[TokenPayload] = js.undefined
  }
  object Envelope {
    
    inline def apply(): Envelope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Envelope]
    }
    
    extension [Self <: Envelope](x: Self) {
      
      inline def setEnvelope(value: String): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
      
      inline def setPayload(value: TokenPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.Headers] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: typings.googleAuthLibrary.oauth2clientMod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait TypeofDefaultTransporter
    extends StObject
       with Instantiable0[DefaultTransporter] {
    
    /**
      * Default user agent.
      */
    val USER_AGENT: String = js.native
  }
  
  trait Xgoogiamauthorityselector extends StObject {
    
    var `x-goog-iam-authority-selector`: String
    
    var `x-goog-iam-authorization-token`: String
  }
  object Xgoogiamauthorityselector {
    
    inline def apply(`x-goog-iam-authority-selector`: String, `x-goog-iam-authorization-token`: String): Xgoogiamauthorityselector = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xgoogiamauthorityselector]
    }
    
    extension [Self <: Xgoogiamauthorityselector](x: Self) {
      
      inline def `setX-goog-iam-authority-selector`(value: String): Self = StObject.set(x, "x-goog-iam-authority-selector", value.asInstanceOf[js.Any])
      
      inline def `setX-goog-iam-authorization-token`(value: String): Self = StObject.set(x, "x-goog-iam-authorization-token", value.asInstanceOf[js.Any])
    }
  }
}
