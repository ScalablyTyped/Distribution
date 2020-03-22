package typings.firebaseFirestore

import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueue extends js.Object {
  var dontPurgeData: js.UndefOr[Boolean] = js.undefined
  var queue: js.UndefOr[AsyncQueue] = js.undefined
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}

object AnonQueue {
  @scala.inline
  def apply(
    dontPurgeData: js.UndefOr[Boolean] = js.undefined,
    queue: AsyncQueue = null,
    synchronizeTabs: js.UndefOr[Boolean] = js.undefined
  ): AnonQueue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dontPurgeData)) __obj.updateDynamic("dontPurgeData")(dontPurgeData.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeTabs)) __obj.updateDynamic("synchronizeTabs")(synchronizeTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueue]
  }
}

