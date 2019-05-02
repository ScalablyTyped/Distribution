package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEventLabel extends js.Object {
  var callback: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var noNotificationsBody: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var notificationCount: scala.Double
  var notificationsBody: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object Anon_CallbackEventLabel {
  @scala.inline
  def apply(
    notificationCount: scala.Double,
    callback: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent] => scala.Unit = null,
    label: java.lang.String = null,
    noNotificationsBody: reactLib.reactMod.ReactNode = null,
    notificationsBody: reactLib.reactMod.ReactNode = null
  ): Anon_CallbackEventLabel = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (label != null) __obj.updateDynamic("label")(label)
    if (noNotificationsBody != null) __obj.updateDynamic("noNotificationsBody")(noNotificationsBody.asInstanceOf[js.Any])
    if (notificationsBody != null) __obj.updateDynamic("notificationsBody")(notificationsBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackEventLabel]
  }
}

