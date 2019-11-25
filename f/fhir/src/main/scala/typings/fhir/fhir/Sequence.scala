package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a biological sequence
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Sequence extends DomainResource {
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
  @scala.inline
  def apply(
    coordinateSystem: integer,
    _coordinateSystem: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _observedSeq: Element = null,
    _readCoverage: Element = null,
    _resourceType: Element = null,
    _type: Element = null,
    contained: js.Array[Resource] = null,
    device: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    observedSeq: String = null,
    patient: Reference = null,
    performer: Reference = null,
    pointer: js.Array[Reference] = null,
    quality: js.Array[SequenceQuality] = null,
    quantity: Quantity = null,
    readCoverage: Int | Double = null,
    referenceSeq: SequenceReferenceSeq = null,
    repository: js.Array[SequenceRepository] = null,
    resourceType: code = null,
    specimen: Reference = null,
    text: Narrative = null,
    `type`: code = null,
    variant: js.Array[SequenceVariant] = null
  ): Sequence = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    if (_coordinateSystem != null) __obj.updateDynamic("_coordinateSystem")(_coordinateSystem.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_observedSeq != null) __obj.updateDynamic("_observedSeq")(_observedSeq.asInstanceOf[js.Any])
    if (_readCoverage != null) __obj.updateDynamic("_readCoverage")(_readCoverage.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (observedSeq != null) __obj.updateDynamic("observedSeq")(observedSeq.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (readCoverage != null) __obj.updateDynamic("readCoverage")(readCoverage.asInstanceOf[js.Any])
    if (referenceSeq != null) __obj.updateDynamic("referenceSeq")(referenceSeq.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (specimen != null) __obj.updateDynamic("specimen")(specimen.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequence]
  }
}

