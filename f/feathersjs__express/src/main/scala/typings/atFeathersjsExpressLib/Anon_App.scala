package typings
package atFeathersjsExpressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_App extends js.Object {
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("json")
  var json_Original: Anon_Options = js.native
  @JSName("rest")
  val rest_Original: Anon_Formatter = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSName("static")
  var static_Original: Anon_Mime = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("urlencoded")
  var urlencoded_Original: Anon_OptionsNextHandleFunction = js.native
  def Router(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: expressLib.expressMod.RouterOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def default[T](app: atFeathersjsFeathersLib.atFeathersjsFeathersMod.Application[T]): atFeathersjsExpressLib.atFeathersjsExpressMod.Application[T] = js.native
  def errorHandler(): expressLib.expressMod.ErrorRequestHandler = js.native
  def errorHandler(options: Anon_Html): expressLib.expressMod.ErrorRequestHandler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(options: bodyDashParserLib.bodyDashParserMod.OptionsJson): connectLib.connectMod.NextHandleFunction = js.native
  def notFound(): expressLib.expressMod.RequestHandler = js.native
  def rest(): js.Function0[scala.Unit] = js.native
  def rest(handler: expressLib.expressMod.RequestHandler): js.Function0[scala.Unit] = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: java.lang.String): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: java.lang.String, options: serveDashStaticLib.serveDashStaticMod.ServeStaticOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(options: bodyDashParserLib.bodyDashParserMod.OptionsUrlencoded): connectLib.connectMod.NextHandleFunction = js.native
}

