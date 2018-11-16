package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchVariantSetsRequest extends js.Object {
  /**
               * Exactly one dataset ID must be provided here. Only variant sets which
               * belong to this dataset will be returned.
               */
  var datasetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
}

