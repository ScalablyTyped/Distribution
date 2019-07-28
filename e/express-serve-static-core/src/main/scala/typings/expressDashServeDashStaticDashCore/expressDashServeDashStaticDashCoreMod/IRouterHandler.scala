package typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterHandler[T] extends js.Object {
  def apply(handlers: (RequestHandler | RequestHandlerParams)*): T = js.native
}

