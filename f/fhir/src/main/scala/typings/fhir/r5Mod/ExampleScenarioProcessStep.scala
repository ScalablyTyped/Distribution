package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioProcessStep
  extends StObject
     with BackboneElement {
  
  var _pause: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates an alternative step that can be taken instead of the operations on the base step in exceptional/atypical circumstances.
    */
  var alternative: js.UndefOr[js.Array[ExampleScenarioProcessStepAlternative]] = js.undefined
  
  /**
    * Each interaction or action.
    */
  var operation: js.UndefOr[ExampleScenarioProcessStepOperation] = js.undefined
  
  /**
    * If there is a pause in the flow.
    */
  var pause: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Nested process.
    */
  var process: js.UndefOr[js.Array[ExampleScenarioProcess]] = js.undefined
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
    
    inline def setOperation(value: ExampleScenarioProcessStepOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setProcess(value: js.Array[ExampleScenarioProcess]): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setProcessVarargs(value: ExampleScenarioProcess*): Self = StObject.set(x, "process", js.Array(value*))
    
    inline def set_pause(value: Element): Self = StObject.set(x, "_pause", value.asInstanceOf[js.Any])
    
    inline def set_pauseUndefined: Self = StObject.set(x, "_pause", js.undefined)
  }
}
