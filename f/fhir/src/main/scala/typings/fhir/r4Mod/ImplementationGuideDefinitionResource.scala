package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideDefinitionResource
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _exampleBoolean: js.UndefOr[Element] = js.undefined
  
  var _exampleCanonical: js.UndefOr[Element] = js.undefined
  
  var _fhirVersion: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _groupingId: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * This is mostly used with examples to explain why it is present (though they can have extensive comments in the examples).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Examples:
    * * StructureDefinition -> Any
    * * ValueSet -> expansion
    * * OperationDefinition -> Parameters
    * * Questionnaire -> QuestionnaireResponse.
    */
  var exampleBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Examples:
    * * StructureDefinition -> Any
    * * ValueSet -> expansion
    * * OperationDefinition -> Parameters
    * * Questionnaire -> QuestionnaireResponse.
    */
  var exampleCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * The resource SHALL be valid against all the versions it is specified to apply to. If the resource referred to is a StructureDefinition, the fhirVersion stated in the StructureDefinition cannot disagree with the version specified here; the specified versions SHALL include the version specified by the StructureDefinition, and may include additional versions using the [applicable-version](extension-structuredefinition-applicable-version.html) extension.
    */
  var fhirVersion: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This must correspond to a package.id element within this implementation guide.
    */
  var groupingId: js.UndefOr[String] = js.undefined
  
  /**
    * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Usually this is a relative URL that locates the resource within the implementation guide. If you authoring an implementation guide, and will publish it using the FHIR publication tooling, use a URI that may point to a resource, or to one of various alternative representations (e.g. spreadsheet). The tooling will convert this when it publishes it.
    */
  var reference: Reference
}
object ImplementationGuideDefinitionResource {
  
  inline def apply(reference: Reference): ImplementationGuideDefinitionResource = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDefinitionResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuideDefinitionResource] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExampleBoolean(value: Boolean): Self = StObject.set(x, "exampleBoolean", value.asInstanceOf[js.Any])
    
    inline def setExampleBooleanUndefined: Self = StObject.set(x, "exampleBoolean", js.undefined)
    
    inline def setExampleCanonical(value: String): Self = StObject.set(x, "exampleCanonical", value.asInstanceOf[js.Any])
    
    inline def setExampleCanonicalUndefined: Self = StObject.set(x, "exampleCanonical", js.undefined)
    
    inline def setFhirVersion(value: js.Array[String]): Self = StObject.set(x, "fhirVersion", value.asInstanceOf[js.Any])
    
    inline def setFhirVersionUndefined: Self = StObject.set(x, "fhirVersion", js.undefined)
    
    inline def setFhirVersionVarargs(value: String*): Self = StObject.set(x, "fhirVersion", js.Array(value*))
    
    inline def setGroupingId(value: String): Self = StObject.set(x, "groupingId", value.asInstanceOf[js.Any])
    
    inline def setGroupingIdUndefined: Self = StObject.set(x, "groupingId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_exampleBoolean(value: Element): Self = StObject.set(x, "_exampleBoolean", value.asInstanceOf[js.Any])
    
    inline def set_exampleBooleanUndefined: Self = StObject.set(x, "_exampleBoolean", js.undefined)
    
    inline def set_exampleCanonical(value: Element): Self = StObject.set(x, "_exampleCanonical", value.asInstanceOf[js.Any])
    
    inline def set_exampleCanonicalUndefined: Self = StObject.set(x, "_exampleCanonical", js.undefined)
    
    inline def set_fhirVersion(value: js.Array[Element]): Self = StObject.set(x, "_fhirVersion", value.asInstanceOf[js.Any])
    
    inline def set_fhirVersionUndefined: Self = StObject.set(x, "_fhirVersion", js.undefined)
    
    inline def set_fhirVersionVarargs(value: Element*): Self = StObject.set(x, "_fhirVersion", js.Array(value*))
    
    inline def set_groupingId(value: Element): Self = StObject.set(x, "_groupingId", value.asInstanceOf[js.Any])
    
    inline def set_groupingIdUndefined: Self = StObject.set(x, "_groupingId", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
