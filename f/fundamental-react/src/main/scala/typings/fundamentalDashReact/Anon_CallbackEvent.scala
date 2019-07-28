package typings.fundamentalDashReact

import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEvent extends js.Object {
  var callback: js.UndefOr[
    js.Function1[/* event */ MouseEvent[HTMLButtonElement, typings.std.MouseEvent], Unit]
  ] = js.undefined
  var glyph: String
  var label: js.UndefOr[String] = js.undefined
  var menu: js.UndefOr[ReactNode] = js.undefined
  var notificationCount: Double
}

object Anon_CallbackEvent {
  @scala.inline
  def apply(
    glyph: String,
    notificationCount: Double,
    callback: /* event */ MouseEvent[HTMLButtonElement, typings.std.MouseEvent] => Unit = null,
    label: String = null,
    menu: ReactNode = null
  ): Anon_CallbackEvent = {
    val __obj = js.Dynamic.literal(glyph = glyph, notificationCount = notificationCount)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (label != null) __obj.updateDynamic("label")(label)
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackEvent]
  }
}

