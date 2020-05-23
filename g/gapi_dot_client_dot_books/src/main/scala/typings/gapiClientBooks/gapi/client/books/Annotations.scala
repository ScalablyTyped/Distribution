package typings.gapiClientBooks.gapi.client.books

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
    totalItems: js.UndefOr[Double] = js.undefined
  ): Annotations = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotations]
  }
}

