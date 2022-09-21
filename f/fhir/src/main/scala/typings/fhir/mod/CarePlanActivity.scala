package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarePlanActivity
  extends StObject
     with BackboneElement {
  
  /**
    * Links plan to resulting actions.
    */
  var actionResulting: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Details in a simple form for generic care plan systems.
    */
  var detail: js.UndefOr[CarePlanActivityDetail] = js.undefined
  
  /**
    * Can be used to capture information about adherence, progress, concerns, etc.
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Details in a form consistent with other applications and contexts of use.
    */
  var reference: js.UndefOr[Reference] = js.undefined
}
object CarePlanActivity {
  
  inline def apply(): CarePlanActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarePlanActivity]
  }
  
  extension [Self <: CarePlanActivity](x: Self) {
    
    inline def setActionResulting(value: js.Array[Reference]): Self = StObject.set(x, "actionResulting", value.asInstanceOf[js.Any])
    
    inline def setActionResultingUndefined: Self = StObject.set(x, "actionResulting", js.undefined)
    
    inline def setActionResultingVarargs(value: Reference*): Self = StObject.set(x, "actionResulting", js.Array(value*))
    
    inline def setDetail(value: CarePlanActivityDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setProgress(value: js.Array[Annotation]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: Annotation*): Self = StObject.set(x, "progress", js.Array(value*))
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
