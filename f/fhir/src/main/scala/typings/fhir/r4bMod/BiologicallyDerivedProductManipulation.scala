package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiologicallyDerivedProductManipulation
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _timeDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Description of manipulation.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Time of manipulation.
    */
  var timeDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Time of manipulation.
    */
  var timePeriod: js.UndefOr[Period] = js.undefined
}
object BiologicallyDerivedProductManipulation {
  
  inline def apply(): BiologicallyDerivedProductManipulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiologicallyDerivedProductManipulation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiologicallyDerivedProductManipulation] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTimeDateTime(value: String): Self = StObject.set(x, "timeDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimeDateTimeUndefined: Self = StObject.set(x, "timeDateTime", js.undefined)
    
    inline def setTimePeriod(value: Period): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_timeDateTime(value: Element): Self = StObject.set(x, "_timeDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timeDateTimeUndefined: Self = StObject.set(x, "_timeDateTime", js.undefined)
  }
}
