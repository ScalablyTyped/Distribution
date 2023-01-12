package typings.expressNtlm

import typings.express.mod.Handler
import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Handler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Handler]
  inline def apply(options: Options): Handler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @JSImport("express-ntlm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var badrequest: js.UndefOr[Handler] = js.undefined
    
    var debug: js.UndefOr[js.Function2[/* prefix */ String, /* message */ String, Unit]] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var domaincontroller: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var forbidden: js.UndefOr[Handler] = js.undefined
    
    var internalservererror: js.UndefOr[Handler] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var tlsOptions: js.UndefOr[ConnectionOptions] = js.undefined
    
    var unauthorized: js.UndefOr[Handler] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBadrequest(value: Handler): Self = StObject.set(x, "badrequest", value.asInstanceOf[js.Any])
      
      inline def setBadrequestUndefined: Self = StObject.set(x, "badrequest", js.undefined)
      
      inline def setDebug(value: (/* prefix */ String, /* message */ String) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomaincontroller(value: String | js.Array[String]): Self = StObject.set(x, "domaincontroller", value.asInstanceOf[js.Any])
      
      inline def setDomaincontrollerUndefined: Self = StObject.set(x, "domaincontroller", js.undefined)
      
      inline def setDomaincontrollerVarargs(value: String*): Self = StObject.set(x, "domaincontroller", js.Array(value*))
      
      inline def setForbidden(value: Handler): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
      
      inline def setForbiddenUndefined: Self = StObject.set(x, "forbidden", js.undefined)
      
      inline def setInternalservererror(value: Handler): Self = StObject.set(x, "internalservererror", value.asInstanceOf[js.Any])
      
      inline def setInternalservererrorUndefined: Self = StObject.set(x, "internalservererror", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTlsOptions(value: ConnectionOptions): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      inline def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
      
      inline def setUnauthorized(value: Handler): Self = StObject.set(x, "unauthorized", value.asInstanceOf[js.Any])
      
      inline def setUnauthorizedUndefined: Self = StObject.set(x, "unauthorized", js.undefined)
    }
  }
  
  trait RequestNtlm extends StObject {
    
    var DomainName: js.UndefOr[String] = js.undefined
    
    var UserName: js.UndefOr[String] = js.undefined
    
    var Workstation: js.UndefOr[String] = js.undefined
  }
  object RequestNtlm {
    
    inline def apply(): RequestNtlm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestNtlm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestNtlm] (val x: Self) extends AnyVal {
      
      inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
      
      inline def setWorkstation(value: String): Self = StObject.set(x, "Workstation", value.asInstanceOf[js.Any])
      
      inline def setWorkstationUndefined: Self = StObject.set(x, "Workstation", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var ntlm: js.UndefOr[RequestNtlm] = js.undefined
      }
      object Request {
        
        inline def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          inline def setNtlm(value: RequestNtlm): Self = StObject.set(x, "ntlm", value.asInstanceOf[js.Any])
          
          inline def setNtlmUndefined: Self = StObject.set(x, "ntlm", js.undefined)
        }
      }
    }
  }
}
