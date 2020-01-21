package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcknowledged extends js.Object {
  var acknowledged: js.UndefOr[js.Array[String]] = js.undefined
  var rejected: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAcknowledged {
  @scala.inline
  def apply(acknowledged: js.Array[String] = null, rejected: js.Array[String] = null): AnonAcknowledged = {
    val __obj = js.Dynamic.literal()
    if (acknowledged != null) __obj.updateDynamic("acknowledged")(acknowledged.asInstanceOf[js.Any])
    if (rejected != null) __obj.updateDynamic("rejected")(rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcknowledged]
  }
}

