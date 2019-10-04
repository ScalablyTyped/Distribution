package typings.expo.buildNotificationsNotificationsDotTypesMod

import typings.expo.Anon_ChannelId
import typings.expo.Anon_DisplayInForeground
import typings.std.NotificationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalNotification extends js.Object {
  var android: js.UndefOr[Anon_ChannelId] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var categoryId: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var ios: js.UndefOr[Anon_DisplayInForeground] = js.undefined
  var title: String
  var web: js.UndefOr[NotificationOptions] = js.undefined
}

object LocalNotification {
  @scala.inline
  def apply(
    title: String,
    android: Anon_ChannelId = null,
    body: String = null,
    categoryId: String = null,
    data: js.Any = null,
    ios: Anon_DisplayInForeground = null,
    web: NotificationOptions = null
  ): LocalNotification = {
    val __obj = js.Dynamic.literal(title = title)
    if (android != null) __obj.updateDynamic("android")(android)
    if (body != null) __obj.updateDynamic("body")(body)
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId)
    if (data != null) __obj.updateDynamic("data")(data)
    if (ios != null) __obj.updateDynamic("ios")(ios)
    if (web != null) __obj.updateDynamic("web")(web)
    __obj.asInstanceOf[LocalNotification]
  }
}

