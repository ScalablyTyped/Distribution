package typings.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /** `File` set constituting the `Source` bundle. */
  var files: js.UndefOr[js.Array[File]] = js.native
}

object Source {
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
  
}

