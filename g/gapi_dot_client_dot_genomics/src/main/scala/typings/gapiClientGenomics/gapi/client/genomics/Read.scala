package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Read extends js.Object {
  /**
    * The quality of the read sequence contained in this alignment record
    * (equivalent to QUAL in SAM).
    * `alignedSequence` and `alignedQuality` may be shorter than the full read
    * sequence and quality. This will occur if the alignment is part of a
    * chimeric alignment, or if the read was trimmed. When this occurs, the CIGAR
    * for this read will begin/end with a hard clip operator that will indicate
    * the length of the excised sequence.
    */
  var alignedQuality: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The bases of the read sequence contained in this alignment record,
    * &#42;&#42;without CIGAR operations applied&#42;&#42; (equivalent to SEQ in SAM).
    * `alignedSequence` and `alignedQuality` may be
    * shorter than the full read sequence and quality. This will occur if the
    * alignment is part of a chimeric alignment, or if the read was trimmed. When
    * this occurs, the CIGAR for this read will begin/end with a hard clip
    * operator that will indicate the length of the excised sequence.
    */
  var alignedSequence: js.UndefOr[String] = js.undefined
  /**
    * The linear alignment for this alignment record. This field is null for
    * unmapped reads.
    */
  var alignment: js.UndefOr[LinearAlignment] = js.undefined
  /** The fragment is a PCR or optical duplicate (SAM flag 0x400). */
  var duplicateFragment: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this read did not pass filters, such as platform or vendor quality
    * controls (SAM flag 0x200).
    */
  var failedVendorQualityChecks: js.UndefOr[Boolean] = js.undefined
  /** The observed length of the fragment, equivalent to TLEN in SAM. */
  var fragmentLength: js.UndefOr[Double] = js.undefined
  /** The fragment name. Equivalent to QNAME (query template name) in SAM. */
  var fragmentName: js.UndefOr[String] = js.undefined
  /**
    * The server-generated read ID, unique across all reads. This is different
    * from the `fragmentName`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  /**
    * The mapping of the primary alignment of the
    * `(readNumber+1)%numberReads` read in the fragment. It replaces
    * mate position and mate strand in SAM.
    */
  var nextMatePosition: js.UndefOr[Position] = js.undefined
  /** The number of reads in the fragment (extension to SAM flag 0x1). */
  var numberReads: js.UndefOr[Double] = js.undefined
  /**
    * The orientation and the distance between reads from the fragment are
    * consistent with the sequencing protocol (SAM flag 0x2).
    */
  var properPlacement: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the read group this read belongs to. A read belongs to exactly
    * one read group. This is a server-generated ID which is distinct from SAM's
    * RG tag (for that value, see
    * ReadGroup.name).
    */
  var readGroupId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the read group set this read belongs to. A read belongs to
    * exactly one read group set.
    */
  var readGroupSetId: js.UndefOr[String] = js.undefined
  /**
    * The read number in sequencing. 0-based and less than numberReads. This
    * field replaces SAM flag 0x40 and 0x80.
    */
  var readNumber: js.UndefOr[Double] = js.undefined
  /**
    * Whether this alignment is secondary. Equivalent to SAM flag 0x100.
    * A secondary alignment represents an alternative to the primary alignment
    * for this read. Aligners may return secondary alignments if a read can map
    * ambiguously to multiple coordinates in the genome. By convention, each read
    * has one and only one alignment where both `secondaryAlignment`
    * and `supplementaryAlignment` are false.
    */
  var secondaryAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this alignment is supplementary. Equivalent to SAM flag 0x800.
    * Supplementary alignments are used in the representation of a chimeric
    * alignment. In a chimeric alignment, a read is split into multiple
    * linear alignments that map to different reference contigs. The first
    * linear alignment in the read will be designated as the representative
    * alignment; the remaining linear alignments will be designated as
    * supplementary alignments. These alignments may have different mapping
    * quality scores. In each linear alignment in a chimeric alignment, the read
    * will be hard clipped. The `alignedSequence` and
    * `alignedQuality` fields in the alignment record will only
    * represent the bases for its respective linear alignment.
    */
  var supplementaryAlignment: js.UndefOr[Boolean] = js.undefined
}

object Read {
  @scala.inline
  def apply(
    alignedQuality: js.Array[Double] = null,
    alignedSequence: String = null,
    alignment: LinearAlignment = null,
    duplicateFragment: js.UndefOr[Boolean] = js.undefined,
    failedVendorQualityChecks: js.UndefOr[Boolean] = js.undefined,
    fragmentLength: js.UndefOr[Double] = js.undefined,
    fragmentName: String = null,
    id: String = null,
    info: Record[String, js.Array[_]] = null,
    nextMatePosition: Position = null,
    numberReads: js.UndefOr[Double] = js.undefined,
    properPlacement: js.UndefOr[Boolean] = js.undefined,
    readGroupId: String = null,
    readGroupSetId: String = null,
    readNumber: js.UndefOr[Double] = js.undefined,
    secondaryAlignment: js.UndefOr[Boolean] = js.undefined,
    supplementaryAlignment: js.UndefOr[Boolean] = js.undefined
  ): Read = {
    val __obj = js.Dynamic.literal()
    if (alignedQuality != null) __obj.updateDynamic("alignedQuality")(alignedQuality.asInstanceOf[js.Any])
    if (alignedSequence != null) __obj.updateDynamic("alignedSequence")(alignedSequence.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(duplicateFragment)) __obj.updateDynamic("duplicateFragment")(duplicateFragment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failedVendorQualityChecks)) __obj.updateDynamic("failedVendorQualityChecks")(failedVendorQualityChecks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentLength)) __obj.updateDynamic("fragmentLength")(fragmentLength.get.asInstanceOf[js.Any])
    if (fragmentName != null) __obj.updateDynamic("fragmentName")(fragmentName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (nextMatePosition != null) __obj.updateDynamic("nextMatePosition")(nextMatePosition.asInstanceOf[js.Any])
    if (!js.isUndefined(numberReads)) __obj.updateDynamic("numberReads")(numberReads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(properPlacement)) __obj.updateDynamic("properPlacement")(properPlacement.get.asInstanceOf[js.Any])
    if (readGroupId != null) __obj.updateDynamic("readGroupId")(readGroupId.asInstanceOf[js.Any])
    if (readGroupSetId != null) __obj.updateDynamic("readGroupSetId")(readGroupSetId.asInstanceOf[js.Any])
    if (!js.isUndefined(readNumber)) __obj.updateDynamic("readNumber")(readNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryAlignment)) __obj.updateDynamic("secondaryAlignment")(secondaryAlignment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supplementaryAlignment)) __obj.updateDynamic("supplementaryAlignment")(supplementaryAlignment.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
}

