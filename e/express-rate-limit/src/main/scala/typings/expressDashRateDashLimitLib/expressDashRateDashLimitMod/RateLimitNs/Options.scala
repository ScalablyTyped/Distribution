package typings
package expressDashRateDashLimitLib.expressDashRateDashLimitMod.RateLimitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var delayAfter: js.UndefOr[scala.Double] = js.undefined
  var delayMs: js.UndefOr[scala.Double] = js.undefined
  var handler: js.UndefOr[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* next */ expressLib.expressMod.eNs.NextFunction, 
      _
    ]
  ] = js.undefined
  var headers: js.UndefOr[scala.Boolean] = js.undefined
  var keyGenerator: js.UndefOr[
    js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      java.lang.String
    ]
  ] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var onLimitReached: js.UndefOr[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* optionsUsed */ this.type, 
      scala.Unit
    ]
  ] = js.undefined
  var skip: js.UndefOr[
    js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Boolean
    ]
  ] = js.undefined
  var skipFailedRequests: js.UndefOr[scala.Boolean] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var store: js.UndefOr[Store] = js.undefined
  var windowMs: js.UndefOr[scala.Double] = js.undefined
}

