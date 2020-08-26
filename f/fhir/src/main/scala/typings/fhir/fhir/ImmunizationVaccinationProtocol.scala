package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What protocol was followed
  */
@js.native
trait ImmunizationVaccinationProtocol extends BackboneElement {
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
    * Contains extended information for property 'seriesDoses'.
    */
  var _seriesDoses: js.UndefOr[Element] = js.native
  /**
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.native
  /**
    * Details of vaccine protocol
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Dose number within series
    */
  var doseSequence: js.UndefOr[positiveInt] = js.native
  /**
    * Indicates if dose counts towards immunity
    */
  var doseStatus: CodeableConcept = js.native
  /**
    * Why dose does (not) count
    */
  var doseStatusReason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Name of vaccine series
    */
  var series: js.UndefOr[String] = js.native
  /**
    * Recommended number of doses for immunity
    */
  var seriesDoses: js.UndefOr[positiveInt] = js.native
  /**
    * Disease immunized against
    */
  var targetDisease: js.Array[CodeableConcept] = js.native
}

object ImmunizationVaccinationProtocol {
  @scala.inline
  def apply(doseStatus: CodeableConcept, targetDisease: js.Array[CodeableConcept]): ImmunizationVaccinationProtocol = {
    val __obj = js.Dynamic.literal(doseStatus = doseStatus.asInstanceOf[js.Any], targetDisease = targetDisease.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationVaccinationProtocol]
  }
  @scala.inline
  implicit class ImmunizationVaccinationProtocolOps[Self <: ImmunizationVaccinationProtocol] (val x: Self) extends AnyVal {
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
    def setDoseStatus(value: CodeableConcept): Self = this.set("doseStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDiseaseVarargs(value: CodeableConcept*): Self = this.set("targetDisease", js.Array(value :_*))
    @scala.inline
    def setTargetDisease(value: js.Array[CodeableConcept]): Self = this.set("targetDisease", value.asInstanceOf[js.Any])
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
    def set_seriesDoses(value: Element): Self = this.set("_seriesDoses", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_seriesDoses: Self = this.set("_seriesDoses", js.undefined)
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
    def setDoseStatusReason(value: CodeableConcept): Self = this.set("doseStatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoseStatusReason: Self = this.set("doseStatusReason", js.undefined)
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSeriesDoses(value: positiveInt): Self = this.set("seriesDoses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesDoses: Self = this.set("seriesDoses", js.undefined)
  }
  
}

