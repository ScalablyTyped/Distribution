package typings.expoFileSystem

import typings.expoFileSystem.anon.From
import typings.expoFileSystem.anon.Idempotent
import typings.expoFileSystem.anon.Intermediates
import typings.expoFileSystem.anon.Md5
import typings.expoFileSystem.fileSystemTypesMod.DownloadOptions
import typings.expoFileSystem.fileSystemTypesMod.DownloadProgressCallback
import typings.expoFileSystem.fileSystemTypesMod.FileInfo
import typings.expoFileSystem.fileSystemTypesMod.FileSystemDownloadResult
import typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadOptions
import typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadResult
import typings.expoFileSystem.fileSystemTypesMod.ReadingOptions
import typings.expoFileSystem.fileSystemTypesMod.WritingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-file-system", "DownloadResumable")
  @js.native
  class DownloadResumable protected ()
    extends typings.expoFileSystem.fileSystemMod.DownloadResumable {
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
  }
  
  @JSImport("expo-file-system", "EncodingType")
  @js.native
  object EncodingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.EncodingType with String] = js.native
    
    /* "base64" */ val Base64: typings.expoFileSystem.fileSystemTypesMod.EncodingType.Base64 with String = js.native
    
    /* "utf8" */ val UTF8: typings.expoFileSystem.fileSystemTypesMod.EncodingType.UTF8 with String = js.native
  }
  
  @JSImport("expo-file-system", "FileSystemSessionType")
  @js.native
  object FileSystemSessionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType with Double] = js.native
    
    /* 0 */ val BACKGROUND: typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.BACKGROUND with Double = js.native
    
    /* 1 */ val FOREGROUND: typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.FOREGROUND with Double = js.native
  }
  
  @JSImport("expo-file-system", "FileSystemUploadType")
  @js.native
  object FileSystemUploadType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType with Double] = js.native
    
    /* 0 */ val BINARY_CONTENT: typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.BINARY_CONTENT with Double = js.native
    
    /* 1 */ val MULTIPART: typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.MULTIPART with Double = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bundleDirectory) */ @JSImport("expo-file-system", "bundledAssets")
  @js.native
  val bundledAssets: String | Null = js.native
  
  @JSImport("expo-file-system", "cacheDirectory")
  @js.native
  val cacheDirectory: String | Null = js.native
  
  @JSImport("expo-file-system", "copyAsync")
  @js.native
  def copyAsync(options: From): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system", "createDownloadResumable")
  @js.native
  def createDownloadResumable(uri: String, fileUri: String): typings.expoFileSystem.fileSystemMod.DownloadResumable = js.native
  @JSImport("expo-file-system", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    resumeData: String
  ): typings.expoFileSystem.fileSystemMod.DownloadResumable = js.native
  @JSImport("expo-file-system", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: DownloadProgressCallback
  ): typings.expoFileSystem.fileSystemMod.DownloadResumable = js.native
  @JSImport("expo-file-system", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: js.UndefOr[scala.Nothing],
    callback: DownloadProgressCallback,
    resumeData: String
  ): typings.expoFileSystem.fileSystemMod.DownloadResumable = js.native
  @JSImport("expo-file-system", "createDownloadResumable")
  @js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): typings.expoFileSystem.fileSystemMod.DownloadResumable = js.native
  @JSImport("expo-file-system", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: js.UndefOr[scala.Nothing],
    resumeData: String
  ): typings.expoFileSystem.fileSystemMod.DownloadResumable = js.native
  @JSImport("expo-file-system", "createDownloadResumable")
  @js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): typings.expoFileSystem.fileSystemMod.DownloadResumable = js.native
  @JSImport("expo-file-system", "createDownloadResumable")
  @js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): typings.expoFileSystem.fileSystemMod.DownloadResumable = js.native
  
  @JSImport("expo-file-system", "deleteAsync")
  @js.native
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  @JSImport("expo-file-system", "deleteAsync")
  @js.native
  def deleteAsync(fileUri: String, options: Idempotent): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system", "deleteLegacyDocumentDirectoryAndroid")
  @js.native
  def deleteLegacyDocumentDirectoryAndroid(): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system", "documentDirectory")
  @js.native
  val documentDirectory: String | Null = js.native
  
  @JSImport("expo-file-system", "downloadAsync")
  @js.native
  def downloadAsync(uri: String, fileUri: String): js.Promise[FileSystemDownloadResult] = js.native
  @JSImport("expo-file-system", "downloadAsync")
  @js.native
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[FileSystemDownloadResult] = js.native
  
  @JSImport("expo-file-system", "getContentUriAsync")
  @js.native
  def getContentUriAsync(fileUri: String): js.Promise[String] = js.native
  
  @JSImport("expo-file-system", "getFreeDiskStorageAsync")
  @js.native
  def getFreeDiskStorageAsync(): js.Promise[Double] = js.native
  
  @JSImport("expo-file-system", "getInfoAsync")
  @js.native
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  @JSImport("expo-file-system", "getInfoAsync")
  @js.native
  def getInfoAsync(fileUri: String, options: Md5): js.Promise[FileInfo] = js.native
  
  @JSImport("expo-file-system", "getTotalDiskCapacityAsync")
  @js.native
  def getTotalDiskCapacityAsync(): js.Promise[Double] = js.native
  
  @JSImport("expo-file-system", "makeDirectoryAsync")
  @js.native
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = js.native
  @JSImport("expo-file-system", "makeDirectoryAsync")
  @js.native
  def makeDirectoryAsync(fileUri: String, options: Intermediates): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system", "moveAsync")
  @js.native
  def moveAsync(options: From): js.Promise[Unit] = js.native
  
  @JSImport("expo-file-system", "readAsStringAsync")
  @js.native
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  @JSImport("expo-file-system", "readAsStringAsync")
  @js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  
  @JSImport("expo-file-system", "readDirectoryAsync")
  @js.native
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("expo-file-system", "uploadAsync")
  @js.native
  def uploadAsync(url: String, fileUri: String): js.Promise[FileSystemUploadResult] = js.native
  @JSImport("expo-file-system", "uploadAsync")
  @js.native
  def uploadAsync(url: String, fileUri: String, options: FileSystemUploadOptions): js.Promise[FileSystemUploadResult] = js.native
  
  @JSImport("expo-file-system", "writeAsStringAsync")
  @js.native
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  @JSImport("expo-file-system", "writeAsStringAsync")
  @js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
}
