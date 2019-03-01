package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapValue extends js.Object {
  /** Floating point value. */
  var fpVal: js.UndefOr[scala.Double] = js.undefined
}

object MapValue {
  @scala.inline
  def apply(fpVal: scala.Int | scala.Double = null): MapValue = {
    val __obj = js.Dynamic.literal()
    if (fpVal != null) __obj.updateDynamic("fpVal")(fpVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValue]
  }
}

