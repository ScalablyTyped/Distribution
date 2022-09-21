package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionActor
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * A description of how the actor fits into the overall actions of the plan definition.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The characteristics of the candidates that could serve as the actor.
    */
  var option: js.Array[PlanDefinitionActorOption]
  
  /**
    * A descriptive label for the actor.
    */
  var title: js.UndefOr[String] = js.undefined
}
object PlanDefinitionActor {
  
  inline def apply(option: js.Array[PlanDefinitionActorOption]): PlanDefinitionActor = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionActor]
  }
  
  extension [Self <: PlanDefinitionActor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOption(value: js.Array[PlanDefinitionActorOption]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionVarargs(value: PlanDefinitionActorOption*): Self = StObject.set(x, "option", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
