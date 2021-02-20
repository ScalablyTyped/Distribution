package typings.expressLocale

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Express middleware to determine the locale identifier of the incomming request.
    * It returns (only) full locale identifiers based on the middleware's configuration.
    * Configuration defines possible sources, their order and, optionally, a whitelist.
    * For performance reasons, on each request, remaining lookups are ignored as soon as a match is found.
    */
  @JSImport("express-locale", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-locale", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * The locale property on the request object
    */
  @js.native
  trait Locale extends StObject {
    
    var language: String = js.native
    
    var region: String = js.native
    
    var source: String = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(language: String, region: String, source: String): Locale = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see {@link https://github.com/smhg/express-locale/#configuration}
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * The default locale for the default lookup.
      * @default 'en-GB'
      */
    var default: js.UndefOr[String] = js.native
    
    /**
      * Lookup results are validated against this list of allowed locales if provided.
      * @default undefined
      */
    var allowed: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The name of the cookie that contains the locale for the cookie lookup.
      *
      * Use with {@link https://github.com/expressjs/cookie-parser|cookie-parser} middleware.
      *
      * Note: you are responsible for writing the locale to the cookie.
      *
      * @default {name: 'locale'}
      */
    var cookie: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * A mapping of hostnames to locales for the hostname lookup.
      * @default {}
      */
    var hostname: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Add custom lookups or overwrite the default ones
      * @default undefined
      */
    var lookups: js.UndefOr[
        StringDictionary[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]]
      ] = js.native
    
    /**
      * Maps lookup results that return only a language to a full locale.
      * @default {}
      */
    var map: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Defines the order of lookups.
      * The first lookup to return a full locale will be the final result.
      * @default ['accept-language', 'default']
      */
    var priority: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The name of the query string parameter that contains the locale for the query lookup.
      * @default {name: 'locale'}
      */
    var query: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * By default, the locale is attached to `req.locale` but can be configured with the `requestProperty` option.
      * @default 'locale'
      */
    var requestProperty: js.UndefOr[String] = js.native
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
      def setAllowed(value: js.Array[String]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      @scala.inline
      def setAllowedVarargs(value: String*): Self = StObject.set(x, "allowed", js.Array(value :_*))
      
      @scala.inline
      def setCookie(value: StringDictionary[js.Any]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setHostname(value: StringDictionary[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setLookups(value: StringDictionary[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]]): Self = StObject.set(x, "lookups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupsUndefined: Self = StObject.set(x, "lookups", js.undefined)
      
      @scala.inline
      def setMap(value: StringDictionary[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setPriority(value: js.Array[String]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setPriorityVarargs(value: String*): Self = StObject.set(x, "priority", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: StringDictionary[js.Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRequestProperty(value: String): Self = StObject.set(x, "requestProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPropertyUndefined: Self = StObject.set(x, "requestProperty", js.undefined)
    }
  }
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      var locale: Locale = js.native
    }
    object Request {
      
      @scala.inline
      def apply(locale: Locale): Request = {
        val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      }
    }
  }
}
