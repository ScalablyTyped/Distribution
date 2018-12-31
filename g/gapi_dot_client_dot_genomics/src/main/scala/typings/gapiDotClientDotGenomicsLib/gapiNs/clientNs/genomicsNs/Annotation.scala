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

