package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentTime extends js.Object {
  var currentTime: scala.Double
  var fullSyncBefore: scala.Double
  var updateCount: scala.Double
  var uploaded: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CurrentTime {
  @scala.inline
  def apply(
    currentTime: scala.Double,
    fullSyncBefore: scala.Double,
    updateCount: scala.Double,
    uploaded: scala.Int | scala.Double = null
  ): Anon_CurrentTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentTime")(currentTime)
    __obj.updateDynamic("fullSyncBefore")(fullSyncBefore)
    __obj.updateDynamic("updateCount")(updateCount)
    if (uploaded != null) __obj.updateDynamic("uploaded")(uploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrentTime]
  }
}

