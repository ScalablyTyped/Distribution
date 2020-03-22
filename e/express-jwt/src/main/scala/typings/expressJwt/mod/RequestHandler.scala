package typings.expressJwt.mod

import typings.express.mod.Request_
import typings.expressJwt.FnCall
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any] {
  @JSName("unless")
  var unless_Original: FnCall = js.native
  def unless(options: js.Function1[/* req */ Request_[ParamsDictionary], Boolean]): typings.express.mod.RequestHandler[ParamsDictionary] = js.native
  def unless(options: typings.expressUnless.mod.Options): typings.express.mod.RequestHandler[ParamsDictionary] = js.native
}

