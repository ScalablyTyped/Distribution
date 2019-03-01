package typings
package atGoogleDashCloudPromisifyLib.atGoogleDashCloudPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyOptions extends js.Object {
  /**
    * Resolve the promise with single arg instead of an array.
    */
  var singular: js.UndefOr[scala.Boolean] = js.undefined
}

object PromisifyOptions {
  @scala.inline
  def apply(singular: js.UndefOr[scala.Boolean] = js.undefined): PromisifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(singular)) __obj.updateDynamic("singular")(singular)
    __obj.asInstanceOf[PromisifyOptions]
  }
}

