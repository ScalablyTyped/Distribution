package typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterMatcher[T] extends js.Object {
  def apply(path: PathParams, subApplication: Application): T = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def apply[P /* <: Params */, ResBody, ReqBody](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody]) | (RequestHandlerParams[P, ResBody, ReqBody]))*
  ): T = js.native
}

