package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdChannelIdString extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource that the user subscribed to.
    */
  var resourceId: ChannelIdString = js.native
}

object ResourceIdChannelIdString {
  @scala.inline
  def apply(resourceId: ChannelIdString): ResourceIdChannelIdString = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdChannelIdString]
  }
  @scala.inline
  implicit class ResourceIdChannelIdStringOps[Self <: ResourceIdChannelIdString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceId(value: ChannelIdString): Self = this.set("resourceId", value.asInstanceOf[js.Any])
  }
  
}

