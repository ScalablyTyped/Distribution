package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitiveField extends js.Object {
  /** Determines if the filter is case sensitive. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Field to use in the filter. */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldIndex: js.UndefOr[scala.Double] = js.undefined
  /** Term to replace the search term with. */
  var replaceString: js.UndefOr[java.lang.String] = js.undefined
  /** Term to search. */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CaseSensitiveField {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    fieldIndex: scala.Int | scala.Double = null,
    replaceString: java.lang.String = null,
    searchString: java.lang.String = null
  ): Anon_CaseSensitiveField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    if (replaceString != null) __obj.updateDynamic("replaceString")(replaceString)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    __obj.asInstanceOf[Anon_CaseSensitiveField]
  }
}

