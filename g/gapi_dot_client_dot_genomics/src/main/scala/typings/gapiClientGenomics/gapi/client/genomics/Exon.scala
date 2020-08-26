package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exon extends js.Object {
  /**
    * The end position of the exon on this annotation's reference sequence,
    * 0-based exclusive. Note that this is relative to the reference start, and
    * &#42;not&#42; the containing annotation start.
    */
  var end: js.UndefOr[String] = js.native
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
  var frame: js.UndefOr[Double] = js.native
  /**
    * The start position of the exon on this annotation's reference sequence,
    * 0-based inclusive. Note that this is relative to the reference start, and
    * &#42;&#42;not&#42;&#42; the containing annotation start.
    */
  var start: js.UndefOr[String] = js.native
}

object Exon {
  @scala.inline
  def apply(): Exon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exon]
  }
  @scala.inline
  implicit class ExonOps[Self <: Exon] (val x: Self) extends AnyVal {
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFrame(value: Double): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

