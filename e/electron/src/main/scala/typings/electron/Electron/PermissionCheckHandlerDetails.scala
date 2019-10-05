package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.unknown
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
  var mediaType: video | audio | unknown
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
    mediaType: video | audio | unknown,
    requestingUrl: String,
    securityOrigin: String
  ): PermissionCheckHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame, mediaType = mediaType.asInstanceOf[js.Any], requestingUrl = requestingUrl, securityOrigin = securityOrigin)
  
    __obj.asInstanceOf[PermissionCheckHandlerDetails]
  }
}

