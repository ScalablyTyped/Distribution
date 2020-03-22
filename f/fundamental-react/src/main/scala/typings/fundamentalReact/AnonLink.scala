package typings.fundamentalReact

import typings.fundamentalReact.iconMod.IconSize
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLink extends js.Object {
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[ReactNode] = js.undefined
  var size: js.UndefOr[IconSize] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonLink {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => Unit = null,
    glyph: String = null,
    link: String = null,
    name: ReactNode = null,
    size: IconSize = null,
    url: String = null
  ): AnonLink = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLink]
  }
}

