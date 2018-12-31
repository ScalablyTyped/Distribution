package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumeannotations extends js.Object {
  /** A list of volume annotations. */
  var items: js.UndefOr[js.Array[Volumeannotation]] = js.undefined
  /** Resource type */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of volume annotations found. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
  /**
    * The version string for all of the volume annotations in this layer (not just the ones in this response). Note: the version string doesn't apply to the
    * annotation data, just the information in this response (e.g. the location of annotations in the book).
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

