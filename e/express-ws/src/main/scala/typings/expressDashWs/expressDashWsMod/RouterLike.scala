package typings.expressDashWs.expressDashWsMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.IRouterMatcher
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Params
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandlerParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterLike
  extends /* key */ StringDictionary[js.Any]
     with /* key */ NumberDictionary[js.Any] {
  @JSName("get")
  var get_Original: IRouterMatcher[this.type] = js.native
  def get(
    path: PathParams,
    subApplication: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Application
  ): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def get[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
}

