package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxVideoOptions extends js.Object {
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var tpl: js.UndefOr[java.lang.String] = js.undefined
}

object FancyBoxVideoOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    tpl: java.lang.String = null
  ): FancyBoxVideoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (format != null) __obj.updateDynamic("format")(format)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[FancyBoxVideoOptions]
  }
}

