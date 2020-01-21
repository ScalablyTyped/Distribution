package typings.favicoJs.favicojs

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
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(js.Any.fromFunction1(dataUrl))
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (elementId != null) __obj.updateDynamic("elementId")(elementId.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FavicoJsOptions]
  }
}

