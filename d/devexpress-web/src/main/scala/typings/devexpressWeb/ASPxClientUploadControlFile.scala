package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client file that corresponds to a particular file selected for uploading in the upload control.
  */
@js.native
trait ASPxClientUploadControlFile extends js.Object {
  /**
    * Gets the name of the file selected for uploading.
    */
  var name: String = js.native
  /**
    * Gets the size of the file selected for uploading.
    */
  var size: Double = js.native
  /**
    * Provides access to the file as a native Javascript object.
    */
  var sourceFileObject: js.Any = js.native
}

object ASPxClientUploadControlFile {
  @scala.inline
  def apply(name: String, size: Double, sourceFileObject: js.Any): ASPxClientUploadControlFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourceFileObject = sourceFileObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFile]
  }
  @scala.inline
  implicit class ASPxClientUploadControlFileOps[Self <: ASPxClientUploadControlFile] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFileObject(value: js.Any): Self = this.set("sourceFileObject", value.asInstanceOf[js.Any])
  }
  
}

