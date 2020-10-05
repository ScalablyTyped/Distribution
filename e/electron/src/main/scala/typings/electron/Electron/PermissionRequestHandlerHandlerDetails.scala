package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionRequestHandlerHandlerDetails extends js.Object {
  /**
    * The url of the `openExternal` request.
    */
  var externalURL: js.UndefOr[String] = js.native
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean = js.native
  /**
    * The types of media access being requested, elements can be `video` or `audio`
    */
  var mediaTypes: js.UndefOr[js.Array[video | audio]] = js.native
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String = js.native
}

object PermissionRequestHandlerHandlerDetails {
  @scala.inline
  def apply(isMainFrame: Boolean, requestingUrl: String): PermissionRequestHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRequestHandlerHandlerDetails]
  }
  @scala.inline
  implicit class PermissionRequestHandlerHandlerDetailsOps[Self <: PermissionRequestHandlerHandlerDetails] (val x: Self) extends AnyVal {
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
    def setRequestingUrl(value: String): Self = this.set("requestingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalURL(value: String): Self = this.set("externalURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalURL: Self = this.set("externalURL", js.undefined)
    @scala.inline
    def setMediaTypesVarargs(value: (video | audio)*): Self = this.set("mediaTypes", js.Array(value :_*))
    @scala.inline
    def setMediaTypes(value: js.Array[video | audio]): Self = this.set("mediaTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaTypes: Self = this.set("mediaTypes", js.undefined)
  }
  
}

