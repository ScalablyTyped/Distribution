package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See |Core_unprivileged| in |core.unprivileged.js|

trait Core extends js.Object {
  // Given an ChannelEndpointIdentifier for a channel, create a proxy event
  // interface for it.
  def bindChannel(channelIdentifier: java.lang.String): stdLib.Promise[Channel]
  // Create a new channel which which to communicate between modules.
  def createChannel(): stdLib.Promise[ChannelSpecifier]
  // Returns the list of identifiers describing the dependency path.
  def getId(): stdLib.Promise[js.Array[java.lang.String]]
  def getLogger(tag: java.lang.String): stdLib.Promise[Logger]
}

