package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.ExpansionFileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpansionfilesResource extends js.Object {
  /** Fetches the Expansion File configuration for the APK specified. */
  def get(request: ExpansionFileType): Request[ExpansionFile] = js.native
  /**
    * Updates the APK's Expansion File configuration to reference another APK's Expansion Files. To add a new Expansion File use the Upload method. This
    * method supports patch semantics.
    */
  def patch(request: ExpansionFileType): Request[ExpansionFile] = js.native
  /** Updates the APK's Expansion File configuration to reference another APK's Expansion Files. To add a new Expansion File use the Upload method. */
  def update(request: ExpansionFileType): Request[ExpansionFile] = js.native
  /** Uploads and attaches a new Expansion File to the APK specified. */
  def upload(request: ExpansionFileType): Request[ExpansionFilesUploadResponse] = js.native
}

object ExpansionfilesResource {
  @scala.inline
  def apply(
    get: ExpansionFileType => Request[ExpansionFile],
    patch: ExpansionFileType => Request[ExpansionFile],
    update: ExpansionFileType => Request[ExpansionFile],
    upload: ExpansionFileType => Request[ExpansionFilesUploadResponse]
  ): ExpansionfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[ExpansionfilesResource]
  }
  @scala.inline
  implicit class ExpansionfilesResourceOps[Self <: ExpansionfilesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: ExpansionFileType => Request[ExpansionFile]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ExpansionFileType => Request[ExpansionFile]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ExpansionFileType => Request[ExpansionFile]): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUpload(value: ExpansionFileType => Request[ExpansionFilesUploadResponse]): Self = this.set("upload", js.Any.fromFunction1(value))
  }
  
}

