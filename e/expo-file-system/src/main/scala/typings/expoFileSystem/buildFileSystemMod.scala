package typings.expoFileSystem

import typings.expoFileSystem.buildFileSystemDottypesMod.DeletingOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.DownloadOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.DownloadPauseState
import typings.expoFileSystem.buildFileSystemDottypesMod.DownloadProgressData
import typings.expoFileSystem.buildFileSystemDottypesMod.FileInfo
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemDownloadResult
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemNetworkTaskProgressCallback
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemRequestDirectoryPermissionsResult
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadResult
import typings.expoFileSystem.buildFileSystemDottypesMod.InfoOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.MakeDirectoryOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.ReadingOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.RelocatingOptions
import typings.expoFileSystem.buildFileSystemDottypesMod.UploadProgressData
import typings.expoFileSystem.buildFileSystemDottypesMod.WritingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFileSystemMod {
  
  @JSImport("expo-file-system/build/FileSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "DownloadResumable")
  @js.native
  open class DownloadResumable protected () extends FileSystemCancellableNetworkTask[DownloadProgressData] {
    def this(url: String, _fileUri: String) = this()
    def this(url: String, _fileUri: String, options: DownloadOptions) = this()
    def this(
      url: String,
      _fileUri: String,
      options: Unit,
      callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData]
    ) = this()
    def this(
      url: String,
      _fileUri: String,
      options: DownloadOptions,
      callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData]
    ) = this()
    def this(url: String, _fileUri: String, options: Unit, callback: Unit, resumeData: String) = this()
    def this(
      url: String,
      _fileUri: String,
      options: Unit,
      callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData],
      resumeData: String
    ) = this()
    def this(url: String, _fileUri: String, options: DownloadOptions, callback: Unit, resumeData: String) = this()
    def this(
      url: String,
      _fileUri: String,
      options: DownloadOptions,
      callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData],
      resumeData: String
    ) = this()
    
    /* private */ var _fileUri: Any = js.native
    
    /* private */ var callback: Any = js.native
    
    /**
      * Download the contents at a remote URI to a file in the app's file system.
      * @return Returns a Promise that resolves to `FileSystemDownloadResult` object, or to `undefined` when task was cancelled.
      */
    def downloadAsync(): js.Promise[js.UndefOr[FileSystemDownloadResult]] = js.native
    
    def fileUri: String = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Pause the current download operation. `resumeData` is added to the `DownloadResumable` object after a successful pause operation.
      * Returns an object that can be saved with `AsyncStorage` for future retrieval (the same object that is returned from calling `FileSystem.DownloadResumable.savable()`).
      * @return Returns a Promise that resolves to `DownloadPauseState` object.
      */
    def pauseAsync(): js.Promise[DownloadPauseState] = js.native
    
    /**
      * Resume a paused download operation.
      * @return Returns a Promise that resolves to `FileSystemDownloadResult` object, or to `undefined` when task was cancelled.
      */
    def resumeAsync(): js.Promise[js.UndefOr[FileSystemDownloadResult]] = js.native
    
    /* private */ var resumeData: Any = js.native
    
    /**
      * Method to get the object which can be saved with `AsyncStorage` for future retrieval.
      * @returns Returns object in shape of `DownloadPauseState` type.
      */
    def savable(): DownloadPauseState = js.native
    
    /* private */ var url: Any = js.native
  }
  
  /* note: abstract class */ @JSImport("expo-file-system/build/FileSystem", "FileSystemCancellableNetworkTask")
  @js.native
  open class FileSystemCancellableNetworkTask[T /* <: DownloadProgressData | UploadProgressData */] () extends StObject {
    
    /* private */ var _uuid: Any = js.native
    
    /* protected */ def addSubscription(): Unit = js.native
    
    def cancelAsync(): js.Promise[Unit] = js.native
    
    /* private */ var emitter: Any = js.native
    
    /* protected */ def getCallback(): js.UndefOr[FileSystemNetworkTaskProgressCallback[T]] = js.native
    
    /* protected */ def getEventName(): String = js.native
    
    /* protected */ def isTaskCancelled(): Boolean = js.native
    
    /* protected */ def removeSubscription(): Unit = js.native
    
    /* private */ var subscription: Any = js.native
    
    /* protected */ var taskWasCanceled: Boolean = js.native
    
    /* protected */ def uuid: String = js.native
  }
  
  object StorageAccessFramework {
    
    @JSImport("expo-file-system/build/FileSystem", "StorageAccessFramework")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_FileSystem.copyAsync` */
    inline def copyAsync(options: RelocatingOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Creates a new empty file.
      * @param parentUri The [SAF](#saf-uri) URI to the parent directory.
      * @param fileName The name of new file **without the extension**.
      * @param mimeType The MIME type of new file.
      * @return A Promise that resolves to a [SAF URI](#saf-uri) to the created file.
      */
    inline def createFileAsync(parentUri: String, fileName: String, mimeType: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileAsync")(parentUri.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /* was `typeof imported_FileSystem.deleteAsync` */
    inline def deleteAsync(fileUri: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def deleteAsync(fileUri: String, options: DeletingOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Gets a [SAF URI](#saf-uri) pointing to a folder in the Android root directory. You can use this function to get URI for
      * `StorageAccessFramework.requestDirectoryPermissionsAsync()` when you trying to migrate an album. In that case, the name of the album is the folder name.
      * @param folderName The name of the folder which is located in the Android root directory.
      * @return Returns a [SAF URI](#saf-uri) to a folder.
      */
    inline def getUriForDirectoryInRoot(folderName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUriForDirectoryInRoot")(folderName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a new empty directory.
      * @param parentUri The [SAF](#saf-uri) URI to the parent directory.
      * @param dirName The name of new directory.
      * @return A Promise that resolves to a [SAF URI](#saf-uri) to the created directory.
      */
    inline def makeDirectoryAsync(parentUri: String, dirName: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectoryAsync")(parentUri.asInstanceOf[js.Any], dirName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /* was `typeof imported_FileSystem.moveAsync` */
    inline def moveAsync(options: RelocatingOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /* was `typeof imported_FileSystem.readAsStringAsync` */
    inline def readAsStringAsync(fileUri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /**
      * Enumerate the contents of a directory.
      * @param dirUri [SAF](#saf-uri) URI to the directory.
      * @return A Promise that resolves to an array of strings, each containing the full [SAF URI](#saf-uri) of a file or directory contained in the directory at `fileUri`.
      */
    inline def readDirectoryAsync(dirUri: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirectoryAsync")(dirUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    
    /**
      * Allows users to select a specific directory, granting your app access to all of the files and sub-directories within that directory.
      * @param initialFileUrl The [SAF URI](#saf-uri) of the directory that the file picker should display when it first loads.
      * If URI is incorrect or points to a non-existing folder, it's ignored.
      * @platform android 11+
      * @return Returns a Promise that resolves to `FileSystemRequestDirectoryPermissionsResult` object.
      */
    inline def requestDirectoryPermissionsAsync(): js.Promise[FileSystemRequestDirectoryPermissionsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestDirectoryPermissionsAsync")().asInstanceOf[js.Promise[FileSystemRequestDirectoryPermissionsResult]]
    inline def requestDirectoryPermissionsAsync(initialFileUrl: String): js.Promise[FileSystemRequestDirectoryPermissionsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestDirectoryPermissionsAsync")(initialFileUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystemRequestDirectoryPermissionsResult]]
    
    /* was `typeof imported_FileSystem.writeAsStringAsync` */
    inline def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("expo-file-system/build/FileSystem", "UploadTask")
  @js.native
  open class UploadTask protected () extends FileSystemCancellableNetworkTask[UploadProgressData] {
    def this(url: String, fileUri: String) = this()
    def this(url: String, fileUri: String, options: FileSystemUploadOptions) = this()
    def this(
      url: String,
      fileUri: String,
      options: Unit,
      callback: FileSystemNetworkTaskProgressCallback[UploadProgressData]
    ) = this()
    def this(
      url: String,
      fileUri: String,
      options: FileSystemUploadOptions,
      callback: FileSystemNetworkTaskProgressCallback[UploadProgressData]
    ) = this()
    
    /* private */ var callback: Any = js.native
    
    /* private */ var fileUri: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def uploadAsync(): js.Promise[js.UndefOr[FileSystemUploadResult]] = js.native
    
    /* private */ var url: Any = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bundleDirectory) */ @JSImport("expo-file-system/build/FileSystem", "bundledAssets")
  @js.native
  val bundledAssets: String | Null = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "cacheDirectory")
  @js.native
  val cacheDirectory: String | Null = js.native
  
  inline def copyAsync(options: RelocatingOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(uri: String, fileUri: String, options: Unit, callback: Unit, resumeData: String): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: Unit,
    callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData]
  ): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: Unit,
    callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData],
    resumeData: String
  ): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: Unit, resumeData: String): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData]
  ): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData],
    resumeData: String
  ): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  
  inline def createUploadTask(url: String, fileUri: String): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadTask")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def createUploadTask(
    url: String,
    fileUri: String,
    options: Unit,
    callback: FileSystemNetworkTaskProgressCallback[UploadProgressData]
  ): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadTask")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def createUploadTask(url: String, fileUri: String, options: FileSystemUploadOptions): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadTask")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def createUploadTask(
    url: String,
    fileUri: String,
    options: FileSystemUploadOptions,
    callback: FileSystemNetworkTaskProgressCallback[UploadProgressData]
  ): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadTask")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  
  inline def deleteAsync(fileUri: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def deleteAsync(fileUri: String, options: DeletingOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteLegacyDocumentDirectoryAndroid(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteLegacyDocumentDirectoryAndroid")().asInstanceOf[js.Promise[Unit]]
  
  @JSImport("expo-file-system/build/FileSystem", "documentDirectory")
  @js.native
  val documentDirectory: String | Null = js.native
  
  inline def downloadAsync(uri: String, fileUri: String): js.Promise[FileSystemDownloadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadAsync")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemDownloadResult]]
  inline def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[FileSystemDownloadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadAsync")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemDownloadResult]]
  
  inline def getContentUriAsync(fileUri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentUriAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getFreeDiskStorageAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeDiskStorageAsync")().asInstanceOf[js.Promise[Double]]
  
  inline def getInfoAsync(fileUri: String): js.Promise[FileInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfoAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileInfo]]
  inline def getInfoAsync(fileUri: String, options: InfoOptions): js.Promise[FileInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfoAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileInfo]]
  
  inline def getTotalDiskCapacityAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalDiskCapacityAsync")().asInstanceOf[js.Promise[Double]]
  
  inline def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectoryAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def makeDirectoryAsync(fileUri: String, options: MakeDirectoryOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectoryAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def moveAsync(options: RelocatingOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def readAsStringAsync(fileUri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirectoryAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def uploadAsync(url: String, fileUri: String): js.Promise[FileSystemUploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadAsync")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemUploadResult]]
  inline def uploadAsync(url: String, fileUri: String, options: FileSystemUploadOptions): js.Promise[FileSystemUploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadAsync")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemUploadResult]]
  
  inline def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
