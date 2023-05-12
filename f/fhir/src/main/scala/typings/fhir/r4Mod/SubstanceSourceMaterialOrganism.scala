package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSourceMaterialOrganism
  extends StObject
     with BackboneElement {
  
  var _intraspecificDescription: js.UndefOr[Element] = js.undefined
  
  /**
    * 4.9.13.6.1 Author type (Conditional).
    */
  var author: js.UndefOr[js.Array[SubstanceSourceMaterialOrganismAuthor]] = js.undefined
  
  /**
    * The family of an organism shall be specified.
    */
  var family: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The genus of an organism shall be specified; refers to the Latin epithet of the genus element of the plant/animal scientific name; it is present in names for genera, species and infraspecies.
    */
  var genus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * 4.9.13.8.1 Hybrid species maternal organism ID (Optional).
    */
  var hybrid: js.UndefOr[SubstanceSourceMaterialOrganismHybrid] = js.undefined
  
  /**
    * The intraspecific description of an organism shall be specified based on a controlled vocabulary. For Influenza Vaccine, the intraspecific description shall contain the syntax of the antigen in line with the WHO convention.
    */
  var intraspecificDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The Intraspecific type of an organism shall be specified.
    */
  var intraspecificType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * 4.9.13.7.1 Kingdom (Conditional).
    */
  var organismGeneral: js.UndefOr[SubstanceSourceMaterialOrganismOrganismGeneral] = js.undefined
  
  /**
    * The species of an organism shall be specified; refers to the Latin epithet of the species of the plant/animal; it is present in names for species and infraspecies.
    */
  var species: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSourceMaterialOrganism {
  
  inline def apply(): SubstanceSourceMaterialOrganism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSourceMaterialOrganism]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSourceMaterialOrganism] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: js.Array[SubstanceSourceMaterialOrganismAuthor]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: SubstanceSourceMaterialOrganismAuthor*): Self = StObject.set(x, "author", js.Array(value*))
    
    inline def setFamily(value: CodeableConcept): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setGenus(value: CodeableConcept): Self = StObject.set(x, "genus", value.asInstanceOf[js.Any])
    
    inline def setGenusUndefined: Self = StObject.set(x, "genus", js.undefined)
    
    inline def setHybrid(value: SubstanceSourceMaterialOrganismHybrid): Self = StObject.set(x, "hybrid", value.asInstanceOf[js.Any])
    
    inline def setHybridUndefined: Self = StObject.set(x, "hybrid", js.undefined)
    
    inline def setIntraspecificDescription(value: String): Self = StObject.set(x, "intraspecificDescription", value.asInstanceOf[js.Any])
    
    inline def setIntraspecificDescriptionUndefined: Self = StObject.set(x, "intraspecificDescription", js.undefined)
    
    inline def setIntraspecificType(value: CodeableConcept): Self = StObject.set(x, "intraspecificType", value.asInstanceOf[js.Any])
    
    inline def setIntraspecificTypeUndefined: Self = StObject.set(x, "intraspecificType", js.undefined)
    
    inline def setOrganismGeneral(value: SubstanceSourceMaterialOrganismOrganismGeneral): Self = StObject.set(x, "organismGeneral", value.asInstanceOf[js.Any])
    
    inline def setOrganismGeneralUndefined: Self = StObject.set(x, "organismGeneral", js.undefined)
    
    inline def setSpecies(value: CodeableConcept): Self = StObject.set(x, "species", value.asInstanceOf[js.Any])
    
    inline def setSpeciesUndefined: Self = StObject.set(x, "species", js.undefined)
    
    inline def set_intraspecificDescription(value: Element): Self = StObject.set(x, "_intraspecificDescription", value.asInstanceOf[js.Any])
    
    inline def set_intraspecificDescriptionUndefined: Self = StObject.set(x, "_intraspecificDescription", js.undefined)
  }
}
