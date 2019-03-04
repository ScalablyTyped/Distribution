package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribersChange extends js.Object {
  /**
    * The clients who subscribed to or unsubscribed from the channel.
    */
  var clients: js.Array[subscribedClient]
  /**
    * The type of the change, either "subscribe" or "unsubscribe".
    */
  var `type`: java.lang.String
}

object subscribersChange {
  @scala.inline
  def apply(clients: js.Array[subscribedClient], `type`: java.lang.String): subscribersChange = {
    val __obj = js.Dynamic.literal(clients = clients)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[subscribersChange]
  }
}

