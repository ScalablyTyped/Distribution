package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioInstanceContainedInstance
  extends StObject
     with BackboneElement {
  
  var _instanceReference: js.UndefOr[Element] = js.undefined
  
  var _versionReference: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to the key of an instance found within this one.
    */
  var instanceReference: String
  
  /**
    * Required if the referenced instance has versions
    */
  var versionReference: js.UndefOr[String] = js.undefined
}
object ExampleScenarioInstanceContainedInstance {
  
  inline def apply(instanceReference: String): ExampleScenarioInstanceContainedInstance = {
    val __obj = js.Dynamic.literal(instanceReference = instanceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioInstanceContainedInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioInstanceContainedInstance] (val x: Self) extends AnyVal {
    
    inline def setInstanceReference(value: String): Self = StObject.set(x, "instanceReference", value.asInstanceOf[js.Any])
    
    inline def setVersionReference(value: String): Self = StObject.set(x, "versionReference", value.asInstanceOf[js.Any])
    
    inline def setVersionReferenceUndefined: Self = StObject.set(x, "versionReference", js.undefined)
    
    inline def set_instanceReference(value: Element): Self = StObject.set(x, "_instanceReference", value.asInstanceOf[js.Any])
    
    inline def set_instanceReferenceUndefined: Self = StObject.set(x, "_instanceReference", js.undefined)
    
    inline def set_versionReference(value: Element): Self = StObject.set(x, "_versionReference", value.asInstanceOf[js.Any])
    
    inline def set_versionReferenceUndefined: Self = StObject.set(x, "_versionReference", js.undefined)
  }
}
