package typings.electronDashNotify.electronDashNotifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotification extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var onClickFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, Unit]] = js.undefined
  var onCloseFunc: js.UndefOr[js.Function1[/* event */ ICloseNotificationEvent, Unit]] = js.undefined
  var onShowFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, Unit]] = js.undefined
  var sound: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object INotification {
  @scala.inline
  def apply(
    title: String,
    image: String = null,
    onClickFunc: /* event */ INotificationEvent => Unit = null,
    onCloseFunc: /* event */ ICloseNotificationEvent => Unit = null,
    onShowFunc: /* event */ INotificationEvent => Unit = null,
    sound: String = null,
    text: String = null,
    url: String = null
  ): INotification = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onClickFunc != null) __obj.updateDynamic("onClickFunc")(js.Any.fromFunction1(onClickFunc))
    if (onCloseFunc != null) __obj.updateDynamic("onCloseFunc")(js.Any.fromFunction1(onCloseFunc))
    if (onShowFunc != null) __obj.updateDynamic("onShowFunc")(js.Any.fromFunction1(onShowFunc))
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotification]
  }
}

