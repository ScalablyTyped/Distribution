package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatafeedStatusError extends js.Object {
  /** The code of the error, e.g., "validation/invalid_value". */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** The number of occurrences of the error in the feed. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** A list of example occurrences of the error, grouped by product. */
  var examples: js.UndefOr[js.Array[DatafeedStatusExample]] = js.undefined
  /** The error message, e.g., "Invalid price". */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

