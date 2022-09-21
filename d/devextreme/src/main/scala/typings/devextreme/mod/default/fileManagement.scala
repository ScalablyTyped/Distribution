package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import typings.devextreme.mod.DevExpress.fileManagement.CustomFileSystemProvider.Options
import typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBaseOptions
import typings.devextreme.mod.DevExpress.fileManagement.UploadInfo
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileManagement {
  
  @JSImport("devextreme", "default.fileManagement.CustomFileSystemProvider")
  @js.native
  open class CustomFileSystemProvider ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: Options) = this()
    
    /**
      * Cancels the file upload.
      */
    /* CompleteClass */
    override def abortFileUpload(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): DxPromise[Any] = js.native
    
    /**
      * Copies files or directories.
      */
    /* CompleteClass */
    override def copyItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Creates a directory.
      */
    /* CompleteClass */
    override def createDirectory(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, name: String): DxPromise[Any] = js.native
    
    /**
      * Deletes files or directories.
      */
    /* CompleteClass */
    override def deleteItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Downloads files.
      */
    /* CompleteClass */
    override def downloadItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Unit = js.native
    
    /**
      * Gets file system items.
      */
    /* CompleteClass */
    override def getItems(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): DxPromise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
    
    /**
      * Gets items content.
      */
    /* CompleteClass */
    override def getItemsContent(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): DxPromise[Any] = js.native
    
    /**
      * Moves files and directories.
      */
    /* CompleteClass */
    override def moveItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Renames a file or directory.
      */
    /* CompleteClass */
    override def renameItem(item: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, newName: String): DxPromise[Any] = js.native
    
    /**
      * Uploads a file in chunks.
      */
    /* CompleteClass */
    override def uploadFileChunk(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): DxPromise[Any] = js.native
  }
  
  @JSImport("devextreme", "default.fileManagement.FileSystemError")
  @js.native
  open class FileSystemError ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemError {
    def this(errorCode: Double) = this()
    def this(errorCode: Double, fileSystemItem: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem) = this()
    def this(errorCode: Unit, fileSystemItem: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem) = this()
    def this(errorCode: Double, fileSystemItem: Unit, errorText: String) = this()
    def this(
      errorCode: Double,
      fileSystemItem: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem,
      errorText: String
    ) = this()
    def this(errorCode: Unit, fileSystemItem: Unit, errorText: String) = this()
    def this(
      errorCode: Unit,
      fileSystemItem: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem,
      errorText: String
    ) = this()
  }
  
  @JSImport("devextreme", "default.fileManagement.FileSystemItem")
  @js.native
  open class FileSystemItem protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem {
    def this(path: String, isDirectory: Boolean) = this()
    def this(path: String, isDirectory: Boolean, pathKeys: js.Array[String]) = this()
    
    /**
      * The file system data object that stores information about the file system item (name, size, modification date, etc.).
      */
    /* CompleteClass */
    var dataItem: Any = js.native
    
    /**
      * A timestamp that indicates when the file system item was last modified.
      */
    /* CompleteClass */
    var dateModified: js.Date = js.native
    
    /**
      * Gets a file&apos;s extension.
      */
    /* CompleteClass */
    override def getFileExtension(): String = js.native
    
    /**
      * Specifies whether a directory has subdirectories.
      */
    /* CompleteClass */
    var hasSubDirectories: Boolean = js.native
    
    /**
      * Specifies whether the file system item is a directory.
      */
    /* CompleteClass */
    var isDirectory: Boolean = js.native
    
    /**
      * The file system item&apos;s key.
      */
    /* CompleteClass */
    var key: String = js.native
    
    /**
      * The file system item&apos;s name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * The file system item&apos;s path.
      */
    /* CompleteClass */
    var path: String = js.native
    
    /**
      * The file system item&apos;s path specified in keys.
      */
    /* CompleteClass */
    var pathKeys: js.Array[String] = js.native
    
    /**
      * The file system item&apos;s size (in bytes).
      */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * An icon (URL) to be used as the file system item&apos;s thumbnail.
      */
    /* CompleteClass */
    var thumbnail: String = js.native
  }
  
  @JSImport("devextreme", "default.fileManagement.FileSystemProviderBase")
  @js.native
  open class FileSystemProviderBase ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: FileSystemProviderBaseOptions[typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase]) = this()
    
    /**
      * Cancels the file upload.
      */
    /* CompleteClass */
    override def abortFileUpload(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): DxPromise[Any] = js.native
    
    /**
      * Copies files or directories.
      */
    /* CompleteClass */
    override def copyItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Creates a directory.
      */
    /* CompleteClass */
    override def createDirectory(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, name: String): DxPromise[Any] = js.native
    
    /**
      * Deletes files or directories.
      */
    /* CompleteClass */
    override def deleteItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Downloads files.
      */
    /* CompleteClass */
    override def downloadItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Unit = js.native
    
    /**
      * Gets file system items.
      */
    /* CompleteClass */
    override def getItems(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): DxPromise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
    
    /**
      * Gets items content.
      */
    /* CompleteClass */
    override def getItemsContent(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): DxPromise[Any] = js.native
    
    /**
      * Moves files and directories.
      */
    /* CompleteClass */
    override def moveItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Renames a file or directory.
      */
    /* CompleteClass */
    override def renameItem(item: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, newName: String): DxPromise[Any] = js.native
    
    /**
      * Uploads a file in chunks.
      */
    /* CompleteClass */
    override def uploadFileChunk(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): DxPromise[Any] = js.native
  }
  
  @JSImport("devextreme", "default.fileManagement.ObjectFileSystemProvider")
  @js.native
  open class ObjectFileSystemProvider ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: typings.devextreme.mod.DevExpress.fileManagement.ObjectFileSystemProvider.Options) = this()
    
    /**
      * Cancels the file upload.
      */
    /* CompleteClass */
    override def abortFileUpload(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): DxPromise[Any] = js.native
    
    /**
      * Copies files or directories.
      */
    /* CompleteClass */
    override def copyItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Creates a directory.
      */
    /* CompleteClass */
    override def createDirectory(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, name: String): DxPromise[Any] = js.native
    
    /**
      * Deletes files or directories.
      */
    /* CompleteClass */
    override def deleteItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Downloads files.
      */
    /* CompleteClass */
    override def downloadItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Unit = js.native
    
    /**
      * Gets file system items.
      */
    /* CompleteClass */
    override def getItems(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): DxPromise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
    
    /**
      * Gets items content.
      */
    /* CompleteClass */
    override def getItemsContent(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): DxPromise[Any] = js.native
    
    /**
      * Moves files and directories.
      */
    /* CompleteClass */
    override def moveItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Renames a file or directory.
      */
    /* CompleteClass */
    override def renameItem(item: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, newName: String): DxPromise[Any] = js.native
    
    /**
      * Uploads a file in chunks.
      */
    /* CompleteClass */
    override def uploadFileChunk(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): DxPromise[Any] = js.native
  }
  
  @JSImport("devextreme", "default.fileManagement.RemoteFileSystemProvider")
  @js.native
  open class RemoteFileSystemProvider ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: typings.devextreme.mod.DevExpress.fileManagement.RemoteFileSystemProvider.Options) = this()
    
    /**
      * Cancels the file upload.
      */
    /* CompleteClass */
    override def abortFileUpload(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): DxPromise[Any] = js.native
    
    /**
      * Copies files or directories.
      */
    /* CompleteClass */
    override def copyItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Creates a directory.
      */
    /* CompleteClass */
    override def createDirectory(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, name: String): DxPromise[Any] = js.native
    
    /**
      * Deletes files or directories.
      */
    /* CompleteClass */
    override def deleteItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Downloads files.
      */
    /* CompleteClass */
    override def downloadItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Unit = js.native
    
    /**
      * Gets file system items.
      */
    /* CompleteClass */
    override def getItems(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): DxPromise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
    
    /**
      * Gets items content.
      */
    /* CompleteClass */
    override def getItemsContent(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): DxPromise[Any] = js.native
    
    /**
      * Moves files and directories.
      */
    /* CompleteClass */
    override def moveItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[DxPromise[Any]] = js.native
    
    /**
      * Renames a file or directory.
      */
    /* CompleteClass */
    override def renameItem(item: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, newName: String): DxPromise[Any] = js.native
    
    /**
      * Uploads a file in chunks.
      */
    /* CompleteClass */
    override def uploadFileChunk(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): DxPromise[Any] = js.native
  }
}
