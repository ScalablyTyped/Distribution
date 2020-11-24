package typings.expressSlowDown.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * express-slow-down options
  */
@js.native
trait Options extends js.Object {
  
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
    def setDelayAfter(value: Double): Self = this.set("delayAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayAfter: Self = this.set("delayAfter", js.undefined)
    
    @scala.inline
    def setDelayMs(value: Double): Self = this.set("delayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayMs: Self = this.set("delayMs", js.undefined)
    
    @scala.inline
    def setKeyGenerator(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => String): Self = this.set("keyGenerator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeyGenerator: Self = this.set("keyGenerator", js.undefined)
    
    @scala.inline
    def setMaxDelayMs(value: Double): Self = this.set("maxDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDelayMs: Self = this.set("maxDelayMs", js.undefined)
    
    @scala.inline
    def setOnLimitReached(value: (/* req */ RequestWithSlowDown, /* res */ Response_[_], Options) => Unit): Self = this.set("onLimitReached", js.Any.fromFunction3(value))
    
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
    def setStore(value: Store): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setWindowMs(value: Double): Self = this.set("windowMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowMs: Self = this.set("windowMs", js.undefined)
  }
}
