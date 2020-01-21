package typings.googleCloudPromisify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyOptions extends js.Object {
  /**
    * Resolve the promise with single arg instead of an array.
    */
  var singular: js.UndefOr[Boolean] = js.undefined
}

object PromisifyOptions {
  @scala.inline
  def apply(singular: js.UndefOr[Boolean] = js.undefined): PromisifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(singular)) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisifyOptions]
  }
}

