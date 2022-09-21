package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.FormData
import typings.devextreme.anon.`3`
import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileManagement {
  
  object CustomFileSystemProvider {
    
    type Options = CustomFileSystemProviderOptions
  }
  type CustomFileSystemProvider = FileSystemProviderBase
  
  trait CustomFileSystemProviderOptions
    extends StObject
       with FileSystemProviderBaseOptions[CustomFileSystemProvider] {
    
    /**
      * A function that cancels the file upload.
      */
    var abortFileUpload: js.UndefOr[
        js.Function3[
          /* file */ File, 
          /* uploadInfo */ UploadInfo, 
          /* destinationDirectory */ FileSystemItem, 
          js.Thenable[Any] | Any
        ]
      ] = js.undefined
    
    /**
      * A function that copies files or directories.
      */
    var copyItem: js.UndefOr[
        js.Function2[
          /* item */ FileSystemItem, 
          /* destinationDirectory */ FileSystemItem, 
          js.Thenable[Any] | Any
        ]
      ] = js.undefined
    
    /**
      * A function that creates a directory.
      */
    var createDirectory: js.UndefOr[
        js.Function2[/* parentDirectory */ FileSystemItem, /* name */ String, js.Thenable[Any] | Any]
      ] = js.undefined
    
    /**
      * A function that deletes a file or directory.
      */
    var deleteItem: js.UndefOr[js.Function1[/* item */ FileSystemItem, js.Thenable[Any] | Any]] = js.undefined
    
    /**
      * A function that downloads files.
      */
    var downloadItems: js.UndefOr[js.Function1[/* items */ js.Array[FileSystemItem], Unit]] = js.undefined
    
    /**
      * A function that gets file system items.
      */
    var getItems: js.UndefOr[
        js.Function1[/* parentDirectory */ FileSystemItem, js.Thenable[js.Array[Any]] | js.Array[Any]]
      ] = js.undefined
    
    /**
      * A function that get items content.
      */
    var getItemsContent: js.UndefOr[js.Function1[/* items */ js.Array[FileSystemItem], js.Thenable[Any] | Any]] = js.undefined
    
    /**
      * A function or the name of a data source field that provides information on whether a file or directory contains sub directories.
      */
    var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * A function that moves files and directories.
      */
    var moveItem: js.UndefOr[
        js.Function2[
          /* item */ FileSystemItem, 
          /* destinationDirectory */ FileSystemItem, 
          js.Thenable[Any] | Any
        ]
      ] = js.undefined
    
    /**
      * A function that renames files and directories.
      */
    var renameItem: js.UndefOr[
        js.Function2[/* item */ FileSystemItem, /* newName */ String, js.Thenable[Any] | Any]
      ] = js.undefined
    
    /**
      * A function that uploads a file in chunks.
      */
    var uploadFileChunk: js.UndefOr[
        js.Function3[
          /* file */ File, 
          /* uploadInfo */ UploadInfo, 
          /* destinationDirectory */ FileSystemItem, 
          js.Thenable[Any] | Any
        ]
      ] = js.undefined
  }
  object CustomFileSystemProviderOptions {
    
    inline def apply(): CustomFileSystemProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomFileSystemProviderOptions]
    }
    
    extension [Self <: CustomFileSystemProviderOptions](x: Self) {
      
      inline def setAbortFileUpload(
        value: (/* file */ File, /* uploadInfo */ UploadInfo, /* destinationDirectory */ FileSystemItem) => js.Thenable[Any] | Any
      ): Self = StObject.set(x, "abortFileUpload", js.Any.fromFunction3(value))
      
      inline def setAbortFileUploadUndefined: Self = StObject.set(x, "abortFileUpload", js.undefined)
      
      inline def setCopyItem(
        value: (/* item */ FileSystemItem, /* destinationDirectory */ FileSystemItem) => js.Thenable[Any] | Any
      ): Self = StObject.set(x, "copyItem", js.Any.fromFunction2(value))
      
      inline def setCopyItemUndefined: Self = StObject.set(x, "copyItem", js.undefined)
      
      inline def setCreateDirectory(value: (/* parentDirectory */ FileSystemItem, /* name */ String) => js.Thenable[Any] | Any): Self = StObject.set(x, "createDirectory", js.Any.fromFunction2(value))
      
      inline def setCreateDirectoryUndefined: Self = StObject.set(x, "createDirectory", js.undefined)
      
      inline def setDeleteItem(value: /* item */ FileSystemItem => js.Thenable[Any] | Any): Self = StObject.set(x, "deleteItem", js.Any.fromFunction1(value))
      
      inline def setDeleteItemUndefined: Self = StObject.set(x, "deleteItem", js.undefined)
      
      inline def setDownloadItems(value: /* items */ js.Array[FileSystemItem] => Unit): Self = StObject.set(x, "downloadItems", js.Any.fromFunction1(value))
      
      inline def setDownloadItemsUndefined: Self = StObject.set(x, "downloadItems", js.undefined)
      
      inline def setGetItems(value: /* parentDirectory */ FileSystemItem => js.Thenable[js.Array[Any]] | js.Array[Any]): Self = StObject.set(x, "getItems", js.Any.fromFunction1(value))
      
      inline def setGetItemsContent(value: /* items */ js.Array[FileSystemItem] => js.Thenable[Any] | Any): Self = StObject.set(x, "getItemsContent", js.Any.fromFunction1(value))
      
      inline def setGetItemsContentUndefined: Self = StObject.set(x, "getItemsContent", js.undefined)
      
      inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
      
      inline def setHasSubDirectoriesExpr(value: String | js.Function): Self = StObject.set(x, "hasSubDirectoriesExpr", value.asInstanceOf[js.Any])
      
      inline def setHasSubDirectoriesExprUndefined: Self = StObject.set(x, "hasSubDirectoriesExpr", js.undefined)
      
      inline def setMoveItem(
        value: (/* item */ FileSystemItem, /* destinationDirectory */ FileSystemItem) => js.Thenable[Any] | Any
      ): Self = StObject.set(x, "moveItem", js.Any.fromFunction2(value))
      
      inline def setMoveItemUndefined: Self = StObject.set(x, "moveItem", js.undefined)
      
      inline def setRenameItem(value: (/* item */ FileSystemItem, /* newName */ String) => js.Thenable[Any] | Any): Self = StObject.set(x, "renameItem", js.Any.fromFunction2(value))
      
      inline def setRenameItemUndefined: Self = StObject.set(x, "renameItem", js.undefined)
      
      inline def setUploadFileChunk(
        value: (/* file */ File, /* uploadInfo */ UploadInfo, /* destinationDirectory */ FileSystemItem) => js.Thenable[Any] | Any
      ): Self = StObject.set(x, "uploadFileChunk", js.Any.fromFunction3(value))
      
      inline def setUploadFileChunkUndefined: Self = StObject.set(x, "uploadFileChunk", js.undefined)
    }
  }
  
  trait FileSystemError extends StObject {
    
    /**
      * The error code.
      */
    var errorCode: js.UndefOr[Double] = js.undefined
    
    /**
      * The error message.
      */
    var errorText: js.UndefOr[String] = js.undefined
    
    /**
      * The processed file or directory.
      */
    var fileSystemItem: js.UndefOr[FileSystemItem] = js.undefined
  }
  object FileSystemError {
    
    inline def apply(): FileSystemError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSystemError]
    }
    
    extension [Self <: FileSystemError](x: Self) {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
      
      inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
      
      inline def setFileSystemItem(value: FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
    }
  }
  
  trait FileSystemItem extends StObject {
    
    /**
      * The file system data object that stores information about the file system item (name, size, modification date, etc.).
      */
    var dataItem: Any
    
    /**
      * A timestamp that indicates when the file system item was last modified.
      */
    var dateModified: js.Date
    
    /**
      * Gets a file&apos;s extension.
      */
    def getFileExtension(): String
    
    /**
      * Specifies whether a directory has subdirectories.
      */
    var hasSubDirectories: Boolean
    
    /**
      * Specifies whether the file system item is a directory.
      */
    var isDirectory: Boolean
    
    /**
      * The file system item&apos;s key.
      */
    var key: String
    
    /**
      * The file system item&apos;s name.
      */
    var name: String
    
    /**
      * The file system item&apos;s path.
      */
    var path: String
    
    /**
      * The file system item&apos;s path specified in keys.
      */
    var pathKeys: js.Array[String]
    
    /**
      * The file system item&apos;s size (in bytes).
      */
    var size: Double
    
    /**
      * An icon (URL) to be used as the file system item&apos;s thumbnail.
      */
    var thumbnail: String
  }
  object FileSystemItem {
    
    inline def apply(
      dataItem: Any,
      dateModified: js.Date,
      getFileExtension: () => String,
      hasSubDirectories: Boolean,
      isDirectory: Boolean,
      key: String,
      name: String,
      path: String,
      pathKeys: js.Array[String],
      size: Double,
      thumbnail: String
    ): FileSystemItem = {
      val __obj = js.Dynamic.literal(dataItem = dataItem.asInstanceOf[js.Any], dateModified = dateModified.asInstanceOf[js.Any], getFileExtension = js.Any.fromFunction0(getFileExtension), hasSubDirectories = hasSubDirectories.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathKeys = pathKeys.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemItem]
    }
    
    extension [Self <: FileSystemItem](x: Self) {
      
      inline def setDataItem(value: Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      inline def setDateModified(value: js.Date): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
      
      inline def setGetFileExtension(value: () => String): Self = StObject.set(x, "getFileExtension", js.Any.fromFunction0(value))
      
      inline def setHasSubDirectories(value: Boolean): Self = StObject.set(x, "hasSubDirectories", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathKeys(value: js.Array[String]): Self = StObject.set(x, "pathKeys", value.asInstanceOf[js.Any])
      
      inline def setPathKeysVarargs(value: String*): Self = StObject.set(x, "pathKeys", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileSystemProviderBase extends StObject {
    
    /**
      * Cancels the file upload.
      */
    def abortFileUpload(fileData: File, uploadInfo: UploadInfo, destinationDirectory: FileSystemItem): DxPromise[Any]
    
    /**
      * Copies files or directories.
      */
    def copyItems(items: js.Array[FileSystemItem], destinationDirectory: FileSystemItem): js.Array[DxPromise[Any]]
    
    /**
      * Creates a directory.
      */
    def createDirectory(parentDirectory: FileSystemItem, name: String): DxPromise[Any]
    
    /**
      * Deletes files or directories.
      */
    def deleteItems(items: js.Array[FileSystemItem]): js.Array[DxPromise[Any]]
    
    /**
      * Downloads files.
      */
    def downloadItems(items: js.Array[FileSystemItem]): Unit
    
    /**
      * Gets file system items.
      */
    def getItems(parentDirectory: FileSystemItem): DxPromise[js.Array[FileSystemItem]]
    
    /**
      * Gets items content.
      */
    def getItemsContent(items: js.Array[FileSystemItem]): DxPromise[Any]
    
    /**
      * Moves files and directories.
      */
    def moveItems(items: js.Array[FileSystemItem], destinationDirectory: FileSystemItem): js.Array[DxPromise[Any]]
    
    /**
      * Renames a file or directory.
      */
    def renameItem(item: FileSystemItem, newName: String): DxPromise[Any]
    
    /**
      * Uploads a file in chunks.
      */
    def uploadFileChunk(fileData: File, uploadInfo: UploadInfo, destinationDirectory: FileSystemItem): DxPromise[Any]
  }
  object FileSystemProviderBase {
    
    inline def apply(
      abortFileUpload: (File, UploadInfo, FileSystemItem) => DxPromise[Any],
      copyItems: (js.Array[FileSystemItem], FileSystemItem) => js.Array[DxPromise[Any]],
      createDirectory: (FileSystemItem, String) => DxPromise[Any],
      deleteItems: js.Array[FileSystemItem] => js.Array[DxPromise[Any]],
      downloadItems: js.Array[FileSystemItem] => Unit,
      getItems: FileSystemItem => DxPromise[js.Array[FileSystemItem]],
      getItemsContent: js.Array[FileSystemItem] => DxPromise[Any],
      moveItems: (js.Array[FileSystemItem], FileSystemItem) => js.Array[DxPromise[Any]],
      renameItem: (FileSystemItem, String) => DxPromise[Any],
      uploadFileChunk: (File, UploadInfo, FileSystemItem) => DxPromise[Any]
    ): FileSystemProviderBase = {
      val __obj = js.Dynamic.literal(abortFileUpload = js.Any.fromFunction3(abortFileUpload), copyItems = js.Any.fromFunction2(copyItems), createDirectory = js.Any.fromFunction2(createDirectory), deleteItems = js.Any.fromFunction1(deleteItems), downloadItems = js.Any.fromFunction1(downloadItems), getItems = js.Any.fromFunction1(getItems), getItemsContent = js.Any.fromFunction1(getItemsContent), moveItems = js.Any.fromFunction2(moveItems), renameItem = js.Any.fromFunction2(renameItem), uploadFileChunk = js.Any.fromFunction3(uploadFileChunk))
      __obj.asInstanceOf[FileSystemProviderBase]
    }
    
    extension [Self <: FileSystemProviderBase](x: Self) {
      
      inline def setAbortFileUpload(value: (File, UploadInfo, FileSystemItem) => DxPromise[Any]): Self = StObject.set(x, "abortFileUpload", js.Any.fromFunction3(value))
      
      inline def setCopyItems(value: (js.Array[FileSystemItem], FileSystemItem) => js.Array[DxPromise[Any]]): Self = StObject.set(x, "copyItems", js.Any.fromFunction2(value))
      
      inline def setCreateDirectory(value: (FileSystemItem, String) => DxPromise[Any]): Self = StObject.set(x, "createDirectory", js.Any.fromFunction2(value))
      
      inline def setDeleteItems(value: js.Array[FileSystemItem] => js.Array[DxPromise[Any]]): Self = StObject.set(x, "deleteItems", js.Any.fromFunction1(value))
      
      inline def setDownloadItems(value: js.Array[FileSystemItem] => Unit): Self = StObject.set(x, "downloadItems", js.Any.fromFunction1(value))
      
      inline def setGetItems(value: FileSystemItem => DxPromise[js.Array[FileSystemItem]]): Self = StObject.set(x, "getItems", js.Any.fromFunction1(value))
      
      inline def setGetItemsContent(value: js.Array[FileSystemItem] => DxPromise[Any]): Self = StObject.set(x, "getItemsContent", js.Any.fromFunction1(value))
      
      inline def setMoveItems(value: (js.Array[FileSystemItem], FileSystemItem) => js.Array[DxPromise[Any]]): Self = StObject.set(x, "moveItems", js.Any.fromFunction2(value))
      
      inline def setRenameItem(value: (FileSystemItem, String) => DxPromise[Any]): Self = StObject.set(x, "renameItem", js.Any.fromFunction2(value))
      
      inline def setUploadFileChunk(value: (File, UploadInfo, FileSystemItem) => DxPromise[Any]): Self = StObject.set(x, "uploadFileChunk", js.Any.fromFunction3(value))
    }
  }
  
  trait FileSystemProviderBaseOptions[T] extends StObject {
    
    /**
      * Specifies which data field provides timestamps that indicate when a file was last modified.
      */
    var dateModifiedExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Specifies which data field provides information about whether a file system item is a directory.
      */
    var isDirectoryExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Specifies the data field that provides keys.
      */
    var keyExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Specifies which data field provides file and directory names.
      */
    var nameExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Specifies which data field provides file sizes.
      */
    var sizeExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Specifies which data field provides icons to be used as thumbnails.
      */
    var thumbnailExpr: js.UndefOr[String | js.Function] = js.undefined
  }
  object FileSystemProviderBaseOptions {
    
    inline def apply[T](): FileSystemProviderBaseOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSystemProviderBaseOptions[T]]
    }
    
    extension [Self <: FileSystemProviderBaseOptions[?], T](x: Self & FileSystemProviderBaseOptions[T]) {
      
      inline def setDateModifiedExpr(value: String | js.Function): Self = StObject.set(x, "dateModifiedExpr", value.asInstanceOf[js.Any])
      
      inline def setDateModifiedExprUndefined: Self = StObject.set(x, "dateModifiedExpr", js.undefined)
      
      inline def setIsDirectoryExpr(value: String | js.Function): Self = StObject.set(x, "isDirectoryExpr", value.asInstanceOf[js.Any])
      
      inline def setIsDirectoryExprUndefined: Self = StObject.set(x, "isDirectoryExpr", js.undefined)
      
      inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
      
      inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
      
      inline def setNameExpr(value: String | js.Function): Self = StObject.set(x, "nameExpr", value.asInstanceOf[js.Any])
      
      inline def setNameExprUndefined: Self = StObject.set(x, "nameExpr", js.undefined)
      
      inline def setSizeExpr(value: String | js.Function): Self = StObject.set(x, "sizeExpr", value.asInstanceOf[js.Any])
      
      inline def setSizeExprUndefined: Self = StObject.set(x, "sizeExpr", js.undefined)
      
      inline def setThumbnailExpr(value: String | js.Function): Self = StObject.set(x, "thumbnailExpr", value.asInstanceOf[js.Any])
      
      inline def setThumbnailExprUndefined: Self = StObject.set(x, "thumbnailExpr", js.undefined)
    }
  }
  
  object ObjectFileSystemProvider {
    
    type Options = ObjectFileSystemProviderOptions
  }
  type ObjectFileSystemProvider = FileSystemProviderBase
  
  trait ObjectFileSystemProviderOptions
    extends StObject
       with FileSystemProviderBaseOptions[ObjectFileSystemProvider] {
    
    /**
      * Specifies which data field provides information about files content.
      */
    var contentExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Specifies an array of data objects that represent files and directories.
      */
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Specifies which data field provides information about nested files and directories.
      */
    var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
  }
  object ObjectFileSystemProviderOptions {
    
    inline def apply(): ObjectFileSystemProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectFileSystemProviderOptions]
    }
    
    extension [Self <: ObjectFileSystemProviderOptions](x: Self) {
      
      inline def setContentExpr(value: String | js.Function): Self = StObject.set(x, "contentExpr", value.asInstanceOf[js.Any])
      
      inline def setContentExprUndefined: Self = StObject.set(x, "contentExpr", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setItemsExpr(value: String | js.Function): Self = StObject.set(x, "itemsExpr", value.asInstanceOf[js.Any])
      
      inline def setItemsExprUndefined: Self = StObject.set(x, "itemsExpr", js.undefined)
    }
  }
  
  object RemoteFileSystemProvider {
    
    type Options = RemoteFileSystemProviderOptions
  }
  type RemoteFileSystemProvider = FileSystemProviderBase
  
  trait RemoteFileSystemProviderOptions
    extends StObject
       with FileSystemProviderBaseOptions[RemoteFileSystemProvider] {
    
    /**
      * Specifies a function that customizes an Ajax request before it is sent to the server.
      */
    var beforeAjaxSend: js.UndefOr[js.Function1[/* options */ FormData, Unit]] = js.undefined
    
    /**
      * Specifies a function that customizes a form submit request before it is sent to the server.
      */
    var beforeSubmit: js.UndefOr[js.Function1[/* options */ `3`, Unit]] = js.undefined
    
    /**
      * Specifies the URL of an endpoint used to access and modify a file system located on the server.
      */
    var endpointUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies which data field provides information about whether a directory has subdirectories.
      */
    var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Specifies the request headers.
      */
    var requestHeaders: js.UndefOr[Any] = js.undefined
  }
  object RemoteFileSystemProviderOptions {
    
    inline def apply(): RemoteFileSystemProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteFileSystemProviderOptions]
    }
    
    extension [Self <: RemoteFileSystemProviderOptions](x: Self) {
      
      inline def setBeforeAjaxSend(value: /* options */ FormData => Unit): Self = StObject.set(x, "beforeAjaxSend", js.Any.fromFunction1(value))
      
      inline def setBeforeAjaxSendUndefined: Self = StObject.set(x, "beforeAjaxSend", js.undefined)
      
      inline def setBeforeSubmit(value: /* options */ `3` => Unit): Self = StObject.set(x, "beforeSubmit", js.Any.fromFunction1(value))
      
      inline def setBeforeSubmitUndefined: Self = StObject.set(x, "beforeSubmit", js.undefined)
      
      inline def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
      
      inline def setEndpointUrlUndefined: Self = StObject.set(x, "endpointUrl", js.undefined)
      
      inline def setHasSubDirectoriesExpr(value: String | js.Function): Self = StObject.set(x, "hasSubDirectoriesExpr", value.asInstanceOf[js.Any])
      
      inline def setHasSubDirectoriesExprUndefined: Self = StObject.set(x, "hasSubDirectoriesExpr", js.undefined)
      
      inline def setRequestHeaders(value: Any): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    }
  }
  
  trait UploadInfo extends StObject {
    
    /**
      * The number of bytes that is uploaded to the server.
      */
    var bytesUploaded: Double
    
    /**
      * The binary content of the uploading chunk.
      */
    var chunkBlob: Blob
    
    /**
      * The number of uploaded chunks and chunks that are to be uploaded.
      */
    var chunkCount: Double
    
    /**
      * The index of the uploading chunk.
      */
    var chunkIndex: Double
    
    /**
      * Information saved during the file upload.
      */
    var customData: Any
  }
  object UploadInfo {
    
    inline def apply(bytesUploaded: Double, chunkBlob: Blob, chunkCount: Double, chunkIndex: Double, customData: Any): UploadInfo = {
      val __obj = js.Dynamic.literal(bytesUploaded = bytesUploaded.asInstanceOf[js.Any], chunkBlob = chunkBlob.asInstanceOf[js.Any], chunkCount = chunkCount.asInstanceOf[js.Any], chunkIndex = chunkIndex.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadInfo]
    }
    
    extension [Self <: UploadInfo](x: Self) {
      
      inline def setBytesUploaded(value: Double): Self = StObject.set(x, "bytesUploaded", value.asInstanceOf[js.Any])
      
      inline def setChunkBlob(value: Blob): Self = StObject.set(x, "chunkBlob", value.asInstanceOf[js.Any])
      
      inline def setChunkCount(value: Double): Self = StObject.set(x, "chunkCount", value.asInstanceOf[js.Any])
      
      inline def setChunkIndex(value: Double): Self = StObject.set(x, "chunkIndex", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    }
  }
}
