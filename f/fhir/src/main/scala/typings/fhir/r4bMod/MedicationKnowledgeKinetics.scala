package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeKinetics
  extends StObject
     with BackboneElement {
  
  /**
    * The drug concentration measured at certain discrete points in time.
    */
  var areaUnderCurve: js.UndefOr[js.Array[Quantity]] = js.undefined
  
  /**
    * The time required for any specified property (e.g., the concentration of a substance in the body) to decrease by half.
    */
  var halfLifePeriod: js.UndefOr[Duration] = js.undefined
  
  /**
    * The median lethal dose of a drug.
    */
  var lethalDose50: js.UndefOr[js.Array[Quantity]] = js.undefined
}
object MedicationKnowledgeKinetics {
  
  inline def apply(): MedicationKnowledgeKinetics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeKinetics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeKinetics] (val x: Self) extends AnyVal {
    
    inline def setAreaUnderCurve(value: js.Array[Quantity]): Self = StObject.set(x, "areaUnderCurve", value.asInstanceOf[js.Any])
    
    inline def setAreaUnderCurveUndefined: Self = StObject.set(x, "areaUnderCurve", js.undefined)
    
    inline def setAreaUnderCurveVarargs(value: Quantity*): Self = StObject.set(x, "areaUnderCurve", js.Array(value*))
    
    inline def setHalfLifePeriod(value: Duration): Self = StObject.set(x, "halfLifePeriod", value.asInstanceOf[js.Any])
    
    inline def setHalfLifePeriodUndefined: Self = StObject.set(x, "halfLifePeriod", js.undefined)
    
    inline def setLethalDose50(value: js.Array[Quantity]): Self = StObject.set(x, "lethalDose50", value.asInstanceOf[js.Any])
    
    inline def setLethalDose50Undefined: Self = StObject.set(x, "lethalDose50", js.undefined)
    
    inline def setLethalDose50Varargs(value: Quantity*): Self = StObject.set(x, "lethalDose50", js.Array(value*))
  }
}
