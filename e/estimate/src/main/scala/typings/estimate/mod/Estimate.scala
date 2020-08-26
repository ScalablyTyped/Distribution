package typings.estimate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Estimate extends js.Object {
  var progress: Double = js.native
  var remaining: Double = js.native
  var total: Double = js.native
  def initialize(): Unit = js.native
  def update(): Unit = js.native
}

object Estimate {
  @scala.inline
  def apply(initialize: () => Unit, progress: Double, remaining: Double, total: Double, update: () => Unit): Estimate = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction0(initialize), progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Estimate]
  }
  @scala.inline
  implicit class EstimateOps[Self <: Estimate] (val x: Self) extends AnyVal {
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
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

