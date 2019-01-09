package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  /** Indicates if the filter expressions are case sensitive. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Expression to extract from field A. */
  var extractA: js.UndefOr[java.lang.String] = js.undefined
  /** Expression to extract from field B. */
  var extractB: js.UndefOr[java.lang.String] = js.undefined
  /** Field A. */
  var fieldA: js.UndefOr[java.lang.String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldAIndex: js.UndefOr[scala.Double] = js.undefined
  /** Indicates if field A is required to match. */
  var fieldARequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Field B. */
  var fieldB: js.UndefOr[java.lang.String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldBIndex: js.UndefOr[scala.Double] = js.undefined
  /** Indicates if field B is required to match. */
  var fieldBRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Expression used to construct the output value. */
  var outputConstructor: js.UndefOr[java.lang.String] = js.undefined
  /** Output field. */
  var outputToField: js.UndefOr[java.lang.String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var outputToFieldIndex: js.UndefOr[scala.Double] = js.undefined
  /** Indicates if the existing value of the output field, if any, should be overridden by the output expression. */
  var overrideOutputField: js.UndefOr[scala.Boolean] = js.undefined
}

