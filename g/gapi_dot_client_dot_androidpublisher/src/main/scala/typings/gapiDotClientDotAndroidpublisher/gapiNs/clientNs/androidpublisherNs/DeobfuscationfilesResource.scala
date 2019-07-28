package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltApkVersionCodeDeobfuscationFileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeobfuscationfilesResource extends js.Object {
  /** Uploads the deobfuscation file of the specified APK. If a deobfuscation file already exists, it will be replaced. */
  def upload(request: Anon_AltApkVersionCodeDeobfuscationFileType): Request[DeobfuscationFilesUploadResponse]
}

object DeobfuscationfilesResource {
  @scala.inline
  def apply(upload: Anon_AltApkVersionCodeDeobfuscationFileType => Request[DeobfuscationFilesUploadResponse]): DeobfuscationfilesResource = {
    val __obj = js.Dynamic.literal(upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[DeobfuscationfilesResource]
  }
}

