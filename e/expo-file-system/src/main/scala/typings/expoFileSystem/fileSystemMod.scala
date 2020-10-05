package typings.expoFileSystem

import typings.expoFileSystem.anon.From
import typings.expoFileSystem.anon.Idempotent
import typings.expoFileSystem.anon.Intermediates
import typings.expoFileSystem.anon.Md5
import typings.expoFileSystem.fileSystemTypesMod.DownloadOptions
import typings.expoFileSystem.fileSystemTypesMod.DownloadPauseState
import typings.expoFileSystem.fileSystemTypesMod.DownloadProgressCallback
import typings.expoFileSystem.fileSystemTypesMod.FileInfo
import typings.expoFileSystem.fileSystemTypesMod.FileSystemDownloadResult
import typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadOptions
import typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadResult
import typings.expoFileSystem.fileSystemTypesMod.ReadingOptions
import typings.expoFileSystem.fileSystemTypesMod.WritingOptions
import typings.unimodulesCore.mod.EventEmitter
import typings.unimodulesReactNativeAdapter.eventEmitterMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-file-system/build/FileSystem", JSImport.Namespace)
@js.native
object fileSystemMod extends js.Object {
  @js.native
  class DownloadResumable protected () extends js.Object {
    def this(url: String, fileUri: String) = this()
    def this(url: String, fileUri: String, options: DownloadOptions) = this()
    def this(
      url: String,
      fileUri: String,
      options: js.UndefOr[scala.Nothing],
      callback: DownloadProgressCallback
    ) = this()
    def this(url: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
    def this(
      url: String,
      fileUri: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      resumeData: String
    ) = this()
    def this(
      url: String,
      fileUri: String,
      options: js.UndefOr[scala.Nothing],
      callback: DownloadProgressCallback,
      resumeData: String
    ) = this()
    def this(
      url: String,
      fileUri: String,
      options: DownloadOptions,
      callback: js.UndefOr[scala.Nothing],
      resumeData: String
    ) = this()
    def this(
      url: String,
      fileUri: String,
      options: DownloadOptions,
      callback: DownloadProgressCallback,
      resumeData: String
    ) = this()
    var _callback: js.UndefOr[DownloadProgressCallback] = js.native
    var _emitter: EventEmitter = js.native
    var _fileUri: String = js.native
    var _options: DownloadOptions = js.native
    var _resumeData: js.UndefOr[String] = js.native
    var _subscription: js.UndefOr[Subscription | Null] = js.native
    var _url: String = js.native
    var _uuid: String = js.native
    def _addSubscription(): Unit = js.native
    def _removeSubscription(): Unit = js.native
    def downloadAsync(): js.Promise[js.UndefOr[FileSystemDownloadResult]] = js.native
    def pauseAsync(): js.Promise[DownloadPauseState] = js.native
    def resumeAsync(): js.Promise[js.UndefOr[FileSystemDownloadResult]] = js.native
    def savable(): DownloadPauseState = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bundleDirectory) */ val bundledAssets: String | Null = js.native
  val cacheDirectory: String | Null = js.native
  val documentDirectory: String | Null = js.native
  def copyAsync(options: From): js.Promise[Unit] = js.native
  def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    resumeData: String
  ): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: DownloadProgressCallback
  ): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: js.UndefOr[scala.Nothing],
    resumeData: String
  ): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  def deleteAsync(fileUri: String, options: Idempotent): js.Promise[Unit] = js.native
  def deleteLegacyDocumentDirectoryAndroid(): js.Promise[Unit] = js.native
  def downloadAsync(uri: String, fileUri: String): js.Promise[FileSystemDownloadResult] = js.native
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[FileSystemDownloadResult] = js.native
  def getContentUriAsync(fileUri: String): js.Promise[String] = js.native
  def getFreeDiskStorageAsync(): js.Promise[Double] = js.native
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: String, options: Md5): js.Promise[FileInfo] = js.native
  def getTotalDiskCapacityAsync(): js.Promise[Double] = js.native
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = js.native
  def makeDirectoryAsync(fileUri: String, options: Intermediates): js.Promise[Unit] = js.native
  def moveAsync(options: From): js.Promise[Unit] = js.native
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = js.native
  def uploadAsync(url: String, fileUri: String): js.Promise[FileSystemUploadResult] = js.native
  def uploadAsync(url: String, fileUri: String, options: FileSystemUploadOptions): js.Promise[FileSystemUploadResult] = js.native
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
  @js.native
  object EncodingType extends js.Object {
    /* "base64" */ val Base64: typings.expoFileSystem.fileSystemTypesMod.EncodingType.Base64 with String = js.native
    /* "utf8" */ val UTF8: typings.expoFileSystem.fileSystemTypesMod.EncodingType.UTF8 with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.EncodingType with String] = js.native
  }
  
  @js.native
  object FileSystemSessionType extends js.Object {
    /* 0 */ val BACKGROUND: typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.BACKGROUND with Double = js.native
    /* 1 */ val FOREGROUND: typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.FOREGROUND with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType with Double] = js.native
  }
  
  @js.native
  object FileSystemUploadType extends js.Object {
    /* 0 */ val BINARY_CONTENT: typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.BINARY_CONTENT with Double = js.native
    /* 1 */ val MULTIPART: typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.MULTIPART with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType with Double] = js.native
  }
  
}

