package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContentCategoriesListResponse extends js.Object {
  /** Content category collection. */
  var contentCategories: js.UndefOr[js.Array[ContentCategory]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#contentCategoriesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

