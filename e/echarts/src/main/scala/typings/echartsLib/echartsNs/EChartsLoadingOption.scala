package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsLoadingOption extends js.Object {
  /**
    * Loading circle color.
    * @default '#c23531'
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mask background color.
    * @default 'rgba(255, 255, 255, 0.8)'
    */
  var maskColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Loading text.
    * @default 'loading'
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Loading text color.
    * @default '#000'
    */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Zlevel of loading. If not 0, it creates a new canvas for loading.
    * @default 0
    */
  var zlevel: js.UndefOr[echartsLib.echartsLibNumbers.`0`] = js.undefined
}

object EChartsLoadingOption {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    maskColor: java.lang.String = null,
    text: java.lang.String = null,
    textColor: java.lang.String = null,
    zlevel: echartsLib.echartsLibNumbers.`0` = null
  ): EChartsLoadingOption = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (maskColor != null) __obj.updateDynamic("maskColor")(maskColor)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel)
    __obj.asInstanceOf[EChartsLoadingOption]
  }
}

