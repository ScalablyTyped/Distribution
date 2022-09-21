package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workflow extends StObject {
  
  /**
    * The workflowStepId of the current step.This is not an index into the workflowSteps array in this object.See the workflowStep object.
    */
  var currentWorkflowStepId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the workflow:
    * - `paused` if the workflow is paused
    * - `in_progress` if the workflow is in progress
    */
  var workflowStatus: js.UndefOr[String] = js.undefined
  
  /**
    * An array of workflow steps.
    */
  var workflowSteps: js.UndefOr[js.Array[WorkflowStep]] = js.undefined
}
object Workflow {
  
  inline def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  
  extension [Self <: Workflow](x: Self) {
    
    inline def setCurrentWorkflowStepId(value: String): Self = StObject.set(x, "currentWorkflowStepId", value.asInstanceOf[js.Any])
    
    inline def setCurrentWorkflowStepIdUndefined: Self = StObject.set(x, "currentWorkflowStepId", js.undefined)
    
    inline def setWorkflowStatus(value: String): Self = StObject.set(x, "workflowStatus", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStatusUndefined: Self = StObject.set(x, "workflowStatus", js.undefined)
    
    inline def setWorkflowSteps(value: js.Array[WorkflowStep]): Self = StObject.set(x, "workflowSteps", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepsUndefined: Self = StObject.set(x, "workflowSteps", js.undefined)
    
    inline def setWorkflowStepsVarargs(value: WorkflowStep*): Self = StObject.set(x, "workflowSteps", js.Array(value*))
  }
}
