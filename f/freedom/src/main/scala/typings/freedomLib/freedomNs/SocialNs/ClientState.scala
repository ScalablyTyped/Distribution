package typings
package freedomLib.freedomNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Status of a client connected to a social network.

trait ClientState extends js.Object {
  var clientId: java.lang.String
  var status: java.lang.String
    // Either ONLINE, OFFLINE, or ONLINE_WITH_OTHER_APP
  var timestamp: scala.Double
  var userId: java.lang.String
}

