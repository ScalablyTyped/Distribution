package typings.expressUaMiddleware

import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressUaMiddleware.anon.Model
import typings.expressUaMiddleware.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Express middleware to parse user-agent header
    */
  inline def apply(): RequestHandler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler]
  
  @JSImport("express-ua-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait UserAgent extends StObject {
    
    val browser: Name
    
    val device: Model
    
    val os: Name
    
    val raw: String
  }
  object UserAgent {
    
    inline def apply(browser: Name, device: Model, os: Name, raw: String): UserAgent = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent]
    }
    
    extension [Self <: UserAgent](x: Self) {
      
      inline def setBrowser(value: Name): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: Model): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setOs(value: Name): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  // types based on @types/ua-parser-js
  // manually copied due to lack of the proper type exports
  trait UserAgentRaw extends StObject {
    
    var raw: String
  }
  object UserAgentRaw {
    
    inline def apply(raw: String): UserAgentRaw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentRaw]
    }
    
    extension [Self <: UserAgentRaw](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var userAgent: UserAgent & UserAgentRaw
        
        def userAgentFromString(raw: String): UserAgent
      }
      object Request {
        
        inline def apply(userAgent: UserAgent & UserAgentRaw, userAgentFromString: String => UserAgent): Request = {
          val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], userAgentFromString = js.Any.fromFunction1(userAgentFromString))
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setUserAgent(value: UserAgent & UserAgentRaw): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
          
          inline def setUserAgentFromString(value: String => UserAgent): Self = StObject.set(x, "userAgentFromString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
