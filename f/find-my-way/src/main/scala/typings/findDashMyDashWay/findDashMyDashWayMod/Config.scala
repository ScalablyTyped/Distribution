package typings.findDashMyDashWay.findDashMyDashWayMod

import typings.findDashMyDashWay.Anon_Ctx
import typings.node.http2Mod.Http2ServerRequest
import typings.node.http2Mod.Http2ServerResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[V /* <: HTTPVersion */] extends js.Object {
  var allowUnsafeRegex: js.UndefOr[Boolean] = js.undefined
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var defaultRoute: js.UndefOr[
    js.Function2[
      /* req */ Http2ServerRequest | IncomingMessage, 
      /* res */ Http2ServerResponse | ServerResponse, 
      Unit
    ]
  ] = js.undefined
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
  var maxParamLength: js.UndefOr[Double] = js.undefined
  var versioning: js.UndefOr[Anon_Ctx[V]] = js.undefined
}

object Config {
  @scala.inline
  def apply[V /* <: HTTPVersion */](
    allowUnsafeRegex: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    defaultRoute: (/* req */ Http2ServerRequest | IncomingMessage, /* res */ Http2ServerResponse | ServerResponse) => Unit = null,
    ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    maxParamLength: Int | Double = null,
    versioning: Anon_Ctx[V] = null
  ): Config[V] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsafeRegex)) __obj.updateDynamic("allowUnsafeRegex")(allowUnsafeRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (defaultRoute != null) __obj.updateDynamic("defaultRoute")(js.Any.fromFunction2(defaultRoute))
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash.asInstanceOf[js.Any])
    if (maxParamLength != null) __obj.updateDynamic("maxParamLength")(maxParamLength.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[V]]
  }
}

