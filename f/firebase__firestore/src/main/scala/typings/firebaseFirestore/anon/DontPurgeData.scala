package typings.firebaseFirestore.anon

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DontPurgeData extends js.Object {
  var dontPurgeData: js.UndefOr[Boolean] = js.undefined
  var queue: js.UndefOr[AsyncQueue] = js.undefined
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}

object DontPurgeData {
  @scala.inline
  def apply(
    dontPurgeData: js.UndefOr[Boolean] = js.undefined,
    queue: AsyncQueue = null,
    synchronizeTabs: js.UndefOr[Boolean] = js.undefined
  ): DontPurgeData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dontPurgeData)) __obj.updateDynamic("dontPurgeData")(dontPurgeData.get.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeTabs)) __obj.updateDynamic("synchronizeTabs")(synchronizeTabs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DontPurgeData]
  }
}

