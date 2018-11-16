package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information about a biological sequence
     */

trait Sequence extends DomainResource {
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
  var observedSeq: js.UndefOr[java.lang.String] = js.undefined
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

