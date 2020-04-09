package typings.expressServeStaticCore.mod

import typings.expressServeStaticCore.expressServeStaticCoreStrings.all
import typings.expressServeStaticCore.expressServeStaticCoreStrings.delete
import typings.expressServeStaticCore.expressServeStaticCoreStrings.get
import typings.expressServeStaticCore.expressServeStaticCoreStrings.head
import typings.expressServeStaticCore.expressServeStaticCoreStrings.options
import typings.expressServeStaticCore.expressServeStaticCoreStrings.patch
import typings.expressServeStaticCore.expressServeStaticCoreStrings.post
import typings.expressServeStaticCore.expressServeStaticCoreStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterMatcher[T, Method /* <: all | get | post | put | delete | patch | options | head */] extends js.Object {
  def apply(path: PathParams, subApplication: Application): T = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def apply[P /* <: Params */, ResBody, ReqBody](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody]) | (RequestHandlerParams[P, ResBody, ReqBody]))*
  ): T = js.native
}

