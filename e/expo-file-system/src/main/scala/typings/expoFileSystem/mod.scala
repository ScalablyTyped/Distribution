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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-file-system", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-file-system", "DownloadResumable")
  @js.native
  class DownloadResumable protected ()
    extends typings.expoFileSystem.fileSystemMod.DownloadResumable {
    def this(url: String, fileUri: String) = this()
    def this(url: String, fileUri: String, options: DownloadOptions) = this()
    def this(url: String, fileUri: String, options: Unit, callback: DownloadProgressCallback) = this()
    def this(url: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
    def this(url: String, fileUri: String, options: Unit, callback: Unit, resumeData: String) = this()
    def this(
      url: String,
      fileUri: String,
      options: Unit,
      callback: DownloadProgressCallback,
      resumeData: String
    ) = this()
    def this(url: String, fileUri: String, options: DownloadOptions, callback: Unit, resumeData: String) = this()
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
    def apply(value: String): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.EncodingType & String] = js.native
    
    /* "base64" */ val Base64: typings.expoFileSystem.fileSystemTypesMod.EncodingType.Base64 & String = js.native
    
    /* "utf8" */ val UTF8: typings.expoFileSystem.fileSystemTypesMod.EncodingType.UTF8 & String = js.native
  }
  
  @JSImport("expo-file-system", "FileSystemSessionType")
  @js.native
  object FileSystemSessionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType & Double] = js.native
    
    /* 0 */ val BACKGROUND: typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.BACKGROUND & Double = js.native
    
    /* 1 */ val FOREGROUND: typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType.FOREGROUND & Double = js.native
  }
  
  @JSImport("expo-file-system", "FileSystemUploadType")
  @js.native
  object FileSystemUploadType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType & Double] = js.native
    
    /* 0 */ val BINARY_CONTENT: typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.BINARY_CONTENT & Double = js.native
    
    /* 1 */ val MULTIPART: typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.MULTIPART & Double = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bundleDirectory) */ @JSImport("expo-file-system", "bundledAssets")
  @js.native
  val bundledAssets: String | Null = js.native
  
  @JSImport("expo-file-system", "cacheDirectory")
  @js.native
  val cacheDirectory: String | Null = js.native
  
  @scala.inline
  def copyAsync(options: From): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def createDownloadResumable(uri: String, fileUri: String): typings.expoFileSystem.fileSystemMod.DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[typings.expoFileSystem.fileSystemMod.DownloadResumable]
  @scala.inline
  def createDownloadResumable(uri: String, fileUri: String, options: Unit, callback: Unit, resumeData: String): typings.expoFileSystem.fileSystemMod.DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[typings.expoFileSystem.fileSystemMod.DownloadResumable]
  @scala.inline
  def createDownloadResumable(uri: String, fileUri: String, options: Unit, callback: DownloadProgressCallback): typings.expoFileSystem.fileSystemMod.DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.expoFileSystem.fileSystemMod.DownloadResumable]
  @scala.inline
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: Unit,
    callback: DownloadProgressCallback,
    resumeData: String
  ): typings.expoFileSystem.fileSystemMod.DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[typings.expoFileSystem.fileSystemMod.DownloadResumable]
  @scala.inline
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): typings.expoFileSystem.fileSystemMod.DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.expoFileSystem.fileSystemMod.DownloadResumable]
  @scala.inline
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: Unit, resumeData: String): typings.expoFileSystem.fileSystemMod.DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[typings.expoFileSystem.fileSystemMod.DownloadResumable]
  @scala.inline
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): typings.expoFileSystem.fileSystemMod.DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.expoFileSystem.fileSystemMod.DownloadResumable]
  @scala.inline
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): typings.expoFileSystem.fileSystemMod.DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[typings.expoFileSystem.fileSystemMod.DownloadResumable]
  
  @scala.inline
  def deleteAsync(fileUri: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def deleteAsync(fileUri: String, options: Idempotent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def deleteLegacyDocumentDirectoryAndroid(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteLegacyDocumentDirectoryAndroid")().asInstanceOf[js.Promise[Unit]]
  
  @JSImport("expo-file-system", "documentDirectory")
  @js.native
  val documentDirectory: String | Null = js.native
  
  @scala.inline
  def downloadAsync(uri: String, fileUri: String): js.Promise[FileSystemDownloadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadAsync")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemDownloadResult]]
  @scala.inline
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[FileSystemDownloadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadAsync")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemDownloadResult]]
  
  @scala.inline
  def getContentUriAsync(fileUri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentUriAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def getFreeDiskStorageAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeDiskStorageAsync")().asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfoAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileInfo]]
  @scala.inline
  def getInfoAsync(fileUri: String, options: Md5): js.Promise[FileInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfoAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileInfo]]
  
  @scala.inline
  def getTotalDiskCapacityAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalDiskCapacityAsync")().asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectoryAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def makeDirectoryAsync(fileUri: String, options: Intermediates): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectoryAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def moveAsync(options: From): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def readAsStringAsync(fileUri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirectoryAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  @scala.inline
  def uploadAsync(url: String, fileUri: String): js.Promise[FileSystemUploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadAsync")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemUploadResult]]
  @scala.inline
  def uploadAsync(url: String, fileUri: String, options: FileSystemUploadOptions): js.Promise[FileSystemUploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadAsync")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemUploadResult]]
  
  @scala.inline
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
