package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSpecificationStructure
  extends StObject
     with BackboneElement {
  
  var _molecularFormula: js.UndefOr[Element] = js.undefined
  
  var _molecularFormulaByMoiety: js.UndefOr[Element] = js.undefined
  
  /**
    * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
    */
  var isotope: js.UndefOr[js.Array[SubstanceSpecificationStructureIsotope]] = js.undefined
  
  /**
    * Molecular formula.
    */
  var molecularFormula: js.UndefOr[String] = js.undefined
  
  /**
    * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical, each moiety separated by a dot.
    */
  var molecularFormulaByMoiety: js.UndefOr[String] = js.undefined
  
  /**
    * The molecular weight or weight range (for proteins, polymers or nucleic acids).
    */
  var molecularWeight: js.UndefOr[SubstanceSpecificationStructureIsotopeMolecularWeight] = js.undefined
  
  /**
    * Optical activity type.
    */
  var opticalActivity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Molecular structural representation.
    */
  var representation: js.UndefOr[js.Array[SubstanceSpecificationStructureRepresentation]] = js.undefined
  
  /**
    * Supporting literature.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Stereochemistry type.
    */
  var stereochemistry: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSpecificationStructure {
  
  inline def apply(): SubstanceSpecificationStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSpecificationStructure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSpecificationStructure] (val x: Self) extends AnyVal {
    
    inline def setIsotope(value: js.Array[SubstanceSpecificationStructureIsotope]): Self = StObject.set(x, "isotope", value.asInstanceOf[js.Any])
    
    inline def setIsotopeUndefined: Self = StObject.set(x, "isotope", js.undefined)
    
    inline def setIsotopeVarargs(value: SubstanceSpecificationStructureIsotope*): Self = StObject.set(x, "isotope", js.Array(value*))
    
    inline def setMolecularFormula(value: String): Self = StObject.set(x, "molecularFormula", value.asInstanceOf[js.Any])
    
    inline def setMolecularFormulaByMoiety(value: String): Self = StObject.set(x, "molecularFormulaByMoiety", value.asInstanceOf[js.Any])
    
    inline def setMolecularFormulaByMoietyUndefined: Self = StObject.set(x, "molecularFormulaByMoiety", js.undefined)
    
    inline def setMolecularFormulaUndefined: Self = StObject.set(x, "molecularFormula", js.undefined)
    
    inline def setMolecularWeight(value: SubstanceSpecificationStructureIsotopeMolecularWeight): Self = StObject.set(x, "molecularWeight", value.asInstanceOf[js.Any])
    
    inline def setMolecularWeightUndefined: Self = StObject.set(x, "molecularWeight", js.undefined)
    
    inline def setOpticalActivity(value: CodeableConcept): Self = StObject.set(x, "opticalActivity", value.asInstanceOf[js.Any])
    
    inline def setOpticalActivityUndefined: Self = StObject.set(x, "opticalActivity", js.undefined)
    
    inline def setRepresentation(value: js.Array[SubstanceSpecificationStructureRepresentation]): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    inline def setRepresentationUndefined: Self = StObject.set(x, "representation", js.undefined)
    
    inline def setRepresentationVarargs(value: SubstanceSpecificationStructureRepresentation*): Self = StObject.set(x, "representation", js.Array(value*))
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setStereochemistry(value: CodeableConcept): Self = StObject.set(x, "stereochemistry", value.asInstanceOf[js.Any])
    
    inline def setStereochemistryUndefined: Self = StObject.set(x, "stereochemistry", js.undefined)
    
    inline def set_molecularFormula(value: Element): Self = StObject.set(x, "_molecularFormula", value.asInstanceOf[js.Any])
    
    inline def set_molecularFormulaByMoiety(value: Element): Self = StObject.set(x, "_molecularFormulaByMoiety", value.asInstanceOf[js.Any])
    
    inline def set_molecularFormulaByMoietyUndefined: Self = StObject.set(x, "_molecularFormulaByMoiety", js.undefined)
    
    inline def set_molecularFormulaUndefined: Self = StObject.set(x, "_molecularFormula", js.undefined)
  }
}
