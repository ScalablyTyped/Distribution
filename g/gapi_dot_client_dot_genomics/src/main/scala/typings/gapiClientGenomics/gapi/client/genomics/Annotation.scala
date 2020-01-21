package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  /** The annotation set to which this annotation belongs. */
  var annotationSetId: js.UndefOr[String] = js.undefined
  /** The end position of the range on the reference, 0-based exclusive. */
  var end: js.UndefOr[String] = js.undefined
  /** The server-generated annotation ID, unique across all annotations. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  /** The display name of this annotation. */
  var name: js.UndefOr[String] = js.undefined
  /** The ID of the Google Genomics reference associated with this range. */
  var referenceId: js.UndefOr[String] = js.undefined
  /**
    * The display name corresponding to the reference specified by
    * `referenceId`, for example `chr1`, `1`, or `chrX`.
    */
  var referenceName: js.UndefOr[String] = js.undefined
  /**
    * Whether this range refers to the reverse strand, as opposed to the forward
    * strand. Note that regardless of this field, the start/end position of the
    * range always refer to the forward strand.
    */
  var reverseStrand: js.UndefOr[Boolean] = js.undefined
  /** The start position of the range on the reference, 0-based inclusive. */
  var start: js.UndefOr[String] = js.undefined
  /**
    * A transcript value represents the assertion that a particular region of
    * the reference genome may be transcribed as RNA. An alternative splicing
    * pattern would be represented as a separate transcript object. This field
    * is only set for annotations of type `TRANSCRIPT`.
    */
  var transcript: js.UndefOr[Transcript] = js.undefined
  /**
    * The data type for this annotation. Must match the containing annotation
    * set's type.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * A variant annotation, which describes the effect of a variant on the
    * genome, the coding sequence, and/or higher level consequences at the
    * organism level e.g. pathogenicity. This field is only set for annotations
    * of type `VARIANT`.
    */
  var variant: js.UndefOr[VariantAnnotation] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(
    annotationSetId: String = null,
    end: String = null,
    id: String = null,
    info: Record[String, js.Array[_]] = null,
    name: String = null,
    referenceId: String = null,
    referenceName: String = null,
    reverseStrand: js.UndefOr[Boolean] = js.undefined,
    start: String = null,
    transcript: Transcript = null,
    `type`: String = null,
    variant: VariantAnnotation = null
  ): Annotation = {
    val __obj = js.Dynamic.literal()
    if (annotationSetId != null) __obj.updateDynamic("annotationSetId")(annotationSetId.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId.asInstanceOf[js.Any])
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseStrand)) __obj.updateDynamic("reverseStrand")(reverseStrand.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (transcript != null) __obj.updateDynamic("transcript")(transcript.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

