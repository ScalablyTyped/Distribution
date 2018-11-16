package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryParameter extends js.Object {
  /** [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Required] The type of this parameter. */
  var parameterType: js.UndefOr[QueryParameterType] = js.undefined
  /** [Required] The value of this parameter. */
  var parameterValue: js.UndefOr[QueryParameterValue] = js.undefined
}

