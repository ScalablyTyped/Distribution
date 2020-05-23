package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldIndex extends js.Object {
  /** Determines if the filter is case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** Field to use in the filter. */
  var field: js.UndefOr[String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldIndex: js.UndefOr[Double] = js.undefined
  /** Term to replace the search term with. */
  var replaceString: js.UndefOr[String] = js.undefined
  /** Term to search. */
  var searchString: js.UndefOr[String] = js.undefined
}

object FieldIndex {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    fieldIndex: js.UndefOr[Double] = js.undefined,
    replaceString: String = null,
    searchString: String = null
  ): FieldIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldIndex)) __obj.updateDynamic("fieldIndex")(fieldIndex.get.asInstanceOf[js.Any])
    if (replaceString != null) __obj.updateDynamic("replaceString")(replaceString.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldIndex]
  }
}

