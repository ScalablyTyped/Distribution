package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueMapValEntry extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[MapValue] = js.undefined
}

object ValueMapValEntry {
  @scala.inline
  def apply(key: java.lang.String = null, value: MapValue = null): ValueMapValEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ValueMapValEntry]
  }
}

