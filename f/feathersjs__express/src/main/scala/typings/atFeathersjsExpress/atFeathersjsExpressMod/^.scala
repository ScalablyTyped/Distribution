package typings.atFeathersjsExpress.atFeathersjsExpressMod

import typings.atFeathersjsExpress.Anon_Html
import typings.atFeathersjsExpress.Typeofexpress
import typings.atFeathersjsExpress.Typeofself
import typings.express.expressMod.ErrorRequestHandler
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.RouterOptions
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: (js.Function1[
    /* app */ typings.atFeathersjsFeathers.atFeathersjsFeathersMod.Application[_], 
    Application[_]
  ]) with Typeofself = js.native
  val original: js.Function0[Express] with Typeofexpress = js.native
  def Router(): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: RouterOptions): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def errorHandler(): ErrorRequestHandler = js.native
  def errorHandler(options: Anon_Html): ErrorRequestHandler = js.native
  def notFound(): RequestHandler = js.native
}

