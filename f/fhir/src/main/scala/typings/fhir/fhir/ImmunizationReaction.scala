package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a reaction that follows immunization
  */
trait ImmunizationReaction
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'reported'.
    */
  var _reported: js.UndefOr[Element] = js.undefined
  
  /**
    * When reaction started
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Additional information on reaction
    */
  var detail: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates self-reported reaction
    */
  var reported: js.UndefOr[Boolean] = js.undefined
}
object ImmunizationReaction {
  
  @scala.inline
  def apply(): ImmunizationReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationReaction]
  }
  
  @scala.inline
  implicit class ImmunizationReactionMutableBuilder[Self <: ImmunizationReaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDetail(value: Reference): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setReported(value: Boolean): Self = StObject.set(x, "reported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportedUndefined: Self = StObject.set(x, "reported", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_reported(value: Element): Self = StObject.set(x, "_reported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_reportedUndefined: Self = StObject.set(x, "_reported", js.undefined)
  }
}
