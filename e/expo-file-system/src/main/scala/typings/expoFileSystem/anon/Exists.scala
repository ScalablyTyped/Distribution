package typings.expoFileSystem.anon

import typings.expoFileSystem.expoFileSystemBooleans.`true`
import typings.expoFileSystem.fileSystemTypesMod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exists extends FileInfo {
  var exists: `true` = js.native
  var isDirectory: Boolean = js.native
  var md5: js.UndefOr[String] = js.native
  var modificationTime: Double = js.native
  var size: Double = js.native
  var uri: String = js.native
}

object Exists {
  @scala.inline
  def apply(exists: `true`, isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): Exists = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exists]
  }
  @scala.inline
  implicit class ExistsOps[Self <: Exists] (val x: Self) extends AnyVal {
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
    def setExists(value: `true`): Self = this.set("exists", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setModificationTime(value: Double): Self = this.set("modificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd5(value: String): Self = this.set("md5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5: Self = this.set("md5", js.undefined)
  }
  
}

