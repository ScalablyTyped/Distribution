package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSpecificationStructureIsotope
  extends StObject
     with BackboneElement {
  
  /**
    * Half life - for a non-natural nuclide.
    */
  var halfLife: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Substance identifier for each non-natural or radioisotope.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The molecular weight or weight range (for proteins, polymers or nucleic acids).
    */
  var molecularWeight: js.UndefOr[SubstanceSpecificationStructureIsotopeMolecularWeight] = js.undefined
  
  /**
    * Substance name for each non-natural or radioisotope.
    */
  var name: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of isotopic substitution present in a single substance.
    */
  var substitution: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSpecificationStructureIsotope {
  
  inline def apply(): SubstanceSpecificationStructureIsotope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSpecificationStructureIsotope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSpecificationStructureIsotope] (val x: Self) extends AnyVal {
    
    inline def setHalfLife(value: Quantity): Self = StObject.set(x, "halfLife", value.asInstanceOf[js.Any])
    
    inline def setHalfLifeUndefined: Self = StObject.set(x, "halfLife", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMolecularWeight(value: SubstanceSpecificationStructureIsotopeMolecularWeight): Self = StObject.set(x, "molecularWeight", value.asInstanceOf[js.Any])
    
    inline def setMolecularWeightUndefined: Self = StObject.set(x, "molecularWeight", js.undefined)
    
    inline def setName(value: CodeableConcept): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubstitution(value: CodeableConcept): Self = StObject.set(x, "substitution", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionUndefined: Self = StObject.set(x, "substitution", js.undefined)
  }
}
