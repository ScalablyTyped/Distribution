package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEventGlyph extends js.Object {
  var callback: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var glyph: java.lang.String
  var image: java.lang.String
  var link: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CallbackEventGlyph {
  @scala.inline
  def apply(
    glyph: java.lang.String,
    image: java.lang.String,
    title: java.lang.String,
    callback: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent] => scala.Unit = null,
    link: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_CallbackEventGlyph = {
    val __obj = js.Dynamic.literal(glyph = glyph, image = image, title = title)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (link != null) __obj.updateDynamic("link")(link)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_CallbackEventGlyph]
  }
}

