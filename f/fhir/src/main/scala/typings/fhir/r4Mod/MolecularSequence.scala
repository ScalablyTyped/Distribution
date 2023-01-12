package typings.fhir.r4Mod

import typings.fhir.fhirStrings.aa
import typings.fhir.fhirStrings.dna
import typings.fhir.fhirStrings.rna
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequence
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _observedSeq: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end).
    */
  var coordinateSystem: Double
  
  /**
    * The method for sequencing, for example, chip information.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * A unique identifier for this particular sequence instance. This is a FHIR-defined id.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.
    */
  var observedSeq: js.UndefOr[String] = js.undefined
  
  /**
    * The patient whose sequencing results are described by this resource.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The organization or lab that should be responsible for this result.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Pointer to next atomic sequence which at most contains one variant.
    */
  var pointer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
    */
  var quality: js.UndefOr[js.Array[MolecularSequenceQuality]] = js.undefined
  
  /**
    * The number of copies of the sequence of interest. (RNASeq).
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence.
    */
  var readCoverage: js.UndefOr[Double] = js.undefined
  
  /**
    * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
    */
  var referenceSeq: js.UndefOr[MolecularSequenceReferenceSeq] = js.undefined
  
  /**
    * Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
    */
  var repository: js.UndefOr[js.Array[MolecularSequenceRepository]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MolecularSequence: typings.fhir.fhirStrings.MolecularSequence
  
  /**
    * Specimen used for sequencing.
    */
  var specimen: js.UndefOr[Reference] = js.undefined
  
  /**
    * Information about chromosome structure variation.
    */
  var structureVariant: js.UndefOr[js.Array[MolecularSequenceStructureVariant]] = js.undefined
  
  /**
    * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
    */
  var `type`: js.UndefOr[aa | dna | rna] = js.undefined
  
  /**
    * The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
    */
  var variant: js.UndefOr[js.Array[MolecularSequenceVariant]] = js.undefined
}
object MolecularSequence {
  
  inline def apply(coordinateSystem: Double): MolecularSequence = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any], resourceType = "MolecularSequence")
    __obj.asInstanceOf[MolecularSequence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MolecularSequence] (val x: Self) extends AnyVal {
    
    inline def setCoordinateSystem(value: Double): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setObservedSeq(value: String): Self = StObject.set(x, "observedSeq", value.asInstanceOf[js.Any])
    
    inline def setObservedSeqUndefined: Self = StObject.set(x, "observedSeq", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPointer(value: js.Array[Reference]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    inline def setPointerVarargs(value: Reference*): Self = StObject.set(x, "pointer", js.Array(value*))
    
    inline def setQuality(value: js.Array[MolecularSequenceQuality]): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setQualityVarargs(value: MolecularSequenceQuality*): Self = StObject.set(x, "quality", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReadCoverage(value: Double): Self = StObject.set(x, "readCoverage", value.asInstanceOf[js.Any])
    
    inline def setReadCoverageUndefined: Self = StObject.set(x, "readCoverage", js.undefined)
    
    inline def setReferenceSeq(value: MolecularSequenceReferenceSeq): Self = StObject.set(x, "referenceSeq", value.asInstanceOf[js.Any])
    
    inline def setReferenceSeqUndefined: Self = StObject.set(x, "referenceSeq", js.undefined)
    
    inline def setRepository(value: js.Array[MolecularSequenceRepository]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRepositoryVarargs(value: MolecularSequenceRepository*): Self = StObject.set(x, "repository", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MolecularSequence): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecimen(value: Reference): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setStructureVariant(value: js.Array[MolecularSequenceStructureVariant]): Self = StObject.set(x, "structureVariant", value.asInstanceOf[js.Any])
    
    inline def setStructureVariantUndefined: Self = StObject.set(x, "structureVariant", js.undefined)
    
    inline def setStructureVariantVarargs(value: MolecularSequenceStructureVariant*): Self = StObject.set(x, "structureVariant", js.Array(value*))
    
    inline def setType(value: aa | dna | rna): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariant(value: js.Array[MolecularSequenceVariant]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setVariantVarargs(value: MolecularSequenceVariant*): Self = StObject.set(x, "variant", js.Array(value*))
    
    inline def set_observedSeq(value: Element): Self = StObject.set(x, "_observedSeq", value.asInstanceOf[js.Any])
    
    inline def set_observedSeqUndefined: Self = StObject.set(x, "_observedSeq", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
