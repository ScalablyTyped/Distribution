package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxButtonTemplateOptions extends js.Object {
  var arrowLeft: js.UndefOr[String] = js.undefined
  var arrowRight: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[String] = js.undefined
  var download: js.UndefOr[String] = js.undefined
  /**
    * This small close button will be appended to your html/inline/ajax content by default,
    * if "smallBtn" option is not set to false
    */
  var smallBtn: js.UndefOr[String] = js.undefined
  var zoom: js.UndefOr[String] = js.undefined
}

object FancyBoxButtonTemplateOptions {
  @scala.inline
  def apply(
    arrowLeft: String = null,
    arrowRight: String = null,
    close: String = null,
    download: String = null,
    smallBtn: String = null,
    zoom: String = null
  ): FancyBoxButtonTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowLeft != null) __obj.updateDynamic("arrowLeft")(arrowLeft.asInstanceOf[js.Any])
    if (arrowRight != null) __obj.updateDynamic("arrowRight")(arrowRight.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (smallBtn != null) __obj.updateDynamic("smallBtn")(smallBtn.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxButtonTemplateOptions]
  }
}

