package typings
package atFeathersjsExpressLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object expressModMembers extends js.Object {
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  var json: expressLib.Anon_Options = js.native
  val original: (js.Function0[
    expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Express
  ]) with atFeathersjsExpressLib.Anon_Static = js.native
  val rest: atFeathersjsExpressLib.Anon_Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  var static: expressLib.Anon_Root = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  var urlencoded: expressLib.Anon_OptionsOptionsUrlencoded = js.native
  def Router(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: expressLib.expressMod.eNs.RouterOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def default[T](app: atFeathersjsFeathersLib.feathersMod.Application[T]): Application[T] = js.native
  def errorHandler(): expressLib.expressMod.eNs.ErrorRequestHandler = js.native
  def errorHandler(options: atFeathersjsExpressLib.Anon_Public): expressLib.expressMod.eNs.ErrorRequestHandler = js.native
  def notFound(): expressLib.expressMod.eNs.RequestHandler = js.native
}

