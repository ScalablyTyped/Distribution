package typings.fastifyCors

import org.scalablytyped.runtime.Shortcut
import typings.fastify.pluginMod.FastifyPlugin
import typings.std.Array
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fastify-cors", JSImport.Default)
  @js.native
  val default: FastifyPlugin[FastifyCorsOptions] = js.native
  
  @js.native
  trait ArrayOfValueOrArray[T] extends Array[ValueOrArray[T]]
  
  @js.native
  trait FastifyCorsOptions extends StObject {
    
    /**
      * Configures the Access-Control-Allow-Headers CORS header.
      * Expects a comma-delimited string (ex: 'Content-Type,Authorization')
      * or an array (ex: ['Content-Type', 'Authorization']). If not
      * specified, defaults to reflecting the headers specified in the
      * request's Access-Control-Request-Headers header.
      */
    var allowedHeaders: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Configures the Access-Control-Allow-Credentials CORS header.
      * Set to true to pass the header, otherwise it is omitted.
      */
    var credentials: js.UndefOr[Boolean] = js.native
    
    /**
      * Configures the Access-Control-Expose-Headers CORS header.
      * Expects a comma-delimited string (ex: 'Content-Range,X-Content-Range')
      * or an array (ex: ['Content-Range', 'X-Content-Range']).
      * If not specified, no custom headers are exposed.
      */
    var exposedHeaders: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Hide options route from the documentation built using fastify-swagger (default: true).
      */
    var hideOptionsRoute: js.UndefOr[Boolean] = js.native
    
    /**
      * Configures the Access-Control-Max-Age CORS header.
      * Set to an integer to pass the header, otherwise it is omitted.
      */
    var maxAge: js.UndefOr[Double] = js.native
    
    /**
      * Configures the Access-Control-Allow-Methods CORS header.
      * Expects a comma-delimited string (ex: 'GET,PUT,POST') or an array (ex: ['GET', 'PUT', 'POST']).
      */
    var methods: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Provides a status code to use for successful OPTIONS requests,
      * since some legacy browsers (IE11, various SmartTVs) choke on 204.
      */
    var optionsSuccessStatus: js.UndefOr[Double] = js.native
    
    /**
      * Configures the Access-Control-Allow-Origin CORS header.
      */
    var origin: js.UndefOr[ValueOrArray[OriginType] | OriginFunction] = js.native
    
    /**
      * Pass the CORS preflight response to the route handler (default: false).
      */
    var preflight: js.UndefOr[Boolean] = js.native
    
    /**
      * Pass the CORS preflight response to the route handler (default: false).
      */
    var preflightContinue: js.UndefOr[Boolean] = js.native
  }
  object FastifyCorsOptions {
    
    @scala.inline
    def apply(): FastifyCorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyCorsOptions]
    }
    
    @scala.inline
    implicit class FastifyCorsOptionsMutableBuilder[Self <: FastifyCorsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedHeaders(value: String | js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
      
      @scala.inline
      def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value :_*))
      
      @scala.inline
      def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setExposedHeaders(value: String | js.Array[String]): Self = StObject.set(x, "exposedHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposedHeadersUndefined: Self = StObject.set(x, "exposedHeaders", js.undefined)
      
      @scala.inline
      def setExposedHeadersVarargs(value: String*): Self = StObject.set(x, "exposedHeaders", js.Array(value :_*))
      
      @scala.inline
      def setHideOptionsRoute(value: Boolean): Self = StObject.set(x, "hideOptionsRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOptionsRouteUndefined: Self = StObject.set(x, "hideOptionsRoute", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMethods(value: String | js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setOptionsSuccessStatus(value: Double): Self = StObject.set(x, "optionsSuccessStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsSuccessStatusUndefined: Self = StObject.set(x, "optionsSuccessStatus", js.undefined)
      
      @scala.inline
      def setOrigin(value: ValueOrArray[OriginType] | OriginFunction): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFunction2(value: (/* origin */ String, /* callback */ OriginCallback) => Unit): Self = StObject.set(x, "origin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPreflight(value: Boolean): Self = StObject.set(x, "preflight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreflightContinue(value: Boolean): Self = StObject.set(x, "preflightContinue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreflightContinueUndefined: Self = StObject.set(x, "preflightContinue", js.undefined)
      
      @scala.inline
      def setPreflightUndefined: Self = StObject.set(x, "preflight", js.undefined)
    }
  }
  
  type OriginCallback = js.Function2[/* err */ Error | Null, /* allow */ Boolean, Unit]
  
  type OriginFunction = js.Function2[/* origin */ String, /* callback */ OriginCallback, Unit]
  
  type OriginType = String | Boolean | RegExp
  
  type ValueOrArray[T] = T | ArrayOfValueOrArray[T]
  
  type _To = FastifyPlugin[FastifyCorsOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FastifyPlugin[FastifyCorsOptions] = default
}
