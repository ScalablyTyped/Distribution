package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeOptions extends js.Object {
  /** The high value in the range. */
  var high: js.Any
  /** The low value in the range. */
  var low: js.Any
}

object RangeOptions {
  @scala.inline
  def apply(high: js.Any, low: js.Any): RangeOptions = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeOptions]
  }
}

