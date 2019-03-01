package typings
package expressDashRateDashLimitLib.expressDashRateDashLimitMod.RateLimitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The funciton to handle requests once `max` is exceeded. It receives the request and response objects.
    * The "next" param is available if you need to pass to the next middleware. The `req.rateLimit` object
    * has `limit`, `current`, and `remaining` number of requests, and if the store provides it, a `resetTime`
    * Date object.
    * Default: `(req, res, next) => res.status(options.statusCode).send(options.message)`
    */
  var handler: js.UndefOr[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* next */ expressLib.expressMod.eNs.NextFunction, 
      _
    ]
  ] = js.undefined
  /**
    * Enable headers for request limit (`X-RateLimit-Limit`) and current usage (`X-RateLimit-Remaining`) on all
    * responses andtime to wait before retrying (`Retry-After`) when `max` is exceeded. Defaults to `true`.
    */
  var headers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function used to generate keys. Defaults to using `req.ip`.
    * Default: `(req, res) => req.ip`
    */
  var keyGenerator: js.UndefOr[
    js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Max number of connections during `windowMs` before sending a 429 response. May be a `number` or
    * a function that returns a `number` or a `Promise<number>`. Defaults to `5`. Set to `0` to disable.
    */
  var max: js.UndefOr[scala.Double | MaxValueFn] = js.undefined
  /**
    * Error message sent to user when `max` is exceeded. May be a `string`, JSON object, or any other value
    * that Express's `req.send()` supports. Defaults to `'Too many requests, please try again later.'`.
    */
  var message: js.UndefOr[java.lang.String | nodeLib.Buffer | Message] = js.undefined
  /**
    * Function that is called the first time `max` is exceeded. The `req.rateLimit` object has `limit`, `current`,
    * and `remaining` number of requests and, if the store provides it, a `resetTime` Date object. Default is
    * an empty function.
    * Default: `(req, res, opts) => {}`
    */
  var onLimitReached: js.UndefOr[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* optionsUsed */ this.type, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Function used to skip requests. Returning `true` from the function will skip limiting for that request. Defaults to
    * always `false` (count all requests).
    * Default: `(req, res) => false`
    */
  var skip: js.UndefOr[
    js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * When set to `true`, failed requests (status >= 400, request canceled or errored) won't be counted. Defaults to `false`.
    */
  var skipFailedRequests: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set to `true`, successful requests (status < 400) won't be counted. Defaults to `false`.
    */
  var skipSuccessfulRequests: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * HTTP status code returned when `max` is exceeded. Defaults to `429`.
    */
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  /**
    * The storage to use when persisting rate limit attempts.
    */
  var store: js.UndefOr[Store] = js.undefined
  /**
    * How long in milliseconds to keep records of requests in memory. Defaults to `60000` (1 minute).
    */
  var windowMs: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    handler: js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* next */ expressLib.expressMod.eNs.NextFunction, 
      _
    ] = null,
    headers: js.UndefOr[scala.Boolean] = js.undefined,
    keyGenerator: js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      java.lang.String
    ] = null,
    max: scala.Double | MaxValueFn = null,
    message: java.lang.String | nodeLib.Buffer | Message = null,
    onLimitReached: js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      Options, 
      scala.Unit
    ] = null,
    skip: js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Boolean
    ] = null,
    skipFailedRequests: js.UndefOr[scala.Boolean] = js.undefined,
    skipSuccessfulRequests: js.UndefOr[scala.Boolean] = js.undefined,
    statusCode: scala.Int | scala.Double = null,
    store: Store = null,
    windowMs: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers)
    if (keyGenerator != null) __obj.updateDynamic("keyGenerator")(keyGenerator)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onLimitReached != null) __obj.updateDynamic("onLimitReached")(onLimitReached)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    if (!js.isUndefined(skipFailedRequests)) __obj.updateDynamic("skipFailedRequests")(skipFailedRequests)
    if (!js.isUndefined(skipSuccessfulRequests)) __obj.updateDynamic("skipSuccessfulRequests")(skipSuccessfulRequests)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store)
    if (windowMs != null) __obj.updateDynamic("windowMs")(windowMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

