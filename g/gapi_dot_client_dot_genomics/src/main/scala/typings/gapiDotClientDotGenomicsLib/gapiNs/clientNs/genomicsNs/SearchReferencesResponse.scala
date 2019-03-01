package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReferencesResponse extends js.Object {
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The matching references. */
  var references: js.UndefOr[js.Array[Reference]] = js.undefined
}

object SearchReferencesResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, references: js.Array[Reference] = null): SearchReferencesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (references != null) __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[SearchReferencesResponse]
  }
}

