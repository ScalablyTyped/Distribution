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
  def apply(fpVal: js.UndefOr[Double] = js.undefined): MapValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fpVal)) __obj.updateDynamic("fpVal")(fpVal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValue]
  }
}

