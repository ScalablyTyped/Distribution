package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcommands extends js.Object {
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]] = js.native
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def getAll(): js.Promise[js.Array[typings.firefoxWebextBrowser.browser.commands.Command]] = js.native
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  def reset(name: String): js.Promise[Unit] = js.native
  /* commands functions */
  /**
    * Update the details of an already defined command.
    * @param detail The new description for the command.
    */
  def update(detail: Description): js.Promise[Unit] = js.native
}

object Typeofcommands {
  @scala.inline
  def apply(
    getAll: () => js.Promise[js.Array[typings.firefoxWebextBrowser.browser.commands.Command]],
    onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]],
    reset: String => js.Promise[Unit],
    update: Description => js.Promise[Unit]
  ): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction0(getAll), onCommand = onCommand.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Typeofcommands]
  }
  @scala.inline
  implicit class TypeofcommandsOps[Self <: Typeofcommands] (val x: Self) extends AnyVal {
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
    def setGetAll(value: () => js.Promise[js.Array[typings.firefoxWebextBrowser.browser.commands.Command]]): Self = this.set("getAll", js.Any.fromFunction0(value))
    @scala.inline
    def setOnCommand(value: WebExtEvent[js.Function1[/* command */ String, Unit]]): Self = this.set("onCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: String => js.Promise[Unit]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Description => js.Promise[Unit]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

