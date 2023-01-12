package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioInstanceContainedInstance
  extends StObject
     with BackboneElement {
  
  var _resourceId: js.UndefOr[Element] = js.undefined
  
  var _versionId: js.UndefOr[Element] = js.undefined
  
  /**
    * Each resource contained in the instance.
    */
  var resourceId: String
  
  /**
    * A specific version of a resource contained in the instance.
    */
  var versionId: js.UndefOr[String] = js.undefined
}
object ExampleScenarioInstanceContainedInstance {
  
  inline def apply(resourceId: String): ExampleScenarioInstanceContainedInstance = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioInstanceContainedInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioInstanceContainedInstance] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    
    inline def set_resourceId(value: Element): Self = StObject.set(x, "_resourceId", value.asInstanceOf[js.Any])
    
    inline def set_resourceIdUndefined: Self = StObject.set(x, "_resourceId", js.undefined)
    
    inline def set_versionId(value: Element): Self = StObject.set(x, "_versionId", value.asInstanceOf[js.Any])
    
    inline def set_versionIdUndefined: Self = StObject.set(x, "_versionId", js.undefined)
  }
}
