package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Annotations extends js.Object {
  /**
    * A list of annotations.
    */
  var items: js.UndefOr[js.Array[Schema$Annotation]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token to pass in for pagination for the next page. This will not be
    * present if this request does not have more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Total number of annotations found. This may be greater than the number of
    * notes returned in this response if results have been paginated.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$Annotations {
  @scala.inline
  def apply(
    items: js.Array[Schema$Annotation] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): Schema$Annotations = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Annotations]
  }
}

