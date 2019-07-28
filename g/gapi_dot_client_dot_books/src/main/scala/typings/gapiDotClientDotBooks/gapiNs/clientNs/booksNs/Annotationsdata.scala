package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotationsdata extends js.Object {
  /** A list of Annotation Data. */
  var items: js.UndefOr[js.Array[Annotationdata]] = js.undefined
  /** Resource type */
  var kind: js.UndefOr[String] = js.undefined
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The total number of volume annotations found. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object Annotationsdata {
  @scala.inline
  def apply(
    items: js.Array[Annotationdata] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): Annotationsdata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotationsdata]
  }
}

