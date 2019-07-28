package typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterMatcher[T] extends js.Object {
  def apply(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): T = js.native
  def apply(path: PathParams, subApplication: Application): T = js.native
}

