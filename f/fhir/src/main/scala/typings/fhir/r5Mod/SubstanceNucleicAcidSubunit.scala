package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceNucleicAcidSubunit
  extends StObject
     with BackboneElement {
  
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * The nucleotide present at the 5’ terminal shall be specified based on a controlled vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5’ prime nucleotide is the letter at the first position in the sequence. A separate representation would be redundant.
    */
  var fivePrime: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The length of the sequence shall be captured.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The linkages between sugar residues will also be captured.
    */
  var linkage: js.UndefOr[js.Array[SubstanceNucleicAcidSubunitLinkage]] = js.undefined
  
  /**
    * Actual nucleotide sequence notation from 5' to 3' end using standard single letter codes. In addition to the base sequence, sugar and type of phosphate or non-phosphate linkage should also be captured.
    */
  var sequence: js.UndefOr[String] = js.undefined
  
  /**
    * (TBC).
    */
  var sequenceAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Index of linear sequences of nucleic acids in order of decreasing length. Sequences of the same length will be ordered by molecular weight. Subunits that have identical sequences will be repeated and have sequential subscripts.
    */
  var subunit: js.UndefOr[Double] = js.undefined
  
  /**
    * 5.3.6.8.1 Sugar ID (Mandatory).
    */
  var sugar: js.UndefOr[js.Array[SubstanceNucleicAcidSubunitSugar]] = js.undefined
  
  /**
    * The nucleotide present at the 3’ terminal shall be specified based on a controlled vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5’ prime nucleotide is the letter at the last position in the sequence. A separate representation would be redundant.
    */
  var threePrime: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceNucleicAcidSubunit {
  
  inline def apply(): SubstanceNucleicAcidSubunit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceNucleicAcidSubunit]
  }
  
  extension [Self <: SubstanceNucleicAcidSubunit](x: Self) {
    
    inline def setFivePrime(value: CodeableConcept): Self = StObject.set(x, "fivePrime", value.asInstanceOf[js.Any])
    
    inline def setFivePrimeUndefined: Self = StObject.set(x, "fivePrime", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLinkage(value: js.Array[SubstanceNucleicAcidSubunitLinkage]): Self = StObject.set(x, "linkage", value.asInstanceOf[js.Any])
    
    inline def setLinkageUndefined: Self = StObject.set(x, "linkage", js.undefined)
    
    inline def setLinkageVarargs(value: SubstanceNucleicAcidSubunitLinkage*): Self = StObject.set(x, "linkage", js.Array(value*))
    
    inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceAttachment(value: Attachment): Self = StObject.set(x, "sequenceAttachment", value.asInstanceOf[js.Any])
    
    inline def setSequenceAttachmentUndefined: Self = StObject.set(x, "sequenceAttachment", js.undefined)
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSubunit(value: Double): Self = StObject.set(x, "subunit", value.asInstanceOf[js.Any])
    
    inline def setSubunitUndefined: Self = StObject.set(x, "subunit", js.undefined)
    
    inline def setSugar(value: js.Array[SubstanceNucleicAcidSubunitSugar]): Self = StObject.set(x, "sugar", value.asInstanceOf[js.Any])
    
    inline def setSugarUndefined: Self = StObject.set(x, "sugar", js.undefined)
    
    inline def setSugarVarargs(value: SubstanceNucleicAcidSubunitSugar*): Self = StObject.set(x, "sugar", js.Array(value*))
    
    inline def setThreePrime(value: CodeableConcept): Self = StObject.set(x, "threePrime", value.asInstanceOf[js.Any])
    
    inline def setThreePrimeUndefined: Self = StObject.set(x, "threePrime", js.undefined)
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
