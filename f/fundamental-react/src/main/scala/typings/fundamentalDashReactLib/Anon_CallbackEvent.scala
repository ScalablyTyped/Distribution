package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEvent extends js.Object {
  var callback: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var glyph: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var menu: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var notificationCount: scala.Double
}

object Anon_CallbackEvent {
  @scala.inline
  def apply(
    glyph: java.lang.String,
    notificationCount: scala.Double,
    callback: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent] => scala.Unit = null,
    label: java.lang.String = null,
    menu: reactLib.reactMod.ReactNode = null
  ): Anon_CallbackEvent = {
    val __obj = js.Dynamic.literal(glyph = glyph, notificationCount = notificationCount)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (label != null) __obj.updateDynamic("label")(label)
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackEvent]
  }
}

