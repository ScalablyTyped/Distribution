package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioInstanceVersion
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _key: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * If not conveying FHIR data or not using the same version of FHIR as this ExampleScenario instance, the reference must be to a Binary.
    */
  var content: js.UndefOr[Reference] = js.undefined
  
  /**
    * An explanation of what this specific version of the instance contains and represents.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A unique string within the instance that is used to reference the version of the instance.
    */
  var key: String
  
  /**
    * A short descriptive label the version to be used in tables or diagrams.
    */
  var title: String
}
object ExampleScenarioInstanceVersion {
  
  inline def apply(key: String, title: String): ExampleScenarioInstanceVersion = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioInstanceVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioInstanceVersion] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Reference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_key(value: Element): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    inline def set_keyUndefined: Self = StObject.set(x, "_key", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
