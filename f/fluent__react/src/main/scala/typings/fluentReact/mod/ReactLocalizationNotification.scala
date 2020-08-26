package typings.fluentReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactLocalizationNotification extends js.Object {
  def relocalize(): Unit = js.native
}

object ReactLocalizationNotification {
  @scala.inline
  def apply(relocalize: () => Unit): ReactLocalizationNotification = {
    val __obj = js.Dynamic.literal(relocalize = js.Any.fromFunction0(relocalize))
    __obj.asInstanceOf[ReactLocalizationNotification]
  }
  @scala.inline
  implicit class ReactLocalizationNotificationOps[Self <: ReactLocalizationNotification] (val x: Self) extends AnyVal {
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
    def setRelocalize(value: () => Unit): Self = this.set("relocalize", js.Any.fromFunction0(value))
  }
  
}

