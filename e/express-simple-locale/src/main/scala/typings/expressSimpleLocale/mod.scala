package typings.expressSimpleLocale

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple Express middleware to guess the short-locale of a user.
    * It then saves the found locale on the request for further usage.
    */
  @JSImport("express-simple-locale", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-simple-locale", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * @see {@link https://github.com/n26/express-simple-locale#options}
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * cookie to try getting the locale from
      * @default 'locale'
      */
    var cookieName: js.UndefOr[String] = js.native
    
    /**
      * locale to fallback to
      * @default 'en'
      */
    var defaultLocale: js.UndefOr[String] = js.native
    
    /**
      * the key to save locale to on the request
      * @default 'locale'
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * the query parameter(s) to look the locale from
      * @default ['locale']
      */
    var queryParams: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * available locales for the app
      * @default []
      */
    var supportedLocales: js.UndefOr[js.Array[String]] = js.native
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
      def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setQueryParams(value: String | js.Array[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setQueryParamsVarargs(value: String*): Self = StObject.set(x, "queryParams", js.Array(value :_*))
      
      @scala.inline
      def setSupportedLocales(value: js.Array[String]): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
      
      @scala.inline
      def setSupportedLocalesVarargs(value: String*): Self = StObject.set(x, "supportedLocales", js.Array(value :_*))
    }
  }
  
  /** The short-locale of a user */
  type ShortLocale = String
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      var userLocale: ShortLocale = js.native
    }
    object Request {
      
      @scala.inline
      def apply(userLocale: ShortLocale): Request = {
        val __obj = js.Dynamic.literal(userLocale = userLocale.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUserLocale(value: ShortLocale): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
      }
    }
  }
}
