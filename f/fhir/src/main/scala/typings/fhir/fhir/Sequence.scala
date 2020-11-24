package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a biological sequence
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Sequence extends DomainResource {
  
  /**
    * Contains extended information for property 'coordinateSystem'.
    */
  var _coordinateSystem: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'observedSeq'.
    */
  var _observedSeq: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'readCoverage'.
    */
  var _readCoverage: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Base number of coordinate system (0 for 0-based numbering or coordinates, inclusive start, exclusive end, 1 for 1-based numbering, inclusive start, inclusive end)
    */
  var coordinateSystem: integer = js.native
  
  /**
    * The method for sequencing
    */
  var device: js.UndefOr[Reference] = js.native
  
  /**
    * Unique ID for this particular sequence. This is a FHIR-defined id
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Sequence that was observed
    */
  var observedSeq: js.UndefOr[String] = js.native
  
  /**
    * Who and/or what this is about
    */
  var patient: js.UndefOr[Reference] = js.native
  
  /**
    * Who should be responsible for test result
    */
  var performer: js.UndefOr[Reference] = js.native
  
  /**
    * Pointer to next atomic sequence
    */
  var pointer: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * An set of value as quality of sequence
    */
  var quality: js.UndefOr[js.Array[SequenceQuality]] = js.native
  
  /**
    * The number of copies of the seqeunce of interest.  (RNASeq)
    */
  var quantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Average number of reads representing a given nucleotide in the reconstructed sequence
    */
  var readCoverage: js.UndefOr[integer] = js.native
  
  /**
    * A sequence used as reference
    */
  var referenceSeq: js.UndefOr[SequenceReferenceSeq] = js.native
  
  /**
    * External repository which contains detailed report related with observedSeq in this resource
    */
  var repository: js.UndefOr[js.Array[SequenceRepository]] = js.native
  
  /**
    * Specimen used for sequencing
    */
  var specimen: js.UndefOr[Reference] = js.native
  
  /**
    * aa | dna | rna
    */
  var `type`: js.UndefOr[code] = js.native
  
  /**
    * Variant in sequence
    */
  var variant: js.UndefOr[js.Array[SequenceVariant]] = js.native
}
object Sequence {
  
  @scala.inline
  def apply(coordinateSystem: integer): Sequence = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequence]
  }
  
  @scala.inline
  implicit class SequenceOps[Self <: Sequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoordinateSystem(value: integer): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_coordinateSystem(value: Element): Self = this.set("_coordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_coordinateSystem: Self = this.set("_coordinateSystem", js.undefined)
    
    @scala.inline
    def set_observedSeq(value: Element): Self = this.set("_observedSeq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_observedSeq: Self = this.set("_observedSeq", js.undefined)
    
    @scala.inline
    def set_readCoverage(value: Element): Self = this.set("_readCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_readCoverage: Self = this.set("_readCoverage", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def setDevice(value: Reference): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setObservedSeq(value: String): Self = this.set("observedSeq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedSeq: Self = this.set("observedSeq", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    
    @scala.inline
    def setPerformer(value: Reference): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setPointerVarargs(value: Reference*): Self = this.set("pointer", js.Array(value :_*))
    
    @scala.inline
    def setPointer(value: js.Array[Reference]): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointer: Self = this.set("pointer", js.undefined)
    
    @scala.inline
    def setQualityVarargs(value: SequenceQuality*): Self = this.set("quality", js.Array(value :_*))
    
    @scala.inline
    def setQuality(value: js.Array[SequenceQuality]): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setReadCoverage(value: integer): Self = this.set("readCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadCoverage: Self = this.set("readCoverage", js.undefined)
    
    @scala.inline
    def setReferenceSeq(value: SequenceReferenceSeq): Self = this.set("referenceSeq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceSeq: Self = this.set("referenceSeq", js.undefined)
    
    @scala.inline
    def setRepositoryVarargs(value: SequenceRepository*): Self = this.set("repository", js.Array(value :_*))
    
    @scala.inline
    def setRepository(value: js.Array[SequenceRepository]): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setSpecimen(value: Reference): Self = this.set("specimen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecimen: Self = this.set("specimen", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVariantVarargs(value: SequenceVariant*): Self = this.set("variant", js.Array(value :_*))
    
    @scala.inline
    def setVariant(value: js.Array[SequenceVariant]): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
