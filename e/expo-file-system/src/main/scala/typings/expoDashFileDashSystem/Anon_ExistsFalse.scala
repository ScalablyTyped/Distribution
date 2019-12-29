package typings.expoDashFileDashSystem

import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.FileInfo
import typings.expoDashFileDashSystem.expoDashFileDashSystemBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExistsFalse extends FileInfo {
  var exists: `false`
  var isDirectory: `false`
  var md5: js.UndefOr[scala.Nothing] = js.undefined
  var modificationTime: js.UndefOr[scala.Nothing] = js.undefined
  var size: js.UndefOr[scala.Nothing] = js.undefined
  var uri: String
}

object Anon_ExistsFalse {
  @scala.inline
  def apply(
    exists: `false`,
    isDirectory: `false`,
    uri: String,
    md5: js.UndefOr[scala.Nothing] = js.undefined,
    modificationTime: js.UndefOr[scala.Nothing] = js.undefined,
    size: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ExistsFalse = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(md5)) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    if (!js.isUndefined(modificationTime)) __obj.updateDynamic("modificationTime")(modificationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExistsFalse]
  }
}

