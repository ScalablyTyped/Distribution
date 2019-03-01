package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelId extends js.Object {
  /** ID of the YouTube channel owned by the Actor. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ChannelId {
  @scala.inline
  def apply(channelId: java.lang.String = null): Anon_ChannelId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    __obj.asInstanceOf[Anon_ChannelId]
  }
}

