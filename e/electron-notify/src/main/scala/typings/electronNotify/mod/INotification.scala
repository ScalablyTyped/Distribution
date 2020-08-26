package typings.electronNotify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotification extends js.Object {
  var image: js.UndefOr[String] = js.native
  var onClickFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, Unit]] = js.native
  var onCloseFunc: js.UndefOr[js.Function1[/* event */ ICloseNotificationEvent, Unit]] = js.native
  var onShowFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, Unit]] = js.native
  var sound: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var title: String = js.native
  var url: js.UndefOr[String] = js.native
}

object INotification {
  @scala.inline
  def apply(title: String): INotification = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotification]
  }
  @scala.inline
  implicit class INotificationOps[Self <: INotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOnClickFunc(value: /* event */ INotificationEvent => Unit): Self = this.set("onClickFunc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickFunc: Self = this.set("onClickFunc", js.undefined)
    @scala.inline
    def setOnCloseFunc(value: /* event */ ICloseNotificationEvent => Unit): Self = this.set("onCloseFunc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCloseFunc: Self = this.set("onCloseFunc", js.undefined)
    @scala.inline
    def setOnShowFunc(value: /* event */ INotificationEvent => Unit): Self = this.set("onShowFunc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShowFunc: Self = this.set("onShowFunc", js.undefined)
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

