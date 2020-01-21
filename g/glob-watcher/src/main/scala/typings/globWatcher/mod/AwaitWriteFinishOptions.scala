package typings.globWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// copied from https://github.com/paulmillr/chokidar/blob/5e09c85ea04ffb7fd9cdb829892540e93ce63553/types/index.d.ts
trait AwaitWriteFinishOptions extends js.Object {
  /**
    * File size polling interval.
    */
  var pollInterval: js.UndefOr[Double] = js.undefined
  /**
    * Amount of time in milliseconds for a file size to remain constant before emitting its event.
    */
  var stabilityThreshold: js.UndefOr[Double] = js.undefined
}

object AwaitWriteFinishOptions {
  @scala.inline
  def apply(pollInterval: Int | Double = null, stabilityThreshold: Int | Double = null): AwaitWriteFinishOptions = {
    val __obj = js.Dynamic.literal()
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (stabilityThreshold != null) __obj.updateDynamic("stabilityThreshold")(stabilityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitWriteFinishOptions]
  }
}

