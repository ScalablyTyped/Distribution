package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a reaction that follows immunization
  */
@js.native
trait ImmunizationReaction extends BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'reported'.
    */
  var _reported: js.UndefOr[Element] = js.native
  
  /**
    * When reaction started
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Additional information on reaction
    */
  var detail: js.UndefOr[Reference] = js.native
  
  /**
    * Indicates self-reported reaction
    */
  var reported: js.UndefOr[Boolean] = js.native
}
object ImmunizationReaction {
  
  @scala.inline
  def apply(): ImmunizationReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationReaction]
  }
  
  @scala.inline
  implicit class ImmunizationReactionOps[Self <: ImmunizationReaction] (val x: Self) extends AnyVal {
    
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
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_reported(value: Element): Self = this.set("_reported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_reported: Self = this.set("_reported", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDetail(value: Reference): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setReported(value: Boolean): Self = this.set("reported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReported: Self = this.set("reported", js.undefined)
  }
}
