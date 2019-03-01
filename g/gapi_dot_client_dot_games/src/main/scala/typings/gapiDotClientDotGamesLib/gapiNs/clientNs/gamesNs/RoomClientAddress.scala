package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomClientAddress extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomClientAddress. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The XMPP address of the client on the Google Games XMPP network. */
  var xmppAddress: js.UndefOr[java.lang.String] = js.undefined
}

object RoomClientAddress {
  @scala.inline
  def apply(kind: java.lang.String = null, xmppAddress: java.lang.String = null): RoomClientAddress = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (xmppAddress != null) __obj.updateDynamic("xmppAddress")(xmppAddress)
    __obj.asInstanceOf[RoomClientAddress]
  }
}

