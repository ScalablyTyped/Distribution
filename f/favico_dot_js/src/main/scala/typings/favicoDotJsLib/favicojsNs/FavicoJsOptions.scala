package typings
package favicoDotJsLib.favicojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FavicoJsOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  var dataUrl: js.UndefOr[js.Function1[/* url */ java.lang.String, _]] = js.undefined
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var elementId: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object FavicoJsOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    bgColor: java.lang.String = null,
    dataUrl: /* url */ java.lang.String => _ = null,
    element: stdLib.HTMLElement = null,
    elementId: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontStyle: java.lang.String = null,
    position: java.lang.String = null,
    textColor: java.lang.String = null,
    `type`: java.lang.String = null
  ): FavicoJsOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(js.Any.fromFunction1(dataUrl))
    if (element != null) __obj.updateDynamic("element")(element)
    if (elementId != null) __obj.updateDynamic("elementId")(elementId)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (position != null) __obj.updateDynamic("position")(position)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FavicoJsOptions]
  }
}

