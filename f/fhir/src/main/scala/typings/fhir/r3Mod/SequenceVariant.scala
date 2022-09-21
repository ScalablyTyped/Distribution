package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceVariant
  extends StObject
     with BackboneElement {
  
  var _cigar: js.UndefOr[Element] = js.undefined
  
  var _observedAllele: js.UndefOr[Element] = js.undefined
  
  var _referenceAllele: js.UndefOr[Element] = js.undefined
  
  /**
    * Extended CIGAR string for aligning the sequence with reference bases. See detailed documentation [here](http://support.illumina.com/help/SequencingAnalysisWorkflow/Content/Vault/Informatics/Sequencing_Analysis/CASAVA/swSEQ_mCA_ExtendedCIGARFormat.htm).
    */
  var cigar: js.UndefOr[String] = js.undefined
  
  /**
    * End position of the variant on the reference sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)).  Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
    */
  var observedAllele: js.UndefOr[String] = js.undefined
  
  /**
    * An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)). Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
    */
  var referenceAllele: js.UndefOr[String] = js.undefined
  
  /**
    * Start position of the variant on the  reference sequence.If the coordinate system is either 0-based or 1-based, then start position is inclusive.
    */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
    * A pointer to an Observation containing variant information.
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
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setObservedAllele(value: String): Self = StObject.set(x, "observedAllele", value.asInstanceOf[js.Any])
    
    inline def setObservedAlleleUndefined: Self = StObject.set(x, "observedAllele", js.undefined)
    
    inline def setReferenceAllele(value: String): Self = StObject.set(x, "referenceAllele", value.asInstanceOf[js.Any])
    
    inline def setReferenceAlleleUndefined: Self = StObject.set(x, "referenceAllele", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setVariantPointer(value: Reference): Self = StObject.set(x, "variantPointer", value.asInstanceOf[js.Any])
    
    inline def setVariantPointerUndefined: Self = StObject.set(x, "variantPointer", js.undefined)
    
    inline def set_cigar(value: Element): Self = StObject.set(x, "_cigar", value.asInstanceOf[js.Any])
    
    inline def set_cigarUndefined: Self = StObject.set(x, "_cigar", js.undefined)
    
    inline def set_observedAllele(value: Element): Self = StObject.set(x, "_observedAllele", value.asInstanceOf[js.Any])
    
    inline def set_observedAlleleUndefined: Self = StObject.set(x, "_observedAllele", js.undefined)
    
    inline def set_referenceAllele(value: Element): Self = StObject.set(x, "_referenceAllele", value.asInstanceOf[js.Any])
    
    inline def set_referenceAlleleUndefined: Self = StObject.set(x, "_referenceAllele", js.undefined)
  }
}
