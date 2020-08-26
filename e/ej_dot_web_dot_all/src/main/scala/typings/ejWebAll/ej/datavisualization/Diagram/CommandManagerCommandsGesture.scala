package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandManagerCommandsGesture extends js.Object {
  /** Sets the key value, on recognition of which the command will be executed.
    * @Default {ej.datavisualization.Diagram.Keys.None}
    */
  var key: js.UndefOr[Keys | String] = js.native
  /** Sets a combination of key modifiers, on recognition of which the command will be executed.
    * @Default {ej.datavisualization.Diagram.KeyModifiers.None}
    */
  var keyModifiers: js.UndefOr[KeyModifiers | String] = js.native
}

object CommandManagerCommandsGesture {
  @scala.inline
  def apply(): CommandManagerCommandsGesture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandManagerCommandsGesture]
  }
  @scala.inline
  implicit class CommandManagerCommandsGestureOps[Self <: CommandManagerCommandsGesture] (val x: Self) extends AnyVal {
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
    def setKey(value: Keys | String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyModifiers(value: KeyModifiers | String): Self = this.set("keyModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifiers: Self = this.set("keyModifiers", js.undefined)
  }
  
}

