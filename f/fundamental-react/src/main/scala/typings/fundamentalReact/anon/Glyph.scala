package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Glyph extends js.Object {
  var callback: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
  ] = js.undefined
  var glyph: String
  var label: js.UndefOr[String] = js.undefined
  var menu: js.UndefOr[ReactNode] = js.undefined
  var notificationCount: Double
}

object Glyph {
  @scala.inline
  def apply(
    glyph: String,
    notificationCount: Double,
    callback: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit = null,
    label: String = null,
    menu: ReactNode = null
  ): Glyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], notificationCount = notificationCount.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
}

