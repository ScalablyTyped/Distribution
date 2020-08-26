package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratification results
  */
@js.native
trait MeasureReportGroupStratifier extends BackboneElement {
  /**
    * What stratifier of the group
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Stratum results, one for each unique value in the stratifier
    */
  var stratum: js.UndefOr[js.Array[MeasureReportGroupStratifierStratum]] = js.native
}

object MeasureReportGroupStratifier {
  @scala.inline
  def apply(): MeasureReportGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupStratifier]
  }
  @scala.inline
  implicit class MeasureReportGroupStratifierOps[Self <: MeasureReportGroupStratifier] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setStratumVarargs(value: MeasureReportGroupStratifierStratum*): Self = this.set("stratum", js.Array(value :_*))
    @scala.inline
    def setStratum(value: js.Array[MeasureReportGroupStratifierStratum]): Self = this.set("stratum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStratum: Self = this.set("stratum", js.undefined)
  }
  
}

