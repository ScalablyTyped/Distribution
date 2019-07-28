package typings.fundamentalDashReact

import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEventGlyph extends js.Object {
  var callback: js.UndefOr[
    js.Function1[/* event */ MouseEvent[HTMLButtonElement, typings.std.MouseEvent], Unit]
  ] = js.undefined
  var glyph: String
  var image: String
  var link: js.UndefOr[String] = js.undefined
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object Anon_CallbackEventGlyph {
  @scala.inline
  def apply(
    glyph: String,
    image: String,
    title: String,
    callback: /* event */ MouseEvent[HTMLButtonElement, typings.std.MouseEvent] => Unit = null,
    link: String = null,
    url: String = null
  ): Anon_CallbackEventGlyph = {
    val __obj = js.Dynamic.literal(glyph = glyph, image = image, title = title)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (link != null) __obj.updateDynamic("link")(link)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_CallbackEventGlyph]
  }
}

