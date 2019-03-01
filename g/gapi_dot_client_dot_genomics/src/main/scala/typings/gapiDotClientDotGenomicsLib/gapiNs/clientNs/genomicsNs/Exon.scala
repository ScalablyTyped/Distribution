package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exon extends js.Object {
  /**
    * The end position of the exon on this annotation's reference sequence,
    * 0-based exclusive. Note that this is relative to the reference start, and
    * &#42;not&#42; the containing annotation start.
    */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The frame of this exon. Contains a value of 0, 1, or 2, which indicates
    * the offset of the first coding base of the exon within the reading frame
    * of the coding DNA sequence, if any. This field is dependent on the
    * strandedness of this annotation (see
    * Annotation.reverse_strand).
    * For forward stranded annotations, this offset is relative to the
    * exon.start. For reverse
    * strand annotations, this offset is relative to the
    * exon.end `- 1`.
    *
    * Unset if this exon does not intersect the coding sequence. Upon creation
    * of a transcript, the frame must be populated for all or none of the
    * coding exons.
    */
  var frame: js.UndefOr[scala.Double] = js.undefined
  /**
    * The start position of the exon on this annotation's reference sequence,
    * 0-based inclusive. Note that this is relative to the reference start, and
    * &#42;&#42;not&#42;&#42; the containing annotation start.
    */
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object Exon {
  @scala.inline
  def apply(
    end: java.lang.String = null,
    frame: scala.Int | scala.Double = null,
    start: java.lang.String = null
  ): Exon = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Exon]
  }
}

