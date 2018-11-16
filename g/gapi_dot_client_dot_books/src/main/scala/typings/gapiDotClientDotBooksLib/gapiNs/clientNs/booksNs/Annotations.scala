package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Annotations extends js.Object {
  /** A list of annotations. */
  var items: js.UndefOr[js.Array[Annotation]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of annotations found. This may be greater than the number of notes returned in this response if results have been paginated. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

