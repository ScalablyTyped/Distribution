package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Display Device options
  */
@js.native
trait Schema$DisplayDevice extends js.Object {
  /**
    * Defines whether the instance has Display enabled.
    */
  var enableDisplay: js.UndefOr[Boolean] = js.native
}

object Schema$DisplayDevice {
  @scala.inline
  def apply(enableDisplay: js.UndefOr[Boolean] = js.undefined): Schema$DisplayDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableDisplay)) __obj.updateDynamic("enableDisplay")(enableDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DisplayDevice]
  }
}

