package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsResizeOption extends js.Object {
  /**
    * Chart height.
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Specify whether or not to prevent triggering events.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Chart width.
    */
  var width: js.UndefOr[Double | String] = js.native
}

object EChartsResizeOption {
  @scala.inline
  def apply(): EChartsResizeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsResizeOption]
  }
  @scala.inline
  implicit class EChartsResizeOptionOps[Self <: EChartsResizeOption] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

