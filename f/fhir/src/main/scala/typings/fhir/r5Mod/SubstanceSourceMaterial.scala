package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSourceMaterial
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _geographicalLocation: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _organismName: js.UndefOr[Element] = js.undefined
  
  var _parentSubstanceName: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * The country where the plant material is harvested or the countries where the plasma is sourced from as laid down in accordance with the Plasma Master File. For “Plasma-derived substances” the attribute country of origin provides information about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.
    */
  var countryOfOrigin: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Stage of life for animals, plants, insects and microorganisms. This information shall be provided only when the substance is significantly different in these stages (e.g. foetal bovine serum).
    */
  var developmentStage: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are often necessary to define both Substances and Specified Group 1 Substances. For substances derived from Plants, fraction information will be captured at the Substance information level ( . Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent composition, will be captured at the Specified Substance Group 1 information level. For plasma-derived products fraction information will be captured at the Substance and the Specified Substance Group 1 levels.
    */
  var fractionDescription: js.UndefOr[js.Array[SubstanceSourceMaterialFractionDescription]] = js.undefined
  
  /**
    * The place/region where the plant is harvested or the places/regions where the animal source material has its habitat.
    */
  var geographicalLocation: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This subclause describes the organism which the substance is derived from. For vaccines, the parent organism shall be specified based on these subclause elements. As an example, full taxonomy will be described for the Substance Name: ., Leaf.
    */
  var organism: js.UndefOr[SubstanceSourceMaterialOrganism] = js.undefined
  
  /**
    * The unique identifier associated with the source material parent organism shall be specified.
    */
  var organismId: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The organism accepted Scientific name shall be provided based on the organism taxonomy.
    */
  var organismName: js.UndefOr[String] = js.undefined
  
  /**
    * The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).
    */
  var parentSubstanceId: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The parent substance of the Herbal Drug, or Herbal preparation.
    */
  var parentSubstanceName: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * To do.
    */
  var partDescription: js.UndefOr[js.Array[SubstanceSourceMaterialPartDescription]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SubstanceSourceMaterial: typings.fhir.fhirStrings.SubstanceSourceMaterial
  
  /**
    * General high level classification of the source material specific to the origin of the material.
    */
  var sourceMaterialClass: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The state of the source material when extracted.
    */
  var sourceMaterialState: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of the source material shall be specified based on a controlled vocabulary. For vaccines, this subclause refers to the class of infectious agent.
    */
  var sourceMaterialType: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSourceMaterial {
  
  inline def apply(): SubstanceSourceMaterial = {
    val __obj = js.Dynamic.literal(resourceType = "SubstanceSourceMaterial")
    __obj.asInstanceOf[SubstanceSourceMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSourceMaterial] (val x: Self) extends AnyVal {
    
    inline def setCountryOfOrigin(value: js.Array[CodeableConcept]): Self = StObject.set(x, "countryOfOrigin", value.asInstanceOf[js.Any])
    
    inline def setCountryOfOriginUndefined: Self = StObject.set(x, "countryOfOrigin", js.undefined)
    
    inline def setCountryOfOriginVarargs(value: CodeableConcept*): Self = StObject.set(x, "countryOfOrigin", js.Array(value*))
    
    inline def setDevelopmentStage(value: CodeableConcept): Self = StObject.set(x, "developmentStage", value.asInstanceOf[js.Any])
    
    inline def setDevelopmentStageUndefined: Self = StObject.set(x, "developmentStage", js.undefined)
    
    inline def setFractionDescription(value: js.Array[SubstanceSourceMaterialFractionDescription]): Self = StObject.set(x, "fractionDescription", value.asInstanceOf[js.Any])
    
    inline def setFractionDescriptionUndefined: Self = StObject.set(x, "fractionDescription", js.undefined)
    
    inline def setFractionDescriptionVarargs(value: SubstanceSourceMaterialFractionDescription*): Self = StObject.set(x, "fractionDescription", js.Array(value*))
    
    inline def setGeographicalLocation(value: js.Array[String]): Self = StObject.set(x, "geographicalLocation", value.asInstanceOf[js.Any])
    
    inline def setGeographicalLocationUndefined: Self = StObject.set(x, "geographicalLocation", js.undefined)
    
    inline def setGeographicalLocationVarargs(value: String*): Self = StObject.set(x, "geographicalLocation", js.Array(value*))
    
    inline def setOrganism(value: SubstanceSourceMaterialOrganism): Self = StObject.set(x, "organism", value.asInstanceOf[js.Any])
    
    inline def setOrganismId(value: Identifier): Self = StObject.set(x, "organismId", value.asInstanceOf[js.Any])
    
    inline def setOrganismIdUndefined: Self = StObject.set(x, "organismId", js.undefined)
    
    inline def setOrganismName(value: String): Self = StObject.set(x, "organismName", value.asInstanceOf[js.Any])
    
    inline def setOrganismNameUndefined: Self = StObject.set(x, "organismName", js.undefined)
    
    inline def setOrganismUndefined: Self = StObject.set(x, "organism", js.undefined)
    
    inline def setParentSubstanceId(value: js.Array[Identifier]): Self = StObject.set(x, "parentSubstanceId", value.asInstanceOf[js.Any])
    
    inline def setParentSubstanceIdUndefined: Self = StObject.set(x, "parentSubstanceId", js.undefined)
    
    inline def setParentSubstanceIdVarargs(value: Identifier*): Self = StObject.set(x, "parentSubstanceId", js.Array(value*))
    
    inline def setParentSubstanceName(value: js.Array[String]): Self = StObject.set(x, "parentSubstanceName", value.asInstanceOf[js.Any])
    
    inline def setParentSubstanceNameUndefined: Self = StObject.set(x, "parentSubstanceName", js.undefined)
    
    inline def setParentSubstanceNameVarargs(value: String*): Self = StObject.set(x, "parentSubstanceName", js.Array(value*))
    
    inline def setPartDescription(value: js.Array[SubstanceSourceMaterialPartDescription]): Self = StObject.set(x, "partDescription", value.asInstanceOf[js.Any])
    
    inline def setPartDescriptionUndefined: Self = StObject.set(x, "partDescription", js.undefined)
    
    inline def setPartDescriptionVarargs(value: SubstanceSourceMaterialPartDescription*): Self = StObject.set(x, "partDescription", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SubstanceSourceMaterial): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceMaterialClass(value: CodeableConcept): Self = StObject.set(x, "sourceMaterialClass", value.asInstanceOf[js.Any])
    
    inline def setSourceMaterialClassUndefined: Self = StObject.set(x, "sourceMaterialClass", js.undefined)
    
    inline def setSourceMaterialState(value: CodeableConcept): Self = StObject.set(x, "sourceMaterialState", value.asInstanceOf[js.Any])
    
    inline def setSourceMaterialStateUndefined: Self = StObject.set(x, "sourceMaterialState", js.undefined)
    
    inline def setSourceMaterialType(value: CodeableConcept): Self = StObject.set(x, "sourceMaterialType", value.asInstanceOf[js.Any])
    
    inline def setSourceMaterialTypeUndefined: Self = StObject.set(x, "sourceMaterialType", js.undefined)
    
    inline def set_geographicalLocation(value: js.Array[Element]): Self = StObject.set(x, "_geographicalLocation", value.asInstanceOf[js.Any])
    
    inline def set_geographicalLocationUndefined: Self = StObject.set(x, "_geographicalLocation", js.undefined)
    
    inline def set_geographicalLocationVarargs(value: Element*): Self = StObject.set(x, "_geographicalLocation", js.Array(value*))
    
    inline def set_organismName(value: Element): Self = StObject.set(x, "_organismName", value.asInstanceOf[js.Any])
    
    inline def set_organismNameUndefined: Self = StObject.set(x, "_organismName", js.undefined)
    
    inline def set_parentSubstanceName(value: js.Array[Element]): Self = StObject.set(x, "_parentSubstanceName", value.asInstanceOf[js.Any])
    
    inline def set_parentSubstanceNameUndefined: Self = StObject.set(x, "_parentSubstanceName", js.undefined)
    
    inline def set_parentSubstanceNameVarargs(value: Element*): Self = StObject.set(x, "_parentSubstanceName", js.Array(value*))
  }
}
