package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionStructure
  extends StObject
     with BackboneElement {
  
  var _molecularFormula: js.UndefOr[Element] = js.undefined
  
  var _molecularFormulaByMoiety: js.UndefOr[Element] = js.undefined
  
  /**
    * An expression which states the number and type of atoms present in a molecule of a substance.
    */
  var molecularFormula: js.UndefOr[String] = js.undefined
  
  /**
    * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical, each moiety separated by a dot.
    */
  var molecularFormulaByMoiety: js.UndefOr[String] = js.undefined
  
  /**
    * The molecular weight or weight range (for proteins, polymers or nucleic acids).
    */
  var molecularWeight: js.UndefOr[SubstanceDefinitionMolecularWeight] = js.undefined
  
  /**
    * Optical activity type.
    */
  var opticalActivity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A depiction of the structure of the substance.
    */
  var representation: js.UndefOr[js.Array[SubstanceDefinitionStructureRepresentation]] = js.undefined
  
  /**
    * The source of information about the structure.
    */
  var sourceDocument: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Stereochemistry type.
    */
  var stereochemistry: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The method used to elucidate the structure of the drug substance. Examples: X-ray, NMR, Peptide mapping, Ligand binding assay.
    */
  var technique: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object SubstanceDefinitionStructure {
  
  inline def apply(): SubstanceDefinitionStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceDefinitionStructure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceDefinitionStructure] (val x: Self) extends AnyVal {
    
    inline def setMolecularFormula(value: String): Self = StObject.set(x, "molecularFormula", value.asInstanceOf[js.Any])
    
    inline def setMolecularFormulaByMoiety(value: String): Self = StObject.set(x, "molecularFormulaByMoiety", value.asInstanceOf[js.Any])
    
    inline def setMolecularFormulaByMoietyUndefined: Self = StObject.set(x, "molecularFormulaByMoiety", js.undefined)
    
    inline def setMolecularFormulaUndefined: Self = StObject.set(x, "molecularFormula", js.undefined)
    
    inline def setMolecularWeight(value: SubstanceDefinitionMolecularWeight): Self = StObject.set(x, "molecularWeight", value.asInstanceOf[js.Any])
    
    inline def setMolecularWeightUndefined: Self = StObject.set(x, "molecularWeight", js.undefined)
    
    inline def setOpticalActivity(value: CodeableConcept): Self = StObject.set(x, "opticalActivity", value.asInstanceOf[js.Any])
    
    inline def setOpticalActivityUndefined: Self = StObject.set(x, "opticalActivity", js.undefined)
    
    inline def setRepresentation(value: js.Array[SubstanceDefinitionStructureRepresentation]): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    inline def setRepresentationUndefined: Self = StObject.set(x, "representation", js.undefined)
    
    inline def setRepresentationVarargs(value: SubstanceDefinitionStructureRepresentation*): Self = StObject.set(x, "representation", js.Array(value*))
    
    inline def setSourceDocument(value: js.Array[Reference]): Self = StObject.set(x, "sourceDocument", value.asInstanceOf[js.Any])
    
    inline def setSourceDocumentUndefined: Self = StObject.set(x, "sourceDocument", js.undefined)
    
    inline def setSourceDocumentVarargs(value: Reference*): Self = StObject.set(x, "sourceDocument", js.Array(value*))
    
    inline def setStereochemistry(value: CodeableConcept): Self = StObject.set(x, "stereochemistry", value.asInstanceOf[js.Any])
    
    inline def setStereochemistryUndefined: Self = StObject.set(x, "stereochemistry", js.undefined)
    
    inline def setTechnique(value: js.Array[CodeableConcept]): Self = StObject.set(x, "technique", value.asInstanceOf[js.Any])
    
    inline def setTechniqueUndefined: Self = StObject.set(x, "technique", js.undefined)
    
    inline def setTechniqueVarargs(value: CodeableConcept*): Self = StObject.set(x, "technique", js.Array(value*))
    
    inline def set_molecularFormula(value: Element): Self = StObject.set(x, "_molecularFormula", value.asInstanceOf[js.Any])
    
    inline def set_molecularFormulaByMoiety(value: Element): Self = StObject.set(x, "_molecularFormulaByMoiety", value.asInstanceOf[js.Any])
    
    inline def set_molecularFormulaByMoietyUndefined: Self = StObject.set(x, "_molecularFormulaByMoiety", js.undefined)
    
    inline def set_molecularFormulaUndefined: Self = StObject.set(x, "_molecularFormula", js.undefined)
  }
}
