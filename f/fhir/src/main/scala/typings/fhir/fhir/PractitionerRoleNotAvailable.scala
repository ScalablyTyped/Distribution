package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Not available during this time due to provided reason
  */
@js.native
trait PractitionerRoleNotAvailable extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Reason presented to the user explaining why time not available
    */
  var description: String = js.native
  
  /**
    * Service not availablefrom this date
    */
  var during: js.UndefOr[Period] = js.native
}
object PractitionerRoleNotAvailable {
  
  @scala.inline
  def apply(description: String): PractitionerRoleNotAvailable = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PractitionerRoleNotAvailable]
  }
  
  @scala.inline
  implicit class PractitionerRoleNotAvailableOps[Self <: PractitionerRoleNotAvailable] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def setDuring(value: Period): Self = this.set("during", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuring: Self = this.set("during", js.undefined)
  }
}
