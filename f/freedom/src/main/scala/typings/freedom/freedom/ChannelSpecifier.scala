package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Specification for a channel.
trait ChannelSpecifier extends StObject {
  
  var channel: Channel
  
  // How to communicate over this channel.
  // A freedom channel endpoint identifier. Can be passed over a freedom
  // message-passing boundary.  It is used to create a channel to the freedom
  // module that called createChannel and created this ChannelSpecifier.
  var identifier: String
}
object ChannelSpecifier {
  
  @scala.inline
  def apply(channel: Channel, identifier: String): ChannelSpecifier = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSpecifier]
  }
  
  @scala.inline
  implicit class ChannelSpecifierMutableBuilder[Self <: ChannelSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
