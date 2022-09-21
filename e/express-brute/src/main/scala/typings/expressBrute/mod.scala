package typings.expressBrute

import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressBrute.anon.Reset
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @summary Middleware.
    * @class
    */
  @JSImport("express-brute", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ExpressBrute {
    /**
      * @summary Constructor.
      * @constructor
      * @param {any} store The store.
      */
    def this(store: Any) = this()
    def this(store: Any, options: Options) = this()
    
    /**
      * @summary Generates middleware that will bounce requests with the same key and IP address that happen faster than the current wait time by calling failCallback.
      * @param {Object} options The options.
      */
    /* CompleteClass */
    override def getMiddleware(options: Middleware): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
      * @param {Request}     request     The HTTP request.
      * @param {Response}    response    The HTTP response.
      * @param {Function}    next        The next middleware.
      * @return {RequestHandler} The Request handler.
      */
    /* CompleteClass */
    override def prevent(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * @summary Resets the wait time between requests back to its initial value.
      * @param {string}      ip      The IP address.
      * @param {string}      key     The key. response.
      * @param {Function}    next    The next middleware.
      * @return {RequestHandler} The Request handler.
      */
    /* CompleteClass */
    override def reset(ip: String, key: String, next: NextFunction): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
  }
  
  @JSImport("express-brute", "FailForbidden")
  @js.native
  val FailForbidden: FailCallback = js.native
  
  @JSImport("express-brute", "FailMark")
  @js.native
  val FailMark: FailCallback = js.native
  
  @JSImport("express-brute", "FailTooManyRequests")
  @js.native
  val FailTooManyRequests: FailCallback = js.native
  
  @JSImport("express-brute", "MemoryStore")
  @js.native
  /**
    * @summary Constructor.
    * @constructor
    * @param {Object} options The options.
    */
  open class MemoryStore () extends StObject {
    def this(options: MemoryStoreOptions) = this()
    
    /**
      * @summary Gets key value.
      * @param {string}      key     The key name.
      * @param {Function}    callbck The callback.
      */
    def get(key: String, callback: js.Function2[/* error */ Any, /* data */ js.Object, Unit]): Unit = js.native
    
    /**
      * @summary Deletes the key.
      * @param {string}      key      The name.
      * @param {Function}    callback The callback.
      */
    def reset(key: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    /**
      * @summary Sets the key value.
      * @param {string}      key      The name.
      * @param {string}      value    The value.
      * @param {number}      lifetime The lifetime.
      * @param {Function}    callback The callback.
      */
    def set(key: String, value: Any, lifetime: Double, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
  }
  
  /**
    * @summary Middleware.
    * @class
    */
  trait ExpressBrute extends StObject {
    
    /**
      * @summary Generates middleware that will bounce requests with the same key and IP address that happen faster than the current wait time by calling failCallback.
      * @param {Object} options The options.
      */
    def getMiddleware(options: Middleware): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    
    /**
      * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
      * @param {Request}     request     The HTTP request.
      * @param {Response}    response    The HTTP response.
      * @param {Function}    next        The next middleware.
      * @return {RequestHandler} The Request handler.
      */
    def prevent(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    
    /**
      * @summary Resets the wait time between requests back to its initial value.
      * @param {string}      ip      The IP address.
      * @param {string}      key     The key. response.
      * @param {Function}    next    The next middleware.
      * @return {RequestHandler} The Request handler.
      */
    def reset(ip: String, key: String, next: NextFunction): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
  }
  object ExpressBrute {
    
    inline def apply(
      getMiddleware: Middleware => RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      prevent: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]], NextFunction) => RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      reset: (String, String, NextFunction) => RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): ExpressBrute = {
      val __obj = js.Dynamic.literal(getMiddleware = js.Any.fromFunction1(getMiddleware), prevent = js.Any.fromFunction3(prevent), reset = js.Any.fromFunction3(reset))
      __obj.asInstanceOf[ExpressBrute]
    }
    
    extension [Self <: ExpressBrute](x: Self) {
      
      inline def setGetMiddleware(
        value: Middleware => RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "getMiddleware", js.Any.fromFunction1(value))
      
      inline def setPrevent(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], Response_[Any, Record[String, Any]], NextFunction) => RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "prevent", js.Any.fromFunction3(value))
      
      inline def setReset(
        value: (String, String, NextFunction) => RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "reset", js.Any.fromFunction3(value))
    }
  }
  
  type FailCallback = js.Function4[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    /* nextValidRequestDate */ js.Date, 
    Unit
  ]
  
  trait MemoryStoreOptions extends StObject {
    
    /**
      * @summary Key prefix.
      * @type {string}
      */
    var prefix: String
  }
  object MemoryStoreOptions {
    
    inline def apply(prefix: String): MemoryStoreOptions = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryStoreOptions]
    }
    
    extension [Self <: MemoryStoreOptions](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Middleware extends StObject {
    
    /**
      * @summary Allows you to override the value of failCallback for this middleware.
      * @type {FailCallback}
      */
    var failCallback: js.UndefOr[FailCallback] = js.undefined
    
    /**
      * @summary Disregard IP address when matching requests if set to true. Defaults to false.
      * @type {boolean}
      */
    var ignoreIP: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @summary Key.
      * @type {Function}
      */
    var key: js.UndefOr[
        js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          /* next */ NextFunction, 
          Any
        ]
      ] = js.undefined
  }
  object Middleware {
    
    inline def apply(): Middleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Middleware]
    }
    
    extension [Self <: Middleware](x: Self) {
      
      inline def setFailCallback(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]], /* next */ NextFunction, /* nextValidRequestDate */ js.Date) => Unit
      ): Self = StObject.set(x, "failCallback", js.Any.fromFunction4(value))
      
      inline def setFailCallbackUndefined: Self = StObject.set(x, "failCallback", js.undefined)
      
      inline def setIgnoreIP(value: Boolean): Self = StObject.set(x, "ignoreIP", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIPUndefined: Self = StObject.set(x, "ignoreIP", js.undefined)
      
      inline def setKey(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]], /* next */ NextFunction) => Any
      ): Self = StObject.set(x, "key", js.Any.fromFunction3(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * @summary Specify whether or not a simplified reset method should be attached at req.brute.reset. The simplified method takes only a callback, and resets all ExpressBrute middleware that was called on the current request. If multiple instances of ExpressBrute have middleware on the same request, only those with attachResetToRequest set to true will be reset (default: true)
      */
    var attachResetToRequest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @summary Gets called with (req, res, next, nextValidRequestDate) when a request is rejected (default: `ExpressBrute.FailForbidden`)
      */
    var failCallback: js.UndefOr[FailCallback] = js.undefined
    
    /**
      * @summary The number of retires the user has before they need to start waiting (default: 2)
      */
    var freeRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * @summary Gets called whenever an error occurs with the persistent store from which ExpressBrute cannot recover. It is passed an object containing the properties message (a description of the message), parent (the error raised by the session store), and [key, ip] or [req, res, next] depending on whether or the error occurs during reset or in the middleware itself.
      */
    var handleStoreError: js.UndefOr[js.Function] = js.undefined
    
    /**
      * @summary The length of time (in seconds since the last request) to remember the number of requests that have been made by an IP. By default it will be set to maxWait * the number of attempts before you hit maxWait to discourage simply waiting for the lifetime to expire before resuming an attack. With default values this is about 6 hours.
      */
    var lifetime: js.UndefOr[Double] = js.undefined
    
    /**
      * @summary The maximum amount of time (in milliseconds) between requests the user needs to wait (default: 15 minutes). The wait for a given request is determined by adding the time the user needed to wait for the previous two requests.
      */
    var maxWait: js.UndefOr[Double] = js.undefined
    
    /**
      * @summary The initial wait time (in milliseconds) after the user runs out of retries (default: 500 milliseconds)
      */
    var minWait: js.UndefOr[Double] = js.undefined
    
    /**
      * @summary Defines whether the lifetime counts from the time of the last request that ExpressBrute didn't prevent for a given IP (true) or from of that IP's first request (false). Useful for allowing limits over fixed periods of time, for example: a limited number of requests per day. (Default: true).
      */
    var refreshTimeoutOnRequest: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttachResetToRequest(value: Boolean): Self = StObject.set(x, "attachResetToRequest", value.asInstanceOf[js.Any])
      
      inline def setAttachResetToRequestUndefined: Self = StObject.set(x, "attachResetToRequest", js.undefined)
      
      inline def setFailCallback(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]], /* next */ NextFunction, /* nextValidRequestDate */ js.Date) => Unit
      ): Self = StObject.set(x, "failCallback", js.Any.fromFunction4(value))
      
      inline def setFailCallbackUndefined: Self = StObject.set(x, "failCallback", js.undefined)
      
      inline def setFreeRetries(value: Double): Self = StObject.set(x, "freeRetries", value.asInstanceOf[js.Any])
      
      inline def setFreeRetriesUndefined: Self = StObject.set(x, "freeRetries", js.undefined)
      
      inline def setHandleStoreError(value: js.Function): Self = StObject.set(x, "handleStoreError", value.asInstanceOf[js.Any])
      
      inline def setHandleStoreErrorUndefined: Self = StObject.set(x, "handleStoreError", js.undefined)
      
      inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      inline def setMinWait(value: Double): Self = StObject.set(x, "minWait", value.asInstanceOf[js.Any])
      
      inline def setMinWaitUndefined: Self = StObject.set(x, "minWait", js.undefined)
      
      inline def setRefreshTimeoutOnRequest(value: Boolean): Self = StObject.set(x, "refreshTimeoutOnRequest", value.asInstanceOf[js.Any])
      
      inline def setRefreshTimeoutOnRequestUndefined: Self = StObject.set(x, "refreshTimeoutOnRequest", js.undefined)
    }
  }
  
  object expressServeStaticCoreAugmentingMod {
    
    trait Request extends StObject {
      
      var brute: js.UndefOr[Reset] = js.undefined
    }
    object Request {
      
      inline def apply(): Request = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setBrute(value: Reset): Self = StObject.set(x, "brute", value.asInstanceOf[js.Any])
        
        inline def setBruteUndefined: Self = StObject.set(x, "brute", js.undefined)
      }
    }
  }
}
