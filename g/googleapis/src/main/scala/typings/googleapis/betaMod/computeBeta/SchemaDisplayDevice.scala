package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Display Device options
  */
@js.native
trait SchemaDisplayDevice extends js.Object {
  /**
    * Defines whether the instance has Display enabled.
    */
  var enableDisplay: js.UndefOr[Boolean] = js.native
}

object SchemaDisplayDevice {
  @scala.inline
  def apply(enableDisplay: js.UndefOr[Boolean] = js.undefined): SchemaDisplayDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableDisplay)) __obj.updateDynamic("enableDisplay")(enableDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisplayDevice]
  }
}

