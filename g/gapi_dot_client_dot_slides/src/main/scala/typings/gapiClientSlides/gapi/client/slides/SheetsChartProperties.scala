package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsChartProperties extends js.Object {
  /** The properties of the embedded chart image. */
  var chartImageProperties: js.UndefOr[ImageProperties] = js.native
}

object SheetsChartProperties {
  @scala.inline
  def apply(): SheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsChartProperties]
  }
  @scala.inline
  implicit class SheetsChartPropertiesOps[Self <: SheetsChartProperties] (val x: Self) extends AnyVal {
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
    def setChartImageProperties(value: ImageProperties): Self = this.set("chartImageProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartImageProperties: Self = this.set("chartImageProperties", js.undefined)
  }
  
}

