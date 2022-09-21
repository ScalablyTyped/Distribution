package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioProcess
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _postConditions: js.UndefOr[Element] = js.undefined
  
  var _preConditions: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * A longer description of the group of operations.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Description of final status after the process ends.
    */
  var postConditions: js.UndefOr[String] = js.undefined
  
  /**
    * Description of initial status before the process starts.
    */
  var preConditions: js.UndefOr[String] = js.undefined
  
  /**
    * Each step of the process.
    */
  var step: js.UndefOr[js.Array[ExampleScenarioProcessStep]] = js.undefined
  
  /**
    * The diagram title of the group of operations.
    */
  var title: String
}
object ExampleScenarioProcess {
  
  inline def apply(title: String): ExampleScenarioProcess = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioProcess]
  }
  
  extension [Self <: ExampleScenarioProcess](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPostConditions(value: String): Self = StObject.set(x, "postConditions", value.asInstanceOf[js.Any])
    
    inline def setPostConditionsUndefined: Self = StObject.set(x, "postConditions", js.undefined)
    
    inline def setPreConditions(value: String): Self = StObject.set(x, "preConditions", value.asInstanceOf[js.Any])
    
    inline def setPreConditionsUndefined: Self = StObject.set(x, "preConditions", js.undefined)
    
    inline def setStep(value: js.Array[ExampleScenarioProcessStep]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStepVarargs(value: ExampleScenarioProcessStep*): Self = StObject.set(x, "step", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_postConditions(value: Element): Self = StObject.set(x, "_postConditions", value.asInstanceOf[js.Any])
    
    inline def set_postConditionsUndefined: Self = StObject.set(x, "_postConditions", js.undefined)
    
    inline def set_preConditions(value: Element): Self = StObject.set(x, "_preConditions", value.asInstanceOf[js.Any])
    
    inline def set_preConditionsUndefined: Self = StObject.set(x, "_preConditions", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
