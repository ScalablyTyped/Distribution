package typings.expressRateLimit.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance
  extends RequestHandler[ParamsDictionary, js.Any, js.Any] {
  def resetKey(key: String): Unit = js.native
}

