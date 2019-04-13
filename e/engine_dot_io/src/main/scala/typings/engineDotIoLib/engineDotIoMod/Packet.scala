package typings
package engineDotIoLib.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packet extends js.Object {
  var data: js.UndefOr[Message] = js.undefined
  var options: js.UndefOr[MessageOptions] = js.undefined
  var `type`: java.lang.String
}

object Packet {
  @scala.inline
  def apply(`type`: java.lang.String, data: Message = null, options: MessageOptions = null): Packet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Packet]
  }
}

