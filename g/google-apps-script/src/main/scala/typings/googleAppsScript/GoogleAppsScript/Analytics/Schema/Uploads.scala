package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uploads extends js.Object {
  var items: js.UndefOr[js.Array[Upload]] = js.undefined
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextLink: js.UndefOr[String] = js.undefined
  var previousLink: js.UndefOr[String] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
}

object Uploads {
  @scala.inline
  def apply(
    items: js.Array[Upload] = null,
    itemsPerPage: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    totalResults: js.UndefOr[Double] = js.undefined
  ): Uploads = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsPerPage)) __obj.updateDynamic("itemsPerPage")(itemsPerPage.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalResults)) __obj.updateDynamic("totalResults")(totalResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uploads]
  }
}

