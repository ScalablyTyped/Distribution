package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Options */
trait AuthenticateOptions extends js.Object {
  var interactive: scala.Boolean
}

object AuthenticateOptions {
  @scala.inline
  def apply(interactive: scala.Boolean): AuthenticateOptions = {
    val __obj = js.Dynamic.literal(interactive = interactive)
  
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

