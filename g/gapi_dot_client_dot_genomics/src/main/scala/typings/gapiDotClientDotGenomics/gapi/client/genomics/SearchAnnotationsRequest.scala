package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAnnotationsRequest extends js.Object {
  /**
    * Required. The annotation sets to search within. The caller must have
    * `READ` access to these annotation sets.
    * All queried annotation sets must have the same type.
    */
  var annotationSetIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The end position of the range on the reference, 0-based exclusive. If
    * referenceId or
    * referenceName
    * must be specified, Defaults to the length of the reference.
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
  /** The ID of the reference to query. */
  var referenceId: js.UndefOr[String] = js.undefined
  /**
    * The name of the reference to query, within the reference set associated
    * with this query.
    */
  var referenceName: js.UndefOr[String] = js.undefined
  /**
    * The start position of the range on the reference, 0-based inclusive. If
    * specified,
    * referenceId or
    * referenceName
    * must be specified. Defaults to 0.
    */
  var start: js.UndefOr[String] = js.undefined
}

object SearchAnnotationsRequest {
  @scala.inline
  def apply(
    annotationSetIds: js.Array[String] = null,
    end: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    referenceId: String = null,
    referenceName: String = null,
    start: String = null
  ): SearchAnnotationsRequest = {
    val __obj = js.Dynamic.literal()
    if (annotationSetIds != null) __obj.updateDynamic("annotationSetIds")(annotationSetIds.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId.asInstanceOf[js.Any])
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAnnotationsRequest]
  }
}

