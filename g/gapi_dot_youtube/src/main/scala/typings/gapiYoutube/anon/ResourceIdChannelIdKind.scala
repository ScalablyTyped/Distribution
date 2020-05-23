package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIdChannelIdKind extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource associated with the comment.
    */
  var resourceId: ChannelIdKind
}

object ResourceIdChannelIdKind {
  @scala.inline
  def apply(resourceId: ChannelIdKind): ResourceIdChannelIdKind = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdChannelIdKind]
  }
}

