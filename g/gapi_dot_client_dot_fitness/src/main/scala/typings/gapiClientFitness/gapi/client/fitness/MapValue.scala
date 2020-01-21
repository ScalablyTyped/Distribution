package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapValue extends js.Object {
  /** Floating point value. */
  var fpVal: js.UndefOr[Double] = js.undefined
}

object MapValue {
  @scala.inline
  def apply(fpVal: Int | Double = null): MapValue = {
    val __obj = js.Dynamic.literal()
    if (fpVal != null) __obj.updateDynamic("fpVal")(fpVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValue]
  }
}

