package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAnnotationsRequest extends js.Object {
  /**
    * Required. The annotation sets to search within. The caller must have
    * `READ` access to these annotation sets.
    * All queried annotation sets must have the same type.
    */
  var annotationSetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The end position of the range on the reference, 0-based exclusive. If
    * referenceId or
    * referenceName
    * must be specified, Defaults to the length of the reference.
    */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 256. The maximum value is 2048.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the reference to query. */
  var referenceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the reference to query, within the reference set associated
    * with this query.
    */
  var referenceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The start position of the range on the reference, 0-based inclusive. If
    * specified,
    * referenceId or
    * referenceName
    * must be specified. Defaults to 0.
    */
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object SearchAnnotationsRequest {
  @scala.inline
  def apply(
    annotationSetIds: js.Array[java.lang.String] = null,
    end: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    referenceId: java.lang.String = null,
    referenceName: java.lang.String = null,
    start: java.lang.String = null
  ): SearchAnnotationsRequest = {
    val __obj = js.Dynamic.literal()
    if (annotationSetIds != null) __obj.updateDynamic("annotationSetIds")(annotationSetIds)
    if (end != null) __obj.updateDynamic("end")(end)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId)
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SearchAnnotationsRequest]
  }
}

