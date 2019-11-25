package typings.fabric.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvasDimensionsOptions extends js.Object {
  /**
  	 * Set the given dimensions only as canvas backstore dimensions
  	 */
  var backstoreOnly: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set the given dimensions only as css dimensions
  	 */
  var cssOnly: js.UndefOr[Boolean] = js.undefined
}

object ICanvasDimensionsOptions {
  @scala.inline
  def apply(backstoreOnly: js.UndefOr[Boolean] = js.undefined, cssOnly: js.UndefOr[Boolean] = js.undefined): ICanvasDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backstoreOnly)) __obj.updateDynamic("backstoreOnly")(backstoreOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(cssOnly)) __obj.updateDynamic("cssOnly")(cssOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasDimensionsOptions]
  }
}

