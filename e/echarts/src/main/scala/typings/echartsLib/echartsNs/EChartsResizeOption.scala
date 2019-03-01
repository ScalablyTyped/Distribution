package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsResizeOption extends js.Object {
  /**
    * Chart height.
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Specify whether or not to prevent triggering events.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Chart width.
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object EChartsResizeOption {
  @scala.inline
  def apply(
    height: scala.Double | java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null
  ): EChartsResizeOption = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsResizeOption]
  }
}

