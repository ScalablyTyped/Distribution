package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An set of value as quality of sequence
  */
trait SequenceQuality
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'fScore'.
    */
  var _fScore: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'gtFP'.
    */
  var _gtFP: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'precision'.
    */
  var _precision: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'queryFP'.
    */
  var _queryFP: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'queryTP'.
    */
  var _queryTP: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'recall'.
    */
  var _recall: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'truthFN'.
    */
  var _truthFN: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'truthTP'.
    */
  var _truthTP: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * End position of the sequence
    */
  var end: js.UndefOr[integer] = js.undefined
  
  /**
    * F-score
    */
  var fScore: js.UndefOr[decimal] = js.undefined
  
  /**
    * False positives where the non-REF alleles in the Truth and Query Call Sets match
    */
  var gtFP: js.UndefOr[decimal] = js.undefined
  
  /**
    * Method to get quality
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Precision of comparison
    */
  var precision: js.UndefOr[decimal] = js.undefined
  
  /**
    * False positives
    */
  var queryFP: js.UndefOr[decimal] = js.undefined
  
  /**
    * True positives from the perspective of the query data
    */
  var queryTP: js.UndefOr[decimal] = js.undefined
  
  /**
    * Recall of comparison
    */
  var recall: js.UndefOr[decimal] = js.undefined
  
  /**
    * Quality score for the comparison
    */
  var score: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Standard sequence for comparison
    */
  var standardSequence: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Start position of the sequence
    */
  var start: js.UndefOr[integer] = js.undefined
  
  /**
    * False negatives
    */
  var truthFN: js.UndefOr[decimal] = js.undefined
  
  /**
    * True positives from the perspective of the truth data
    */
  var truthTP: js.UndefOr[decimal] = js.undefined
  
  /**
    * indel | snp | unknown
    */
  var `type`: code
}
object SequenceQuality {
  
  inline def apply(`type`: code): SequenceQuality = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceQuality]
  }
  
  extension [Self <: SequenceQuality](x: Self) {
    
    inline def setEnd(value: integer): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFScore(value: decimal): Self = StObject.set(x, "fScore", value.asInstanceOf[js.Any])
    
    inline def setFScoreUndefined: Self = StObject.set(x, "fScore", js.undefined)
    
    inline def setGtFP(value: decimal): Self = StObject.set(x, "gtFP", value.asInstanceOf[js.Any])
    
    inline def setGtFPUndefined: Self = StObject.set(x, "gtFP", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPrecision(value: decimal): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setQueryFP(value: decimal): Self = StObject.set(x, "queryFP", value.asInstanceOf[js.Any])
    
    inline def setQueryFPUndefined: Self = StObject.set(x, "queryFP", js.undefined)
    
    inline def setQueryTP(value: decimal): Self = StObject.set(x, "queryTP", value.asInstanceOf[js.Any])
    
    inline def setQueryTPUndefined: Self = StObject.set(x, "queryTP", js.undefined)
    
    inline def setRecall(value: decimal): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
    
    inline def setScore(value: Quantity): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setStandardSequence(value: CodeableConcept): Self = StObject.set(x, "standardSequence", value.asInstanceOf[js.Any])
    
    inline def setStandardSequenceUndefined: Self = StObject.set(x, "standardSequence", js.undefined)
    
    inline def setStart(value: integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTruthFN(value: decimal): Self = StObject.set(x, "truthFN", value.asInstanceOf[js.Any])
    
    inline def setTruthFNUndefined: Self = StObject.set(x, "truthFN", js.undefined)
    
    inline def setTruthTP(value: decimal): Self = StObject.set(x, "truthTP", value.asInstanceOf[js.Any])
    
    inline def setTruthTPUndefined: Self = StObject.set(x, "truthTP", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_fScore(value: Element): Self = StObject.set(x, "_fScore", value.asInstanceOf[js.Any])
    
    inline def set_fScoreUndefined: Self = StObject.set(x, "_fScore", js.undefined)
    
    inline def set_gtFP(value: Element): Self = StObject.set(x, "_gtFP", value.asInstanceOf[js.Any])
    
    inline def set_gtFPUndefined: Self = StObject.set(x, "_gtFP", js.undefined)
    
    inline def set_precision(value: Element): Self = StObject.set(x, "_precision", value.asInstanceOf[js.Any])
    
    inline def set_precisionUndefined: Self = StObject.set(x, "_precision", js.undefined)
    
    inline def set_queryFP(value: Element): Self = StObject.set(x, "_queryFP", value.asInstanceOf[js.Any])
    
    inline def set_queryFPUndefined: Self = StObject.set(x, "_queryFP", js.undefined)
    
    inline def set_queryTP(value: Element): Self = StObject.set(x, "_queryTP", value.asInstanceOf[js.Any])
    
    inline def set_queryTPUndefined: Self = StObject.set(x, "_queryTP", js.undefined)
    
    inline def set_recall(value: Element): Self = StObject.set(x, "_recall", value.asInstanceOf[js.Any])
    
    inline def set_recallUndefined: Self = StObject.set(x, "_recall", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
    
    inline def set_truthFN(value: Element): Self = StObject.set(x, "_truthFN", value.asInstanceOf[js.Any])
    
    inline def set_truthFNUndefined: Self = StObject.set(x, "_truthFN", js.undefined)
    
    inline def set_truthTP(value: Element): Self = StObject.set(x, "_truthTP", value.asInstanceOf[js.Any])
    
    inline def set_truthTPUndefined: Self = StObject.set(x, "_truthTP", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
