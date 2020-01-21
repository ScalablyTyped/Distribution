package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entrypoint for the application.
  */
@js.native
trait SchemaEntrypoint extends js.Object {
  /**
    * The format should be a shell command that can be fed to bash -c.
    */
  var shell: js.UndefOr[String] = js.native
}

object SchemaEntrypoint {
  @scala.inline
  def apply(shell: String = null): SchemaEntrypoint = {
    val __obj = js.Dynamic.literal()
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntrypoint]
  }
}

