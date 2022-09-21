package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioInstanceVersion
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _versionId: js.UndefOr[Element] = js.undefined
  
  /**
    * The description of the resource version.
    */
  var description: String
  
  /**
    * The identifier of a specific version of a resource.
    */
  var versionId: String
}
object ExampleScenarioInstanceVersion {
  
  inline def apply(description: String, versionId: String): ExampleScenarioInstanceVersion = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioInstanceVersion]
  }
  
  extension [Self <: ExampleScenarioInstanceVersion](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_versionId(value: Element): Self = StObject.set(x, "_versionId", value.asInstanceOf[js.Any])
    
    inline def set_versionIdUndefined: Self = StObject.set(x, "_versionId", js.undefined)
  }
}
