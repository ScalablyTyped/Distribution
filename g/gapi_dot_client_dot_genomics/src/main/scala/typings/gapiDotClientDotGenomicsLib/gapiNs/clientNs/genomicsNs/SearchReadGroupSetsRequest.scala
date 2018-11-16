package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchReadGroupSetsRequest extends js.Object {
  /**
               * Restricts this query to read group sets within the given datasets. At least
               * one ID must be provided.
               */
  var datasetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Only return read group sets for which a substring of the name matches this
               * string.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The maximum number of results to return in a single page. If unspecified,
               * defaults to 256. The maximum value is 1024.
               */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
               * The continuation token, which is used to page through large result sets.
               * To get the next page of results, set this parameter to the value of
               * `nextPageToken` from the previous response.
               */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

