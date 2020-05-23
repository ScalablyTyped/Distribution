package typings.evernote.anon

import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentTime extends js.Object {
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  var fullSyncBefore: js.UndefOr[Timestamp] = js.undefined
  var updateCount: js.UndefOr[Double] = js.undefined
  var uploaded: js.UndefOr[Double] = js.undefined
  var userLastUpdated: js.UndefOr[Timestamp] = js.undefined
  var userMaxMessageEventId: js.UndefOr[MessageEventID] = js.undefined
}

object CurrentTime {
  @scala.inline
  def apply(
    currentTime: js.UndefOr[Timestamp] = js.undefined,
    fullSyncBefore: js.UndefOr[Timestamp] = js.undefined,
    updateCount: js.UndefOr[Double] = js.undefined,
    uploaded: js.UndefOr[Double] = js.undefined,
    userLastUpdated: js.UndefOr[Timestamp] = js.undefined,
    userMaxMessageEventId: js.UndefOr[MessageEventID] = js.undefined
  ): CurrentTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentTime)) __obj.updateDynamic("currentTime")(currentTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullSyncBefore)) __obj.updateDynamic("fullSyncBefore")(fullSyncBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateCount)) __obj.updateDynamic("updateCount")(updateCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploaded)) __obj.updateDynamic("uploaded")(uploaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userLastUpdated)) __obj.updateDynamic("userLastUpdated")(userLastUpdated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userMaxMessageEventId)) __obj.updateDynamic("userMaxMessageEventId")(userMaxMessageEventId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTime]
  }
}

