package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandManagerCommands extends js.Object {
  /** A method that defines whether the command is executable at the moment or not.
    */
  var canExecute: js.UndefOr[js.Any] = js.native
  /** A method that defines what to be executed when the key combination is recognized.
    */
  var execute: js.UndefOr[js.Any] = js.native
  /** Defines a combination of keys and key modifiers, on recognition of which the command will be executed
    */
  var gesture: js.UndefOr[CommandManagerCommandsGesture] = js.native
  /** Defines any additional parameters that are required at runtime
    * @Default {null}
    */
  var parameter: js.UndefOr[js.Any] = js.native
}

object CommandManagerCommands {
  @scala.inline
  def apply(): CommandManagerCommands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandManagerCommands]
  }
  @scala.inline
  implicit class CommandManagerCommandsOps[Self <: CommandManagerCommands] (val x: Self) extends AnyVal {
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
    def setCanExecute(value: js.Any): Self = this.set("canExecute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanExecute: Self = this.set("canExecute", js.undefined)
    @scala.inline
    def setExecute(value: js.Any): Self = this.set("execute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    @scala.inline
    def setGesture(value: CommandManagerCommandsGesture): Self = this.set("gesture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGesture: Self = this.set("gesture", js.undefined)
    @scala.inline
    def setParameter(value: js.Any): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
  }
  
}

