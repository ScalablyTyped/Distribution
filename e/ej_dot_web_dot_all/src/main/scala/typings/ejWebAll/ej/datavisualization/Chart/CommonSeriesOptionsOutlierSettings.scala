package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonSeriesOptionsOutlierSettings extends js.Object {
  /** Specifies the shape of the outlier.
    * @Default {circle. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.native
  /** Options for customizing the size of the outlier shape.
    */
  var size: js.UndefOr[CommonSeriesOptionsOutlierSettingsSize] = js.native
}

object CommonSeriesOptionsOutlierSettings {
  @scala.inline
  def apply(): CommonSeriesOptionsOutlierSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptionsOutlierSettings]
  }
  @scala.inline
  implicit class CommonSeriesOptionsOutlierSettingsOps[Self <: CommonSeriesOptionsOutlierSettings] (val x: Self) extends AnyVal {
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
    def setShape(value: Shape | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: CommonSeriesOptionsOutlierSettingsSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

