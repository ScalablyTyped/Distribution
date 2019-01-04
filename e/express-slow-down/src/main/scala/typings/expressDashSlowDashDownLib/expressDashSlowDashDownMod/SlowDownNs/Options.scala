package typings
package expressDashSlowDashDownLib.expressDashSlowDashDownMod.SlowDownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * express-slow-down options
  */
trait Options extends js.Object {
  /**
    * Max number of connections during `windowMs` before starting to delay responses.
    * Defaults to `1`. Set to `0` to disable delaying.
    */
  var delayAfter: js.UndefOr[scala.Double] = js.undefined
  /**
    * How long to delay the response, multiplied by `(number recent hits - delayAfter)`.
    * Defaults to `1000` (1 second). Set to `0` to disable delaying.
    */
  var delayMs: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function used to generate keys. By default user IP address (`req.ip`) is used.
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
    * Function to execute the first time the limit is reached within `windowMs`.
    * Default: `(req, res, opts) => {}`
    */
  var onLimitReached: js.UndefOr[
    js.Function3[
      /* req */ RequestWithSlowDown, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* optionsUsed */ this.type, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Function used to skip requests. Returning `true` from the function will skip delaying for that request.
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
    * When `true` failed requests (response status >= 400) won't be counted. Defaults to `false`.
    */
  var skipFailedRequests: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true` successful requests (response status < 400) won't be counted. Defaults to `false`.
    */
  var skipSuccessfulRequests: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The storage to use when persisting request attempts. By default, the MemoryStore is used.
    */
  var store: js.UndefOr[Store] = js.undefined
  /**
    * How long to keep records of requests in memory. Defaults to `60000` (1 minute)
    */
  var windowMs: js.UndefOr[scala.Double] = js.undefined
}

