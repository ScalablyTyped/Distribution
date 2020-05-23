package typings.feathersjsExpress.anon

import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsUrlencoded
import typings.connect.mod.NextHandleFunction
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.express.mod.RouterOptions
import typings.expressServeStaticCore.mod.Handler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsFeathers.mod.Application
import typings.serveStatic.mod.ServeStaticOptions
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
  var json_Original: FnCall = js.native
  @JSName("rest")
  val rest_Original: Call = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSName("static")
  var static_Original: Mime = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("urlencoded")
  var urlencoded_Original: FnCallOptions = js.native
  def Router(): typings.expressServeStaticCore.mod.Router = js.native
  def Router(options: RouterOptions): typings.expressServeStaticCore.mod.Router = js.native
  def default[T](app: Application[T]): typings.feathersjsExpress.mod.Application[T] = js.native
  def errorHandler(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  def errorHandler(options: Html): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
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
  def notFound(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def rest(): js.Function0[Unit] = js.native
  def rest(handler: RequestHandler[ParamsDictionary, _, _, Query]): js.Function0[Unit] = js.native
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

