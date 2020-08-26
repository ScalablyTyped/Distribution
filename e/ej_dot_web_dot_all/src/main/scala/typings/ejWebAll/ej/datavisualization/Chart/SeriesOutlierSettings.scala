package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesOutlierSettings extends js.Object {
  /** Specifies the shape of the outlier.
    * @Default {circle. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.native
  /** Options for customizing the size of the outlier shape.
    */
  var size: js.UndefOr[SeriesOutlierSettingsSize] = js.native
}

object SeriesOutlierSettings {
  @scala.inline
  def apply(): SeriesOutlierSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesOutlierSettings]
  }
  @scala.inline
  implicit class SeriesOutlierSettingsOps[Self <: SeriesOutlierSettings] (val x: Self) extends AnyVal {
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
    def setSize(value: SeriesOutlierSettingsSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

