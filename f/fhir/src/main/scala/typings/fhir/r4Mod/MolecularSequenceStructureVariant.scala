package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceStructureVariant
  extends StObject
     with BackboneElement {
  
  var _exact: js.UndefOr[Element] = js.undefined
  
  /**
    * Used to indicate if the outer and inner start-end values have the same meaning.
    */
  var exact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Structural variant inner.
    */
  var inner: js.UndefOr[MolecularSequenceStructureVariantInner] = js.undefined
  
  /**
    * Length of the variant chromosome.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Structural variant outer.
    */
  var outer: js.UndefOr[MolecularSequenceStructureVariantOuter] = js.undefined
  
  /**
    * Information about chromosome structure variation DNA change type.
    */
  var variantType: js.UndefOr[CodeableConcept] = js.undefined
}
object MolecularSequenceStructureVariant {
  
  inline def apply(): MolecularSequenceStructureVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MolecularSequenceStructureVariant]
  }
  
  extension [Self <: MolecularSequenceStructureVariant](x: Self) {
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setInner(value: MolecularSequenceStructureVariantInner): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOuter(value: MolecularSequenceStructureVariantOuter): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
    
    inline def setOuterUndefined: Self = StObject.set(x, "outer", js.undefined)
    
    inline def setVariantType(value: CodeableConcept): Self = StObject.set(x, "variantType", value.asInstanceOf[js.Any])
    
    inline def setVariantTypeUndefined: Self = StObject.set(x, "variantType", js.undefined)
    
    inline def set_exact(value: Element): Self = StObject.set(x, "_exact", value.asInstanceOf[js.Any])
    
    inline def set_exactUndefined: Self = StObject.set(x, "_exact", js.undefined)
  }
}
