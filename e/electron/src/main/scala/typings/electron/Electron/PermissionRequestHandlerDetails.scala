package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequestHandlerDetails extends js.Object {
  /**
    * The url of the openExternal request.
    */
  var externalURL: js.UndefOr[String] = js.undefined
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean
  /**
    * The types of media access being requested, elements can be video or audio
    */
  var mediaTypes: js.UndefOr[js.Array[video | audio]] = js.undefined
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String
}

object PermissionRequestHandlerDetails {
  @scala.inline
  def apply(
    isMainFrame: Boolean,
    requestingUrl: String,
    externalURL: String = null,
    mediaTypes: js.Array[video | audio] = null
  ): PermissionRequestHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any])
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL.asInstanceOf[js.Any])
    if (mediaTypes != null) __obj.updateDynamic("mediaTypes")(mediaTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRequestHandlerDetails]
  }
}

