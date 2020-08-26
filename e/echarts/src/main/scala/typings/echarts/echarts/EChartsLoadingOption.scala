package typings.echarts.echarts

import typings.echarts.echartsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsLoadingOption extends js.Object {
  /**
    * Loading circle color.
    * @default '#c23531'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Mask background color.
    * @default 'rgba(255, 255, 255, 0.8)'
    */
  var maskColor: js.UndefOr[String] = js.native
  /**
    * Loading text.
    * @default 'loading'
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Loading text color.
    * @default '#000'
    */
  var textColor: js.UndefOr[String] = js.native
  /**
    * Zlevel of loading. If not 0, it creates a new canvas for loading.
    * @default 0
    */
  var zlevel: js.UndefOr[`0`] = js.native
}

object EChartsLoadingOption {
  @scala.inline
  def apply(): EChartsLoadingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsLoadingOption]
  }
  @scala.inline
  implicit class EChartsLoadingOptionOps[Self <: EChartsLoadingOption] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setMaskColor(value: String): Self = this.set("maskColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskColor: Self = this.set("maskColor", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setZlevel(value: `0`): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
  }
  
}

