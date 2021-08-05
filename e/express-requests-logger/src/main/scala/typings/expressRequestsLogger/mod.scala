package typings.expressRequestsLogger

import typings.expressRequestsLogger.expressRequestsLoggerStrings.debug
import typings.expressRequestsLogger.expressRequestsLoggerStrings.error
import typings.expressRequestsLogger.expressRequestsLoggerStrings.info
import typings.expressRequestsLogger.expressRequestsLoggerStrings.trace
import typings.expressRequestsLogger.expressRequestsLoggerStrings.warn
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.qs.mod.ParsedQs
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Middleware for logging request/responses in Express apps
    */
  inline def apply(): NextFunction = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[NextFunction]
  inline def apply(options: Options): NextFunction = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[NextFunction]
  
  @JSImport("express-requests-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CommonOptions extends StObject {
    
    /**
      * `true` - include request in audit, `false` - don't.
      * {@link https://github.com/PayU/express-request-logger#audit}
      */
    var audit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * pass the fields you wish to exclude in the body of the requests (sensitive data like passwords, credit cards numbers etc..). * field - exclude all body
      * {@link https://github.com/PayU/express-request-logger#excludebody}
      */
    var excludeBody: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * pass the header names you wish to exclude from the audit (senstitive data like authorization headers etc..). * field - exclude all headers
      * {@link https://github.com/PayU/express-request-logger#excludeheaders}
      */
    var excludeHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * pass the fields you wish to mask in the body of the requests (sensitive data like passwords, credit cards numbers etc..).
      * {@link https://github.com/PayU/express-request-logger#maskbody}
      */
    var maskBody: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * pass the fields you wish to mask in the headers of the requests (senstitive data like authorization headers etc..).
      * {@link https://github.com/PayU/express-request-logger#maskheaders}
      */
    var maskHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * pass the fields you wish to mask in the query of the requests (sensitive data like passwords, credit cards numbers etc..).
      * {@link https://github.com/PayU/express-request-logger#maskquery}
      */
    var maskQuery: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Restrict request body's logged content length (inputs other than positive integers will be ignored).
      * {@link https://github.com/PayU/express-request-logger#maxbodylength}
      */
    var maxBodyLength: js.UndefOr[Double] = js.undefined
  }
  object CommonOptions {
    
    inline def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    extension [Self <: CommonOptions](x: Self) {
      
      inline def setAudit(value: Boolean): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
      
      inline def setAuditUndefined: Self = StObject.set(x, "audit", js.undefined)
      
      inline def setExcludeBody(value: js.Array[String]): Self = StObject.set(x, "excludeBody", value.asInstanceOf[js.Any])
      
      inline def setExcludeBodyUndefined: Self = StObject.set(x, "excludeBody", js.undefined)
      
      inline def setExcludeBodyVarargs(value: String*): Self = StObject.set(x, "excludeBody", js.Array(value :_*))
      
      inline def setExcludeHeaders(value: js.Array[String]): Self = StObject.set(x, "excludeHeaders", value.asInstanceOf[js.Any])
      
      inline def setExcludeHeadersUndefined: Self = StObject.set(x, "excludeHeaders", js.undefined)
      
      inline def setExcludeHeadersVarargs(value: String*): Self = StObject.set(x, "excludeHeaders", js.Array(value :_*))
      
      inline def setMaskBody(value: js.Array[String]): Self = StObject.set(x, "maskBody", value.asInstanceOf[js.Any])
      
      inline def setMaskBodyUndefined: Self = StObject.set(x, "maskBody", js.undefined)
      
      inline def setMaskBodyVarargs(value: String*): Self = StObject.set(x, "maskBody", js.Array(value :_*))
      
      inline def setMaskHeaders(value: js.Array[String]): Self = StObject.set(x, "maskHeaders", value.asInstanceOf[js.Any])
      
      inline def setMaskHeadersUndefined: Self = StObject.set(x, "maskHeaders", js.undefined)
      
      inline def setMaskHeadersVarargs(value: String*): Self = StObject.set(x, "maskHeaders", js.Array(value :_*))
      
      inline def setMaskQuery(value: js.Array[String]): Self = StObject.set(x, "maskQuery", value.asInstanceOf[js.Any])
      
      inline def setMaskQueryUndefined: Self = StObject.set(x, "maskQuery", js.undefined)
      
      inline def setMaskQueryVarargs(value: String*): Self = StObject.set(x, "maskQuery", js.Array(value :_*))
      
      inline def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
      
      inline def setMaxBodyLengthUndefined: Self = StObject.set(x, "maxBodyLength", js.undefined)
    }
  }
  
  trait Logger extends StObject {
    
    def info(obj: js.Object, params: js.Any*): Unit
  }
  object Logger {
    
    inline def apply(info: (js.Object, /* repeated */ js.Any) => Unit): Logger = {
      val __obj = js.Dynamic.literal(info = js.Any.fromFunction2(info))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setInfo(value: (js.Object, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * {@link https://github.com/PayU/express-request-logger#options}
    */
  trait Options
    extends StObject
       with CommonOptions {
    
    /**
      * Additional to mask options, you can add your own functionality to mask request body.
      * This function will execute as a masking function before the package functions.
      * The custom function gets the full express request and should return the masked body.
      * {@link https://github.com/PayU/express-request-logger#custommaskbodyfunc}
      */
    var customMaskBodyFunc: js.UndefOr[
        js.Function1[/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], String]
      ] = js.undefined
    
    /**
      * `true` - log once the request arrives (request details), and log after response is sent (both request and response).
      * Useful if there is a concern that the server will crash during the request and there is a need to log the request before it's processed.
      * `false` - log only after the response is sent.
      * {@link https://github.com/PayU/express-request-logger#doubleaudit}
      */
    var doubleAudit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if the request url matches one of the values in the array, the request/response won't be logged.
      * {@link https://github.com/PayU/express-request-logger#excludeurls}
      */
    var excludeURLs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The logger to use for logging the request/response.
      * Package tested only with `bunyan` logger, but should work with any logger which has a info method which takes an object.
      * {@link https://github.com/PayU/express-request-logger#logger}
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * Specific configuration for requests
      * {@link https://github.com/PayU/express-request-logger#request}
      */
    var request: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Specific configuration for responses
      * {@link https://github.com/PayU/express-request-logger#response}
      */
    var response: js.UndefOr[ResponseOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCustomMaskBodyFunc(value: /* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs] => String): Self = StObject.set(x, "customMaskBodyFunc", js.Any.fromFunction1(value))
      
      inline def setCustomMaskBodyFuncUndefined: Self = StObject.set(x, "customMaskBodyFunc", js.undefined)
      
      inline def setDoubleAudit(value: Boolean): Self = StObject.set(x, "doubleAudit", value.asInstanceOf[js.Any])
      
      inline def setDoubleAuditUndefined: Self = StObject.set(x, "doubleAudit", js.undefined)
      
      inline def setExcludeURLs(value: js.Array[String]): Self = StObject.set(x, "excludeURLs", value.asInstanceOf[js.Any])
      
      inline def setExcludeURLsUndefined: Self = StObject.set(x, "excludeURLs", js.undefined)
      
      inline def setExcludeURLsVarargs(value: String*): Self = StObject.set(x, "excludeURLs", js.Array(value :_*))
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResponse(value: ResponseOptions): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  trait ResponseOptions
    extends StObject
       with CommonOptions {
    
    /**
      * Map of statusCodes to log levels.
      * By default the audit is logged with level 'info'.
      * It is possible to override it by configuration according to the statusCode of the response
      */
    var levels: js.UndefOr[StatusCodeMap] = js.undefined
  }
  object ResponseOptions {
    
    inline def apply(): ResponseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseOptions]
    }
    
    extension [Self <: ResponseOptions](x: Self) {
      
      inline def setLevels(value: StatusCodeMap): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    }
  }
  
  type StatusCodeMap = Record[String, trace | debug | info | warn | error]
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        val maxBodyLength: Double
      }
      object Request {
        
        inline def apply(maxBodyLength: Double): typings.expressRequestsLogger.mod.global.Express.Request = {
          val __obj = js.Dynamic.literal(maxBodyLength = maxBodyLength.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.expressRequestsLogger.mod.global.Express.Request]
        }
        
        extension [Self <: typings.expressRequestsLogger.mod.global.Express.Request](x: Self) {
          
          inline def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
        }
      }
      
      trait Response extends StObject {
        
        val maxBodyLength: Double
        
        val timestamp: Date
      }
      object Response {
        
        inline def apply(maxBodyLength: Double, timestamp: Date): Response = {
          val __obj = js.Dynamic.literal(maxBodyLength = maxBodyLength.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
          __obj.asInstanceOf[Response]
        }
        
        extension [Self <: Response](x: Self) {
          
          inline def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
          
          inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
