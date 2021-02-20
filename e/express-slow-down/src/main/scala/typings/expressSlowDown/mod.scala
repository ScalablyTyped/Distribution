package typings.expressSlowDown

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-slow-down", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * express-slow-down options
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * Max number of connections during `windowMs` before starting to delay responses.
      * Defaults to `1`. Set to `0` to disable delaying.
      */
    var delayAfter: js.UndefOr[Double] = js.native
    
    /**
      * How long to delay the response, multiplied by `(number recent hits - delayAfter)`.
      * Defaults to `1000` (1 second). Set to `0` to disable delaying.
      */
    var delayMs: js.UndefOr[Double] = js.native
    
    /**
      * Function used to generate keys. By default user IP address (`req.ip`) is used.
      * Default: `(req, res) => req.ip`
      */
    var keyGenerator: js.UndefOr[
        js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String]
      ] = js.native
    
    /**
      * Maximum value for `delayMs` after many consecutive attempts, that is, after the n-th request,
      * the delay will be always `maxDelayMs`. Important when your application is running behind a
      * load balancer or reverse proxy that has a request timeout. Defaults to Infinity.
      */
    var maxDelayMs: js.UndefOr[Double] = js.native
    
    /**
      * Function to execute the first time the limit is reached within `windowMs`.
      * Default: `(req, res, opts) => {}`
      */
    var onLimitReached: js.UndefOr[
        js.Function3[
          /* req */ RequestWithSlowDown, 
          /* res */ Response_[_], 
          /* optionsUsed */ this.type, 
          Unit
        ]
      ] = js.native
    
    /**
      * Function used to skip requests. Returning `true` from the function will skip delaying for that request.
      * Default: `(req, res) => false`
      */
    var skip: js.UndefOr[
        js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
      ] = js.native
    
    /**
      * When `true` failed requests (response status >= 400) won't be counted. Defaults to `false`.
      */
    var skipFailedRequests: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true` successful requests (response status < 400) won't be counted. Defaults to `false`.
      */
    var skipSuccessfulRequests: js.UndefOr[Boolean] = js.native
    
    /**
      * The storage to use when persisting request attempts. By default, the MemoryStore is used.
      */
    var store: js.UndefOr[Store] = js.native
    
    /**
      * How long to keep records of requests in memory. Defaults to `60000` (1 minute)
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
      def setDelayAfter(value: Double): Self = StObject.set(x, "delayAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayAfterUndefined: Self = StObject.set(x, "delayAfter", js.undefined)
      
      @scala.inline
      def setDelayMs(value: Double): Self = StObject.set(x, "delayMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayMsUndefined: Self = StObject.set(x, "delayMs", js.undefined)
      
      @scala.inline
      def setKeyGenerator(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => String): Self = StObject.set(x, "keyGenerator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyGeneratorUndefined: Self = StObject.set(x, "keyGenerator", js.undefined)
      
      @scala.inline
      def setMaxDelayMs(value: Double): Self = StObject.set(x, "maxDelayMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelayMsUndefined: Self = StObject.set(x, "maxDelayMs", js.undefined)
      
      @scala.inline
      def setOnLimitReached(value: (/* req */ RequestWithSlowDown, /* res */ Response_[_], Options) => Unit): Self = StObject.set(x, "onLimitReached", js.Any.fromFunction3(value))
      
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
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setWindowMs(value: Double): Self = StObject.set(x, "windowMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowMsUndefined: Self = StObject.set(x, "windowMs", js.undefined)
    }
  }
  
  /**
    * Express Request with the added `slowDown` property
    */
  @js.native
  trait RequestWithSlowDown
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    var slowDown: SlowDownRequestAugmentation = js.native
  }
  
  @js.native
  trait SlowDownRequestAugmentation extends StObject {
    
    /**
      * The number of requests in the current window
      */
    var current: Double = js.native
    
    /**
      * Amount of delay imposed on current request in milliseconds
      */
    var delay: Double = js.native
    
    /**
      * The `options.delayAfter` value
      */
    var limit: Double = js.native
    
    /**
      * the number of requests remaining before rate-limiting begins
      */
    var remaining: Double = js.native
    
    /**
      * When the window will reset, `current` will return to `0`, and `remaining` will return
      * to limit. Represents milliseconds since epoch (compare to `Date.now()`). This field
      * depends on store support. It will be `undefined` if the store does not provide the value.
      */
    var resetTime: js.UndefOr[Double] = js.native
  }
  object SlowDownRequestAugmentation {
    
    @scala.inline
    def apply(current: Double, delay: Double, limit: Double, remaining: Double): SlowDownRequestAugmentation = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlowDownRequestAugmentation]
    }
    
    @scala.inline
    implicit class SlowDownRequestAugmentationMutableBuilder[Self <: SlowDownRequestAugmentation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetTime(value: Double): Self = StObject.set(x, "resetTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetTimeUndefined: Self = StObject.set(x, "resetTime", js.undefined)
    }
  }
  
  @js.native
  trait Store extends StObject {
    
    def decrement(key: String): Unit = js.native
    
    def incr(key: String, cb: StoreIncrementCallback): Unit = js.native
    
    def resetKey(key: String): Unit = js.native
  }
  object Store {
    
    @scala.inline
    def apply(
      decrement: String => Unit,
      incr: (String, StoreIncrementCallback) => Unit,
      resetKey: String => Unit
    ): Store = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), resetKey = js.Any.fromFunction1(resetKey))
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrement(value: String => Unit): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncr(value: (String, StoreIncrementCallback) => Unit): Self = StObject.set(x, "incr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResetKey(value: String => Unit): Self = StObject.set(x, "resetKey", js.Any.fromFunction1(value))
    }
  }
  
  type StoreIncrementCallback = js.Function2[/* err */ js.UndefOr[js.Object], /* hits */ js.UndefOr[Double], Unit]
}
