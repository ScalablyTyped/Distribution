package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a biological sequence
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Sequence
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'coordinateSystem'.
    */
  var _coordinateSystem: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'observedSeq'.
    */
  var _observedSeq: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'readCoverage'.
    */
  var _readCoverage: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Base number of coordinate system (0 for 0-based numbering or coordinates, inclusive start, exclusive end, 1 for 1-based numbering, inclusive start, inclusive end)
    */
  var coordinateSystem: integer
  
  /**
    * The method for sequencing
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * Unique ID for this particular sequence. This is a FHIR-defined id
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Sequence that was observed
    */
  var observedSeq: js.UndefOr[String] = js.undefined
  
  /**
    * Who and/or what this is about
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who should be responsible for test result
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Pointer to next atomic sequence
    */
  var pointer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An set of value as quality of sequence
    */
  var quality: js.UndefOr[js.Array[SequenceQuality]] = js.undefined
  
  /**
    * The number of copies of the seqeunce of interest.  (RNASeq)
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Average number of reads representing a given nucleotide in the reconstructed sequence
    */
  var readCoverage: js.UndefOr[integer] = js.undefined
  
  /**
    * A sequence used as reference
    */
  var referenceSeq: js.UndefOr[SequenceReferenceSeq] = js.undefined
  
  /**
    * External repository which contains detailed report related with observedSeq in this resource
    */
  var repository: js.UndefOr[js.Array[SequenceRepository]] = js.undefined
  
  /**
    * Specimen used for sequencing
    */
  var specimen: js.UndefOr[Reference] = js.undefined
  
  /**
    * aa | dna | rna
    */
  var `type`: js.UndefOr[code] = js.undefined
  
  /**
    * Variant in sequence
    */
  var variant: js.UndefOr[js.Array[SequenceVariant]] = js.undefined
}
object Sequence {
  
  inline def apply(coordinateSystem: integer): Sequence = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequence]
  }
  
  extension [Self <: Sequence](x: Self) {
    
    inline def setCoordinateSystem(value: integer): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setObservedSeq(value: String): Self = StObject.set(x, "observedSeq", value.asInstanceOf[js.Any])
    
    inline def setObservedSeqUndefined: Self = StObject.set(x, "observedSeq", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPointer(value: js.Array[Reference]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    inline def setPointerVarargs(value: Reference*): Self = StObject.set(x, "pointer", js.Array(value :_*))
    
    inline def setQuality(value: js.Array[SequenceQuality]): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setQualityVarargs(value: SequenceQuality*): Self = StObject.set(x, "quality", js.Array(value :_*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReadCoverage(value: integer): Self = StObject.set(x, "readCoverage", value.asInstanceOf[js.Any])
    
    inline def setReadCoverageUndefined: Self = StObject.set(x, "readCoverage", js.undefined)
    
    inline def setReferenceSeq(value: SequenceReferenceSeq): Self = StObject.set(x, "referenceSeq", value.asInstanceOf[js.Any])
    
    inline def setReferenceSeqUndefined: Self = StObject.set(x, "referenceSeq", js.undefined)
    
    inline def setRepository(value: js.Array[SequenceRepository]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRepositoryVarargs(value: SequenceRepository*): Self = StObject.set(x, "repository", js.Array(value :_*))
    
    inline def setSpecimen(value: Reference): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariant(value: js.Array[SequenceVariant]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setVariantVarargs(value: SequenceVariant*): Self = StObject.set(x, "variant", js.Array(value :_*))
    
    inline def set_coordinateSystem(value: Element): Self = StObject.set(x, "_coordinateSystem", value.asInstanceOf[js.Any])
    
    inline def set_coordinateSystemUndefined: Self = StObject.set(x, "_coordinateSystem", js.undefined)
    
    inline def set_observedSeq(value: Element): Self = StObject.set(x, "_observedSeq", value.asInstanceOf[js.Any])
    
    inline def set_observedSeqUndefined: Self = StObject.set(x, "_observedSeq", js.undefined)
    
    inline def set_readCoverage(value: Element): Self = StObject.set(x, "_readCoverage", value.asInstanceOf[js.Any])
    
    inline def set_readCoverageUndefined: Self = StObject.set(x, "_readCoverage", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
