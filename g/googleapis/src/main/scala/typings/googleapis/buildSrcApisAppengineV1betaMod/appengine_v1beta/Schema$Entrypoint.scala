package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entrypoint for the application.
  */
@js.native
trait Schema$Entrypoint extends js.Object {
  /**
    * The format should be a shell command that can be fed to bash -c.
    */
  var shell: js.UndefOr[String] = js.native
}

object Schema$Entrypoint {
  @scala.inline
  def apply(shell: String = null): Schema$Entrypoint = {
    val __obj = js.Dynamic.literal()
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Entrypoint]
  }
}

