package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDevServerArgs extends ParentSpanPluginArgs {
  @JSName("app")
  var app_Original: expressLib.expressMod.Application = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: nodeLib.httpMod.ServerResponse
  ): js.Any = js.native
  def app(
    req: nodeLib.httpMod.IncomingMessage,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
}

