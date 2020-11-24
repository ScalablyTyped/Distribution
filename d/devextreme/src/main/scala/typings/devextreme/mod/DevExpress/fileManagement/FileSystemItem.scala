package typings.devextreme.mod.DevExpress.fileManagement

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemItem extends js.Object {
  
  /**
    * [descr:FileSystemItem.dataItem]
    */
  var dataItem: js.Any = js.native
  
  /**
    * [descr:FileSystemItem.dateModified]
    */
  var dateModified: Date = js.native
  
  /**
    * [descr:FileSystemItem.getFileExtension()]
    */
  def getFileExtension(): String = js.native
  
  /**
    * [descr:FileSystemItem.hasSubDirectories]
    */
  var hasSubDirectories: Boolean = js.native
  
  /**
    * [descr:FileSystemItem.isDirectory]
    */
  var isDirectory: Boolean = js.native
  
  /**
    * [descr:FileSystemItem.key]
    */
  var key: String = js.native
  
  /**
    * [descr:FileSystemItem.name]
    */
  var name: String = js.native
  
  /**
    * [descr:FileSystemItem.path]
    */
  var path: String = js.native
  
  /**
    * [descr:FileSystemItem.pathKeys]
    */
  var pathKeys: js.Array[String] = js.native
  
  /**
    * [descr:FileSystemItem.size]
    */
  var size: Double = js.native
  
  /**
    * [descr:FileSystemItem.thumbnail]
    */
  var thumbnail: String = js.native
}
object FileSystemItem {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FileSystemItemOps[Self <: FileSystemItem] (val x: Self) extends AnyVal {
    
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
    def setDataItem(value: js.Any): Self = this.set("dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateModified(value: Date): Self = this.set("dateModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFileExtension(value: () => String): Self = this.set("getFileExtension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSubDirectories(value: Boolean): Self = this.set("hasSubDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathKeysVarargs(value: String*): Self = this.set("pathKeys", js.Array(value :_*))
    
    @scala.inline
    def setPathKeys(value: js.Array[String]): Self = this.set("pathKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}
