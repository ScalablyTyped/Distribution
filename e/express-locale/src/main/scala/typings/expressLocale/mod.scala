package typings.expressLocale

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Express middleware to determine the locale identifier of the incomming request.
    * It returns (only) full locale identifiers based on the middleware's configuration.
    * Configuration defines possible sources, their order and, optionally, a whitelist.
    * For performance reasons, on each request, remaining lookups are ignored as soon as a match is found.
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
  
  @JSImport("express-locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The locale property on the request object
    */
  trait Locale extends StObject {
    
    var language: String
    
    var region: String
    
    var source: String
  }
  object Locale {
    
    inline def apply(language: String, region: String, source: String): Locale = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see {@link https://github.com/smhg/express-locale/#configuration}
    */
  trait Options extends StObject {
    
    /**
      * The default locale for the default lookup.
      * @default 'en-GB'
      */
    var default: js.UndefOr[String] = js.undefined
    
    /**
      * Lookup results are validated against this list of allowed locales if provided.
      * @default undefined
      */
    var allowed: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The name of the cookie that contains the locale for the cookie lookup.
      *
      * Use with {@link https://github.com/expressjs/cookie-parser|cookie-parser} middleware.
      *
      * Note: you are responsible for writing the locale to the cookie.
      *
      * @default {name: 'locale'}
      */
    var cookie: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * A mapping of hostnames to locales for the hostname lookup.
      * @default {}
      */
    var hostname: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Add custom lookups or overwrite the default ones
      * @default undefined
      */
    var lookups: js.UndefOr[
        StringDictionary[
          js.Function1[
            /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], 
            String
          ]
        ]
      ] = js.undefined
    
    /**
      * Maps lookup results that return only a language to a full locale.
      * @default {}
      */
    var map: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Defines the order of lookups.
      * The first lookup to return a full locale will be the final result.
      * @default ['accept-language', 'default']
      */
    var priority: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The name of the query string parameter that contains the locale for the query lookup.
      * @default {name: 'locale'}
      */
    var query: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * By default, the locale is attached to `req.locale` but can be configured with the `requestProperty` option.
      * @default 'locale'
      */
    var requestProperty: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowed(value: js.Array[String]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setAllowedVarargs(value: String*): Self = StObject.set(x, "allowed", js.Array(value*))
      
      inline def setCookie(value: StringDictionary[Any]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setHostname(value: StringDictionary[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setLookups(
        value: StringDictionary[
              js.Function1[
                /* req */ Request_[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                  Any, 
                  Any, 
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                  Record[String, Any]
                ], 
                String
              ]
            ]
      ): Self = StObject.set(x, "lookups", value.asInstanceOf[js.Any])
      
      inline def setLookupsUndefined: Self = StObject.set(x, "lookups", js.undefined)
      
      inline def setMap(value: StringDictionary[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPriority(value: js.Array[String]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setPriorityVarargs(value: String*): Self = StObject.set(x, "priority", js.Array(value*))
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRequestProperty(value: String): Self = StObject.set(x, "requestProperty", value.asInstanceOf[js.Any])
      
      inline def setRequestPropertyUndefined: Self = StObject.set(x, "requestProperty", js.undefined)
    }
  }
  
  /* augmented module */
  object expressServeStaticCoreAugmentingMod {
    
    trait Request extends StObject {
      
      var locale: Locale
    }
    object Request {
      
      inline def apply(locale: Locale): Request = {
        val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      }
    }
  }
}
