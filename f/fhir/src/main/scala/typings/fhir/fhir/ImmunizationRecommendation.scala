package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Guidance or advice relating to an immunization
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ImmunizationRecommendation extends DomainResource {
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Who this profile is for
    */
  var patient: Reference = js.native
  /**
    * Vaccine administration recommendations
    */
  var recommendation: js.Array[ImmunizationRecommendationRecommendation] = js.native
}

object ImmunizationRecommendation {
  @scala.inline
  def apply(patient: Reference, recommendation: js.Array[ImmunizationRecommendationRecommendation]): ImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendation]
  }
  @scala.inline
  implicit class ImmunizationRecommendationOps[Self <: ImmunizationRecommendation] (val x: Self) extends AnyVal {
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
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecommendationVarargs(value: ImmunizationRecommendationRecommendation*): Self = this.set("recommendation", js.Array(value :_*))
    @scala.inline
    def setRecommendation(value: js.Array[ImmunizationRecommendationRecommendation]): Self = this.set("recommendation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
  
}

