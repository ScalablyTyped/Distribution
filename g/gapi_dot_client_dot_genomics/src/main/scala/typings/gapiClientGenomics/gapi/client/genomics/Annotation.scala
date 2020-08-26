package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
  /** The annotation set to which this annotation belongs. */
  var annotationSetId: js.UndefOr[String] = js.native
  /** The end position of the range on the reference, 0-based exclusive. */
  var end: js.UndefOr[String] = js.native
  /** The server-generated annotation ID, unique across all annotations. */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** The display name of this annotation. */
  var name: js.UndefOr[String] = js.native
  /** The ID of the Google Genomics reference associated with this range. */
  var referenceId: js.UndefOr[String] = js.native
  /**
    * The display name corresponding to the reference specified by
    * `referenceId`, for example `chr1`, `1`, or `chrX`.
    */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * Whether this range refers to the reverse strand, as opposed to the forward
    * strand. Note that regardless of this field, the start/end position of the
    * range always refer to the forward strand.
    */
  var reverseStrand: js.UndefOr[Boolean] = js.native
  /** The start position of the range on the reference, 0-based inclusive. */
  var start: js.UndefOr[String] = js.native
  /**
    * A transcript value represents the assertion that a particular region of
    * the reference genome may be transcribed as RNA. An alternative splicing
    * pattern would be represented as a separate transcript object. This field
    * is only set for annotations of type `TRANSCRIPT`.
    */
  var transcript: js.UndefOr[Transcript] = js.native
  /**
    * The data type for this annotation. Must match the containing annotation
    * set's type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A variant annotation, which describes the effect of a variant on the
    * genome, the coding sequence, and/or higher level consequences at the
    * organism level e.g. pathogenicity. This field is only set for annotations
    * of type `VARIANT`.
    */
  var variant: js.UndefOr[VariantAnnotation] = js.native
}

object Annotation {
  @scala.inline
  def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
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
    def setAnnotationSetId(value: String): Self = this.set("annotationSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationSetId: Self = this.set("annotationSetId", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInfo(value: Record[String, js.Array[_]]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReferenceId(value: String): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceId: Self = this.set("referenceId", js.undefined)
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceName: Self = this.set("referenceName", js.undefined)
    @scala.inline
    def setReverseStrand(value: Boolean): Self = this.set("reverseStrand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseStrand: Self = this.set("reverseStrand", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTranscript(value: Transcript): Self = this.set("transcript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscript: Self = this.set("transcript", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVariant(value: VariantAnnotation): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

