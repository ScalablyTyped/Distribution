package typings.expoDashFileDashSystem.expoDashFileDashSystemMod

import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadOptions
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadProgressCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-file-system", "DownloadResumable")
@js.native
class DownloadResumable protected ()
  extends typings.expoDashFileDashSystem.buildFileSystemMod.DownloadResumable {
  def this(url: String, fileUri: String) = this()
  def this(url: String, fileUri: String, options: DownloadOptions) = this()
  def this(url: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
  def this(
    url: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ) = this()
}

