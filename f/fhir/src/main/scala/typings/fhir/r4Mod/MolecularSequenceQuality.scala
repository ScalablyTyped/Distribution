package typings.fhir.r4Mod

import typings.fhir.fhirStrings.indel
import typings.fhir.fhirStrings.snp
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceQuality
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * End position of the sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * Harmonic mean of Recall and Precision, computed as: 2 * precision * recall / (precision + recall).
    */
  var fScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of false positives where the non-REF alleles in the Truth and Query Call Sets match (i.e. cases where the truth is 1/1 and the query is 0/1 or similar).
    */
  var gtFP: js.UndefOr[Double] = js.undefined
  
  /**
    * Which method is used to get sequence quality.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * QUERY.TP / (QUERY.TP + QUERY.FP).
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * False positives, i.e. the number of sites in the Query Call Set for which there is no path through the Truth Call Set that is consistent with this site. Sites with correct variant but incorrect genotype are counted here.
    */
  var queryFP: js.UndefOr[Double] = js.undefined
  
  /**
    * True positives, from the perspective of the query data, i.e. the number of sites in the Query Call Set for which there are paths through the Truth Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event.
    */
  var queryTP: js.UndefOr[Double] = js.undefined
  
  /**
    * TRUTH.TP / (TRUTH.TP + TRUTH.FN).
    */
  var recall: js.UndefOr[Double] = js.undefined
  
  /**
    * Receiver Operator Characteristic (ROC) Curve  to give sensitivity/specificity tradeoff.
    */
  var roc: js.UndefOr[MolecularSequenceQualityRoc] = js.undefined
  
  /**
    * The score of an experimentally derived feature such as a p-value ([SO:0001685](http://www.sequenceontology.org/browser/current_svn/term/SO:0001685)).
    */
  var score: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Gold standard sequence used for comparing against.
    */
  var standardSequence: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Start position of the sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
    */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
    * False negatives, i.e. the number of sites in the Truth Call Set for which there is no path through the Query Call Set that is consistent with all of the alleles at this site, or sites for which there is an inaccurate genotype call for the event. Sites with correct variant but incorrect genotype are counted here.
    */
  var truthFN: js.UndefOr[Double] = js.undefined
  
  /**
    * True positives, from the perspective of the truth data, i.e. the number of sites in the Truth Call Set for which there are paths through the Query Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event.
    */
  var truthTP: js.UndefOr[Double] = js.undefined
  
  /**
    * INDEL / SNP / Undefined variant.
    */
  var `type`: indel | snp | unknown
}
object MolecularSequenceQuality {
  
  inline def apply(`type`: indel | snp | unknown): MolecularSequenceQuality = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MolecularSequenceQuality]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MolecularSequenceQuality] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFScore(value: Double): Self = StObject.set(x, "fScore", value.asInstanceOf[js.Any])
    
    inline def setFScoreUndefined: Self = StObject.set(x, "fScore", js.undefined)
    
    inline def setGtFP(value: Double): Self = StObject.set(x, "gtFP", value.asInstanceOf[js.Any])
    
    inline def setGtFPUndefined: Self = StObject.set(x, "gtFP", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setQueryFP(value: Double): Self = StObject.set(x, "queryFP", value.asInstanceOf[js.Any])
    
    inline def setQueryFPUndefined: Self = StObject.set(x, "queryFP", js.undefined)
    
    inline def setQueryTP(value: Double): Self = StObject.set(x, "queryTP", value.asInstanceOf[js.Any])
    
    inline def setQueryTPUndefined: Self = StObject.set(x, "queryTP", js.undefined)
    
    inline def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
    
    inline def setRoc(value: MolecularSequenceQualityRoc): Self = StObject.set(x, "roc", value.asInstanceOf[js.Any])
    
    inline def setRocUndefined: Self = StObject.set(x, "roc", js.undefined)
    
    inline def setScore(value: Quantity): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setStandardSequence(value: CodeableConcept): Self = StObject.set(x, "standardSequence", value.asInstanceOf[js.Any])
    
    inline def setStandardSequenceUndefined: Self = StObject.set(x, "standardSequence", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTruthFN(value: Double): Self = StObject.set(x, "truthFN", value.asInstanceOf[js.Any])
    
    inline def setTruthFNUndefined: Self = StObject.set(x, "truthFN", js.undefined)
    
    inline def setTruthTP(value: Double): Self = StObject.set(x, "truthTP", value.asInstanceOf[js.Any])
    
    inline def setTruthTPUndefined: Self = StObject.set(x, "truthTP", js.undefined)
    
    inline def setType(value: indel | snp | unknown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
