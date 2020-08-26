package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device changed in procedure
  */
@js.native
trait ProcedureFocalDevice extends BackboneElement {
  /**
    * Kind of change to device
    */
  var action: js.UndefOr[CodeableConcept] = js.native
  /**
    * Device that was changed
    */
  var manipulated: Reference = js.native
}

object ProcedureFocalDevice {
  @scala.inline
  def apply(manipulated: Reference): ProcedureFocalDevice = {
    val __obj = js.Dynamic.literal(manipulated = manipulated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureFocalDevice]
  }
  @scala.inline
  implicit class ProcedureFocalDeviceOps[Self <: ProcedureFocalDevice] (val x: Self) extends AnyVal {
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
    def setManipulated(value: Reference): Self = this.set("manipulated", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: CodeableConcept): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
  }
  
}

