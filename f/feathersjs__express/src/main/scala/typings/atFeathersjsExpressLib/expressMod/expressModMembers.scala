package typings
package atFeathersjsExpressLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object expressModMembers extends js.Object {
  val default: (js.Function1[/* app */ atFeathersjsFeathersLib.feathersMod.Application[_], Application[_]]) with stdLib.Window = js.native
  /**
       * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
       * @since 4.16.0
       */
  var json: js.Function1[
    /* options */ bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsJson, 
    connectLib.connectMod.createServerNs.NextHandleFunction
  ] = js.native
  val original: js.Any = js.native
  val rest: atFeathersjsExpressLib.Anon_Handler = js.native
  /**
       * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
       */
  var static: js.Function2[
    /* root */ java.lang.String, 
    /* options */ serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions, 
    expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler
  ] = js.native
  /**
       * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
       * @since 4.16.0
       */
  var urlencoded: js.Function1[
    /* options */ bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsUrlencoded, 
    connectLib.connectMod.createServerNs.NextHandleFunction
  ] = js.native
  def Router(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: expressLib.expressMod.eNs.RouterOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def errorHandler(): expressLib.expressMod.eNs.ErrorRequestHandler = js.native
  def errorHandler(options: atFeathersjsExpressLib.Anon_Public): expressLib.expressMod.eNs.ErrorRequestHandler = js.native
  def notFound(): expressLib.expressMod.eNs.RequestHandler = js.native
}

