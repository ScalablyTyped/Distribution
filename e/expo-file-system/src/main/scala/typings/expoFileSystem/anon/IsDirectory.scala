package typings.expoFileSystem.anon

import typings.expoFileSystem.expoFileSystemBooleans.`false`
import typings.expoFileSystem.fileSystemTypesMod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsDirectory extends FileInfo {
  var exists: `false` = js.native
  var isDirectory: `false` = js.native
  var md5: js.UndefOr[scala.Nothing] = js.native
  var modificationTime: js.UndefOr[scala.Nothing] = js.native
  var size: js.UndefOr[scala.Nothing] = js.native
  var uri: String = js.native
}

object IsDirectory {
  @scala.inline
  def apply(exists: `false`, isDirectory: `false`, uri: String): IsDirectory = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDirectory]
  }
  @scala.inline
  implicit class IsDirectoryOps[Self <: IsDirectory] (val x: Self) extends AnyVal {
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
    def setExists(value: `false`): Self = this.set("exists", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDirectory(value: `false`): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

