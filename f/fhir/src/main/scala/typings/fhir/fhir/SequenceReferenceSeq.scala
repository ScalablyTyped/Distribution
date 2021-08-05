package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A sequence used as reference
  */
trait SequenceReferenceSeq
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'genomeBuild'.
    */
  var _genomeBuild: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'referenceSeqString'.
    */
  var _referenceSeqString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'strand'.
    */
  var _strand: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'windowEnd'.
    */
  var _windowEnd: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'windowStart'.
    */
  var _windowStart: js.UndefOr[Element] = js.undefined
  
  /**
    * Chromosome containing genetic finding
    */
  var chromosome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'
    */
  var genomeBuild: js.UndefOr[String] = js.undefined
  
  /**
    * Reference identifier
    */
  var referenceSeqId: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A Pointer to another Sequence entity as reference sequence
    */
  var referenceSeqPointer: js.UndefOr[Reference] = js.undefined
  
  /**
    * A string to represent reference sequence
    */
  var referenceSeqString: js.UndefOr[String] = js.undefined
  
  /**
    * Directionality of DNA ( +1/-1)
    */
  var strand: js.UndefOr[integer] = js.undefined
  
  /**
    * End position of the window on the reference sequence
    */
  var windowEnd: integer
  
  /**
    * Start position of the window on the  reference sequence
    */
  var windowStart: integer
}
object SequenceReferenceSeq {
  
  inline def apply(windowEnd: integer, windowStart: integer): SequenceReferenceSeq = {
    val __obj = js.Dynamic.literal(windowEnd = windowEnd.asInstanceOf[js.Any], windowStart = windowStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceReferenceSeq]
  }
  
  extension [Self <: SequenceReferenceSeq](x: Self) {
    
    inline def setChromosome(value: CodeableConcept): Self = StObject.set(x, "chromosome", value.asInstanceOf[js.Any])
    
    inline def setChromosomeUndefined: Self = StObject.set(x, "chromosome", js.undefined)
    
    inline def setGenomeBuild(value: String): Self = StObject.set(x, "genomeBuild", value.asInstanceOf[js.Any])
    
    inline def setGenomeBuildUndefined: Self = StObject.set(x, "genomeBuild", js.undefined)
    
    inline def setReferenceSeqId(value: CodeableConcept): Self = StObject.set(x, "referenceSeqId", value.asInstanceOf[js.Any])
    
    inline def setReferenceSeqIdUndefined: Self = StObject.set(x, "referenceSeqId", js.undefined)
    
    inline def setReferenceSeqPointer(value: Reference): Self = StObject.set(x, "referenceSeqPointer", value.asInstanceOf[js.Any])
    
    inline def setReferenceSeqPointerUndefined: Self = StObject.set(x, "referenceSeqPointer", js.undefined)
    
    inline def setReferenceSeqString(value: String): Self = StObject.set(x, "referenceSeqString", value.asInstanceOf[js.Any])
    
    inline def setReferenceSeqStringUndefined: Self = StObject.set(x, "referenceSeqString", js.undefined)
    
    inline def setStrand(value: integer): Self = StObject.set(x, "strand", value.asInstanceOf[js.Any])
    
    inline def setStrandUndefined: Self = StObject.set(x, "strand", js.undefined)
    
    inline def setWindowEnd(value: integer): Self = StObject.set(x, "windowEnd", value.asInstanceOf[js.Any])
    
    inline def setWindowStart(value: integer): Self = StObject.set(x, "windowStart", value.asInstanceOf[js.Any])
    
    inline def set_genomeBuild(value: Element): Self = StObject.set(x, "_genomeBuild", value.asInstanceOf[js.Any])
    
    inline def set_genomeBuildUndefined: Self = StObject.set(x, "_genomeBuild", js.undefined)
    
    inline def set_referenceSeqString(value: Element): Self = StObject.set(x, "_referenceSeqString", value.asInstanceOf[js.Any])
    
    inline def set_referenceSeqStringUndefined: Self = StObject.set(x, "_referenceSeqString", js.undefined)
    
    inline def set_strand(value: Element): Self = StObject.set(x, "_strand", value.asInstanceOf[js.Any])
    
    inline def set_strandUndefined: Self = StObject.set(x, "_strand", js.undefined)
    
    inline def set_windowEnd(value: Element): Self = StObject.set(x, "_windowEnd", value.asInstanceOf[js.Any])
    
    inline def set_windowEndUndefined: Self = StObject.set(x, "_windowEnd", js.undefined)
    
    inline def set_windowStart(value: Element): Self = StObject.set(x, "_windowStart", value.asInstanceOf[js.Any])
    
    inline def set_windowStartUndefined: Self = StObject.set(x, "_windowStart", js.undefined)
  }
}
