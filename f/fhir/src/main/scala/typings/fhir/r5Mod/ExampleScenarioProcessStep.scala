package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioProcessStep
  extends StObject
     with BackboneElement {
  
  var _number: js.UndefOr[Element] = js.undefined
  
  var _pause: js.UndefOr[Element] = js.undefined
  
  var _workflow: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates an alternative step that can be taken instead of the sub-process, scenario or operation.  E.g. to represent non-happy-path/exceptional/atypical circumstances.
    */
  var alternative: js.UndefOr[js.Array[ExampleScenarioProcessStepAlternative]] = js.undefined
  
  /**
    * If step numbers are simultaneous, they will be the same.  Numbers don't have to be numeric.  E.g. '2c)' is a valid step number
    */
  var number: js.UndefOr[String] = js.undefined
  
  /**
    * The step represents a single operation invoked on receiver by sender.
    */
  var operation: js.UndefOr[ExampleScenarioProcessStepOperation] = js.undefined
  
  /**
    * If true, indicates that, following this step, there is a pause in the flow and the subsequent step will occur at some later time (triggered by some event).
    */
  var pause: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that the step is a complex sub-process with its own steps.
    */
  var process: js.UndefOr[ExampleScenarioProcess] = js.undefined
  
  /**
    * Indicates that the step is defined by a seaparate scenario instance.
    */
  var workflow: js.UndefOr[String] = js.undefined
}
object ExampleScenarioProcessStep {
  
  inline def apply(): ExampleScenarioProcessStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExampleScenarioProcessStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioProcessStep] (val x: Self) extends AnyVal {
    
    inline def setAlternative(value: js.Array[ExampleScenarioProcessStepAlternative]): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
    
    inline def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
    
    inline def setAlternativeVarargs(value: ExampleScenarioProcessStepAlternative*): Self = StObject.set(x, "alternative", js.Array(value*))
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOperation(value: ExampleScenarioProcessStepOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setProcess(value: ExampleScenarioProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setWorkflow(value: String): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
    
    inline def setWorkflowUndefined: Self = StObject.set(x, "workflow", js.undefined)
    
    inline def set_number(value: Element): Self = StObject.set(x, "_number", value.asInstanceOf[js.Any])
    
    inline def set_numberUndefined: Self = StObject.set(x, "_number", js.undefined)
    
    inline def set_pause(value: Element): Self = StObject.set(x, "_pause", value.asInstanceOf[js.Any])
    
    inline def set_pauseUndefined: Self = StObject.set(x, "_pause", js.undefined)
    
    inline def set_workflow(value: Element): Self = StObject.set(x, "_workflow", value.asInstanceOf[js.Any])
    
    inline def set_workflowUndefined: Self = StObject.set(x, "_workflow", js.undefined)
  }
}
