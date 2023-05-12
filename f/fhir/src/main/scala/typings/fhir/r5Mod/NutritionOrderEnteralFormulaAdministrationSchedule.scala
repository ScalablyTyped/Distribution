package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderEnteralFormulaAdministrationSchedule
  extends StObject
     with BackboneElement {
  
  var _asNeeded: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates whether the enteral formula is only taken when needed within a specific dosing schedule.
    */
  var asNeeded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the enteral formula is only taken based on a precondition for taking the enteral formula.
    */
  var asNeededFor: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The time period and frequency at which the enteral formula should be given.  The enteral formula should be given for the combination of all schedules if more than one schedule is present.
    */
  var timing: js.UndefOr[js.Array[Timing]] = js.undefined
}
object NutritionOrderEnteralFormulaAdministrationSchedule {
  
  inline def apply(): NutritionOrderEnteralFormulaAdministrationSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormulaAdministrationSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrderEnteralFormulaAdministrationSchedule] (val x: Self) extends AnyVal {
    
    inline def setAsNeeded(value: Boolean): Self = StObject.set(x, "asNeeded", value.asInstanceOf[js.Any])
    
    inline def setAsNeededFor(value: CodeableConcept): Self = StObject.set(x, "asNeededFor", value.asInstanceOf[js.Any])
    
    inline def setAsNeededForUndefined: Self = StObject.set(x, "asNeededFor", js.undefined)
    
    inline def setAsNeededUndefined: Self = StObject.set(x, "asNeeded", js.undefined)
    
    inline def setTiming(value: js.Array[Timing]): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    inline def setTimingVarargs(value: Timing*): Self = StObject.set(x, "timing", js.Array(value*))
    
    inline def set_asNeeded(value: Element): Self = StObject.set(x, "_asNeeded", value.asInstanceOf[js.Any])
    
    inline def set_asNeededUndefined: Self = StObject.set(x, "_asNeeded", js.undefined)
  }
}
