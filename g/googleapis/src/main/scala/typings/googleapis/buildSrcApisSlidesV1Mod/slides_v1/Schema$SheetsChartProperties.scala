package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the SheetsChart.
  */
@js.native
trait Schema$SheetsChartProperties extends js.Object {
  /**
    * The properties of the embedded chart image.
    */
  var chartImageProperties: js.UndefOr[Schema$ImageProperties] = js.native
}

object Schema$SheetsChartProperties {
  @scala.inline
  def apply(chartImageProperties: Schema$ImageProperties = null): Schema$SheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    if (chartImageProperties != null) __obj.updateDynamic("chartImageProperties")(chartImageProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SheetsChartProperties]
  }
}

