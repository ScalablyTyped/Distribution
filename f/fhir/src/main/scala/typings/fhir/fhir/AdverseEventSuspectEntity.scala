package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suspected agent causing the adverse event
  */
@js.native
trait AdverseEventSuspectEntity extends BackboneElement {
  /**
    * Contains extended information for property 'causality'.
    */
  var _causality: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'causalityProductRelatedness'.
    */
  var _causalityProductRelatedness: js.UndefOr[Element] = js.native
  /**
    * causality1 | causality2
    */
  var causality: js.UndefOr[code] = js.native
  /**
    * assess1 | assess2
    */
  var causalityAssessment: js.UndefOr[CodeableConcept] = js.native
  /**
    * AdverseEvent.suspectEntity.causalityAuthor
    */
  var causalityAuthor: js.UndefOr[Reference] = js.native
  /**
    * method1 | method2
    */
  var causalityMethod: js.UndefOr[CodeableConcept] = js.native
  /**
    * AdverseEvent.suspectEntity.causalityProductRelatedness
    */
  var causalityProductRelatedness: js.UndefOr[String] = js.native
  /**
    * result1 | result2
    */
  var causalityResult: js.UndefOr[CodeableConcept] = js.native
  /**
    * Refers to the specific entity that caused the adverse event
    */
  var instance: Reference = js.native
}

object AdverseEventSuspectEntity {
  @scala.inline
  def apply(instance: Reference): AdverseEventSuspectEntity = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdverseEventSuspectEntity]
  }
  @scala.inline
  implicit class AdverseEventSuspectEntityOps[Self <: AdverseEventSuspectEntity] (val x: Self) extends AnyVal {
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
    def setInstance(value: Reference): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def set_causality(value: Element): Self = this.set("_causality", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_causality: Self = this.set("_causality", js.undefined)
    @scala.inline
    def set_causalityProductRelatedness(value: Element): Self = this.set("_causalityProductRelatedness", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_causalityProductRelatedness: Self = this.set("_causalityProductRelatedness", js.undefined)
    @scala.inline
    def setCausality(value: code): Self = this.set("causality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCausality: Self = this.set("causality", js.undefined)
    @scala.inline
    def setCausalityAssessment(value: CodeableConcept): Self = this.set("causalityAssessment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCausalityAssessment: Self = this.set("causalityAssessment", js.undefined)
    @scala.inline
    def setCausalityAuthor(value: Reference): Self = this.set("causalityAuthor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCausalityAuthor: Self = this.set("causalityAuthor", js.undefined)
    @scala.inline
    def setCausalityMethod(value: CodeableConcept): Self = this.set("causalityMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCausalityMethod: Self = this.set("causalityMethod", js.undefined)
    @scala.inline
    def setCausalityProductRelatedness(value: String): Self = this.set("causalityProductRelatedness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCausalityProductRelatedness: Self = this.set("causalityProductRelatedness", js.undefined)
    @scala.inline
    def setCausalityResult(value: CodeableConcept): Self = this.set("causalityResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCausalityResult: Self = this.set("causalityResult", js.undefined)
  }
  
}

