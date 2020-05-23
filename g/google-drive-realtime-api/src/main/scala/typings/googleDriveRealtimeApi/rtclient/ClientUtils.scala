package typings.googleDriveRealtimeApi.rtclient

import typings.googleDriveRealtimeApi.anon.FileIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUtils extends js.Object {
  var RealtimeLoader: RealtimeLoaderFactory
  // INCOMPLETE
  var params: FileIds
  /**
    * Creates a new Realtime file.
    * @param title {string} title of the newly created file.
    * @param mimeType {string} the MIME type of the new file.
    * @param callback {(file:DriveAPIFileResource) => void} the callback to call after creation.
    */
  def createRealtimeFile(title: String, mimeType: String, callback: js.Function1[/* file */ DriveAPIFileResource, Unit]): Unit
}

object ClientUtils {
  @scala.inline
  def apply(
    RealtimeLoader: RealtimeLoaderFactory,
    createRealtimeFile: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Unit,
    params: FileIds
  ): ClientUtils = {
    val __obj = js.Dynamic.literal(RealtimeLoader = RealtimeLoader.asInstanceOf[js.Any], createRealtimeFile = js.Any.fromFunction3(createRealtimeFile), params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientUtils]
  }
}

