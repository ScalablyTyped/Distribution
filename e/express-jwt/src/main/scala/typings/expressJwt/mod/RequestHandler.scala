package typings.expressJwt.mod

import typings.express.mod.Request_
import typings.expressJwt.anon.FnCall
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHandler
  extends typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
  
  def unless(): typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def unless(options: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]): typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def unless(options: typings.expressUnless.mod.Options): typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSName("unless")
  var unless_Original: FnCall = js.native
}
