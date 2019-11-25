package typings.atGoogleDashCloudPromisify.atGoogleDashCloudPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyAllOptions extends PromisifyOptions {
  /**
    * Array of methods to ignore when promisifying.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
}

object PromisifyAllOptions {
  @scala.inline
  def apply(exclude: js.Array[String] = null, singular: js.UndefOr[Boolean] = js.undefined): PromisifyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(singular)) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisifyAllOptions]
  }
}

