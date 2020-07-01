package typings.framebus.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FramebusPayload extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var event: String
  var eventData: js.UndefOr[FramebusSubscriberArg] = js.undefined
  var origin: String
  var reply: js.UndefOr[String | ReplyFunction] = js.undefined
}

object FramebusPayload {
  @scala.inline
  def apply(
    event: String,
    origin: String,
    data: String = null,
    eventData: FramebusSubscriberArg = null,
    reply: String | ReplyFunction = null
  ): FramebusPayload = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (eventData != null) __obj.updateDynamic("eventData")(eventData.asInstanceOf[js.Any])
    if (reply != null) __obj.updateDynamic("reply")(reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[FramebusPayload]
  }
}

