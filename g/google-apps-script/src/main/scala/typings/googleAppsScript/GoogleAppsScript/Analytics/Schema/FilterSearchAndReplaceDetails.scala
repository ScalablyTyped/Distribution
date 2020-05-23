package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSearchAndReplaceDetails extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var fieldIndex: js.UndefOr[Double] = js.undefined
  var replaceString: js.UndefOr[String] = js.undefined
  var searchString: js.UndefOr[String] = js.undefined
}

object FilterSearchAndReplaceDetails {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    fieldIndex: js.UndefOr[Double] = js.undefined,
    replaceString: String = null,
    searchString: String = null
  ): FilterSearchAndReplaceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldIndex)) __obj.updateDynamic("fieldIndex")(fieldIndex.get.asInstanceOf[js.Any])
    if (replaceString != null) __obj.updateDynamic("replaceString")(replaceString.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSearchAndReplaceDetails]
  }
}

