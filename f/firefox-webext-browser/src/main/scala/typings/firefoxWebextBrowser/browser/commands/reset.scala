package typings.firefoxWebextBrowser.browser.commands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.commands.reset")
@js.native
object reset extends js.Object {
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  def apply(name: String): js.Promise[Unit] = js.native
}

