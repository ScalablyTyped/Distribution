package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomClientAddress extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomClientAddress. */
  var kind: js.UndefOr[String] = js.undefined
  /** The XMPP address of the client on the Google Games XMPP network. */
  var xmppAddress: js.UndefOr[String] = js.undefined
}

object RoomClientAddress {
  @scala.inline
  def apply(kind: String = null, xmppAddress: String = null): RoomClientAddress = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (xmppAddress != null) __obj.updateDynamic("xmppAddress")(xmppAddress)
    __obj.asInstanceOf[RoomClientAddress]
  }
}

