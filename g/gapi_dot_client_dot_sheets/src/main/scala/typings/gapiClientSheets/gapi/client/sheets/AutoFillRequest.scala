package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFillRequest extends js.Object {
  /**
    * The range to autofill. This will examine the range and detect
    * the location that has data and automatically fill that data
    * in to the rest of the range.
    */
  var range: js.UndefOr[GridRange] = js.native
  /**
    * The source and destination areas to autofill.
    * This explicitly lists the source of the autofill and where to
    * extend that data.
    */
  var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.native
  /**
    * True if we should generate data with the "alternate" series.
    * This differs based on the type and amount of source data.
    */
  var useAlternateSeries: js.UndefOr[Boolean] = js.native
}

object AutoFillRequest {
  @scala.inline
  def apply(): AutoFillRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFillRequest]
  }
  @scala.inline
  implicit class AutoFillRequestOps[Self <: AutoFillRequest] (val x: Self) extends AnyVal {
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
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setSourceAndDestination(value: SourceAndDestination): Self = this.set("sourceAndDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAndDestination: Self = this.set("sourceAndDestination", js.undefined)
    @scala.inline
    def setUseAlternateSeries(value: Boolean): Self = this.set("useAlternateSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseAlternateSeries: Self = this.set("useAlternateSeries", js.undefined)
  }
  
}

