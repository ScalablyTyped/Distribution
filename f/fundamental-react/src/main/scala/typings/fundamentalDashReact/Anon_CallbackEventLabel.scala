package typings.fundamentalDashReact

import typings.react.reactMod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEventLabel extends js.Object {
  var callback: js.UndefOr[
    js.Function1[/* event */ typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
  ] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var noNotificationsBody: js.UndefOr[ReactNode] = js.undefined
  var notificationCount: Double
  var notificationsBody: js.UndefOr[ReactNode] = js.undefined
}

object Anon_CallbackEventLabel {
  @scala.inline
  def apply(
    notificationCount: Double,
    callback: /* event */ typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit = null,
    label: String = null,
    noNotificationsBody: ReactNode = null,
    notificationsBody: ReactNode = null
  ): Anon_CallbackEventLabel = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (label != null) __obj.updateDynamic("label")(label)
    if (noNotificationsBody != null) __obj.updateDynamic("noNotificationsBody")(noNotificationsBody.asInstanceOf[js.Any])
    if (notificationsBody != null) __obj.updateDynamic("notificationsBody")(notificationsBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackEventLabel]
  }
}

