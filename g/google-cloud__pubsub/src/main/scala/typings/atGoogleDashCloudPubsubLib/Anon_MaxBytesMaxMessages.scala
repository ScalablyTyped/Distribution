package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxBytesMaxMessages extends js.Object {
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
  var maxMilliseconds: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxBytesMaxMessages {
  @scala.inline
  def apply(
    maxBytes: scala.Int | scala.Double = null,
    maxMessages: scala.Int | scala.Double = null,
    maxMilliseconds: scala.Int | scala.Double = null
  ): Anon_MaxBytesMaxMessages = {
    val __obj = js.Dynamic.literal()
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (maxMilliseconds != null) __obj.updateDynamic("maxMilliseconds")(maxMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxBytesMaxMessages]
  }
}

