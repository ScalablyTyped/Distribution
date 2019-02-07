package typings
package expressDashJwtLib.expressDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends expressLib.expressMod.eNs.RequestHandler {
  @JSName("unless")
  var unless_Original: expressDashJwtLib.Anon_Options = js.native
  def unless(): expressLib.expressMod.eNs.RequestHandler = js.native
  def unless(options: expressDashUnlessLib.expressDashUnlessMod.unlessNs.Options): expressLib.expressMod.eNs.RequestHandler = js.native
  def unless(options: js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Boolean]): expressLib.expressMod.eNs.RequestHandler = js.native
}

