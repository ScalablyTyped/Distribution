package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentTime extends js.Object {
  var currentTime: Double
  var fullSyncBefore: Double
  var updateCount: Double
  var uploaded: js.UndefOr[Double] = js.undefined
}

object Anon_CurrentTime {
  @scala.inline
  def apply(currentTime: Double, fullSyncBefore: Double, updateCount: Double, uploaded: Int | Double = null): Anon_CurrentTime = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], fullSyncBefore = fullSyncBefore.asInstanceOf[js.Any], updateCount = updateCount.asInstanceOf[js.Any])
    if (uploaded != null) __obj.updateDynamic("uploaded")(uploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrentTime]
  }
}

