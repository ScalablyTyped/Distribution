package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.DeobfuscationFileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeobfuscationfilesResource extends js.Object {
  /** Uploads the deobfuscation file of the specified APK. If a deobfuscation file already exists, it will be replaced. */
  def upload(request: DeobfuscationFileType): Request[DeobfuscationFilesUploadResponse] = js.native
}

object DeobfuscationfilesResource {
  @scala.inline
  def apply(upload: DeobfuscationFileType => Request[DeobfuscationFilesUploadResponse]): DeobfuscationfilesResource = {
    val __obj = js.Dynamic.literal(upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[DeobfuscationfilesResource]
  }
  @scala.inline
  implicit class DeobfuscationfilesResourceOps[Self <: DeobfuscationfilesResource] (val x: Self) extends AnyVal {
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
    def setUpload(value: DeobfuscationFileType => Request[DeobfuscationFilesUploadResponse]): Self = this.set("upload", js.Any.fromFunction1(value))
  }
  
}

