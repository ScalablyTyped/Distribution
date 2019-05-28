package typings
package expressDashJwtLib.expressDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler {
  @JSName("unless")
  var unless_Original: expressDashJwtLib.Fn_Options = js.native
  def unless(options: expressDashUnlessLib.expressDashUnlessMod.Options): expressLib.expressMod.RequestHandler = js.native
  def unless(options: js.Function1[/* req */ expressLib.expressMod.Request, scala.Boolean]): expressLib.expressMod.RequestHandler = js.native
}

