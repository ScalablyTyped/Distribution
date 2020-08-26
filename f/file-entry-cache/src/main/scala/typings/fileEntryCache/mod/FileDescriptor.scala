package typings.fileEntryCache.mod

import typings.fileEntryCache.anon.Hash
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDescriptor extends js.Object {
  val changed: js.UndefOr[Boolean] = js.native
  val err: js.UndefOr[Error] = js.native
  val key: String = js.native
  val meta: js.UndefOr[Hash] = js.native
  val notFound: Boolean = js.native
}

object FileDescriptor {
  @scala.inline
  def apply(key: String, notFound: Boolean): FileDescriptor = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptor]
  }
  @scala.inline
  implicit class FileDescriptorOps[Self <: FileDescriptor] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotFound(value: Boolean): Self = this.set("notFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setChanged(value: Boolean): Self = this.set("changed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChanged: Self = this.set("changed", js.undefined)
    @scala.inline
    def setErr(value: Error): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    @scala.inline
    def setMeta(value: Hash): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
  }
  
}

