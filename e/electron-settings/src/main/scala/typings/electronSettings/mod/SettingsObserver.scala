package typings.electronSettings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsObserver extends js.Object {
  /**
    * Disposes of this Observer instance.
    */
  def dispose(): Unit = js.native
}

object SettingsObserver {
  @scala.inline
  def apply(dispose: () => Unit): SettingsObserver = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[SettingsObserver]
  }
  @scala.inline
  implicit class SettingsObserverOps[Self <: SettingsObserver] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
  }
  
}

