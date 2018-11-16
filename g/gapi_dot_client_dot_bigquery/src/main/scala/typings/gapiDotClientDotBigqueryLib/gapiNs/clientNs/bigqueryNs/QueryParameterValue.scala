package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryParameterValue extends js.Object {
  /** [Optional] The array values, if this is an array type. */
  var arrayValues: js.UndefOr[js.Array[QueryParameterValue]] = js.undefined
  /** [Optional] The struct field values, in order of the struct type's declaration. */
  var structValues: js.UndefOr[stdLib.Record[java.lang.String, QueryParameterValue]] = js.undefined
  /** [Optional] The value of this value, if a simple scalar type. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

