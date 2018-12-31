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

