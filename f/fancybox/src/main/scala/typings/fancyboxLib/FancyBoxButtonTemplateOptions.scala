package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxButtonTemplateOptions extends js.Object {
  var arrowLeft: js.UndefOr[java.lang.String] = js.undefined
  var arrowRight: js.UndefOr[java.lang.String] = js.undefined
  var close: js.UndefOr[java.lang.String] = js.undefined
  var download: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This small close button will be appended to your html/inline/ajax content by default,
    * if "smallBtn" option is not set to false
    */
  var smallBtn: js.UndefOr[java.lang.String] = js.undefined
  var zoom: js.UndefOr[java.lang.String] = js.undefined
}

object FancyBoxButtonTemplateOptions {
  @scala.inline
  def apply(
    arrowLeft: java.lang.String = null,
    arrowRight: java.lang.String = null,
    close: java.lang.String = null,
    download: java.lang.String = null,
    smallBtn: java.lang.String = null,
    zoom: java.lang.String = null
  ): FancyBoxButtonTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowLeft != null) __obj.updateDynamic("arrowLeft")(arrowLeft)
    if (arrowRight != null) __obj.updateDynamic("arrowRight")(arrowRight)
    if (close != null) __obj.updateDynamic("close")(close)
    if (download != null) __obj.updateDynamic("download")(download)
    if (smallBtn != null) __obj.updateDynamic("smallBtn")(smallBtn)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[FancyBoxButtonTemplateOptions]
  }
}

