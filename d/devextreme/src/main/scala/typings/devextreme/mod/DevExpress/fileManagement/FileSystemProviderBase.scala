package typings.devextreme.mod.DevExpress.fileManagement

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemProviderBase extends js.Object {
  
  /**
    * [descr:FileSystemProviderBase.abortFileUpload()]
    */
  def abortFileUpload(fileData: File, uploadInfo: UploadInfo, destinationDirectory: FileSystemItem): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:FileSystemProviderBase.copyItems()]
    */
  def copyItems(items: js.Array[FileSystemItem], destinationDirectory: FileSystemItem): js.Array[Promise[_] | JQueryPromise[_]] = js.native
  
  /**
    * [descr:FileSystemProviderBase.createDirectory()]
    */
  def createDirectory(parentDirectory: FileSystemItem, name: String): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:FileSystemProviderBase.deleteItems()]
    */
  def deleteItems(items: js.Array[FileSystemItem]): js.Array[Promise[_] | JQueryPromise[_]] = js.native
  
  /**
    * [descr:FileSystemProviderBase.downloadItems()]
    */
  def downloadItems(items: js.Array[FileSystemItem]): Unit = js.native
  
  /**
    * [descr:FileSystemProviderBase.getItems()]
    */
  def getItems(parentDirectory: FileSystemItem): Promise[js.Array[FileSystemItem]] with JQueryPromise[js.Array[FileSystemItem]] = js.native
  
  /**
    * [descr:FileSystemProviderBase.getItemsContent()]
    */
  def getItemsContent(items: js.Array[FileSystemItem]): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:FileSystemProviderBase.moveItems()]
    */
  def moveItems(items: js.Array[FileSystemItem], destinationDirectory: FileSystemItem): js.Array[Promise[_] | JQueryPromise[_]] = js.native
  
  /**
    * [descr:FileSystemProviderBase.renameItem()]
    */
  def renameItem(item: FileSystemItem, newName: String): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:FileSystemProviderBase.uploadFileChunk()]
    */
  def uploadFileChunk(fileData: File, uploadInfo: UploadInfo, destinationDirectory: FileSystemItem): Promise[_] with JQueryPromise[_] = js.native
}
object FileSystemProviderBase {
  
  @scala.inline
  def apply(
    abortFileUpload: (File, UploadInfo, FileSystemItem) => Promise[_] with JQueryPromise[_],
    copyItems: (js.Array[FileSystemItem], FileSystemItem) => js.Array[Promise[_] | JQueryPromise[_]],
    createDirectory: (FileSystemItem, String) => Promise[_] with JQueryPromise[_],
    deleteItems: js.Array[FileSystemItem] => js.Array[Promise[_] | JQueryPromise[_]],
    downloadItems: js.Array[FileSystemItem] => Unit,
    getItems: FileSystemItem => Promise[js.Array[FileSystemItem]] with JQueryPromise[js.Array[FileSystemItem]],
    getItemsContent: js.Array[FileSystemItem] => Promise[_] with JQueryPromise[_],
    moveItems: (js.Array[FileSystemItem], FileSystemItem) => js.Array[Promise[_] | JQueryPromise[_]],
    renameItem: (FileSystemItem, String) => Promise[_] with JQueryPromise[_],
    uploadFileChunk: (File, UploadInfo, FileSystemItem) => Promise[_] with JQueryPromise[_]
  ): FileSystemProviderBase = {
    val __obj = js.Dynamic.literal(abortFileUpload = js.Any.fromFunction3(abortFileUpload), copyItems = js.Any.fromFunction2(copyItems), createDirectory = js.Any.fromFunction2(createDirectory), deleteItems = js.Any.fromFunction1(deleteItems), downloadItems = js.Any.fromFunction1(downloadItems), getItems = js.Any.fromFunction1(getItems), getItemsContent = js.Any.fromFunction1(getItemsContent), moveItems = js.Any.fromFunction2(moveItems), renameItem = js.Any.fromFunction2(renameItem), uploadFileChunk = js.Any.fromFunction3(uploadFileChunk))
    __obj.asInstanceOf[FileSystemProviderBase]
  }
  
  @scala.inline
  implicit class FileSystemProviderBaseOps[Self <: FileSystemProviderBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbortFileUpload(value: (File, UploadInfo, FileSystemItem) => Promise[_] with JQueryPromise[_]): Self = this.set("abortFileUpload", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCopyItems(value: (js.Array[FileSystemItem], FileSystemItem) => js.Array[Promise[_] | JQueryPromise[_]]): Self = this.set("copyItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateDirectory(value: (FileSystemItem, String) => Promise[_] with JQueryPromise[_]): Self = this.set("createDirectory", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteItems(value: js.Array[FileSystemItem] => js.Array[Promise[_] | JQueryPromise[_]]): Self = this.set("deleteItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownloadItems(value: js.Array[FileSystemItem] => Unit): Self = this.set("downloadItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItems(
      value: FileSystemItem => Promise[js.Array[FileSystemItem]] with JQueryPromise[js.Array[FileSystemItem]]
    ): Self = this.set("getItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemsContent(value: js.Array[FileSystemItem] => Promise[_] with JQueryPromise[_]): Self = this.set("getItemsContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveItems(value: (js.Array[FileSystemItem], FileSystemItem) => js.Array[Promise[_] | JQueryPromise[_]]): Self = this.set("moveItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenameItem(value: (FileSystemItem, String) => Promise[_] with JQueryPromise[_]): Self = this.set("renameItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUploadFileChunk(value: (File, UploadInfo, FileSystemItem) => Promise[_] with JQueryPromise[_]): Self = this.set("uploadFileChunk", js.Any.fromFunction3(value))
  }
}
