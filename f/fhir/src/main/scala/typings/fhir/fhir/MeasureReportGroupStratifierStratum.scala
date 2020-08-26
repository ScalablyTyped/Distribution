package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratum results, one for each unique value in the stratifier
  */
@js.native
trait MeasureReportGroupStratifierStratum extends BackboneElement {
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * What score this stratum achieved
    */
  var measureScore: js.UndefOr[decimal] = js.native
  /**
    * Population results in this stratum
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumPopulation]] = js.native
  /**
    * The stratum value, e.g. male
    */
  var value: String = js.native
}

object MeasureReportGroupStratifierStratum {
  @scala.inline
  def apply(value: String): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
  @scala.inline
  implicit class MeasureReportGroupStratifierStratumOps[Self <: MeasureReportGroupStratifierStratum] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_measureScore(value: Element): Self = this.set("_measureScore", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_measureScore: Self = this.set("_measureScore", js.undefined)
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    @scala.inline
    def setMeasureScore(value: decimal): Self = this.set("measureScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureScore: Self = this.set("measureScore", js.undefined)
    @scala.inline
    def setPopulationVarargs(value: MeasureReportGroupStratifierStratumPopulation*): Self = this.set("population", js.Array(value :_*))
    @scala.inline
    def setPopulation(value: js.Array[MeasureReportGroupStratifierStratumPopulation]): Self = this.set("population", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulation: Self = this.set("population", js.undefined)
  }
  
}

