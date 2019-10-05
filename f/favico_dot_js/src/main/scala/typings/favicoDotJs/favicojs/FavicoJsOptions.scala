package typings.favicoDotJs.favicojs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FavicoJsOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var bgColor: js.UndefOr[String] = js.undefined
  var dataUrl: js.UndefOr[js.Function1[/* url */ String, _]] = js.undefined
  var element: js.UndefOr[HTMLElement] = js.undefined
  var elementId: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object FavicoJsOptions {
  @scala.inline
  def apply(
    animation: String = null,
    bgColor: String = null,
    dataUrl: /* url */ String => _ = null,
    element: HTMLElement = null,
    elementId: String = null,
    fontFamily: String = null,
    fontStyle: String = null,
    position: String = null,
    textColor: String = null,
    `type`: String = null
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

