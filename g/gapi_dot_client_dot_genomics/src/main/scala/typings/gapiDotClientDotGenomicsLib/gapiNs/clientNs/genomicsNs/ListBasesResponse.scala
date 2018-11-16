package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListBasesResponse extends js.Object {
  /**
               * The continuation token, which is used to page through large result sets.
               * Provide this value in a subsequent request to return the next page of
               * results. This field will be empty if there aren't any additional results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The offset position (0-based) of the given `sequence` from the
               * start of this `Reference`. This value will differ for each page
               * in a paginated request.
               */
  var offset: js.UndefOr[java.lang.String] = js.undefined
  /** A substring of the bases that make up this reference. */
  var sequence: js.UndefOr[java.lang.String] = js.undefined
}

