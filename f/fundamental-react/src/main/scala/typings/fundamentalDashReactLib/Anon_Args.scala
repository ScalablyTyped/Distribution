package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var size: js.UndefOr[fundamentalDashReactLib.libIconIconMod.IconSize] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => scala.Unit = null,
    glyph: java.lang.String = null,
    link: java.lang.String = null,
    name: reactLib.reactMod.ReactNode = null,
    size: fundamentalDashReactLib.libIconIconMod.IconSize = null,
    url: java.lang.String = null
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

