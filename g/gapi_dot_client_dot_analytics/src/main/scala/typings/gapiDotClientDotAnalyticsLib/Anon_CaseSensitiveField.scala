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

