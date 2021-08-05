package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Variant in sequence
  */
trait SequenceVariant
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'cigar'.
    */
  var _cigar: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'observedAllele'.
    */
  var _observedAllele: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'referenceAllele'.
    */
  var _referenceAllele: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  
  /**
    * Extended CIGAR string for aligning the sequence with reference bases
    */
  var cigar: js.UndefOr[String] = js.undefined
  
  /**
    * End position of the variant on the reference sequence
    */
  var end: js.UndefOr[integer] = js.undefined
  
  /**
    * Allele that was observed
    */
  var observedAllele: js.UndefOr[String] = js.undefined
  
  /**
    * Allele in the reference sequence
    */
  var referenceAllele: js.UndefOr[String] = js.undefined
  
  /**
    * Start position of the variant on the  reference sequence
    */
  var start: js.UndefOr[integer] = js.undefined
  
  /**
    * Pointer to observed variant information
    */
  var variantPointer: js.UndefOr[Reference] = js.undefined
}
object SequenceVariant {
  
  inline def apply(): SequenceVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceVariant]
  }
  
  extension [Self <: SequenceVariant](x: Self) {
    
    inline def setCigar(value: String): Self = StObject.set(x, "cigar", value.asInstanceOf[js.Any])
    
    inline def setCigarUndefined: Self = StObject.set(x, "cigar", js.undefined)
    
    inline def setEnd(value: integer): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setObservedAllele(value: String): Self = StObject.set(x, "observedAllele", value.asInstanceOf[js.Any])
    
    inline def setObservedAlleleUndefined: Self = StObject.set(x, "observedAllele", js.undefined)
    
    inline def setReferenceAllele(value: String): Self = StObject.set(x, "referenceAllele", value.asInstanceOf[js.Any])
    
    inline def setReferenceAlleleUndefined: Self = StObject.set(x, "referenceAllele", js.undefined)
    
    inline def setStart(value: integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setVariantPointer(value: Reference): Self = StObject.set(x, "variantPointer", value.asInstanceOf[js.Any])
    
    inline def setVariantPointerUndefined: Self = StObject.set(x, "variantPointer", js.undefined)
    
    inline def set_cigar(value: Element): Self = StObject.set(x, "_cigar", value.asInstanceOf[js.Any])
    
    inline def set_cigarUndefined: Self = StObject.set(x, "_cigar", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_observedAllele(value: Element): Self = StObject.set(x, "_observedAllele", value.asInstanceOf[js.Any])
    
    inline def set_observedAlleleUndefined: Self = StObject.set(x, "_observedAllele", js.undefined)
    
    inline def set_referenceAllele(value: Element): Self = StObject.set(x, "_referenceAllele", value.asInstanceOf[js.Any])
    
    inline def set_referenceAlleleUndefined: Self = StObject.set(x, "_referenceAllele", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
  }
}
