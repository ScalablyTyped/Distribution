package typings.expressWinston.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressWinston.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressWinstonRequest
  extends Request[ParamsDictionary, js.Any, js.Any, Query] {
  var _routeWhitelists: Body = js.native
}

