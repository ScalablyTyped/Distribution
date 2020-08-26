package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApproximateSplitRequest extends js.Object {
  /**
    * A fraction at which to split the work item, from 0.0 (beginning of the
    * input) to 1.0 (end of the input).
    */
  var fractionConsumed: js.UndefOr[Double] = js.native
  /** A Position at which to split the work item. */
  var position: js.UndefOr[Position] = js.native
}

object ApproximateSplitRequest {
  @scala.inline
  def apply(): ApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproximateSplitRequest]
  }
  @scala.inline
  implicit class ApproximateSplitRequestOps[Self <: ApproximateSplitRequest] (val x: Self) extends AnyVal {
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
    def setFractionConsumed(value: Double): Self = this.set("fractionConsumed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionConsumed: Self = this.set("fractionConsumed", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

