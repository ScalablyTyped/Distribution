package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBase extends js.Object {
  var message: java.lang.String
  var platform: js.UndefOr[Platform] = js.undefined
}

object MessageBase {
  @scala.inline
  def apply(message: java.lang.String, platform: Platform = null): MessageBase = {
    val __obj = js.Dynamic.literal(message = message)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[MessageBase]
  }
}

