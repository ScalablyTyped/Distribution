package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsOptionConfig extends js.Object {
  var lazyUpdate: js.UndefOr[Boolean] = js.native
  var notMerge: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
}

object EChartsOptionConfig {
  @scala.inline
  def apply(): EChartsOptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsOptionConfig]
  }
  @scala.inline
  implicit class EChartsOptionConfigOps[Self <: EChartsOptionConfig] (val x: Self) extends AnyVal {
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
    def setLazyUpdate(value: Boolean): Self = this.set("lazyUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyUpdate: Self = this.set("lazyUpdate", js.undefined)
    @scala.inline
    def setNotMerge(value: Boolean): Self = this.set("notMerge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotMerge: Self = this.set("notMerge", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}

