package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChartProperties extends js.Object {
  /** The properties of the embedded chart image. */
  var chartImageProperties: js.UndefOr[ImageProperties] = js.undefined
}

object SheetsChartProperties {
  @scala.inline
  def apply(chartImageProperties: ImageProperties = null): SheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    if (chartImageProperties != null) __obj.updateDynamic("chartImageProperties")(chartImageProperties)
    __obj.asInstanceOf[SheetsChartProperties]
  }
}

