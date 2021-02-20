package typings.expressUaMiddleware

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressUaMiddleware.anon.Model
import typings.expressUaMiddleware.anon.Name
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Express middleware to parse user-agent header
    */
  @JSImport("express-ua-middleware", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  
  @js.native
  trait UserAgent extends StObject {
    
    val browser: Name = js.native
    
    val device: Model = js.native
    
    val os: Name = js.native
    
    val raw: String = js.native
  }
  object UserAgent {
    
    @scala.inline
    def apply(browser: Name, device: Model, os: Name, raw: String): UserAgent = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent]
    }
    
    @scala.inline
    implicit class UserAgentMutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: Name): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: Model): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: Name): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  // types based on @types/ua-parser-js
  // manually copied due to lack of the proper type exports
  @js.native
  trait UserAgentRaw extends StObject {
    
    var raw: String = js.native
  }
  object UserAgentRaw {
    
    @scala.inline
    def apply(raw: String): UserAgentRaw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentRaw]
    }
    
    @scala.inline
    implicit class UserAgentRawMutableBuilder[Self <: UserAgentRaw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        var userAgent: UserAgent with UserAgentRaw = js.native
        
        def userAgentFromString(raw: String): UserAgent = js.native
      }
      object Request {
        
        @scala.inline
        def apply(userAgent: UserAgent with UserAgentRaw, userAgentFromString: String => UserAgent): Request = {
          val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], userAgentFromString = js.Any.fromFunction1(userAgentFromString))
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setUserAgent(value: UserAgent with UserAgentRaw): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUserAgentFromString(value: String => UserAgent): Self = StObject.set(x, "userAgentFromString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
