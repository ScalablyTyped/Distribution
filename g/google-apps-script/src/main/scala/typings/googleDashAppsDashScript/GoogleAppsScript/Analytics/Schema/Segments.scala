package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segments extends js.Object {
  var items: js.UndefOr[js.Array[Segment]] = js.undefined
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextLink: js.UndefOr[String] = js.undefined
  var previousLink: js.UndefOr[String] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Segments {
  @scala.inline
  def apply(
    items: js.Array[Segment] = null,
    itemsPerPage: Int | Double = null,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    startIndex: Int | Double = null,
    totalResults: Int | Double = null,
    username: String = null
  ): Segments = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Segments]
  }
}

