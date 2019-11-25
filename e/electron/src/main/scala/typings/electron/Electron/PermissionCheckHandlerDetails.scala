package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.unknown_
import typings.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionCheckHandlerDetails extends js.Object {
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean
  /**
    * The type of media access being requested, can be video, audio or unknown
    */
  var mediaType: video | audio | unknown_
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String
  /**
    * The security orign of the media check.
    */
  var securityOrigin: String
}

object PermissionCheckHandlerDetails {
  @scala.inline
  def apply(
    isMainFrame: Boolean,
    mediaType: video | audio | unknown_,
    requestingUrl: String,
    securityOrigin: String
  ): PermissionCheckHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PermissionCheckHandlerDetails]
  }
}

