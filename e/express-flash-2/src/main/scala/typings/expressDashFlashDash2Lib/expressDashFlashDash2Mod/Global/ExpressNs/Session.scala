package typings
package expressDashFlashDash2Lib.expressDashFlashDash2Mod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var flash: Flash
}

object Session {
  @scala.inline
  def apply(flash: Flash): Session = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flash")(flash)
    __obj.asInstanceOf[Session]
  }
}

