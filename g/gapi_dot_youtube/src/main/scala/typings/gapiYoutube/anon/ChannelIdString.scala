package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelIdString extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the channel that the user subscribed to.
    */
  var channelId: String = js.native
  /**
    * The type of the API resource.
    */
  var kind: String = js.native
}

object ChannelIdString {
  @scala.inline
  def apply(channelId: String, kind: String): ChannelIdString = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdString]
  }
  @scala.inline
  implicit class ChannelIdStringOps[Self <: ChannelIdString] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

