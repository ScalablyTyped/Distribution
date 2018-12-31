package typings
package freedomLib.freedomNs.UdpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type for the chrome.socket.recvFrom callback:
//   http://developer.chrome.com/apps/socket#method-recvFrom
// This is also the type returned to onData callbacks.
trait RecvFromInfo extends js.Object {
  var address: java.lang.String
  var data: stdLib.ArrayBuffer
  var port: scala.Double
  var resultCode: scala.Double
}

