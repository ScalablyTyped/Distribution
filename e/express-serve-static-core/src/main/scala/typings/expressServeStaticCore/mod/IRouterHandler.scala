package typings.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterHandler[T] extends js.Object {
  def apply(
    handlers: ((RequestHandler[ParamsDictionary, _, _]) | (RequestHandlerParams[ParamsDictionary, _, _]))*
  ): T = js.native
}

