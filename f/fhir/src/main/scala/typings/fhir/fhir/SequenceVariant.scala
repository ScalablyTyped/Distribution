package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Variant in sequence
  */
@js.native
trait SequenceVariant extends BackboneElement {
  
  /**
    * Contains extended information for property 'cigar'.
    */
  var _cigar: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'observedAllele'.
    */
  var _observedAllele: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'referenceAllele'.
    */
  var _referenceAllele: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  
  /**
    * Extended CIGAR string for aligning the sequence with reference bases
    */
  var cigar: js.UndefOr[String] = js.native
  
  /**
    * End position of the variant on the reference sequence
    */
  var end: js.UndefOr[integer] = js.native
  
  /**
    * Allele that was observed
    */
  var observedAllele: js.UndefOr[String] = js.native
  
  /**
    * Allele in the reference sequence
    */
  var referenceAllele: js.UndefOr[String] = js.native
  
  /**
    * Start position of the variant on the  reference sequence
    */
  var start: js.UndefOr[integer] = js.native
  
  /**
    * Pointer to observed variant information
    */
  var variantPointer: js.UndefOr[Reference] = js.native
}
object SequenceVariant {
  
  @scala.inline
  def apply(): SequenceVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceVariant]
  }
  
  @scala.inline
  implicit class SequenceVariantMutableBuilder[Self <: SequenceVariant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCigar(value: String): Self = StObject.set(x, "cigar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCigarUndefined: Self = StObject.set(x, "cigar", js.undefined)
    
    @scala.inline
    def setEnd(value: integer): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setObservedAllele(value: String): Self = StObject.set(x, "observedAllele", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedAlleleUndefined: Self = StObject.set(x, "observedAllele", js.undefined)
    
    @scala.inline
    def setReferenceAllele(value: String): Self = StObject.set(x, "referenceAllele", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceAlleleUndefined: Self = StObject.set(x, "referenceAllele", js.undefined)
    
    @scala.inline
    def setStart(value: integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setVariantPointer(value: Reference): Self = StObject.set(x, "variantPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantPointerUndefined: Self = StObject.set(x, "variantPointer", js.undefined)
    
    @scala.inline
    def set_cigar(value: Element): Self = StObject.set(x, "_cigar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cigarUndefined: Self = StObject.set(x, "_cigar", js.undefined)
    
    @scala.inline
    def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    @scala.inline
    def set_observedAllele(value: Element): Self = StObject.set(x, "_observedAllele", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_observedAlleleUndefined: Self = StObject.set(x, "_observedAllele", js.undefined)
    
    @scala.inline
    def set_referenceAllele(value: Element): Self = StObject.set(x, "_referenceAllele", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_referenceAlleleUndefined: Self = StObject.set(x, "_referenceAllele", js.undefined)
    
    @scala.inline
    def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
  }
}
