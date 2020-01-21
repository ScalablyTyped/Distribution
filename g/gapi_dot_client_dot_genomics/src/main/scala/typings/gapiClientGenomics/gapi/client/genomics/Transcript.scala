package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transcript extends js.Object {
  /**
    * The range of the coding sequence for this transcript, if any. To determine
    * the exact ranges of coding sequence, intersect this range with those of the
    * exons, if any. If there are any
    * exons, the
    * codingSequence must start
    * and end within them.
    *
    * Note that in some cases, the reference genome will not exactly match the
    * observed mRNA transcript e.g. due to variance in the source genome from
    * reference. In these cases,
    * exon.frame will not necessarily
    * match the expected reference reading frame and coding exon reference bases
    * cannot necessarily be concatenated to produce the original transcript mRNA.
    */
  var codingSequence: js.UndefOr[CodingSequence] = js.undefined
  /**
    * The <a href="http://en.wikipedia.org/wiki/Exon">exons</a> that compose
    * this transcript. This field should be unset for genomes where transcript
    * splicing does not occur, for example prokaryotes.
    *
    * Introns are regions of the transcript that are not included in the
    * spliced RNA product. Though not explicitly modeled here, intron ranges can
    * be deduced; all regions of this transcript that are not exons are introns.
    *
    * Exonic sequences do not necessarily code for a translational product
    * (amino acids). Only the regions of exons bounded by the
    * codingSequence correspond
    * to coding DNA sequence.
    *
    * Exons are ordered by start position and may not overlap.
    */
  var exons: js.UndefOr[js.Array[Exon]] = js.undefined
  /** The annotation ID of the gene from which this transcript is transcribed. */
  var geneId: js.UndefOr[String] = js.undefined
}

object Transcript {
  @scala.inline
  def apply(codingSequence: CodingSequence = null, exons: js.Array[Exon] = null, geneId: String = null): Transcript = {
    val __obj = js.Dynamic.literal()
    if (codingSequence != null) __obj.updateDynamic("codingSequence")(codingSequence.asInstanceOf[js.Any])
    if (exons != null) __obj.updateDynamic("exons")(exons.asInstanceOf[js.Any])
    if (geneId != null) __obj.updateDynamic("geneId")(geneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transcript]
  }
}

