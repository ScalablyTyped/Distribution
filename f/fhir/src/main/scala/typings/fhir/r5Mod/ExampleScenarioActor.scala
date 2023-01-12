package typings.fhir.r5Mod

import typings.fhir.fhirStrings.entity
import typings.fhir.fhirStrings.person_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioActor
  extends StObject
     with BackboneElement {
  
  var _actorId: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * should this be called ID or acronym?
    */
  var actorId: String
  
  /**
    * Cardinality: is name and description 1..1?
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Cardinality: is name and description 1..1?
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of actor - person or system.
    */
  var `type`: person_ | entity
}
object ExampleScenarioActor {
  
  inline def apply(actorId: String, `type`: person_ | entity): ExampleScenarioActor = {
    val __obj = js.Dynamic.literal(actorId = actorId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioActor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioActor] (val x: Self) extends AnyVal {
    
    inline def setActorId(value: String): Self = StObject.set(x, "actorId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: person_ | entity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_actorId(value: Element): Self = StObject.set(x, "_actorId", value.asInstanceOf[js.Any])
    
    inline def set_actorIdUndefined: Self = StObject.set(x, "_actorId", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
