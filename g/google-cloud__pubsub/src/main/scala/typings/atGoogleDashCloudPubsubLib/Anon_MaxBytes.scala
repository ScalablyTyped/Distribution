package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxBytes extends js.Object {
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxBytes {
  @scala.inline
  def apply(maxBytes: scala.Int | scala.Double = null, maxMessages: scala.Int | scala.Double = null): Anon_MaxBytes = {
    val __obj = js.Dynamic.literal()
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxBytes]
  }
}

