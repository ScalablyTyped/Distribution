package typings
package atFeathersjsExpressLib.atFeathersjsExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: (js.Function1[
    /* app */ atFeathersjsFeathersLib.atFeathersjsFeathersMod.Application[_], 
    Application[_]
  ]) with atFeathersjsExpressLib.Typeofself = js.native
  val original: (js.Function0[
    expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Express
  ]) with atFeathersjsExpressLib.Typeofexpress = js.native
  def Router(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: expressLib.expressMod.RouterOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def errorHandler(): expressLib.expressMod.ErrorRequestHandler = js.native
  def errorHandler(options: atFeathersjsExpressLib.Anon_Html): expressLib.expressMod.ErrorRequestHandler = js.native
  def notFound(): expressLib.expressMod.RequestHandler = js.native
}

