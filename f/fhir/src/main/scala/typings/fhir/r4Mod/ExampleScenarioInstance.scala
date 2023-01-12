package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioInstance
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _resourceId: js.UndefOr[Element] = js.undefined
  
  var _resourceType: js.UndefOr[Element] = js.undefined
  
  /**
    * Resources contained in the instance (e.g. the observations contained in a bundle).
    */
  var containedInstance: js.UndefOr[js.Array[ExampleScenarioInstanceContainedInstance]] = js.undefined
  
  /**
    * Human-friendly description of the resource instance.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A short name for the resource instance.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the resource for referencing.
    */
  var resourceId: String
  
  /**
    * The type of the resource.
    */
  var resourceType: String
  
  /**
    * A specific version of the resource.
    */
  var version: js.UndefOr[js.Array[ExampleScenarioInstanceVersion]] = js.undefined
}
object ExampleScenarioInstance {
  
  inline def apply(resourceId: String, resourceType: String): ExampleScenarioInstance = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioInstance] (val x: Self) extends AnyVal {
    
    inline def setContainedInstance(value: js.Array[ExampleScenarioInstanceContainedInstance]): Self = StObject.set(x, "containedInstance", value.asInstanceOf[js.Any])
    
    inline def setContainedInstanceUndefined: Self = StObject.set(x, "containedInstance", js.undefined)
    
    inline def setContainedInstanceVarargs(value: ExampleScenarioInstanceContainedInstance*): Self = StObject.set(x, "containedInstance", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: js.Array[ExampleScenarioInstanceVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: ExampleScenarioInstanceVersion*): Self = StObject.set(x, "version", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_resourceId(value: Element): Self = StObject.set(x, "_resourceId", value.asInstanceOf[js.Any])
    
    inline def set_resourceIdUndefined: Self = StObject.set(x, "_resourceId", js.undefined)
    
    inline def set_resourceType(value: Element): Self = StObject.set(x, "_resourceType", value.asInstanceOf[js.Any])
    
    inline def set_resourceTypeUndefined: Self = StObject.set(x, "_resourceType", js.undefined)
  }
}
