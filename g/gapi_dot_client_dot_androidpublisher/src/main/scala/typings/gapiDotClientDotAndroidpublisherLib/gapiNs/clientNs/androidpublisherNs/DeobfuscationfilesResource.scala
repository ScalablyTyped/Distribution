package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeobfuscationfilesResource extends js.Object {
  /** Uploads the deobfuscation file of the specified APK. If a deobfuscation file already exists, it will be replaced. */
  def upload(request: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCodeDeobfuscationFileType): gapiDotClientLib.gapiNs.clientNs.Request[DeobfuscationFilesUploadResponse]
}

object DeobfuscationfilesResource {
  @scala.inline
  def apply(
    upload: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCodeDeobfuscationFileType, 
      gapiDotClientLib.gapiNs.clientNs.Request[DeobfuscationFilesUploadResponse]
    ]
  ): DeobfuscationfilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[DeobfuscationfilesResource]
  }
}

