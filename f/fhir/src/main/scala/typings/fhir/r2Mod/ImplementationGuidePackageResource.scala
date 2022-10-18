package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`extension`
import typings.fhir.fhirStrings.dictionary
import typings.fhir.fhirStrings.example
import typings.fhir.fhirStrings.logical
import typings.fhir.fhirStrings.profile
import typings.fhir.fhirStrings.terminology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuidePackageResource
  extends StObject
     with BackboneElement {
  
  var _acronym: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _sourceUri: js.UndefOr[Element] = js.undefined
  
  /**
    * A short code that may be used to identify the resource throughout the implementation guide.
    */
  var acronym: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the reason that a resource has been included in the implementation guide.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.
    */
  var exampleFor: js.UndefOr[Reference] = js.undefined
  
  /**
    * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This element is provided so that implementation guide tooling does not have to guess the purpose of including a resource in the implementation guide based on the type or context.
    */
  var purpose: example | terminology | profile | `extension` | dictionary | logical
  
  /**
    * Where this resource is found.
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Where this resource is found.
    */
  var sourceUri: js.UndefOr[String] = js.undefined
}
object ImplementationGuidePackageResource {
  
  inline def apply(purpose: example | terminology | profile | `extension` | dictionary | logical): ImplementationGuidePackageResource = {
    val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePackageResource]
  }
  
  extension [Self <: ImplementationGuidePackageResource](x: Self) {
    
    inline def setAcronym(value: String): Self = StObject.set(x, "acronym", value.asInstanceOf[js.Any])
    
    inline def setAcronymUndefined: Self = StObject.set(x, "acronym", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExampleFor(value: Reference): Self = StObject.set(x, "exampleFor", value.asInstanceOf[js.Any])
    
    inline def setExampleForUndefined: Self = StObject.set(x, "exampleFor", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPurpose(value: example | terminology | profile | `extension` | dictionary | logical): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    inline def set_acronym(value: Element): Self = StObject.set(x, "_acronym", value.asInstanceOf[js.Any])
    
    inline def set_acronymUndefined: Self = StObject.set(x, "_acronym", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_sourceUri(value: Element): Self = StObject.set(x, "_sourceUri", value.asInstanceOf[js.Any])
    
    inline def set_sourceUriUndefined: Self = StObject.set(x, "_sourceUri", js.undefined)
  }
}
