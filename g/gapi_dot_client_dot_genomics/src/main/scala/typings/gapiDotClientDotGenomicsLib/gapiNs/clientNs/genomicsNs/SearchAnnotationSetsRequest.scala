package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAnnotationSetsRequest extends js.Object {
  /**
    * Required. The dataset IDs to search within. Caller must have `READ` access
    * to these datasets.
    */
  var datasetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Only return annotations sets for which a substring of the name matches this
    * string (case insensitive).
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 128. The maximum value is 1024.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If specified, only annotation sets associated with the given reference set
    * are returned.
    */
  var referenceSetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If specified, only annotation sets that have any of these types are
    * returned.
    */
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

