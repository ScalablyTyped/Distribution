package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReadsRequest extends js.Object {
  /**
    * The end position of the range on the reference, 0-based exclusive. If
    * specified, `referenceName` must also be specified.
    */
  var end: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 256. The maximum value is 2048.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the read groups within which to search for reads. All specified
    * read groups must belong to the same read group sets. Must specify one of
    * `readGroupSetIds` or `readGroupIds`.
    */
  var readGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The IDs of the read groups sets within which to search for reads. All
    * specified read group sets must be aligned against a common set of reference
    * sequences; this defines the genomic coordinates for the query. Must specify
    * one of `readGroupSetIds` or `readGroupIds`.
    */
  var readGroupSetIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The reference sequence name, for example `chr1`, `1`, or `chrX`. If set to
    * `&#42;`, only unmapped reads are returned. If unspecified, all reads (mapped
    * and unmapped) are returned.
    */
  var referenceName: js.UndefOr[String] = js.undefined
  /**
    * The start position of the range on the reference, 0-based inclusive. If
    * specified, `referenceName` must also be specified.
    */
  var start: js.UndefOr[String] = js.undefined
}

object SearchReadsRequest {
  @scala.inline
  def apply(
    end: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    readGroupIds: js.Array[String] = null,
    readGroupSetIds: js.Array[String] = null,
    referenceName: String = null,
    start: String = null
  ): SearchReadsRequest = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (readGroupIds != null) __obj.updateDynamic("readGroupIds")(readGroupIds)
    if (readGroupSetIds != null) __obj.updateDynamic("readGroupSetIds")(readGroupSetIds)
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SearchReadsRequest]
  }
}

