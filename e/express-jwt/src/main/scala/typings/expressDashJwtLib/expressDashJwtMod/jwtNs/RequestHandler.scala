package typings
package expressDashJwtLib.expressDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends expressLib.expressMod.eNs.RequestHandler {
  @JSName("unless")
  var unless_Original: (js.Function1[
    /* options */ expressDashUnlessLib.expressDashUnlessMod.unlessNs.Options, 
    this.type
  ]) with expressDashJwtLib.Anon_Unless = js.native
  def unless(options: expressDashUnlessLib.expressDashUnlessMod.unlessNs.Options): expressLib.expressMod.eNs.RequestHandler = js.native
}

