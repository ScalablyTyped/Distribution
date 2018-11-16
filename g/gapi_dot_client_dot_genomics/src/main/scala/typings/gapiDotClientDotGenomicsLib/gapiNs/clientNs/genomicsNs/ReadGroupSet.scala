package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadGroupSet extends js.Object {
  /** The dataset to which this read group set belongs. */
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  /** The filename of the original source file for this read group set, if any. */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** The server-generated read group set ID, unique for all read group sets. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** A map of additional read group set information. */
  var info: js.UndefOr[stdLib.Record[java.lang.String, js.Array[_]]] = js.undefined
  /**
               * The read group set name. By default this will be initialized to the sample
               * name of the sequenced data contained in this set.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The read groups in this set. There are typically 1-10 read groups in a read
               * group set.
               */
  var readGroups: js.UndefOr[js.Array[ReadGroup]] = js.undefined
  /** The reference set to which the reads in this read group set are aligned. */
  var referenceSetId: js.UndefOr[java.lang.String] = js.undefined
}

