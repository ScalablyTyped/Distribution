package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a file to save to.
  */
@js.native
trait RichEditFileInfo extends js.Object {
  /**
    * Gets or sets the file's document format.
    */
  var documentFormat: DocumentFormat = js.native
  /**
    * Gets or sets the file name.
    */
  var fileName: String = js.native
  /**
    * Gets or sets the file's folder name.
    */
  var folderPath: String = js.native
}

object RichEditFileInfo {
  @scala.inline
  def apply(documentFormat: DocumentFormat, fileName: String, folderPath: String): RichEditFileInfo = {
    val __obj = js.Dynamic.literal(documentFormat = documentFormat.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichEditFileInfo]
  }
  @scala.inline
  implicit class RichEditFileInfoOps[Self <: RichEditFileInfo] (val x: Self) extends AnyVal {
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
    def setDocumentFormat(value: DocumentFormat): Self = this.set("documentFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderPath(value: String): Self = this.set("folderPath", value.asInstanceOf[js.Any])
  }
  
}

