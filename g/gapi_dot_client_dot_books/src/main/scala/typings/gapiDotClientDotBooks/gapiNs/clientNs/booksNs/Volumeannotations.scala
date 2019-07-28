package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumeannotations extends js.Object {
  /** A list of volume annotations. */
  var items: js.UndefOr[js.Array[Volumeannotation]] = js.undefined
  /** Resource type */
  var kind: js.UndefOr[String] = js.undefined
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The total number of volume annotations found. */
  var totalItems: js.UndefOr[Double] = js.undefined
  /**
    * The version string for all of the volume annotations in this layer (not just the ones in this response). Note: the version string doesn't apply to the
    * annotation data, just the information in this response (e.g. the location of annotations in the book).
    */
  var version: js.UndefOr[String] = js.undefined
}

object Volumeannotations {
  @scala.inline
  def apply(
    items: js.Array[Volumeannotation] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null,
    version: String = null
  ): Volumeannotations = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Volumeannotations]
  }
}

