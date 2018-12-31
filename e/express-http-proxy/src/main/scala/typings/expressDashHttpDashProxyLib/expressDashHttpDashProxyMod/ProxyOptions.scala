package typings
package expressDashHttpDashProxyLib.expressDashHttpDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ nodeLib.httpMod.RequestOptions, 
      /* srcReq */ expressLib.expressMod.eNs.Request, 
      nodeLib.httpMod.RequestOptions
    ]
  ] = js.undefined
  var proxyReqPathResolver: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]] = js.undefined
}

