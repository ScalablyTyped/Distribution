package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxIframeSettings extends js.Object {
  /**
    * Iframe tag attributes
    */
  var attr: js.UndefOr[FancyBoxPlainObject] = js.undefined
  /**
    * Custom CSS styling for iframe wrapping element
    * You can use this to set custom iframe dimensions
    */
  var css: js.UndefOr[FancyBoxPlainObject] = js.undefined
  /**
    * Preload iframe before displaying it
    * This allows to calculate iframe content width and height
    * (note: Due to "Same Origin Policy", you can't get cross domain data).
    */
  var preload: js.UndefOr[Boolean] = js.undefined
  /**
    * Iframe template
    */
  var tpl: js.UndefOr[String] = js.undefined
}

object FancyBoxIframeSettings {
  @scala.inline
  def apply(
    attr: FancyBoxPlainObject = null,
    css: FancyBoxPlainObject = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    tpl: String = null
  ): FancyBoxIframeSettings = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxIframeSettings]
  }
}

