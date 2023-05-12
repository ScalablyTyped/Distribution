package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductAuthorizationProcedure
  extends StObject
     with BackboneElement {
  
  var _dateDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Applcations submitted to obtain a marketing authorization.
    */
  var application: js.UndefOr[js.Array[MedicinalProductAuthorizationProcedure]] = js.undefined
  
  /**
    * Date of procedure.
    */
  var dateDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Date of procedure.
    */
  var datePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Identifier for this procedure.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Type of procedure.
    */
  var `type`: CodeableConcept
}
object MedicinalProductAuthorizationProcedure {
  
  inline def apply(`type`: CodeableConcept): MedicinalProductAuthorizationProcedure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductAuthorizationProcedure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductAuthorizationProcedure] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: js.Array[MedicinalProductAuthorizationProcedure]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setApplicationVarargs(value: MedicinalProductAuthorizationProcedure*): Self = StObject.set(x, "application", js.Array(value*))
    
    inline def setDateDateTime(value: String): Self = StObject.set(x, "dateDateTime", value.asInstanceOf[js.Any])
    
    inline def setDateDateTimeUndefined: Self = StObject.set(x, "dateDateTime", js.undefined)
    
    inline def setDatePeriod(value: Period): Self = StObject.set(x, "datePeriod", value.asInstanceOf[js.Any])
    
    inline def setDatePeriodUndefined: Self = StObject.set(x, "datePeriod", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_dateDateTime(value: Element): Self = StObject.set(x, "_dateDateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateDateTimeUndefined: Self = StObject.set(x, "_dateDateTime", js.undefined)
  }
}
