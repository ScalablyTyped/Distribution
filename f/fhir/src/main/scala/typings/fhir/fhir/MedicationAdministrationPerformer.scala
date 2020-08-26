package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who administered substance
  */
@js.native
trait MedicationAdministrationPerformer extends BackboneElement {
  /**
    * Individual who was performing
    */
  var actor: Reference = js.native
  /**
    * Organization organization was acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.native
}

object MedicationAdministrationPerformer {
  @scala.inline
  def apply(actor: Reference): MedicationAdministrationPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministrationPerformer]
  }
  @scala.inline
  implicit class MedicationAdministrationPerformerOps[Self <: MedicationAdministrationPerformer] (val x: Self) extends AnyVal {
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
    def setActor(value: Reference): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = this.set("onBehalfOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOf: Self = this.set("onBehalfOf", js.undefined)
  }
  
}

