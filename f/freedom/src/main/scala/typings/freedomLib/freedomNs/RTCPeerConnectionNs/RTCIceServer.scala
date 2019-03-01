package typings
package freedomLib.freedomNs.RTCPeerConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceServer extends js.Object {
  var credential: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.Array[java.lang.String]
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIceServer {
  @scala.inline
  def apply(
    urls: js.Array[java.lang.String],
    credential: java.lang.String = null,
    username: java.lang.String = null
  ): RTCIceServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("urls")(urls)
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[RTCIceServer]
  }
}

