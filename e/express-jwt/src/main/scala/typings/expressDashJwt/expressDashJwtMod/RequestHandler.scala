package typings.expressDashJwt.expressDashJwtMod

import typings.express.expressMod.Request
import typings.expressDashJwt.Fn_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler {
  @JSName("unless")
  var unless_Original: Fn_Options = js.native
  def unless(options: js.Function1[/* req */ Request, Boolean]): typings.express.expressMod.RequestHandler = js.native
  def unless(options: typings.expressDashUnless.expressDashUnlessMod.Options): typings.express.expressMod.RequestHandler = js.native
}

