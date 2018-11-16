package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryParameterType extends js.Object {
  /** [Optional] The type of the array's elements, if this is an array. */
  var arrayType: js.UndefOr[QueryParameterType] = js.undefined
  /** [Optional] The types of the fields of this struct, in order, if this is a struct. */
  var structTypes: js.UndefOr[js.Array[gapiDotClientDotBigqueryLib.Anon_Type]] = js.undefined
  /** [Required] The top level type of this field. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

