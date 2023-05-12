package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioProcessStepAlternative
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * A human-readable description of the alternative explaining when the alternative should occur rather than the base step.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the operation, sub-process or scenario that happens if the alternative option is selected.
    */
  var step: js.UndefOr[js.Array[ExampleScenarioProcessStep]] = js.undefined
  
  /**
    * The label to display for the alternative that gives a sense of the circumstance in which the alternative should be invoked.
    */
  var title: String
}
object ExampleScenarioProcessStepAlternative {
  
  inline def apply(title: String): ExampleScenarioProcessStepAlternative = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioProcessStepAlternative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioProcessStepAlternative] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStep(value: js.Array[ExampleScenarioProcessStep]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStepVarargs(value: ExampleScenarioProcessStep*): Self = StObject.set(x, "step", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
