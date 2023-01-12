package typings.expressSimpleLocale

import typings.express.mod.RequestHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple Express middleware to guess the short-locale of a user.
    * It then saves the found locale on the request for further usage.
    */
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: Options): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-simple-locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see {@link https://github.com/n26/express-simple-locale#options}
    */
  trait Options extends StObject {
    
    /**
      * cookie to try getting the locale from
      * @default 'locale'
      */
    var cookieName: js.UndefOr[String] = js.undefined
    
    /**
      * locale to fallback to
      * @default 'en'
      */
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    /**
      * the key to save locale to on the request
      * @default 'locale'
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * the query parameter(s) to look the locale from
      * @default ['locale']
      */
    var queryParams: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * available locales for the app
      * @default []
      */
    var supportedLocales: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setQueryParams(value: String | js.Array[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setQueryParamsVarargs(value: String*): Self = StObject.set(x, "queryParams", js.Array(value*))
      
      inline def setSupportedLocales(value: js.Array[String]): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
      
      inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
      
      inline def setSupportedLocalesVarargs(value: String*): Self = StObject.set(x, "supportedLocales", js.Array(value*))
    }
  }
  
  /** The short-locale of a user */
  type ShortLocale = String
  
  /* augmented module */
  object expressServeStaticCoreAugmentingMod {
    
    trait Request extends StObject {
      
      var userLocale: ShortLocale
    }
    object Request {
      
      inline def apply(userLocale: ShortLocale): Request = {
        val __obj = js.Dynamic.literal(userLocale = userLocale.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        inline def setUserLocale(value: ShortLocale): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
      }
    }
  }
}
