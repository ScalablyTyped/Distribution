package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What the plan is trying to accomplish
  */
@js.native
trait PlanDefinitionGoal extends BackboneElement {
  
  /**
    * What does the goal address
    */
  var addresses: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * E.g. Treatment, dietary, behavioral, etc
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Code or text describing the goal
    */
  var description: CodeableConcept = js.native
  
  /**
    * Supporting documentation for the goal
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  
  /**
    * high-priority | medium-priority | low-priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * When goal pursuit begins
    */
  var start: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Target outcome for the goal
    */
  var target: js.UndefOr[js.Array[PlanDefinitionGoalTarget]] = js.native
}
object PlanDefinitionGoal {
  
  @scala.inline
  def apply(description: CodeableConcept): PlanDefinitionGoal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionGoal]
  }
  
  @scala.inline
  implicit class PlanDefinitionGoalMutableBuilder[Self <: PlanDefinitionGoal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[CodeableConcept]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: CodeableConcept*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDescription(value: CodeableConcept): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setStart(value: CodeableConcept): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Array[PlanDefinitionGoalTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: PlanDefinitionGoalTarget*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
