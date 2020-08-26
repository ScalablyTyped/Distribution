package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base class for commands that modify floating object settings.
  */
@js.native
trait ChangeFloatingObjectPropertyCommandBase[T] extends js.Object {
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  def execute(settings: T): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[T] = js.native
}

object ChangeFloatingObjectPropertyCommandBase {
  @scala.inline
  def apply[T](execute: T => Boolean, getState: () => CommandState[T]): ChangeFloatingObjectPropertyCommandBase[T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectPropertyCommandBase[T]]
  }
  @scala.inline
  implicit class ChangeFloatingObjectPropertyCommandBaseOps[Self <: ChangeFloatingObjectPropertyCommandBase[_], T] (val x: Self with ChangeFloatingObjectPropertyCommandBase[T]) extends AnyVal {
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
    def setExecute(value: T => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    @scala.inline
    def setGetState(value: () => CommandState[T]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
  
}

