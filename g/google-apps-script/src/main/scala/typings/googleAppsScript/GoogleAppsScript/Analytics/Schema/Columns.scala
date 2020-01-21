package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Column]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
}

object Columns {
  @scala.inline
  def apply(
    attributeNames: js.Array[String] = null,
    etag: String = null,
    items: js.Array[Column] = null,
    kind: String = null,
    totalResults: Int | Double = null
  ): Columns = {
    val __obj = js.Dynamic.literal()
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

