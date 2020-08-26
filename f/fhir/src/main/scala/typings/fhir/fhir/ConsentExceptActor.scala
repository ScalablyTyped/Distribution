package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who|what controlled by this exception (or group, by role)
  */
@js.native
trait ConsentExceptActor extends BackboneElement {
  /**
    * Resource for the actor (or group, by role)
    */
  var reference: Reference = js.native
  /**
    * How the actor is involved
    */
  var role: CodeableConcept = js.native
}

object ConsentExceptActor {
  @scala.inline
  def apply(reference: Reference, role: CodeableConcept): ConsentExceptActor = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExceptActor]
  }
  @scala.inline
  implicit class ConsentExceptActorOps[Self <: ConsentExceptActor] (val x: Self) extends AnyVal {
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
    def setReference(value: Reference): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: CodeableConcept): Self = this.set("role", value.asInstanceOf[js.Any])
  }
  
}

