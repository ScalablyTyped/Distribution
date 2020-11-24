package typings.expressRateLimit.mod

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDraft_polli_ratelimit_headers(value: Boolean): Self = this.set("draft_polli_ratelimit_headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraft_polli_ratelimit_headers: Self = this.set("draft_polli_ratelimit_headers", js.undefined)
    
    @scala.inline
    def setHandler(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => _
    ): Self = this.set("handler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHeaders(value: Boolean): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setKeyGenerator(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => String): Self = this.set("keyGenerator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeyGenerator: Self = this.set("keyGenerator", js.undefined)
    
    @scala.inline
    def setMaxFunction0(value: () => Double | js.Promise[Double]): Self = this.set("max", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMax(value: Double | MaxValueFn): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessage(value: String | Buffer | Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnLimitReached(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Options) => Unit
    ): Self = this.set("onLimitReached", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnLimitReached: Self = this.set("onLimitReached", js.undefined)
    
    @scala.inline
    def setSkip(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = this.set("skip", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSkipFailedRequests(value: Boolean): Self = this.set("skipFailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFailedRequests: Self = this.set("skipFailedRequests", js.undefined)
    
    @scala.inline
    def setSkipSuccessfulRequests(value: Boolean): Self = this.set("skipSuccessfulRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipSuccessfulRequests: Self = this.set("skipSuccessfulRequests", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setStore(value: Store): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setWindowMs(value: Double): Self = this.set("windowMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowMs: Self = this.set("windowMs", js.undefined)
  }
}
