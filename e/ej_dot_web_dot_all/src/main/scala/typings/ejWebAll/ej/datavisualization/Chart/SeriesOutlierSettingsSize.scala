package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesOutlierSettingsSize extends js.Object {
  /** Height of the outlier shape.
    * @Default {6}
    */
  var height: js.UndefOr[Double] = js.native
  /** Width of the outlier shape.
    * @Default {6}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesOutlierSettingsSize {
  @scala.inline
  def apply(): SeriesOutlierSettingsSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesOutlierSettingsSize]
  }
  @scala.inline
  implicit class SeriesOutlierSettingsSizeOps[Self <: SeriesOutlierSettingsSize] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

