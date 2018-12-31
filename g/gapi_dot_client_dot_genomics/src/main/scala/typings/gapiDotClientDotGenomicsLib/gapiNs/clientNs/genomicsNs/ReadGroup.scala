package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadGroup extends js.Object {
  /** The dataset to which this read group belongs. */
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  /** A free-form text description of this read group. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The experiment used to generate this read group. */
  var experiment: js.UndefOr[Experiment] = js.undefined
  /**
    * The server-generated read group ID, unique for all read groups.
    * Note: This is different than the @RG ID field in the SAM spec. For that
    * value, see name.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A map of additional read group information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[stdLib.Record[java.lang.String, js.Array[_]]] = js.undefined
  /** The read group name. This corresponds to the @RG ID field in the SAM spec. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The predicted insert size of this read group. The insert size is the length
    * the sequenced DNA fragment from end-to-end, not including the adapters.
    */
  var predictedInsertSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The programs used to generate this read group. Programs are always
    * identical for all read groups within a read group set. For this reason,
    * only the first read group in a returned set will have this field
    * populated.
    */
  var programs: js.UndefOr[js.Array[Program]] = js.undefined
  /** The reference set the reads in this read group are aligned to. */
  var referenceSetId: js.UndefOr[java.lang.String] = js.undefined
  /** A client-supplied sample identifier for the reads in this read group. */
  var sampleId: js.UndefOr[java.lang.String] = js.undefined
}

