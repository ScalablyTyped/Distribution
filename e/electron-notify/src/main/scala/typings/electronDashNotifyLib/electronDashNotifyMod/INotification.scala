package typings
package electronDashNotifyLib.electronDashNotifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotification extends js.Object {
  var image: js.UndefOr[java.lang.String] = js.undefined
  var onClickFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, scala.Unit]] = js.undefined
  var onCloseFunc: js.UndefOr[js.Function1[/* event */ ICloseNotificationEvent, scala.Unit]] = js.undefined
  var onShowFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, scala.Unit]] = js.undefined
  var sound: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object INotification {
  @scala.inline
  def apply(
    title: java.lang.String,
    image: java.lang.String = null,
    onClickFunc: /* event */ INotificationEvent => scala.Unit = null,
    onCloseFunc: /* event */ ICloseNotificationEvent => scala.Unit = null,
    onShowFunc: /* event */ INotificationEvent => scala.Unit = null,
    sound: java.lang.String = null,
    text: java.lang.String = null,
    url: java.lang.String = null
  ): INotification = {
    val __obj = js.Dynamic.literal(title = title)
    if (image != null) __obj.updateDynamic("image")(image)
    if (onClickFunc != null) __obj.updateDynamic("onClickFunc")(js.Any.fromFunction1(onClickFunc))
    if (onCloseFunc != null) __obj.updateDynamic("onCloseFunc")(js.Any.fromFunction1(onCloseFunc))
    if (onShowFunc != null) __obj.updateDynamic("onShowFunc")(js.Any.fromFunction1(onShowFunc))
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[INotification]
  }
}

