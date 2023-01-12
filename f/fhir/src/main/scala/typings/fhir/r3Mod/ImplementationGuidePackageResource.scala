package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuidePackageResource
  extends StObject
     with BackboneElement {
  
  var _acronym: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _example: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _sourceUri: js.UndefOr[Element] = js.undefined
  
  /**
    * This is used when generating schematrons from profiles, for example, but has other uses. Publishing tooling may autogenerate this value, but a human assigned value is more useful. This value must be unique within an implementation guide (across included guides as well).
    */
  var acronym: js.UndefOr[String] = js.undefined
  
  /**
    * This is mostly used with examples to explain why it is present (though they can have extensive comments in the examples).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Typically, conformance resources and knowledge resources are directly part of the implementation guide, with their normal meaning, and patient linked resources are usually examples. However this is not always true.
    */
  var example: Boolean
  
  /**
    * Examples:
    * * StructureDefinition -> Any
    * * ValueSet -> expansion
    * * OperationDefinition -> Parameters
    * * Questionnaire -> QuestionnaireResponse.
    */
  var exampleFor: js.UndefOr[Reference] = js.undefined
  
  /**
    * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Usually this is a relative URL that locates the resource within the implementation guide. If you authoring an implementation guide, and will publish it using the FHIR publication tooling, use a URI that may point to a resource, or to one of various alternative representations (e.g. spreadsheet). The tooling will convert this when it publishes it.
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Usually this is a relative URL that locates the resource within the implementation guide. If you authoring an implementation guide, and will publish it using the FHIR publication tooling, use a URI that may point to a resource, or to one of various alternative representations (e.g. spreadsheet). The tooling will convert this when it publishes it.
    */
  var sourceUri: js.UndefOr[String] = js.undefined
}
object ImplementationGuidePackageResource {
  
  inline def apply(example: Boolean): ImplementationGuidePackageResource = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePackageResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuidePackageResource] (val x: Self) extends AnyVal {
    
    inline def setAcronym(value: String): Self = StObject.set(x, "acronym", value.asInstanceOf[js.Any])
    
    inline def setAcronymUndefined: Self = StObject.set(x, "acronym", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExample(value: Boolean): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleFor(value: Reference): Self = StObject.set(x, "exampleFor", value.asInstanceOf[js.Any])
    
    inline def setExampleForUndefined: Self = StObject.set(x, "exampleFor", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    inline def set_acronym(value: Element): Self = StObject.set(x, "_acronym", value.asInstanceOf[js.Any])
    
    inline def set_acronymUndefined: Self = StObject.set(x, "_acronym", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_example(value: Element): Self = StObject.set(x, "_example", value.asInstanceOf[js.Any])
    
    inline def set_exampleUndefined: Self = StObject.set(x, "_example", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_sourceUri(value: Element): Self = StObject.set(x, "_sourceUri", value.asInstanceOf[js.Any])
    
    inline def set_sourceUriUndefined: Self = StObject.set(x, "_sourceUri", js.undefined)
  }
}
