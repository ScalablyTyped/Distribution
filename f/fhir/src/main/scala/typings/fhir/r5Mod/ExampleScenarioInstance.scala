package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioInstance
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _key: js.UndefOr[Element] = js.undefined
  
  var _structureProfileCanonical: js.UndefOr[Element] = js.undefined
  
  var _structureProfileUri: js.UndefOr[Element] = js.undefined
  
  var _structureVersion: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * References to other instances that can be found within this instance (e.g. the observations contained in a bundle).
    */
  var containedInstance: js.UndefOr[js.Array[ExampleScenarioInstanceContainedInstance]] = js.undefined
  
  /**
    * If not conveying FHIR data or not using the same version of FHIR as this ExampleScenario instance, the reference must be to a Binary.
    */
  var content: js.UndefOr[Reference] = js.undefined
  
  /**
    * An explanation of what the instance contains and what it's for.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A unique string within the scenario that is used to reference the instance.
    */
  var key: String
  
  /**
    * Refers to a profile, template or other ruleset the instance adheres to.
    */
  var structureProfileCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Refers to a profile, template or other ruleset the instance adheres to.
    */
  var structureProfileUri: js.UndefOr[String] = js.undefined
  
  /**
    * A code indicating the kind of data structure (FHIR resource or some other standard) this is an instance of.
    */
  var structureType: Coding
  
  /**
    * Conveys the version of the data structure instantiated.  I.e. what release of FHIR, X12, OpenEHR, etc. is instance compliant with.
    */
  var structureVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A short descriptive label the instance to be used in tables or diagrams.
    */
  var title: String
  
  /**
    * Not used if an instance doesn't change
    */
  var version: js.UndefOr[js.Array[ExampleScenarioInstanceVersion]] = js.undefined
}
object ExampleScenarioInstance {
  
  inline def apply(key: String, structureType: Coding, title: String): ExampleScenarioInstance = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioInstance] (val x: Self) extends AnyVal {
    
    inline def setContainedInstance(value: js.Array[ExampleScenarioInstanceContainedInstance]): Self = StObject.set(x, "containedInstance", value.asInstanceOf[js.Any])
    
    inline def setContainedInstanceUndefined: Self = StObject.set(x, "containedInstance", js.undefined)
    
    inline def setContainedInstanceVarargs(value: ExampleScenarioInstanceContainedInstance*): Self = StObject.set(x, "containedInstance", js.Array(value*))
    
    inline def setContent(value: Reference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setStructureProfileCanonical(value: String): Self = StObject.set(x, "structureProfileCanonical", value.asInstanceOf[js.Any])
    
    inline def setStructureProfileCanonicalUndefined: Self = StObject.set(x, "structureProfileCanonical", js.undefined)
    
    inline def setStructureProfileUri(value: String): Self = StObject.set(x, "structureProfileUri", value.asInstanceOf[js.Any])
    
    inline def setStructureProfileUriUndefined: Self = StObject.set(x, "structureProfileUri", js.undefined)
    
    inline def setStructureType(value: Coding): Self = StObject.set(x, "structureType", value.asInstanceOf[js.Any])
    
    inline def setStructureVersion(value: String): Self = StObject.set(x, "structureVersion", value.asInstanceOf[js.Any])
    
    inline def setStructureVersionUndefined: Self = StObject.set(x, "structureVersion", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: js.Array[ExampleScenarioInstanceVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: ExampleScenarioInstanceVersion*): Self = StObject.set(x, "version", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_key(value: Element): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    inline def set_keyUndefined: Self = StObject.set(x, "_key", js.undefined)
    
    inline def set_structureProfileCanonical(value: Element): Self = StObject.set(x, "_structureProfileCanonical", value.asInstanceOf[js.Any])
    
    inline def set_structureProfileCanonicalUndefined: Self = StObject.set(x, "_structureProfileCanonical", js.undefined)
    
    inline def set_structureProfileUri(value: Element): Self = StObject.set(x, "_structureProfileUri", value.asInstanceOf[js.Any])
    
    inline def set_structureProfileUriUndefined: Self = StObject.set(x, "_structureProfileUri", js.undefined)
    
    inline def set_structureVersion(value: Element): Self = StObject.set(x, "_structureVersion", value.asInstanceOf[js.Any])
    
    inline def set_structureVersionUndefined: Self = StObject.set(x, "_structureVersion", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
