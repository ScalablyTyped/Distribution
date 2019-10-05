package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceServer extends js.Object {
  var credential: js.UndefOr[String] = js.undefined
  var urls: js.Array[String]
  var username: js.UndefOr[String] = js.undefined
}

object RTCIceServer {
  @scala.inline
  def apply(urls: js.Array[String], credential: String = null, username: String = null): RTCIceServer = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[RTCIceServer]
  }
}

