package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Blob
import typings.std.Date
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileManagement {
  
  type CustomFileSystemProvider = FileSystemProviderBase
  
  trait CustomFileSystemProviderOptions
    extends StObject
       with FileSystemProviderBaseOptions[CustomFileSystemProvider] {
    
    /**
      * [descr:CustomFileSystemProvider.Options.abortFileUpload]
      */
    var abortFileUpload: js.UndefOr[
        js.Function3[
          /* file */ File, 
          /* uploadInfo */ UploadInfo, 
          /* destinationDirectory */ FileSystemItem, 
          Promise[js.Any] | JQueryPromise[js.Any] | js.Any
        ]
      ] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.copyItem]
      */
    var copyItem: js.UndefOr[
        js.Function2[
          /* item */ FileSystemItem, 
          /* destinationDirectory */ FileSystemItem, 
          Promise[js.Any] | JQueryPromise[js.Any] | js.Any
        ]
      ] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.createDirectory]
      */
    var createDirectory: js.UndefOr[
        js.Function2[
          /* parentDirectory */ FileSystemItem, 
          /* name */ String, 
          Promise[js.Any] | JQueryPromise[js.Any] | js.Any
        ]
      ] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.deleteItem]
      */
    var deleteItem: js.UndefOr[
        js.Function1[/* item */ FileSystemItem, Promise[js.Any] | JQueryPromise[js.Any] | js.Any]
      ] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.downloadItems]
      */
    var downloadItems: js.UndefOr[js.Function1[/* items */ js.Array[FileSystemItem], js.Any]] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.getItems]
      */
    var getItems: js.UndefOr[
        js.Function1[
          /* parentDirectory */ FileSystemItem, 
          Promise[js.Array[js.Any]] | JQueryPromise[js.Array[js.Any]] | js.Array[js.Any]
        ]
      ] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.getItemsContent]
      */
    var getItemsContent: js.UndefOr[
        js.Function1[
          /* items */ js.Array[FileSystemItem], 
          Promise[js.Any] | JQueryPromise[js.Any] | js.Any
        ]
      ] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.hasSubDirectoriesExpr]
      */
    var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.moveItem]
      */
    var moveItem: js.UndefOr[
        js.Function2[
          /* item */ FileSystemItem, 
          /* destinationDirectory */ FileSystemItem, 
          Promise[js.Any] | JQueryPromise[js.Any] | js.Any
        ]
      ] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.renameItem]
      */
    var renameItem: js.UndefOr[
        js.Function2[
          /* item */ FileSystemItem, 
          /* newName */ String, 
          Promise[js.Any] | JQueryPromise[js.Any] | js.Any
        ]
      ] = js.undefined
    
    /**
      * [descr:CustomFileSystemProvider.Options.uploadFileChunk]
      */
    var uploadFileChunk: js.UndefOr[
        js.Function3[
          /* file */ File, 
          /* uploadInfo */ UploadInfo, 
          /* destinationDirectory */ FileSystemItem, 
          Promise[js.Any] | JQueryPromise[js.Any] | js.Any
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
        value: (/* file */ File, /* uploadInfo */ UploadInfo, /* destinationDirectory */ FileSystemItem) => Promise[js.Any] | JQueryPromise[js.Any] | js.Any
      ): Self = StObject.set(x, "abortFileUpload", js.Any.fromFunction3(value))
      
      inline def setAbortFileUploadUndefined: Self = StObject.set(x, "abortFileUpload", js.undefined)
      
      inline def setCopyItem(
        value: (/* item */ FileSystemItem, /* destinationDirectory */ FileSystemItem) => Promise[js.Any] | JQueryPromise[js.Any] | js.Any
      ): Self = StObject.set(x, "copyItem", js.Any.fromFunction2(value))
      
      inline def setCopyItemUndefined: Self = StObject.set(x, "copyItem", js.undefined)
      
      inline def setCreateDirectory(
        value: (/* parentDirectory */ FileSystemItem, /* name */ String) => Promise[js.Any] | JQueryPromise[js.Any] | js.Any
      ): Self = StObject.set(x, "createDirectory", js.Any.fromFunction2(value))
      
      inline def setCreateDirectoryUndefined: Self = StObject.set(x, "createDirectory", js.undefined)
      
      inline def setDeleteItem(value: /* item */ FileSystemItem => Promise[js.Any] | JQueryPromise[js.Any] | js.Any): Self = StObject.set(x, "deleteItem", js.Any.fromFunction1(value))
      
      inline def setDeleteItemUndefined: Self = StObject.set(x, "deleteItem", js.undefined)
      
      inline def setDownloadItems(value: /* items */ js.Array[FileSystemItem] => js.Any): Self = StObject.set(x, "downloadItems", js.Any.fromFunction1(value))
      
      inline def setDownloadItemsUndefined: Self = StObject.set(x, "downloadItems", js.undefined)
      
      inline def setGetItems(
        value: /* parentDirectory */ FileSystemItem => Promise[js.Array[js.Any]] | JQueryPromise[js.Array[js.Any]] | js.Array[js.Any]
      ): Self = StObject.set(x, "getItems", js.Any.fromFunction1(value))
      
      inline def setGetItemsContent(value: /* items */ js.Array[FileSystemItem] => Promise[js.Any] | JQueryPromise[js.Any] | js.Any): Self = StObject.set(x, "getItemsContent", js.Any.fromFunction1(value))
      
      inline def setGetItemsContentUndefined: Self = StObject.set(x, "getItemsContent", js.undefined)
      
      inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
      
      inline def setHasSubDirectoriesExpr(value: String | js.Function): Self = StObject.set(x, "hasSubDirectoriesExpr", value.asInstanceOf[js.Any])
      
      inline def setHasSubDirectoriesExprUndefined: Self = StObject.set(x, "hasSubDirectoriesExpr", js.undefined)
      
      inline def setMoveItem(
        value: (/* item */ FileSystemItem, /* destinationDirectory */ FileSystemItem) => Promise[js.Any] | JQueryPromise[js.Any] | js.Any
      ): Self = StObject.set(x, "moveItem", js.Any.fromFunction2(value))
      
      inline def setMoveItemUndefined: Self = StObject.set(x, "moveItem", js.undefined)
      
      inline def setRenameItem(
        value: (/* item */ FileSystemItem, /* newName */ String) => Promise[js.Any] | JQueryPromise[js.Any] | js.Any
      ): Self = StObject.set(x, "renameItem", js.Any.fromFunction2(value))
      
      inline def setRenameItemUndefined: Self = StObject.set(x, "renameItem", js.undefined)
      
      inline def setUploadFileChunk(
        value: (/* file */ File, /* uploadInfo */ UploadInfo, /* destinationDirectory */ FileSystemItem) => Promise[js.Any] | JQueryPromise[js.Any] | js.Any
      ): Self = StObject.set(x, "uploadFileChunk", js.Any.fromFunction3(value))
      
      inline def setUploadFileChunkUndefined: Self = StObject.set(x, "uploadFileChunk", js.undefined)
    }
  }
  
  trait FileSystemItem extends StObject {
    
    /**
      * [descr:FileSystemItem.dataItem]
      */
    var dataItem: js.Any
    
    /**
      * [descr:FileSystemItem.dateModified]
      */
    var dateModified: Date
    
    /**
      * [descr:FileSystemItem.getFileExtension()]
      */
    def getFileExtension(): String
    
    /**
      * [descr:FileSystemItem.hasSubDirectories]
      */
    var hasSubDirectories: Boolean
    
    /**
      * [descr:FileSystemItem.isDirectory]
      */
    var isDirectory: Boolean
    
    /**
      * [descr:FileSystemItem.key]
      */
    var key: String
    
    /**
      * [descr:FileSystemItem.name]
      */
    var name: String
    
    /**
      * [descr:FileSystemItem.path]
      */
    var path: String
    
    /**
      * [descr:FileSystemItem.pathKeys]
      */
    var pathKeys: js.Array[String]
    
    /**
      * [descr:FileSystemItem.size]
      */
    var size: Double
    
    /**
      * [descr:FileSystemItem.thumbnail]
      */
    var thumbnail: String
  }
  object FileSystemItem {
    
    inline def apply(
      dataItem: js.Any,
      dateModified: Date,
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
      
      inline def setDataItem(value: js.Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      inline def setDateModified(value: Date): Self = StObject.set(x, "dateModified", value.asInstanceOf[js.Any])
      
      inline def setGetFileExtension(value: () => String): Self = StObject.set(x, "getFileExtension", js.Any.fromFunction0(value))
      
      inline def setHasSubDirectories(value: Boolean): Self = StObject.set(x, "hasSubDirectories", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathKeys(value: js.Array[String]): Self = StObject.set(x, "pathKeys", value.asInstanceOf[js.Any])
      
      inline def setPathKeysVarargs(value: String*): Self = StObject.set(x, "pathKeys", js.Array(value :_*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileSystemProviderBase extends StObject {
    
    /**
      * [descr:FileSystemProviderBase.abortFileUpload()]
      */
    def abortFileUpload(fileData: File, uploadInfo: UploadInfo, destinationDirectory: FileSystemItem): Promise[js.Any] & JQueryPromise[js.Any]
    
    /**
      * [descr:FileSystemProviderBase.copyItems()]
      */
    def copyItems(items: js.Array[FileSystemItem], destinationDirectory: FileSystemItem): js.Array[Promise[js.Any] | JQueryPromise[js.Any]]
    
    /**
      * [descr:FileSystemProviderBase.createDirectory()]
      */
    def createDirectory(parentDirectory: FileSystemItem, name: String): Promise[js.Any] & JQueryPromise[js.Any]
    
    /**
      * [descr:FileSystemProviderBase.deleteItems()]
      */
    def deleteItems(items: js.Array[FileSystemItem]): js.Array[Promise[js.Any] | JQueryPromise[js.Any]]
    
    /**
      * [descr:FileSystemProviderBase.downloadItems()]
      */
    def downloadItems(items: js.Array[FileSystemItem]): Unit
    
    /**
      * [descr:FileSystemProviderBase.getItems()]
      */
    def getItems(parentDirectory: FileSystemItem): Promise[js.Array[FileSystemItem]] & JQueryPromise[js.Array[FileSystemItem]]
    
    /**
      * [descr:FileSystemProviderBase.getItemsContent()]
      */
    def getItemsContent(items: js.Array[FileSystemItem]): Promise[js.Any] & JQueryPromise[js.Any]
    
    /**
      * [descr:FileSystemProviderBase.moveItems()]
      */
    def moveItems(items: js.Array[FileSystemItem], destinationDirectory: FileSystemItem): js.Array[Promise[js.Any] | JQueryPromise[js.Any]]
    
    /**
      * [descr:FileSystemProviderBase.renameItem()]
      */
    def renameItem(item: FileSystemItem, newName: String): Promise[js.Any] & JQueryPromise[js.Any]
    
    /**
      * [descr:FileSystemProviderBase.uploadFileChunk()]
      */
    def uploadFileChunk(fileData: File, uploadInfo: UploadInfo, destinationDirectory: FileSystemItem): Promise[js.Any] & JQueryPromise[js.Any]
  }
  object FileSystemProviderBase {
    
    inline def apply(
      abortFileUpload: (File, UploadInfo, FileSystemItem) => Promise[js.Any] & JQueryPromise[js.Any],
      copyItems: (js.Array[FileSystemItem], FileSystemItem) => js.Array[Promise[js.Any] | JQueryPromise[js.Any]],
      createDirectory: (FileSystemItem, String) => Promise[js.Any] & JQueryPromise[js.Any],
      deleteItems: js.Array[FileSystemItem] => js.Array[Promise[js.Any] | JQueryPromise[js.Any]],
      downloadItems: js.Array[FileSystemItem] => Unit,
      getItems: FileSystemItem => Promise[js.Array[FileSystemItem]] & JQueryPromise[js.Array[FileSystemItem]],
      getItemsContent: js.Array[FileSystemItem] => Promise[js.Any] & JQueryPromise[js.Any],
      moveItems: (js.Array[FileSystemItem], FileSystemItem) => js.Array[Promise[js.Any] | JQueryPromise[js.Any]],
      renameItem: (FileSystemItem, String) => Promise[js.Any] & JQueryPromise[js.Any],
      uploadFileChunk: (File, UploadInfo, FileSystemItem) => Promise[js.Any] & JQueryPromise[js.Any]
    ): FileSystemProviderBase = {
      val __obj = js.Dynamic.literal(abortFileUpload = js.Any.fromFunction3(abortFileUpload), copyItems = js.Any.fromFunction2(copyItems), createDirectory = js.Any.fromFunction2(createDirectory), deleteItems = js.Any.fromFunction1(deleteItems), downloadItems = js.Any.fromFunction1(downloadItems), getItems = js.Any.fromFunction1(getItems), getItemsContent = js.Any.fromFunction1(getItemsContent), moveItems = js.Any.fromFunction2(moveItems), renameItem = js.Any.fromFunction2(renameItem), uploadFileChunk = js.Any.fromFunction3(uploadFileChunk))
      __obj.asInstanceOf[FileSystemProviderBase]
    }
    
    extension [Self <: FileSystemProviderBase](x: Self) {
      
      inline def setAbortFileUpload(value: (File, UploadInfo, FileSystemItem) => Promise[js.Any] & JQueryPromise[js.Any]): Self = StObject.set(x, "abortFileUpload", js.Any.fromFunction3(value))
      
      inline def setCopyItems(
        value: (js.Array[FileSystemItem], FileSystemItem) => js.Array[Promise[js.Any] | JQueryPromise[js.Any]]
      ): Self = StObject.set(x, "copyItems", js.Any.fromFunction2(value))
      
      inline def setCreateDirectory(value: (FileSystemItem, String) => Promise[js.Any] & JQueryPromise[js.Any]): Self = StObject.set(x, "createDirectory", js.Any.fromFunction2(value))
      
      inline def setDeleteItems(value: js.Array[FileSystemItem] => js.Array[Promise[js.Any] | JQueryPromise[js.Any]]): Self = StObject.set(x, "deleteItems", js.Any.fromFunction1(value))
      
      inline def setDownloadItems(value: js.Array[FileSystemItem] => Unit): Self = StObject.set(x, "downloadItems", js.Any.fromFunction1(value))
      
      inline def setGetItems(
        value: FileSystemItem => Promise[js.Array[FileSystemItem]] & JQueryPromise[js.Array[FileSystemItem]]
      ): Self = StObject.set(x, "getItems", js.Any.fromFunction1(value))
      
      inline def setGetItemsContent(value: js.Array[FileSystemItem] => Promise[js.Any] & JQueryPromise[js.Any]): Self = StObject.set(x, "getItemsContent", js.Any.fromFunction1(value))
      
      inline def setMoveItems(
        value: (js.Array[FileSystemItem], FileSystemItem) => js.Array[Promise[js.Any] | JQueryPromise[js.Any]]
      ): Self = StObject.set(x, "moveItems", js.Any.fromFunction2(value))
      
      inline def setRenameItem(value: (FileSystemItem, String) => Promise[js.Any] & JQueryPromise[js.Any]): Self = StObject.set(x, "renameItem", js.Any.fromFunction2(value))
      
      inline def setUploadFileChunk(value: (File, UploadInfo, FileSystemItem) => Promise[js.Any] & JQueryPromise[js.Any]): Self = StObject.set(x, "uploadFileChunk", js.Any.fromFunction3(value))
    }
  }
  
  trait FileSystemProviderBaseOptions[T] extends StObject {
    
    /**
      * [descr:FileSystemProviderBase.Options.dateModifiedExpr]
      */
    var dateModifiedExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * [descr:FileSystemProviderBase.Options.isDirectoryExpr]
      */
    var isDirectoryExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * [descr:FileSystemProviderBase.Options.keyExpr]
      */
    var keyExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * [descr:FileSystemProviderBase.Options.nameExpr]
      */
    var nameExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * [descr:FileSystemProviderBase.Options.sizeExpr]
      */
    var sizeExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * [descr:FileSystemProviderBase.Options.thumbnailExpr]
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
  
  type ObjectFileSystemProvider = FileSystemProviderBase
  
  trait ObjectFileSystemProviderOptions
    extends StObject
       with FileSystemProviderBaseOptions[ObjectFileSystemProvider] {
    
    /**
      * [descr:ObjectFileSystemProvider.Options.contentExpr]
      */
    var contentExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * [descr:ObjectFileSystemProvider.Options.data]
      */
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * [descr:ObjectFileSystemProvider.Options.itemsExpr]
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
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setItemsExpr(value: String | js.Function): Self = StObject.set(x, "itemsExpr", value.asInstanceOf[js.Any])
      
      inline def setItemsExprUndefined: Self = StObject.set(x, "itemsExpr", js.undefined)
    }
  }
  
  type RemoteFileSystemProvider = FileSystemProviderBase
  
  trait RemoteFileSystemProviderOptions
    extends StObject
       with FileSystemProviderBaseOptions[RemoteFileSystemProvider] {
    
    /**
      * [descr:RemoteFileSystemProvider.Options.endpointUrl]
      */
    var endpointUrl: js.UndefOr[String] = js.undefined
    
    /**
      * [descr:RemoteFileSystemProvider.Options.hasSubDirectoriesExpr]
      */
    var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.undefined
  }
  object RemoteFileSystemProviderOptions {
    
    inline def apply(): RemoteFileSystemProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteFileSystemProviderOptions]
    }
    
    extension [Self <: RemoteFileSystemProviderOptions](x: Self) {
      
      inline def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
      
      inline def setEndpointUrlUndefined: Self = StObject.set(x, "endpointUrl", js.undefined)
      
      inline def setHasSubDirectoriesExpr(value: String | js.Function): Self = StObject.set(x, "hasSubDirectoriesExpr", value.asInstanceOf[js.Any])
      
      inline def setHasSubDirectoriesExprUndefined: Self = StObject.set(x, "hasSubDirectoriesExpr", js.undefined)
    }
  }
  
  trait UploadInfo extends StObject {
    
    /**
      * [descr:UploadInfo.bytesUploaded]
      */
    var bytesUploaded: Double
    
    /**
      * [descr:UploadInfo.chunkBlob]
      */
    var chunkBlob: Blob
    
    /**
      * [descr:UploadInfo.chunkCount]
      */
    var chunkCount: Double
    
    /**
      * [descr:UploadInfo.chunkIndex]
      */
    var chunkIndex: Double
    
    /**
      * [descr:UploadInfo.customData]
      */
    var customData: js.Any
  }
  object UploadInfo {
    
    inline def apply(bytesUploaded: Double, chunkBlob: Blob, chunkCount: Double, chunkIndex: Double, customData: js.Any): UploadInfo = {
      val __obj = js.Dynamic.literal(bytesUploaded = bytesUploaded.asInstanceOf[js.Any], chunkBlob = chunkBlob.asInstanceOf[js.Any], chunkCount = chunkCount.asInstanceOf[js.Any], chunkIndex = chunkIndex.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadInfo]
    }
    
    extension [Self <: UploadInfo](x: Self) {
      
      inline def setBytesUploaded(value: Double): Self = StObject.set(x, "bytesUploaded", value.asInstanceOf[js.Any])
      
      inline def setChunkBlob(value: Blob): Self = StObject.set(x, "chunkBlob", value.asInstanceOf[js.Any])
      
      inline def setChunkCount(value: Double): Self = StObject.set(x, "chunkCount", value.asInstanceOf[js.Any])
      
      inline def setChunkIndex(value: Double): Self = StObject.set(x, "chunkIndex", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    }
  }
}
