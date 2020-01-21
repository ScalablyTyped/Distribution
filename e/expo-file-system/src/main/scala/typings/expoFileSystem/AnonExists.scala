package typings.expoFileSystem

import typings.expoFileSystem.expoFileSystemBooleans.`true`
import typings.expoFileSystem.fileSystemTypesMod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExists extends FileInfo {
  var exists: `true`
  var isDirectory: Boolean
  var md5: js.UndefOr[String] = js.undefined
  var modificationTime: Double
  var size: Double
  var uri: String
}

object AnonExists {
  @scala.inline
  def apply(
    exists: `true`,
    isDirectory: Boolean,
    modificationTime: Double,
    size: Double,
    uri: String,
    md5: String = null
  ): AnonExists = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (md5 != null) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExists]
  }
}

