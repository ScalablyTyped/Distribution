package typings.fundamentalReact

import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var callback: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
  ] = js.undefined
  var glyph: String
  var image: String
  var link: js.UndefOr[String] = js.undefined
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object AnonImage {
  @scala.inline
  def apply(
    glyph: String,
    image: String,
    title: String,
    callback: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit = null,
    link: String = null,
    url: String = null
  ): AnonImage = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

