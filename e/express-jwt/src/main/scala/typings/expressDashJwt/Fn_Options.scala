package typings.expressDashJwt

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashUnless.expressDashUnlessMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply(options: js.Function1[/* req */ Request[ParamsDictionary], Boolean]): RequestHandler[ParamsDictionary] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary] = js.native
}

