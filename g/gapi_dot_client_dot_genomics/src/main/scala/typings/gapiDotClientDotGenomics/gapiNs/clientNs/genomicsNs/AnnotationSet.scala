package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationSet extends js.Object {
  /** The dataset to which this annotation set belongs. */
  var datasetId: js.UndefOr[String] = js.undefined
  /** The server-generated annotation set ID, unique across all annotation sets. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  /** The display name for this annotation set. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The ID of the reference set that defines the coordinate space for this
    * set's annotations.
    */
  var referenceSetId: js.UndefOr[String] = js.undefined
  /**
    * The source URI describing the file from which this annotation set was
    * generated, if any.
    */
  var sourceUri: js.UndefOr[String] = js.undefined
  /** The type of annotations contained within this set. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnnotationSet {
  @scala.inline
  def apply(
    datasetId: String = null,
    id: String = null,
    info: Record[String, js.Array[_]] = null,
    name: String = null,
    referenceSetId: String = null,
    sourceUri: String = null,
    `type`: String = null
  ): AnnotationSet = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (info != null) __obj.updateDynamic("info")(info)
    if (name != null) __obj.updateDynamic("name")(name)
    if (referenceSetId != null) __obj.updateDynamic("referenceSetId")(referenceSetId)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnnotationSet]
  }
}

