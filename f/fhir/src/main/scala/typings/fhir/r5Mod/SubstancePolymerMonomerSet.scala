package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerMonomerSet
  extends StObject
     with BackboneElement {
  
  /**
    * Captures the type of ratio to the entire polymer, e.g. Monomer/Polymer ratio, SRU/Polymer Ratio.
    */
  var ratioType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The starting materials - monomer(s) used in the synthesis of the polymer.
    */
  var startingMaterial: js.UndefOr[js.Array[SubstancePolymerMonomerSetStartingMaterial]] = js.undefined
}
object SubstancePolymerMonomerSet {
  
  inline def apply(): SubstancePolymerMonomerSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerMonomerSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstancePolymerMonomerSet] (val x: Self) extends AnyVal {
    
    inline def setRatioType(value: CodeableConcept): Self = StObject.set(x, "ratioType", value.asInstanceOf[js.Any])
    
    inline def setRatioTypeUndefined: Self = StObject.set(x, "ratioType", js.undefined)
    
    inline def setStartingMaterial(value: js.Array[SubstancePolymerMonomerSetStartingMaterial]): Self = StObject.set(x, "startingMaterial", value.asInstanceOf[js.Any])
    
    inline def setStartingMaterialUndefined: Self = StObject.set(x, "startingMaterial", js.undefined)
    
    inline def setStartingMaterialVarargs(value: SubstancePolymerMonomerSetStartingMaterial*): Self = StObject.set(x, "startingMaterial", js.Array(value*))
  }
}
