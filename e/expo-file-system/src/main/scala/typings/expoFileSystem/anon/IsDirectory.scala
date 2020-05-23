package typings.expoFileSystem.anon

import typings.expoFileSystem.expoFileSystemBooleans.`false`
import typings.expoFileSystem.fileSystemTypesMod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsDirectory extends FileInfo {
  var exists: `false`
  var isDirectory: `false`
  var md5: js.UndefOr[scala.Nothing] = js.undefined
  var modificationTime: js.UndefOr[scala.Nothing] = js.undefined
  var size: js.UndefOr[scala.Nothing] = js.undefined
  var uri: String
}

object IsDirectory {
  @scala.inline
  def apply(exists: `false`, isDirectory: `false`, uri: String): IsDirectory = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDirectory]
  }
}

