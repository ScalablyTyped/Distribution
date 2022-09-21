package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionGoal
  extends StObject
     with BackboneElement {
  
  /**
    * Identifies problems, conditions, issues, or concerns the goal is intended to address.
    */
  var addresses: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates a category the goal falls within.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If no code is available, use CodeableConcept.text.
    */
  var description: CodeableConcept
  
  /**
    * Didactic or other informational resources associated with the goal that provide further supporting information about the goal. Information resources can include inline text commentary and links to web resources.
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * Identifies the expected level of importance associated with reaching/sustaining the defined goal.
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The event after which the goal should begin being pursued.
    */
  var start: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates what should be done and within what timeframe.
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
    
    inline def setAddressesVarargs(value: CodeableConcept*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: CodeableConcept): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "documentation", js.Array(value*))
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStart(value: CodeableConcept): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTarget(value: js.Array[PlanDefinitionGoalTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: PlanDefinitionGoalTarget*): Self = StObject.set(x, "target", js.Array(value*))
  }
}
