package typings.fundamentalDashReact

import typings.fundamentalDashReact.libIconIconMod.IconSize
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[ReactNode] = js.undefined
  var size: js.UndefOr[IconSize] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => Unit = null,
    glyph: String = null,
    link: String = null,
    name: ReactNode = null,
    size: IconSize = null,
    url: String = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (link != null) __obj.updateDynamic("link")(link)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Args]
  }
}

