package typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precondition extends js.Object {
  /**
    * If set, the last update time to enforce.
    */
  val lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
}

object Precondition {
  @scala.inline
  def apply(lastUpdateTime: Timestamp = null): Precondition = {
    val __obj = js.Dynamic.literal()
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    __obj.asInstanceOf[Precondition]
  }
}

