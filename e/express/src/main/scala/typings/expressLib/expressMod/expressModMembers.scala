package typings
package expressLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express", JSImport.Namespace)
@js.native
object expressModMembers extends js.Object {
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  var json: expressLib.Anon_Options = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  var static: expressLib.Anon_Root = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  var urlencoded: expressLib.Anon_OptionsOptionsUrlencoded = js.native
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Express = js.native
  def Router(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: expressLib.expressMod.eNs.RouterOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
}

