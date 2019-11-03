package typings.atFeathersjsExpress

import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.Application
import typings.bodyDashParser.bodyDashParserMod.OptionsJson
import typings.bodyDashParser.bodyDashParserMod.OptionsUrlencoded
import typings.connect.connectMod.NextHandleFunction
import typings.express.expressMod.ErrorRequestHandler
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.RouterOptions
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofself extends js.Object {
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("json")
  var json_Original: Fn_Options = js.native
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
  var urlencoded_Original: Fn_OptionsNextHandleFunction = js.native
  def Router(): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: RouterOptions): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def default[T](app: Application[T]): typings.atFeathersjsExpress.atFeathersjsExpressMod.Application[T] = js.native
  def errorHandler(): ErrorRequestHandler[ParamsDictionary] = js.native
  def errorHandler(options: Anon_Html): ErrorRequestHandler[ParamsDictionary] = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(options: OptionsJson): NextHandleFunction = js.native
  def notFound(): RequestHandler[ParamsDictionary] = js.native
  def rest(): js.Function0[Unit] = js.native
  def rest(handler: RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String, options: ServeStaticOptions): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
}

