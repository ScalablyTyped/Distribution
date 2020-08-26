package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of measurements taken by a device
  */
@js.native
trait SampledData extends Element {
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'dimensions'.
    */
  var _dimensions: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lowerLimit'.
    */
  var _lowerLimit: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'period'.
    */
  var _period: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'upperLimit'.
    */
  var _upperLimit: js.UndefOr[Element] = js.native
  /**
    * Decimal values with spaces, or "E" | "U" | "L"
    */
  var data: String = js.native
  /**
    * Number of sample points at each time point
    */
  var dimensions: positiveInt = js.native
  /**
    * Multiply data by this before adding to origin
    */
  var factor: js.UndefOr[decimal] = js.native
  /**
    * Lower limit of detection
    */
  var lowerLimit: js.UndefOr[decimal] = js.native
  /**
    * Zero value and units
    */
  var origin: Quantity = js.native
  /**
    * Number of milliseconds between samples
    */
  var period: decimal = js.native
  /**
    * Upper limit of detection
    */
  var upperLimit: js.UndefOr[decimal] = js.native
}

object SampledData {
  @scala.inline
  def apply(data: String, dimensions: positiveInt, origin: Quantity, period: decimal): SampledData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledData]
  }
  @scala.inline
  implicit class SampledDataOps[Self <: SampledData] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensions(value: positiveInt): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: Quantity): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriod(value: decimal): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def set_data(value: Element): Self = this.set("_data", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_data: Self = this.set("_data", js.undefined)
    @scala.inline
    def set_dimensions(value: Element): Self = this.set("_dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_dimensions: Self = this.set("_dimensions", js.undefined)
    @scala.inline
    def set_factor(value: Element): Self = this.set("_factor", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_factor: Self = this.set("_factor", js.undefined)
    @scala.inline
    def set_lowerLimit(value: Element): Self = this.set("_lowerLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_lowerLimit: Self = this.set("_lowerLimit", js.undefined)
    @scala.inline
    def set_period(value: Element): Self = this.set("_period", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_period: Self = this.set("_period", js.undefined)
    @scala.inline
    def set_upperLimit(value: Element): Self = this.set("_upperLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_upperLimit: Self = this.set("_upperLimit", js.undefined)
    @scala.inline
    def setFactor(value: decimal): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setLowerLimit(value: decimal): Self = this.set("lowerLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerLimit: Self = this.set("lowerLimit", js.undefined)
    @scala.inline
    def setUpperLimit(value: decimal): Self = this.set("upperLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperLimit: Self = this.set("upperLimit", js.undefined)
  }
  
}

