package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceStructureVariantOuter
  extends StObject
     with BackboneElement {
  
  /**
    * Structural variant outer end. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * Structural variant outer start. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object MolecularSequenceStructureVariantOuter {
  
  inline def apply(): MolecularSequenceStructureVariantOuter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MolecularSequenceStructureVariantOuter]
  }
  
  extension [Self <: MolecularSequenceStructureVariantOuter](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
