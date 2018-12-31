package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionCheckHandlerDetails extends js.Object {
  /**
    * The type of media access being requested, can be video, audio or unknown
    */
  var mediaType: electronLib.electronLibStrings.video | electronLib.electronLibStrings.audio | electronLib.electronLibStrings.unknown
  /**
    * The security orign of the media check.
    */
  var securityOrigin: java.lang.String
}

