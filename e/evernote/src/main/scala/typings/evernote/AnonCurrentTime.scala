package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentTime extends js.Object {
  var currentTime: Double
  var fullSyncBefore: Double
  var updateCount: Double
  var uploaded: js.UndefOr[Double] = js.undefined
}

object AnonCurrentTime {
  @scala.inline
  def apply(currentTime: Double, fullSyncBefore: Double, updateCount: Double, uploaded: Int | Double = null): AnonCurrentTime = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], fullSyncBefore = fullSyncBefore.asInstanceOf[js.Any], updateCount = updateCount.asInstanceOf[js.Any])
    if (uploaded != null) __obj.updateDynamic("uploaded")(uploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentTime]
  }
}

