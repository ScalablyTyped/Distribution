package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleFields extends js.Object {
  var crossDimensionReachReportCompatibleFields: js.UndefOr[CrossDimensionReachReportCompatibleFields] = js.native
  var floodlightReportCompatibleFields: js.UndefOr[FloodlightReportCompatibleFields] = js.native
  var kind: js.UndefOr[String] = js.native
  var pathToConversionReportCompatibleFields: js.UndefOr[PathToConversionReportCompatibleFields] = js.native
  var reachReportCompatibleFields: js.UndefOr[ReachReportCompatibleFields] = js.native
  var reportCompatibleFields: js.UndefOr[ReportCompatibleFields] = js.native
}

object CompatibleFields {
  @scala.inline
  def apply(): CompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleFields]
  }
  @scala.inline
  implicit class CompatibleFieldsOps[Self <: CompatibleFields] (val x: Self) extends AnyVal {
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
    def setCrossDimensionReachReportCompatibleFields(value: CrossDimensionReachReportCompatibleFields): Self = this.set("crossDimensionReachReportCompatibleFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossDimensionReachReportCompatibleFields: Self = this.set("crossDimensionReachReportCompatibleFields", js.undefined)
    @scala.inline
    def setFloodlightReportCompatibleFields(value: FloodlightReportCompatibleFields): Self = this.set("floodlightReportCompatibleFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightReportCompatibleFields: Self = this.set("floodlightReportCompatibleFields", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPathToConversionReportCompatibleFields(value: PathToConversionReportCompatibleFields): Self = this.set("pathToConversionReportCompatibleFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathToConversionReportCompatibleFields: Self = this.set("pathToConversionReportCompatibleFields", js.undefined)
    @scala.inline
    def setReachReportCompatibleFields(value: ReachReportCompatibleFields): Self = this.set("reachReportCompatibleFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReachReportCompatibleFields: Self = this.set("reachReportCompatibleFields", js.undefined)
    @scala.inline
    def setReportCompatibleFields(value: ReportCompatibleFields): Self = this.set("reportCompatibleFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportCompatibleFields: Self = this.set("reportCompatibleFields", js.undefined)
  }
  
}

