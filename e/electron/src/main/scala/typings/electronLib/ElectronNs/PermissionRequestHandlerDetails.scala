package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequestHandlerDetails extends js.Object {
  /**
    * The url of the openExternal request.
    */
  var externalURL: java.lang.String
  /**
    * The types of media access being requested, elements can be video or audio
    */
  var mediaTypes: js.Array[electronLib.electronLibStrings.video | electronLib.electronLibStrings.audio]
}

object PermissionRequestHandlerDetails {
  @scala.inline
  def apply(
    externalURL: java.lang.String,
    mediaTypes: js.Array[electronLib.electronLibStrings.video | electronLib.electronLibStrings.audio]
  ): PermissionRequestHandlerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("externalURL")(externalURL)
    __obj.updateDynamic("mediaTypes")(mediaTypes)
    __obj.asInstanceOf[PermissionRequestHandlerDetails]
  }
}

