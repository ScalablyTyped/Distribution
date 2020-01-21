package typings.firebaseFirestore

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDontPurgeData extends js.Object {
  var dontPurgeData: js.UndefOr[Boolean] = js.undefined
  var queue: js.UndefOr[AsyncQueue] = js.undefined
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}

object AnonDontPurgeData {
  @scala.inline
  def apply(
    dontPurgeData: js.UndefOr[Boolean] = js.undefined,
    queue: AsyncQueue = null,
    synchronizeTabs: js.UndefOr[Boolean] = js.undefined
  ): AnonDontPurgeData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dontPurgeData)) __obj.updateDynamic("dontPurgeData")(dontPurgeData.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeTabs)) __obj.updateDynamic("synchronizeTabs")(synchronizeTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDontPurgeData]
  }
}

