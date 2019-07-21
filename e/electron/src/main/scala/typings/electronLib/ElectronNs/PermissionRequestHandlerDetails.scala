package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequestHandlerDetails extends js.Object {
  /**
    * The url of the openExternal request.
    */
  var externalURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: scala.Boolean
  /**
    * The types of media access being requested, elements can be video or audio
    */
  var mediaTypes: js.UndefOr[
    js.Array[electronLib.electronLibStrings.video | electronLib.electronLibStrings.audio]
  ] = js.undefined
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: java.lang.String
}

object PermissionRequestHandlerDetails {
  @scala.inline
  def apply(
    isMainFrame: scala.Boolean,
    requestingUrl: java.lang.String,
    externalURL: java.lang.String = null,
    mediaTypes: js.Array[electronLib.electronLibStrings.video | electronLib.electronLibStrings.audio] = null
  ): PermissionRequestHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame, requestingUrl = requestingUrl)
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL)
    if (mediaTypes != null) __obj.updateDynamic("mediaTypes")(mediaTypes)
    __obj.asInstanceOf[PermissionRequestHandlerDetails]
  }
}

