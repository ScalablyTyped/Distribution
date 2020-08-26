package typings.globWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// copied from https://github.com/paulmillr/chokidar/blob/5e09c85ea04ffb7fd9cdb829892540e93ce63553/types/index.d.ts
@js.native
trait AwaitWriteFinishOptions extends js.Object {
  /**
    * File size polling interval.
    */
  var pollInterval: js.UndefOr[Double] = js.native
  /**
    * Amount of time in milliseconds for a file size to remain constant before emitting its event.
    */
  var stabilityThreshold: js.UndefOr[Double] = js.native
}

object AwaitWriteFinishOptions {
  @scala.inline
  def apply(): AwaitWriteFinishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwaitWriteFinishOptions]
  }
  @scala.inline
  implicit class AwaitWriteFinishOptionsOps[Self <: AwaitWriteFinishOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    @scala.inline
    def setStabilityThreshold(value: Double): Self = this.set("stabilityThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStabilityThreshold: Self = this.set("stabilityThreshold", js.undefined)
  }
  
}

