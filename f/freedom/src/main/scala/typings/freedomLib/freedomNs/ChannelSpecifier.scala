package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Specification for a channel.
trait ChannelSpecifier extends js.Object {
  var channel: Channel
    // How to communicate over this channel.
  // A freedom channel endpoint identifier. Can be passed over a freedom
  // message-passing boundary.  It is used to create a channel to the freedom
  // module that called createChannel and created this ChannelSpecifier.
  var identifier: java.lang.String
}

object ChannelSpecifier {
  @scala.inline
  def apply(channel: Channel, identifier: java.lang.String): ChannelSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("identifier")(identifier)
    __obj.asInstanceOf[ChannelSpecifier]
  }
}

