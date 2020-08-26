package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoundUploadItems extends UploadFilter {
  /**
    * the name of the file
    */
  var name: js.UndefOr[String] = js.native
  /**
    * the size of the file
    */
  var size: js.UndefOr[String] = js.native
}

object FoundUploadItems {
  @scala.inline
  def apply(): FoundUploadItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoundUploadItems]
  }
  @scala.inline
  implicit class FoundUploadItemsOps[Self <: FoundUploadItems] (val x: Self) extends AnyVal {
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
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

