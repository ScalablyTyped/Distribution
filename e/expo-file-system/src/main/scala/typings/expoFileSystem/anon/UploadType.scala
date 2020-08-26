package typings.expoFileSystem.anon

import typings.expoFileSystem.fileSystemTypesMod.FileSystemUploadType.BINARY_CONTENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadType extends js.Object {
  var uploadType: js.UndefOr[BINARY_CONTENT] = js.native
}

object UploadType {
  @scala.inline
  def apply(): UploadType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadType]
  }
  @scala.inline
  implicit class UploadTypeOps[Self <: UploadType] (val x: Self) extends AnyVal {
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
    def setUploadType(value: BINARY_CONTENT): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
  }
  
}

