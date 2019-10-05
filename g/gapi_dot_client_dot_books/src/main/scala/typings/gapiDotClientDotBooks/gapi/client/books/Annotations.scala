package typings.gapiDotClientDotBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotations extends js.Object {
  /** A list of annotations. */
  var items: js.UndefOr[js.Array[Annotation]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Total number of annotations found. This may be greater than the number of notes returned in this response if results have been paginated. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object Annotations {
  @scala.inline
  def apply(
    items: js.Array[Annotation] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): Annotations = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotations]
  }
}

