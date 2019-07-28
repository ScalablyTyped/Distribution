package typings.freedom.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See |Core_unprivileged| in |core.unprivileged.js|
trait Core extends js.Object {
  // Given an ChannelEndpointIdentifier for a channel, create a proxy event
  // interface for it.
  def bindChannel(channelIdentifier: String): js.Promise[Channel]
  // Create a new channel which which to communicate between modules.
  def createChannel(): js.Promise[ChannelSpecifier]
  // Returns the list of identifiers describing the dependency path.
  def getId(): js.Promise[js.Array[String]]
  def getLogger(tag: String): js.Promise[Logger]
}

object Core {
  @scala.inline
  def apply(
    bindChannel: String => js.Promise[Channel],
    createChannel: () => js.Promise[ChannelSpecifier],
    getId: () => js.Promise[js.Array[String]],
    getLogger: String => js.Promise[Logger]
  ): Core = {
    val __obj = js.Dynamic.literal(bindChannel = js.Any.fromFunction1(bindChannel), createChannel = js.Any.fromFunction0(createChannel), getId = js.Any.fromFunction0(getId), getLogger = js.Any.fromFunction1(getLogger))
  
    __obj.asInstanceOf[Core]
  }
}

