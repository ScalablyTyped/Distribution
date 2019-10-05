package typings.gapiDotClientDotGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadGroupSet extends js.Object {
  /** The dataset to which this read group set belongs. */
  var datasetId: js.UndefOr[String] = js.undefined
  /** The filename of the original source file for this read group set, if any. */
  var filename: js.UndefOr[String] = js.undefined
  /** The server-generated read group set ID, unique for all read group sets. */
  var id: js.UndefOr[String] = js.undefined
  /** A map of additional read group set information. */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  /**
    * The read group set name. By default this will be initialized to the sample
    * name of the sequenced data contained in this set.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The read groups in this set. There are typically 1-10 read groups in a read
    * group set.
    */
  var readGroups: js.UndefOr[js.Array[ReadGroup]] = js.undefined
  /** The reference set to which the reads in this read group set are aligned. */
  var referenceSetId: js.UndefOr[String] = js.undefined
}

object ReadGroupSet {
  @scala.inline
  def apply(
    datasetId: String = null,
    filename: String = null,
    id: String = null,
    info: Record[String, js.Array[_]] = null,
    name: String = null,
    readGroups: js.Array[ReadGroup] = null,
    referenceSetId: String = null
  ): ReadGroupSet = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (id != null) __obj.updateDynamic("id")(id)
    if (info != null) __obj.updateDynamic("info")(info)
    if (name != null) __obj.updateDynamic("name")(name)
    if (readGroups != null) __obj.updateDynamic("readGroups")(readGroups)
    if (referenceSetId != null) __obj.updateDynamic("referenceSetId")(referenceSetId)
    __obj.asInstanceOf[ReadGroupSet]
  }
}

