package typings.freedom.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Specification for a channel.
@js.native
trait ChannelSpecifier extends js.Object {
  var channel: Channel = js.native
    // How to communicate over this channel.
  // A freedom channel endpoint identifier. Can be passed over a freedom
  // message-passing boundary.  It is used to create a channel to the freedom
  // module that called createChannel and created this ChannelSpecifier.
  var identifier: String = js.native
}

object ChannelSpecifier {
  @scala.inline
  def apply(channel: Channel, identifier: String): ChannelSpecifier = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSpecifier]
  }
  @scala.inline
  implicit class ChannelSpecifierOps[Self <: ChannelSpecifier] (val x: Self) extends AnyVal {
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
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
  }
  
}

