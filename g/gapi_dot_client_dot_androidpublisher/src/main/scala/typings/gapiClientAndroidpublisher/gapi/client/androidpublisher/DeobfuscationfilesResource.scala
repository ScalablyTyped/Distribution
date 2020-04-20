package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonDeobfuscationFileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeobfuscationfilesResource extends js.Object {
  /** Uploads the deobfuscation file of the specified APK. If a deobfuscation file already exists, it will be replaced. */
  def upload(request: AnonDeobfuscationFileType): Request_[DeobfuscationFilesUploadResponse]
}

object DeobfuscationfilesResource {
  @scala.inline
  def apply(upload: AnonDeobfuscationFileType => Request_[DeobfuscationFilesUploadResponse]): DeobfuscationfilesResource = {
    val __obj = js.Dynamic.literal(upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[DeobfuscationfilesResource]
  }
}

