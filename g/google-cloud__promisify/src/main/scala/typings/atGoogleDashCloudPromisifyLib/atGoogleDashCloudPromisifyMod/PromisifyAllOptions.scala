package typings
package atGoogleDashCloudPromisifyLib.atGoogleDashCloudPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyAllOptions extends PromisifyOptions {
  /**
    * Array of methods to ignore when promisifying.
    */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PromisifyAllOptions {
  @scala.inline
  def apply(exclude: js.Array[java.lang.String] = null, singular: js.UndefOr[scala.Boolean] = js.undefined): PromisifyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(singular)) __obj.updateDynamic("singular")(singular)
    __obj.asInstanceOf[PromisifyAllOptions]
  }
}

