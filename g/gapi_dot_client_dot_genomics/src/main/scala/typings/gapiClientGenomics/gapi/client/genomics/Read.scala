package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var alignedQuality: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The bases of the read sequence contained in this alignment record,
    * &#42;&#42;without CIGAR operations applied&#42;&#42; (equivalent to SEQ in SAM).
    * `alignedSequence` and `alignedQuality` may be
    * shorter than the full read sequence and quality. This will occur if the
    * alignment is part of a chimeric alignment, or if the read was trimmed. When
    * this occurs, the CIGAR for this read will begin/end with a hard clip
    * operator that will indicate the length of the excised sequence.
    */
  var alignedSequence: js.UndefOr[String] = js.native
  /**
    * The linear alignment for this alignment record. This field is null for
    * unmapped reads.
    */
  var alignment: js.UndefOr[LinearAlignment] = js.native
  /** The fragment is a PCR or optical duplicate (SAM flag 0x400). */
  var duplicateFragment: js.UndefOr[Boolean] = js.native
  /**
    * Whether this read did not pass filters, such as platform or vendor quality
    * controls (SAM flag 0x200).
    */
  var failedVendorQualityChecks: js.UndefOr[Boolean] = js.native
  /** The observed length of the fragment, equivalent to TLEN in SAM. */
  var fragmentLength: js.UndefOr[Double] = js.native
  /** The fragment name. Equivalent to QNAME (query template name) in SAM. */
  var fragmentName: js.UndefOr[String] = js.native
  /**
    * The server-generated read ID, unique across all reads. This is different
    * from the `fragmentName`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /**
    * The mapping of the primary alignment of the
    * `(readNumber+1)%numberReads` read in the fragment. It replaces
    * mate position and mate strand in SAM.
    */
  var nextMatePosition: js.UndefOr[Position] = js.native
  /** The number of reads in the fragment (extension to SAM flag 0x1). */
  var numberReads: js.UndefOr[Double] = js.native
  /**
    * The orientation and the distance between reads from the fragment are
    * consistent with the sequencing protocol (SAM flag 0x2).
    */
  var properPlacement: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the read group this read belongs to. A read belongs to exactly
    * one read group. This is a server-generated ID which is distinct from SAM's
    * RG tag (for that value, see
    * ReadGroup.name).
    */
  var readGroupId: js.UndefOr[String] = js.native
  /**
    * The ID of the read group set this read belongs to. A read belongs to
    * exactly one read group set.
    */
  var readGroupSetId: js.UndefOr[String] = js.native
  /**
    * The read number in sequencing. 0-based and less than numberReads. This
    * field replaces SAM flag 0x40 and 0x80.
    */
  var readNumber: js.UndefOr[Double] = js.native
  /**
    * Whether this alignment is secondary. Equivalent to SAM flag 0x100.
    * A secondary alignment represents an alternative to the primary alignment
    * for this read. Aligners may return secondary alignments if a read can map
    * ambiguously to multiple coordinates in the genome. By convention, each read
    * has one and only one alignment where both `secondaryAlignment`
    * and `supplementaryAlignment` are false.
    */
  var secondaryAlignment: js.UndefOr[Boolean] = js.native
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
  var supplementaryAlignment: js.UndefOr[Boolean] = js.native
}

object Read {
  @scala.inline
  def apply(): Read = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Read]
  }
  @scala.inline
  implicit class ReadOps[Self <: Read] (val x: Self) extends AnyVal {
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
    def setAlignedQualityVarargs(value: Double*): Self = this.set("alignedQuality", js.Array(value :_*))
    @scala.inline
    def setAlignedQuality(value: js.Array[Double]): Self = this.set("alignedQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignedQuality: Self = this.set("alignedQuality", js.undefined)
    @scala.inline
    def setAlignedSequence(value: String): Self = this.set("alignedSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignedSequence: Self = this.set("alignedSequence", js.undefined)
    @scala.inline
    def setAlignment(value: LinearAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setDuplicateFragment(value: Boolean): Self = this.set("duplicateFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateFragment: Self = this.set("duplicateFragment", js.undefined)
    @scala.inline
    def setFailedVendorQualityChecks(value: Boolean): Self = this.set("failedVendorQualityChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedVendorQualityChecks: Self = this.set("failedVendorQualityChecks", js.undefined)
    @scala.inline
    def setFragmentLength(value: Double): Self = this.set("fragmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentLength: Self = this.set("fragmentLength", js.undefined)
    @scala.inline
    def setFragmentName(value: String): Self = this.set("fragmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentName: Self = this.set("fragmentName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInfo(value: Record[String, js.Array[_]]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setNextMatePosition(value: Position): Self = this.set("nextMatePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMatePosition: Self = this.set("nextMatePosition", js.undefined)
    @scala.inline
    def setNumberReads(value: Double): Self = this.set("numberReads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberReads: Self = this.set("numberReads", js.undefined)
    @scala.inline
    def setProperPlacement(value: Boolean): Self = this.set("properPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperPlacement: Self = this.set("properPlacement", js.undefined)
    @scala.inline
    def setReadGroupId(value: String): Self = this.set("readGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadGroupId: Self = this.set("readGroupId", js.undefined)
    @scala.inline
    def setReadGroupSetId(value: String): Self = this.set("readGroupSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadGroupSetId: Self = this.set("readGroupSetId", js.undefined)
    @scala.inline
    def setReadNumber(value: Double): Self = this.set("readNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadNumber: Self = this.set("readNumber", js.undefined)
    @scala.inline
    def setSecondaryAlignment(value: Boolean): Self = this.set("secondaryAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryAlignment: Self = this.set("secondaryAlignment", js.undefined)
    @scala.inline
    def setSupplementaryAlignment(value: Boolean): Self = this.set("supplementaryAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupplementaryAlignment: Self = this.set("supplementaryAlignment", js.undefined)
  }
  
}

