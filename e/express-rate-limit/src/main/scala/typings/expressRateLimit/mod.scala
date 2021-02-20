package typings.expressRateLimit

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.RequestHandler
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-rate-limit", JSImport.Namespace)
  @js.native
  def apply(): RateLimit = js.native
  @JSImport("express-rate-limit", JSImport.Namespace)
  @js.native
  def apply(options: Options): RateLimit = js.native
  
  type MaxValueFn = js.Function0[Double | js.Promise[Double]]
  
  @js.native
  trait Message
    extends /* key */ StringDictionary[js.Any] {
    
    var message: String = js.native
    
    var status: Double = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String, status: Double): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Enable headers conforming to the [ratelimit standardization proposal](https://tools.ietf.org/id/draft-polli-ratelimit-headers-01.html):
      * `RateLimit-Limit`, `RateLimit-Remaining`, and, if the store supports it, `RateLimit-Reset`. May be used in conjunction with, or instead of the `headers` option.
      * Behavior and name will likely change in future releases.
      * @default false
      */
    var draft_polli_ratelimit_headers: js.UndefOr[Boolean] = js.native
    
    /**
      * The funciton to handle requests once `max` is exceeded. It receives the request and response objects.
      * The "next" param is available if you need to pass to the next middleware. The `req.rateLimit` object
      * has `limit`, `current`, and `remaining` number of requests, and if the store provides it, a `resetTime`
      * Date object.
      * Default: `(req, res, next) => res.status(options.statusCode).send(options.message)`
      */
    var handler: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* res */ Response_[_], 
          /* next */ NextFunction, 
          _
        ]
      ] = js.native
    
    /**
      * Enable headers for request limit (`X-RateLimit-Limit`) and current usage (`X-RateLimit-Remaining`) on all
      * responses andtime to wait before retrying (`Retry-After`) when `max` is exceeded. Defaults to `true`.
      */
    var headers: js.UndefOr[Boolean] = js.native
    
    /**
      * Function used to generate keys. Defaults to using `req.ip`.
      * Default: `(req, res) => req.ip`
      */
    var keyGenerator: js.UndefOr[
        js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String]
      ] = js.native
    
    /**
      * Max number of connections during `windowMs` before sending a 429 response. May be a number, or
      * a function that returns a number or a promise. If `max` is a function, it will be called with `req` and `res` params.
      * Set to `0` to disable.
      * @default 5
      */
    var max: js.UndefOr[Double | MaxValueFn] = js.native
    
    /**
      * Error message sent to user when `max` is exceeded. May be a `string`, JSON object, or any other value
      * that Express's `req.send()` supports. Defaults to `'Too many requests, please try again later.'`.
      */
    var message: js.UndefOr[String | Buffer | Message] = js.native
    
    /**
      * Function that is called the first time `max` is exceeded. The `req.rateLimit` object has `limit`, `current`,
      * and `remaining` number of requests and, if the store provides it, a `resetTime` Date object. Default is
      * an empty function.
      * Default: `(req, res, opts) => {}`
      */
    var onLimitReached: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* res */ Response_[_], 
          /* optionsUsed */ this.type, 
          Unit
        ]
      ] = js.native
    
    /**
      * Function used to skip requests. Returning `true` from the function will skip limiting for that request. Defaults to
      * always `false` (count all requests).
      * Default: `(req, res) => false`
      */
    var skip: js.UndefOr[
        js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
      ] = js.native
    
    /**
      * When set to `true`, failed requests (status >= 400, request canceled or errored) won't be counted. Defaults to `false`.
      */
    var skipFailedRequests: js.UndefOr[Boolean] = js.native
    
    /**
      * When set to `true`, successful requests (status < 400) won't be counted. Defaults to `false`.
      */
    var skipSuccessfulRequests: js.UndefOr[Boolean] = js.native
    
    /**
      * HTTP status code returned when `max` is exceeded. Defaults to `429`.
      */
    var statusCode: js.UndefOr[Double] = js.native
    
    /**
      * The storage to use when persisting rate limit attempts.
      */
    var store: js.UndefOr[Store] = js.native
    
    /**
      * Timeframe for which requests are checked/remembered. Also used in the Retry-After header when the limit is reached.
      * Note: with non-default stores, you may need to configure this value twice, once here and once on the store.
      * In some cases the units also differ (e.g. seconds vs miliseconds)
      * @default 60000
      */
    var windowMs: js.UndefOr[Double] = js.native
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
      def setDraft_polli_ratelimit_headers(value: Boolean): Self = StObject.set(x, "draft_polli_ratelimit_headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraft_polli_ratelimit_headersUndefined: Self = StObject.set(x, "draft_polli_ratelimit_headers", js.undefined)
      
      @scala.inline
      def setHandler(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => _
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setKeyGenerator(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => String): Self = StObject.set(x, "keyGenerator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyGeneratorUndefined: Self = StObject.set(x, "keyGenerator", js.undefined)
      
      @scala.inline
      def setMax(value: Double | MaxValueFn): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFunction0(value: () => Double | js.Promise[Double]): Self = StObject.set(x, "max", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessage(value: String | Buffer | Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnLimitReached(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Options) => Unit
      ): Self = StObject.set(x, "onLimitReached", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnLimitReachedUndefined: Self = StObject.set(x, "onLimitReached", js.undefined)
      
      @scala.inline
      def setSkip(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSkipFailedRequests(value: Boolean): Self = StObject.set(x, "skipFailedRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFailedRequestsUndefined: Self = StObject.set(x, "skipFailedRequests", js.undefined)
      
      @scala.inline
      def setSkipSuccessfulRequests(value: Boolean): Self = StObject.set(x, "skipSuccessfulRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSuccessfulRequestsUndefined: Self = StObject.set(x, "skipSuccessfulRequests", js.undefined)
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setWindowMs(value: Double): Self = StObject.set(x, "windowMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowMsUndefined: Self = StObject.set(x, "windowMs", js.undefined)
    }
  }
  
  @js.native
  trait RateLimit
    extends RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
    
    def resetIp(key: String): Unit = js.native
    
    def resetKey(key: String): Unit = js.native
  }
  
  @js.native
  trait RateLimitInfo extends StObject {
    
    val current: Double = js.native
    
    val limit: Double = js.native
    
    val remaining: Double = js.native
    
    val resetTime: js.UndefOr[Date] = js.native
  }
  object RateLimitInfo {
    
    @scala.inline
    def apply(current: Double, limit: Double, remaining: Double): RateLimitInfo = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimitInfo]
    }
    
    @scala.inline
    implicit class RateLimitInfoMutableBuilder[Self <: RateLimitInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetTime(value: Date): Self = StObject.set(x, "resetTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetTimeUndefined: Self = StObject.set(x, "resetTime", js.undefined)
    }
  }
  
  @js.native
  trait Store extends StObject {
    
    def decrement(key: String): Unit = js.native
    
    def incr(key: String, cb: StoreIncrementCallback): Unit = js.native
    
    def resetAll(): Unit = js.native
    
    def resetKey(key: String): Unit = js.native
  }
  object Store {
    
    @scala.inline
    def apply(
      decrement: String => Unit,
      incr: (String, StoreIncrementCallback) => Unit,
      resetAll: () => Unit,
      resetKey: String => Unit
    ): Store = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), resetAll = js.Any.fromFunction0(resetAll), resetKey = js.Any.fromFunction1(resetKey))
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrement(value: String => Unit): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncr(value: (String, StoreIncrementCallback) => Unit): Self = StObject.set(x, "incr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResetAll(value: () => Unit): Self = StObject.set(x, "resetAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetKey(value: String => Unit): Self = StObject.set(x, "resetKey", js.Any.fromFunction1(value))
    }
  }
  
  type StoreIncrementCallback = js.Function3[
    /* err */ js.UndefOr[js.Object], 
    /* hits */ js.UndefOr[Double], 
    /* resetTime */ js.UndefOr[Date], 
    Unit
  ]
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        /**
          * property is added to all requests with the limit, current,
          * and remaining number of requests and, if the store provides it, a resetTime Date object.
          * These may be used in your application code to take additional actions or inform the user of their status
          */
        var rateLimit: RateLimitInfo = js.native
      }
      object Request {
        
        @scala.inline
        def apply(rateLimit: RateLimitInfo): Request = {
          val __obj = js.Dynamic.literal(rateLimit = rateLimit.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setRateLimit(value: RateLimitInfo): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
