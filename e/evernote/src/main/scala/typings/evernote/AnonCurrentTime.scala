package typings.evernote

import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentTime extends js.Object {
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  var fullSyncBefore: js.UndefOr[Timestamp] = js.undefined
  var updateCount: js.UndefOr[Double] = js.undefined
  var uploaded: js.UndefOr[Double] = js.undefined
  var userLastUpdated: js.UndefOr[Timestamp] = js.undefined
  var userMaxMessageEventId: js.UndefOr[MessageEventID] = js.undefined
}

object AnonCurrentTime {
  @scala.inline
  def apply(
    currentTime: Int | Double = null,
    fullSyncBefore: Int | Double = null,
    updateCount: Int | Double = null,
    uploaded: Int | Double = null,
    userLastUpdated: Int | Double = null,
    userMaxMessageEventId: Int | Double = null
  ): AnonCurrentTime = {
    val __obj = js.Dynamic.literal()
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (fullSyncBefore != null) __obj.updateDynamic("fullSyncBefore")(fullSyncBefore.asInstanceOf[js.Any])
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    if (uploaded != null) __obj.updateDynamic("uploaded")(uploaded.asInstanceOf[js.Any])
    if (userLastUpdated != null) __obj.updateDynamic("userLastUpdated")(userLastUpdated.asInstanceOf[js.Any])
    if (userMaxMessageEventId != null) __obj.updateDynamic("userMaxMessageEventId")(userMaxMessageEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentTime]
  }
}

