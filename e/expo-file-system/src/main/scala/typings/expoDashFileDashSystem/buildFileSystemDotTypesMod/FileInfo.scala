package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

import typings.expoDashFileDashSystem.expoDashFileDashSystemBooleans.`false`
import typings.expoDashFileDashSystem.expoDashFileDashSystemBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expoDashFileDashSystem.Anon_Exists
  - typings.expoDashFileDashSystem.Anon_ExistsFalse
*/
trait FileInfo extends js.Object

object FileInfo {
  @scala.inline
  def Anon_Exists(
    exists: `true`,
    isDirectory: Boolean,
    modificationTime: Double,
    size: Double,
    uri: String,
    md5: String = null
  ): FileInfo = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (md5 != null) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
  @scala.inline
  def Anon_ExistsFalse(
    exists: `false`,
    isDirectory: `false`,
    uri: String,
    md5: js.UndefOr[scala.Nothing] = js.undefined,
    modificationTime: js.UndefOr[scala.Nothing] = js.undefined,
    size: js.UndefOr[scala.Nothing] = js.undefined
  ): FileInfo = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(md5)) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    if (!js.isUndefined(modificationTime)) __obj.updateDynamic("modificationTime")(modificationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
}

