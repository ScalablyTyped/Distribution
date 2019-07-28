package typings.gapiDotClientDotDatastore.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayValue extends js.Object {
  /**
    * Values in the array.
    * The order of this array may not be preserved if it contains a mix of
    * indexed and unindexed values.
    */
  var values: js.UndefOr[js.Array[Value]] = js.undefined
}

object ArrayValue {
  @scala.inline
  def apply(values: js.Array[Value] = null): ArrayValue = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ArrayValue]
  }
}

