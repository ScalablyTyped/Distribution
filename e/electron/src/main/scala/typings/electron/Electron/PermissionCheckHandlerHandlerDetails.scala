package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.unknown_
import typings.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionCheckHandlerHandlerDetails extends js.Object {
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean = js.native
  /**
    * The type of media access being requested, can be `video`, `audio` or `unknown`
    */
  var mediaType: video | audio | unknown_ = js.native
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String = js.native
  /**
    * The security orign of the `media` check.
    */
  var securityOrigin: String = js.native
}

object PermissionCheckHandlerHandlerDetails {
  @scala.inline
  def apply(
    isMainFrame: Boolean,
    mediaType: video | audio | unknown_,
    requestingUrl: String,
    securityOrigin: String
  ): PermissionCheckHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionCheckHandlerHandlerDetails]
  }
  @scala.inline
  implicit class PermissionCheckHandlerHandlerDetailsOps[Self <: PermissionCheckHandlerHandlerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsMainFrame(value: Boolean): Self = this.set("isMainFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: video | audio | unknown_): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestingUrl(value: String): Self = this.set("requestingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
  }
  
}

