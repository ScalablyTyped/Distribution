package typings.expoDashFileDashSystem.buildFileSystemMod

import typings.expoDashFileDashSystem.Anon_From
import typings.expoDashFileDashSystem.Anon_Idempotent
import typings.expoDashFileDashSystem.Anon_Intermediates
import typings.expoDashFileDashSystem.Anon_Md5
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadOptions
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadProgressCallback
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadResult
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.FileInfo
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.ReadingOptions
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.WritingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-file-system/build/FileSystem", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(bundleDirectory) */ val bundledAssets: String | Null = js.native
  val cacheDirectory: String | Null = js.native
  val documentDirectory: String | Null = js.native
  def copyAsync(options: Anon_From): js.Promise[Unit] = js.native
  def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  def deleteAsync(fileUri: String, options: Anon_Idempotent): js.Promise[Unit] = js.native
  def downloadAsync(uri: String, fileUri: String): js.Promise[DownloadResult] = js.native
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[DownloadResult] = js.native
  def getContentUriAsync(fileUri: String): js.Promise[String] = js.native
  def getFreeDiskStorageAsync(): js.Promise[Double] = js.native
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: String, options: Anon_Md5): js.Promise[FileInfo] = js.native
  def getTotalDiskCapacityAsync(): js.Promise[Double] = js.native
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = js.native
  def makeDirectoryAsync(fileUri: String, options: Anon_Intermediates): js.Promise[Unit] = js.native
  def moveAsync(options: Anon_From): js.Promise[Unit] = js.native
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = js.native
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
}

