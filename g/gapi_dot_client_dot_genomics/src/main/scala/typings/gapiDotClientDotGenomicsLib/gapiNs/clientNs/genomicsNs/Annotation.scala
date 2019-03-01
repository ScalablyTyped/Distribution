package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  /** The annotation set to which this annotation belongs. */
  var annotationSetId: js.UndefOr[java.lang.String] = js.undefined
  /** The end position of the range on the reference, 0-based exclusive. */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /** The server-generated annotation ID, unique across all annotations. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[stdLib.Record[java.lang.String, js.Array[_]]] = js.undefined
  /** The display name of this annotation. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the Google Genomics reference associated with this range. */
  var referenceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The display name corresponding to the reference specified by
    * `referenceId`, for example `chr1`, `1`, or `chrX`.
    */
  var referenceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this range refers to the reverse strand, as opposed to the forward
    * strand. Note that regardless of this field, the start/end position of the
    * range always refer to the forward strand.
    */
  var reverseStrand: js.UndefOr[scala.Boolean] = js.undefined
  /** The start position of the range on the reference, 0-based inclusive. */
  var start: js.UndefOr[java.lang.String] = js.undefined
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
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
    annotationSetId: java.lang.String = null,
    end: java.lang.String = null,
    id: java.lang.String = null,
    info: stdLib.Record[java.lang.String, js.Array[_]] = null,
    name: java.lang.String = null,
    referenceId: java.lang.String = null,
    referenceName: java.lang.String = null,
    reverseStrand: js.UndefOr[scala.Boolean] = js.undefined,
    start: java.lang.String = null,
    transcript: Transcript = null,
    `type`: java.lang.String = null,
    variant: VariantAnnotation = null
  ): Annotation = {
    val __obj = js.Dynamic.literal()
    if (annotationSetId != null) __obj.updateDynamic("annotationSetId")(annotationSetId)
    if (end != null) __obj.updateDynamic("end")(end)
    if (id != null) __obj.updateDynamic("id")(id)
    if (info != null) __obj.updateDynamic("info")(info)
    if (name != null) __obj.updateDynamic("name")(name)
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId)
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName)
    if (!js.isUndefined(reverseStrand)) __obj.updateDynamic("reverseStrand")(reverseStrand)
    if (start != null) __obj.updateDynamic("start")(start)
    if (transcript != null) __obj.updateDynamic("transcript")(transcript)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[Annotation]
  }
}

