package typings.googleDriveRealtimeApi.rtclient

import typings.googleDriveRealtimeApi.anon.FileIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientUtils extends js.Object {
  
  var RealtimeLoader: RealtimeLoaderFactory = js.native
  
  /**
    * Creates a new Realtime file.
    * @param title {string} title of the newly created file.
    * @param mimeType {string} the MIME type of the new file.
    * @param callback {(file:DriveAPIFileResource) => void} the callback to call after creation.
    */
  def createRealtimeFile(title: String, mimeType: String, callback: js.Function1[/* file */ DriveAPIFileResource, Unit]): Unit = js.native
  
  // INCOMPLETE
  var params: FileIds = js.native
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
  
  @scala.inline
  implicit class ClientUtilsOps[Self <: ClientUtils] (val x: Self) extends AnyVal {
    
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
    def setRealtimeLoader(value: RealtimeLoaderFactory): Self = this.set("RealtimeLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRealtimeFile(value: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Unit): Self = this.set("createRealtimeFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParams(value: FileIds): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
