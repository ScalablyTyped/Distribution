package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceStructureVariantInner
  extends StObject
     with BackboneElement {
  
  /**
    * Structural variant inner end. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * Structural variant inner start. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object MolecularSequenceStructureVariantInner {
  
  inline def apply(): MolecularSequenceStructureVariantInner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MolecularSequenceStructureVariantInner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MolecularSequenceStructureVariantInner] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
