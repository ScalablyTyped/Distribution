package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionCheckHandlerDetails extends js.Object {
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: scala.Boolean
  /**
    * The type of media access being requested, can be video, audio or unknown
    */
  var mediaType: electronLib.electronLibStrings.video | electronLib.electronLibStrings.audio | electronLib.electronLibStrings.unknown
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: java.lang.String
  /**
    * The security orign of the media check.
    */
  var securityOrigin: java.lang.String
}

object PermissionCheckHandlerDetails {
  @scala.inline
  def apply(
    isMainFrame: scala.Boolean,
    mediaType: electronLib.electronLibStrings.video | electronLib.electronLibStrings.audio | electronLib.electronLibStrings.unknown,
    requestingUrl: java.lang.String,
    securityOrigin: java.lang.String
  ): PermissionCheckHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame, mediaType = mediaType.asInstanceOf[js.Any], requestingUrl = requestingUrl, securityOrigin = securityOrigin)
  
    __obj.asInstanceOf[PermissionCheckHandlerDetails]
  }
}

