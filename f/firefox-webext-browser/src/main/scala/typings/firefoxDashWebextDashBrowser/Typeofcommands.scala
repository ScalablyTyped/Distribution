package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.commands.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcommands extends js.Object {
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]]
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def getAll(): js.Promise[js.Array[Command]]
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  def reset(name: String): js.Promise[Unit]
  /* commands functions */
  /**
    * Update the details of an already defined command.
    * @param detail The new description for the command.
    */
  def update(detail: Anon_Description): js.Promise[Unit]
}

object Typeofcommands {
  @scala.inline
  def apply(
    getAll: () => js.Promise[js.Array[Command]],
    onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]],
    reset: String => js.Promise[Unit],
    update: Anon_Description => js.Promise[Unit]
  ): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction0(getAll), onCommand = onCommand.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Typeofcommands]
  }
}

