package typings
package expressDashWsLib.expressDashWsMod.expressWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterLike
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with /* key */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  @JSName("get")
  var get_Original: expressLib.expressMod.eNs.IRouterMatcher[this.type] = js.native
  def get(
    path: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams,
    handlers: (expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandlerParams)*
  ): this.type = js.native
  def get(
    path: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams,
    subApplication: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Application
  ): this.type = js.native
}

