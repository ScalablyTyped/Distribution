package typings.expressNtlm

import typings.express.mod.Handler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.tlsMod.ConnectionOptions
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Handler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Handler]
  @scala.inline
  def apply(options: Options): Handler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadrequest(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "badrequest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBadrequestUndefined: Self = StObject.set(x, "badrequest", js.undefined)
      
      @scala.inline
      def setDebug(value: (/* prefix */ String, /* message */ String) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomaincontroller(value: String | js.Array[String]): Self = StObject.set(x, "domaincontroller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomaincontrollerUndefined: Self = StObject.set(x, "domaincontroller", js.undefined)
      
      @scala.inline
      def setDomaincontrollerVarargs(value: String*): Self = StObject.set(x, "domaincontroller", js.Array(value :_*))
      
      @scala.inline
      def setForbidden(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "forbidden", js.Any.fromFunction3(value))
      
      @scala.inline
      def setForbiddenUndefined: Self = StObject.set(x, "forbidden", js.undefined)
      
      @scala.inline
      def setInternalservererror(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "internalservererror", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInternalservererrorUndefined: Self = StObject.set(x, "internalservererror", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setTlsOptions(value: ConnectionOptions): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
      
      @scala.inline
      def setUnauthorized(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "unauthorized", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnauthorizedUndefined: Self = StObject.set(x, "unauthorized", js.undefined)
    }
  }
  
  trait RequestNtlm extends StObject {
    
    var DomainName: js.UndefOr[String] = js.undefined
    
    var UserName: js.UndefOr[String] = js.undefined
    
    var Workstation: js.UndefOr[String] = js.undefined
  }
  object RequestNtlm {
    
    @scala.inline
    def apply(): RequestNtlm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestNtlm]
    }
    
    @scala.inline
    implicit class RequestNtlmMutableBuilder[Self <: RequestNtlm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
      
      @scala.inline
      def setWorkstation(value: String): Self = StObject.set(x, "Workstation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkstationUndefined: Self = StObject.set(x, "Workstation", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var ntlm: js.UndefOr[RequestNtlm] = js.undefined
      }
      object Request {
        
        @scala.inline
        def apply(): typings.expressNtlm.mod.global.Express.Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.expressNtlm.mod.global.Express.Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: typings.expressNtlm.mod.global.Express.Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setNtlm(value: RequestNtlm): Self = StObject.set(x, "ntlm", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNtlmUndefined: Self = StObject.set(x, "ntlm", js.undefined)
        }
      }
    }
  }
}
