package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var callback: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
  ] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var noNotificationsBody: js.UndefOr[ReactNode] = js.undefined
  var notificationCount: Double
  var notificationsBody: js.UndefOr[ReactNode] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    notificationCount: Double,
    callback: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit = null,
    label: String = null,
    noNotificationsBody: ReactNode = null,
    notificationsBody: ReactNode = null
  ): Label = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (noNotificationsBody != null) __obj.updateDynamic("noNotificationsBody")(noNotificationsBody.asInstanceOf[js.Any])
    if (notificationsBody != null) __obj.updateDynamic("notificationsBody")(notificationsBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

