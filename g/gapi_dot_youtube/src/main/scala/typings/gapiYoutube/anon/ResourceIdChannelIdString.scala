package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIdChannelIdString extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource that the user subscribed to.
    */
  var resourceId: ChannelIdString
}

object ResourceIdChannelIdString {
  @scala.inline
  def apply(resourceId: ChannelIdString): ResourceIdChannelIdString = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdChannelIdString]
  }
}

