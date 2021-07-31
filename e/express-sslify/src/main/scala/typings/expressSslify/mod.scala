package typings.expressSslify

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-sslify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def HTTPS(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("HTTPS")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def HTTPS(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("HTTPS")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  trait Options extends StObject {
    
    /**
      * Azure has a slightly different way of signaling encrypted connections.
      * To tell express-sslify to look out for Azure's x-arr-ssl header.
      * @default false
      */
    var trustAzureHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Heroku, nodejitsu and other hosters often use reverse proxies which offer SSL endpoints but then forward unencrypted HTTP traffic to the website.
      * This makes it difficult to detect if the original request was indeed via HTTPS.
      * Luckily, most reverse proxies set the x-forwarded-proto header flag with the original request scheme.
      * @default false
      */
    var trustProtoHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If your reverse proxy sends the original host using the X-Forwarded-Host header and you need to use that instead of the Host header for the redirect.
      * @default false
      */
    var trustXForwardedHostHeader: js.UndefOr[Boolean] = js.undefined
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
      def setTrustAzureHeader(value: Boolean): Self = StObject.set(x, "trustAzureHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustAzureHeaderUndefined: Self = StObject.set(x, "trustAzureHeader", js.undefined)
      
      @scala.inline
      def setTrustProtoHeader(value: Boolean): Self = StObject.set(x, "trustProtoHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustProtoHeaderUndefined: Self = StObject.set(x, "trustProtoHeader", js.undefined)
      
      @scala.inline
      def setTrustXForwardedHostHeader(value: Boolean): Self = StObject.set(x, "trustXForwardedHostHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustXForwardedHostHeaderUndefined: Self = StObject.set(x, "trustXForwardedHostHeader", js.undefined)
    }
  }
}
