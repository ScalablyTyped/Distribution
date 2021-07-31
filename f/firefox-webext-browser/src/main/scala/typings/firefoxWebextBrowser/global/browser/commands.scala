package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.commands.Command
import typings.firefoxWebextBrowser.browser.commands.UpdateDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the xtension.
  *
  * Manifest keys: `commands`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object commands {
  
  @JSGlobal("browser.commands")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  @scala.inline
  def getAll(): js.Promise[js.Array[Command]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[Command]]]
  
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  @JSGlobal("browser.commands.onCommand")
  @js.native
  val onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]] = js.native
  
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  @scala.inline
  def reset(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* commands functions */
  /**
    * Update the details of an already defined command.
    * @param detail The new description for the command.
    */
  @scala.inline
  def update(detail: UpdateDetail): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(detail.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
