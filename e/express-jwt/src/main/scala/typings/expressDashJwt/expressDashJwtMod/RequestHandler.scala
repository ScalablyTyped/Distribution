package typings.expressDashJwt.expressDashJwtMod

import typings.express.expressMod.Request
import typings.expressDashJwt.Fn_Options
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler[ParamsDictionary] {
  @JSName("unless")
  var unless_Original: Fn_Options = js.native
  def unless(options: js.Function1[/* req */ Request[ParamsDictionary], Boolean]): typings.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  def unless(options: typings.expressDashUnless.expressDashUnlessMod.Options): typings.express.expressMod.RequestHandler[ParamsDictionary] = js.native
}

