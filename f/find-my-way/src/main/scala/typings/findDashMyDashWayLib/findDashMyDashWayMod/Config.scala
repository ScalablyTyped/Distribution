package typings
package findDashMyDashWayLib.findDashMyDashWayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[V /* <: HTTPVersion */] extends js.Object {
  var allowUnsafeRegex: js.UndefOr[scala.Boolean] = js.undefined
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var defaultRoute: js.UndefOr[
    js.Function2[
      /* req */ nodeLib.http2Mod.Http2ServerRequest | nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.http2Mod.Http2ServerResponse | nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
  var ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  var maxParamLength: js.UndefOr[scala.Double] = js.undefined
  var versioning: js.UndefOr[findDashMyDashWayLib.Anon_Ctx[V]] = js.undefined
}

object Config {
  @scala.inline
  def apply[V /* <: HTTPVersion */](
    allowUnsafeRegex: js.UndefOr[scala.Boolean] = js.undefined,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    defaultRoute: (/* req */ nodeLib.http2Mod.Http2ServerRequest | nodeLib.httpMod.IncomingMessage, /* res */ nodeLib.http2Mod.Http2ServerResponse | nodeLib.httpMod.ServerResponse) => scala.Unit = null,
    ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    maxParamLength: scala.Int | scala.Double = null,
    versioning: findDashMyDashWayLib.Anon_Ctx[V] = null
  ): Config[V] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsafeRegex)) __obj.updateDynamic("allowUnsafeRegex")(allowUnsafeRegex)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (defaultRoute != null) __obj.updateDynamic("defaultRoute")(js.Any.fromFunction2(defaultRoute))
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash)
    if (maxParamLength != null) __obj.updateDynamic("maxParamLength")(maxParamLength.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning)
    __obj.asInstanceOf[Config[V]]
  }
}

