package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateLabel extends js.Object {
  /**
    * Whether to rotate the label automatically.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.circular.rotateLabel
    */
  var rotateLabel: js.UndefOr[Boolean] = js.native
}

object RotateLabel {
  @scala.inline
  def apply(): RotateLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateLabel]
  }
  @scala.inline
  implicit class RotateLabelOps[Self <: RotateLabel] (val x: Self) extends AnyVal {
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
    def setRotateLabel(value: Boolean): Self = this.set("rotateLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateLabel: Self = this.set("rotateLabel", js.undefined)
  }
  
}

