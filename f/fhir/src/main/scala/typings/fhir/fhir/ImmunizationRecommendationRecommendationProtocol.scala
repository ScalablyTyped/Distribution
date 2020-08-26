package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Protocol used by recommendation
  */
@js.native
trait ImmunizationRecommendationRecommendationProtocol extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'doseSequence'.
    */
  var _doseSequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'series'.
    */
  var _series: js.UndefOr[Element] = js.native
  /**
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.native
  /**
    * Protocol details
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Dose number within sequence
    */
  var doseSequence: js.UndefOr[positiveInt] = js.native
  /**
    * Name of vaccination series
    */
  var series: js.UndefOr[String] = js.native
}

object ImmunizationRecommendationRecommendationProtocol {
  @scala.inline
  def apply(): ImmunizationRecommendationRecommendationProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationProtocol]
  }
  @scala.inline
  implicit class ImmunizationRecommendationRecommendationProtocolOps[Self <: ImmunizationRecommendationRecommendationProtocol] (val x: Self) extends AnyVal {
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
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_doseSequence(value: Element): Self = this.set("_doseSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_doseSequence: Self = this.set("_doseSequence", js.undefined)
    @scala.inline
    def set_series(value: Element): Self = this.set("_series", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_series: Self = this.set("_series", js.undefined)
    @scala.inline
    def setAuthority(value: Reference): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDoseSequence(value: positiveInt): Self = this.set("doseSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoseSequence: Self = this.set("doseSequence", js.undefined)
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
  }
  
}

