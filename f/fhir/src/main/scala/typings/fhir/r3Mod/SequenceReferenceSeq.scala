package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceReferenceSeq
  extends StObject
     with BackboneElement {
  
  var _genomeBuild: js.UndefOr[Element] = js.undefined
  
  var _referenceSeqString: js.UndefOr[Element] = js.undefined
  
  /**
    * Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
    */
  var chromosome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
    */
  var genomeBuild: js.UndefOr[String] = js.undefined
  
  /**
    * Reference identifier of reference sequence submitted to NCBI. It must match the type in the Sequence.type field. For example, the prefix, “NG_” identifies reference sequence for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences.
    */
  var referenceSeqId: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A Pointer to another Sequence entity as reference sequence.
    */
  var referenceSeqPointer: js.UndefOr[Reference] = js.undefined
  
  /**
    * A string like "ACGT".
    */
  var referenceSeqString: js.UndefOr[String] = js.undefined
  
  /**
    * Directionality of DNA sequence. Available values are "1" for the plus strand (5' to 3')/Watson/Sense/positive  and "-1" for the minus strand(3' to 5')/Crick/Antisense/negative.
    */
  var strand: js.UndefOr[Double] = js.undefined
  
  /**
    * End position of the window on the reference sequence. If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
    */
  var windowEnd: Double
  
  /**
    * Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
    */
  var windowStart: Double
}
object SequenceReferenceSeq {
  
  inline def apply(windowEnd: Double, windowStart: Double): SequenceReferenceSeq = {
    val __obj = js.Dynamic.literal(windowEnd = windowEnd.asInstanceOf[js.Any], windowStart = windowStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceReferenceSeq]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceReferenceSeq] (val x: Self) extends AnyVal {
    
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
    
    inline def setStrand(value: Double): Self = StObject.set(x, "strand", value.asInstanceOf[js.Any])
    
    inline def setStrandUndefined: Self = StObject.set(x, "strand", js.undefined)
    
    inline def setWindowEnd(value: Double): Self = StObject.set(x, "windowEnd", value.asInstanceOf[js.Any])
    
    inline def setWindowStart(value: Double): Self = StObject.set(x, "windowStart", value.asInstanceOf[js.Any])
    
    inline def set_genomeBuild(value: Element): Self = StObject.set(x, "_genomeBuild", value.asInstanceOf[js.Any])
    
    inline def set_genomeBuildUndefined: Self = StObject.set(x, "_genomeBuild", js.undefined)
    
    inline def set_referenceSeqString(value: Element): Self = StObject.set(x, "_referenceSeqString", value.asInstanceOf[js.Any])
    
    inline def set_referenceSeqStringUndefined: Self = StObject.set(x, "_referenceSeqString", js.undefined)
  }
}
