package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendSize extends js.Object {
  /** Specify the height of the legend. Height can be specified in pixel.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.native
  /** Specify the width of the legend. Width can be specified in pixel.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.native
}

object LegendSize {
  @scala.inline
  def apply(): LegendSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendSize]
  }
  @scala.inline
  implicit class LegendSizeOps[Self <: LegendSize] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

