package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.fileManagement.CustomFileSystemProviderOptions
import typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBaseOptions
import typings.devextreme.mod.DevExpress.fileManagement.ObjectFileSystemProviderOptions
import typings.devextreme.mod.DevExpress.fileManagement.RemoteFileSystemProviderOptions
import typings.devextreme.mod.DevExpress.fileManagement.UploadInfo
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Date
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileManagement {
  
  @JSImport("devextreme", "default.fileManagement.CustomFileSystemProvider")
  @js.native
  class CustomFileSystemProvider ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: CustomFileSystemProviderOptions) = this()
    
    /**
      * [descr:FileSystemProviderBase.abortFileUpload()]
      */
    /* CompleteClass */
    override def abortFileUpload(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.copyItems()]
      */
    /* CompleteClass */
    override def copyItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.createDirectory()]
      */
    /* CompleteClass */
    override def createDirectory(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, name: String): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.deleteItems()]
      */
    /* CompleteClass */
    override def deleteItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.downloadItems()]
      */
    /* CompleteClass */
    override def downloadItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Unit = js.native
    
    /**
      * [descr:FileSystemProviderBase.getItems()]
      */
    /* CompleteClass */
    override def getItems(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Promise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] & JQueryPromise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.getItemsContent()]
      */
    /* CompleteClass */
    override def getItemsContent(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.moveItems()]
      */
    /* CompleteClass */
    override def moveItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.renameItem()]
      */
    /* CompleteClass */
    override def renameItem(item: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, newName: String): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.uploadFileChunk()]
      */
    /* CompleteClass */
    override def uploadFileChunk(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): Promise[js.Any] & JQueryPromise[js.Any] = js.native
  }
  
  @JSImport("devextreme", "default.fileManagement.FileSystemItem")
  @js.native
  class FileSystemItem ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem {
    
    /**
      * [descr:FileSystemItem.dataItem]
      */
    /* CompleteClass */
    var dataItem: js.Any = js.native
    
    /**
      * [descr:FileSystemItem.dateModified]
      */
    /* CompleteClass */
    var dateModified: Date = js.native
    
    /**
      * [descr:FileSystemItem.getFileExtension()]
      */
    /* CompleteClass */
    override def getFileExtension(): String = js.native
    
    /**
      * [descr:FileSystemItem.hasSubDirectories]
      */
    /* CompleteClass */
    var hasSubDirectories: Boolean = js.native
    
    /**
      * [descr:FileSystemItem.isDirectory]
      */
    /* CompleteClass */
    var isDirectory: Boolean = js.native
    
    /**
      * [descr:FileSystemItem.key]
      */
    /* CompleteClass */
    var key: String = js.native
    
    /**
      * [descr:FileSystemItem.name]
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * [descr:FileSystemItem.path]
      */
    /* CompleteClass */
    var path: String = js.native
    
    /**
      * [descr:FileSystemItem.pathKeys]
      */
    /* CompleteClass */
    var pathKeys: js.Array[String] = js.native
    
    /**
      * [descr:FileSystemItem.size]
      */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * [descr:FileSystemItem.thumbnail]
      */
    /* CompleteClass */
    var thumbnail: String = js.native
  }
  
  @JSImport("devextreme", "default.fileManagement.FileSystemProviderBase")
  @js.native
  class FileSystemProviderBase ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: FileSystemProviderBaseOptions[typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase]) = this()
    
    /**
      * [descr:FileSystemProviderBase.abortFileUpload()]
      */
    /* CompleteClass */
    override def abortFileUpload(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.copyItems()]
      */
    /* CompleteClass */
    override def copyItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.createDirectory()]
      */
    /* CompleteClass */
    override def createDirectory(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, name: String): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.deleteItems()]
      */
    /* CompleteClass */
    override def deleteItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.downloadItems()]
      */
    /* CompleteClass */
    override def downloadItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Unit = js.native
    
    /**
      * [descr:FileSystemProviderBase.getItems()]
      */
    /* CompleteClass */
    override def getItems(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Promise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] & JQueryPromise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.getItemsContent()]
      */
    /* CompleteClass */
    override def getItemsContent(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.moveItems()]
      */
    /* CompleteClass */
    override def moveItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.renameItem()]
      */
    /* CompleteClass */
    override def renameItem(item: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, newName: String): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.uploadFileChunk()]
      */
    /* CompleteClass */
    override def uploadFileChunk(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): Promise[js.Any] & JQueryPromise[js.Any] = js.native
  }
  
  @JSImport("devextreme", "default.fileManagement.ObjectFileSystemProvider")
  @js.native
  class ObjectFileSystemProvider ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: ObjectFileSystemProviderOptions) = this()
    
    /**
      * [descr:FileSystemProviderBase.abortFileUpload()]
      */
    /* CompleteClass */
    override def abortFileUpload(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.copyItems()]
      */
    /* CompleteClass */
    override def copyItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.createDirectory()]
      */
    /* CompleteClass */
    override def createDirectory(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, name: String): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.deleteItems()]
      */
    /* CompleteClass */
    override def deleteItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.downloadItems()]
      */
    /* CompleteClass */
    override def downloadItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Unit = js.native
    
    /**
      * [descr:FileSystemProviderBase.getItems()]
      */
    /* CompleteClass */
    override def getItems(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Promise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] & JQueryPromise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.getItemsContent()]
      */
    /* CompleteClass */
    override def getItemsContent(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.moveItems()]
      */
    /* CompleteClass */
    override def moveItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.renameItem()]
      */
    /* CompleteClass */
    override def renameItem(item: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, newName: String): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.uploadFileChunk()]
      */
    /* CompleteClass */
    override def uploadFileChunk(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): Promise[js.Any] & JQueryPromise[js.Any] = js.native
  }
  
  @JSImport("devextreme", "default.fileManagement.RemoteFileSystemProvider")
  @js.native
  class RemoteFileSystemProvider ()
    extends StObject
       with typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: RemoteFileSystemProviderOptions) = this()
    
    /**
      * [descr:FileSystemProviderBase.abortFileUpload()]
      */
    /* CompleteClass */
    override def abortFileUpload(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.copyItems()]
      */
    /* CompleteClass */
    override def copyItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.createDirectory()]
      */
    /* CompleteClass */
    override def createDirectory(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, name: String): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.deleteItems()]
      */
    /* CompleteClass */
    override def deleteItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.downloadItems()]
      */
    /* CompleteClass */
    override def downloadItems(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Unit = js.native
    
    /**
      * [descr:FileSystemProviderBase.getItems()]
      */
    /* CompleteClass */
    override def getItems(parentDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Promise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] & JQueryPromise[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.getItemsContent()]
      */
    /* CompleteClass */
    override def getItemsContent(items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.moveItems()]
      */
    /* CompleteClass */
    override def moveItems(
      items: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem],
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): js.Array[Promise[js.Any] | JQueryPromise[js.Any]] = js.native
    
    /**
      * [descr:FileSystemProviderBase.renameItem()]
      */
    /* CompleteClass */
    override def renameItem(item: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem, newName: String): Promise[js.Any] & JQueryPromise[js.Any] = js.native
    
    /**
      * [descr:FileSystemProviderBase.uploadFileChunk()]
      */
    /* CompleteClass */
    override def uploadFileChunk(
      fileData: File,
      uploadInfo: UploadInfo,
      destinationDirectory: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
    ): Promise[js.Any] & JQueryPromise[js.Any] = js.native
  }
}
