package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCallSetsRequest extends js.Object {
  /**
    * Only return call sets for which a substring of the name matches this
    * string.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 1024.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Restrict the query to call sets within the given variant sets. At least one
    * ID must be provided.
    */
  var variantSetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SearchCallSetsRequest {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    variantSetIds: js.Array[java.lang.String] = null
  ): SearchCallSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (variantSetIds != null) __obj.updateDynamic("variantSetIds")(variantSetIds)
    __obj.asInstanceOf[SearchCallSetsRequest]
  }
}

