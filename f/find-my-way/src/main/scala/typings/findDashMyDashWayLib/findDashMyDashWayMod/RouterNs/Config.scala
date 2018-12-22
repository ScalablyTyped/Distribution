package typings
package findDashMyDashWayLib.findDashMyDashWayMod.RouterNs

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
}

