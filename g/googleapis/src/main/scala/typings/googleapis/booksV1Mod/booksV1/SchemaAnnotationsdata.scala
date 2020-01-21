package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAnnotationsdata extends js.Object {
  /**
    * A list of Annotation Data.
    */
  var items: js.UndefOr[js.Array[SchemaAnnotationdata]] = js.native
  /**
    * Resource type
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token to pass in for pagination for the next page. This will not be
    * present if this request does not have more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of volume annotations found.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaAnnotationsdata {
  @scala.inline
  def apply(
    items: js.Array[SchemaAnnotationdata] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): SchemaAnnotationsdata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotationsdata]
  }
}

