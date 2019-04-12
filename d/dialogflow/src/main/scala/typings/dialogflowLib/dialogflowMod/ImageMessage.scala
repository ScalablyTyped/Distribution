package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMessage
  extends MessageBase
     with Message {
  var image: Image
  @JSName("message")
  var message_ImageMessage: dialogflowLib.dialogflowLibStrings.image
}

object ImageMessage {
  @scala.inline
  def apply(image: Image, message: dialogflowLib.dialogflowLibStrings.image, platform: Platform = null): ImageMessage = {
    val __obj = js.Dynamic.literal(image = image, message = message)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[ImageMessage]
  }
}

