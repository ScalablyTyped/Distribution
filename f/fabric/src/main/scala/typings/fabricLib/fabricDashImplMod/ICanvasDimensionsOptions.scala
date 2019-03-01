package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvasDimensionsOptions extends js.Object {
  /**
  	 * Set the given dimensions only as canvas backstore dimensions
  	 */
  var backstoreOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set the given dimensions only as css dimensions
  	 */
  var cssOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object ICanvasDimensionsOptions {
  @scala.inline
  def apply(
    backstoreOnly: js.UndefOr[scala.Boolean] = js.undefined,
    cssOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): ICanvasDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backstoreOnly)) __obj.updateDynamic("backstoreOnly")(backstoreOnly)
    if (!js.isUndefined(cssOnly)) __obj.updateDynamic("cssOnly")(cssOnly)
    __obj.asInstanceOf[ICanvasDimensionsOptions]
  }
}

