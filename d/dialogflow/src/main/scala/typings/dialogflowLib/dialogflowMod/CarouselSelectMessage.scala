package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselSelectMessage
  extends MessageBase
     with Message {
  var carouselSelect: CarouselSelect
  @JSName("message")
  var message_CarouselSelectMessage: dialogflowLib.dialogflowLibStrings.carouselSelect
}

object CarouselSelectMessage {
  @scala.inline
  def apply(
    carouselSelect: CarouselSelect,
    message: dialogflowLib.dialogflowLibStrings.carouselSelect,
    platform: Platform = null
  ): CarouselSelectMessage = {
    val __obj = js.Dynamic.literal(carouselSelect = carouselSelect, message = message)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[CarouselSelectMessage]
  }
}

