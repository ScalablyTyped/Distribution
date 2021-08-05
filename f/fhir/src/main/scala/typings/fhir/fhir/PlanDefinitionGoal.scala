package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What the plan is trying to accomplish
  */
trait PlanDefinitionGoal
  extends StObject
     with BackboneElement {
  
  /**
    * What does the goal address
    */
  var addresses: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * E.g. Treatment, dietary, behavioral, etc
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Code or text describing the goal
    */
  var description: CodeableConcept
  
  /**
    * Supporting documentation for the goal
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * high-priority | medium-priority | low-priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When goal pursuit begins
    */
  var start: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Target outcome for the goal
    */
  var target: js.UndefOr[js.Array[PlanDefinitionGoalTarget]] = js.undefined
}
object PlanDefinitionGoal {
  
  inline def apply(description: CodeableConcept): PlanDefinitionGoal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionGoal]
  }
  
  extension [Self <: PlanDefinitionGoal](x: Self) {
    
    inline def setAddresses(value: js.Array[CodeableConcept]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: CodeableConcept*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: CodeableConcept): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStart(value: CodeableConcept): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTarget(value: js.Array[PlanDefinitionGoalTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: PlanDefinitionGoalTarget*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
