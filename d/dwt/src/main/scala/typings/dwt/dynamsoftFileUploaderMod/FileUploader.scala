package typings.dwt.dynamsoftFileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUploader extends js.Object {
  
  /**
    * Initialize and create a FileUploader instance.
    * @param URL Specify a path to retrieve the FileUploader library.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument uploadManager A FileUploader instance.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def Init(
    URL: String,
    successCallback: js.Function1[/* uploadManager */ UploadManager, Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
}
object FileUploader {
  
  @scala.inline
  def apply(
    Init: (String, js.Function1[/* uploadManager */ UploadManager, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
  ): FileUploader = {
    val __obj = js.Dynamic.literal(Init = js.Any.fromFunction3(Init))
    __obj.asInstanceOf[FileUploader]
  }
  
  @scala.inline
  implicit class FileUploaderOps[Self <: FileUploader] (val x: Self) extends AnyVal {
    
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
    def setInit(
      value: (String, js.Function1[/* uploadManager */ UploadManager, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
    ): Self = this.set("Init", js.Any.fromFunction3(value))
  }
}
