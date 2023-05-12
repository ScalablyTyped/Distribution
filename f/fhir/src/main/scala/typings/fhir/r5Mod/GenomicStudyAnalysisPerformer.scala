package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenomicStudyAnalysisPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * The organization, healthcare professional, or others who participated in performing this analysis.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * Role of the actor for this analysis.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object GenomicStudyAnalysisPerformer {
  
  inline def apply(): GenomicStudyAnalysisPerformer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenomicStudyAnalysisPerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenomicStudyAnalysisPerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
