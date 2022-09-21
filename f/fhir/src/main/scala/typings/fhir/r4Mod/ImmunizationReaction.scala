package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationReaction
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _reported: js.UndefOr[Element] = js.undefined
  
  /**
    * Date of reaction to the immunization.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Details of the reaction.
    */
  var detail: js.UndefOr[Reference] = js.undefined
  
  /**
    * Self-reported indicator.
    */
  var reported: js.UndefOr[Boolean] = js.undefined
}
object ImmunizationReaction {
  
  inline def apply(): ImmunizationReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationReaction]
  }
  
  extension [Self <: ImmunizationReaction](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDetail(value: Reference): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setReported(value: Boolean): Self = StObject.set(x, "reported", value.asInstanceOf[js.Any])
    
    inline def setReportedUndefined: Self = StObject.set(x, "reported", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_reported(value: Element): Self = StObject.set(x, "_reported", value.asInstanceOf[js.Any])
    
    inline def set_reportedUndefined: Self = StObject.set(x, "_reported", js.undefined)
  }
}
