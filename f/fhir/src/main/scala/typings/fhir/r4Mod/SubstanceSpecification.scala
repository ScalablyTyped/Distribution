package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSpecification
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Codes associated with the substance.
    */
  var code: js.UndefOr[js.Array[SubstanceSpecificationCode]] = js.undefined
  
  /**
    * Textual comment about this record of a substance.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Textual description of the substance.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If the substance applies to only human or veterinary use.
    */
  var domain: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifier by which this substance is known.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Moiety, for structural modifications.
    */
  var moiety: js.UndefOr[js.Array[SubstanceSpecificationMoiety]] = js.undefined
  
  /**
    * The molecular weight or weight range (for proteins, polymers or nucleic acids).
    */
  var molecularWeight: js.UndefOr[js.Array[SubstanceSpecificationStructureIsotopeMolecularWeight]] = js.undefined
  
  /**
    * Names applicable to this substance.
    */
  var name: js.UndefOr[js.Array[SubstanceSpecificationName]] = js.undefined
  
  /**
    * Data items specific to nucleic acids.
    */
  var nucleicAcid: js.UndefOr[Reference] = js.undefined
  
  /**
    * Data items specific to polymers.
    */
  var polymer: js.UndefOr[Reference] = js.undefined
  
  /**
    * General specifications for this substance, including how it is related to other substances.
    */
  var property: js.UndefOr[js.Array[SubstanceSpecificationProperty]] = js.undefined
  
  /**
    * Data items specific to proteins.
    */
  var protein: js.UndefOr[Reference] = js.undefined
  
  /**
    * General information detailing this substance.
    */
  var referenceInformation: js.UndefOr[Reference] = js.undefined
  
  /**
    * A link between this substance and another, with details of the relationship.
    */
  var relationship: js.UndefOr[js.Array[SubstanceSpecificationRelationship]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SubstanceSpecification: typings.fhir.fhirStrings.SubstanceSpecification
  
  /**
    * Supporting literature.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Material or taxonomic/anatomical source for the substance.
    */
  var sourceMaterial: js.UndefOr[Reference] = js.undefined
  
  /**
    * Status of substance within the catalogue e.g. approved.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Structural information.
    */
  var structure: js.UndefOr[SubstanceSpecificationStructure] = js.undefined
  
  /**
    * High level categorization, e.g. polymer or nucleic acid.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSpecification {
  
  inline def apply(): SubstanceSpecification = {
    val __obj = js.Dynamic.literal(resourceType = "SubstanceSpecification")
    __obj.asInstanceOf[SubstanceSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSpecification] (val x: Self) extends AnyVal {
    
    inline def setCode(value: js.Array[SubstanceSpecificationCode]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: SubstanceSpecificationCode*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: CodeableConcept): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMoiety(value: js.Array[SubstanceSpecificationMoiety]): Self = StObject.set(x, "moiety", value.asInstanceOf[js.Any])
    
    inline def setMoietyUndefined: Self = StObject.set(x, "moiety", js.undefined)
    
    inline def setMoietyVarargs(value: SubstanceSpecificationMoiety*): Self = StObject.set(x, "moiety", js.Array(value*))
    
    inline def setMolecularWeight(value: js.Array[SubstanceSpecificationStructureIsotopeMolecularWeight]): Self = StObject.set(x, "molecularWeight", value.asInstanceOf[js.Any])
    
    inline def setMolecularWeightUndefined: Self = StObject.set(x, "molecularWeight", js.undefined)
    
    inline def setMolecularWeightVarargs(value: SubstanceSpecificationStructureIsotopeMolecularWeight*): Self = StObject.set(x, "molecularWeight", js.Array(value*))
    
    inline def setName(value: js.Array[SubstanceSpecificationName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: SubstanceSpecificationName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNucleicAcid(value: Reference): Self = StObject.set(x, "nucleicAcid", value.asInstanceOf[js.Any])
    
    inline def setNucleicAcidUndefined: Self = StObject.set(x, "nucleicAcid", js.undefined)
    
    inline def setPolymer(value: Reference): Self = StObject.set(x, "polymer", value.asInstanceOf[js.Any])
    
    inline def setPolymerUndefined: Self = StObject.set(x, "polymer", js.undefined)
    
    inline def setProperty(value: js.Array[SubstanceSpecificationProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: SubstanceSpecificationProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setProtein(value: Reference): Self = StObject.set(x, "protein", value.asInstanceOf[js.Any])
    
    inline def setProteinUndefined: Self = StObject.set(x, "protein", js.undefined)
    
    inline def setReferenceInformation(value: Reference): Self = StObject.set(x, "referenceInformation", value.asInstanceOf[js.Any])
    
    inline def setReferenceInformationUndefined: Self = StObject.set(x, "referenceInformation", js.undefined)
    
    inline def setRelationship(value: js.Array[SubstanceSpecificationRelationship]): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setRelationshipVarargs(value: SubstanceSpecificationRelationship*): Self = StObject.set(x, "relationship", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SubstanceSpecification): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceMaterial(value: Reference): Self = StObject.set(x, "sourceMaterial", value.asInstanceOf[js.Any])
    
    inline def setSourceMaterialUndefined: Self = StObject.set(x, "sourceMaterial", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStructure(value: SubstanceSpecificationStructure): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
