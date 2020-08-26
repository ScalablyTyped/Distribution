package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApproximateProgress extends js.Object {
  /** Obsolete. */
  var percentComplete: js.UndefOr[Double] = js.native
  /** Obsolete. */
  var position: js.UndefOr[Position] = js.native
  /** Obsolete. */
  var remainingTime: js.UndefOr[String] = js.native
}

object ApproximateProgress {
  @scala.inline
  def apply(): ApproximateProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproximateProgress]
  }
  @scala.inline
  implicit class ApproximateProgressOps[Self <: ApproximateProgress] (val x: Self) extends AnyVal {
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
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRemainingTime(value: String): Self = this.set("remainingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemainingTime: Self = this.set("remainingTime", js.undefined)
  }
  
}

