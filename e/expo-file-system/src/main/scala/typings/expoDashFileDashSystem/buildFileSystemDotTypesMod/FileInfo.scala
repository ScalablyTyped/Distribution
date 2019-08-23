package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

import typings.expoDashFileDashSystem.expoDashFileDashSystemNumbers.`false`
import typings.expoDashFileDashSystem.expoDashFileDashSystemNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  var exists: js.UndefOr[`false` | `true`] = js.undefined
  var isDirectory: js.UndefOr[Boolean | `false`] = js.undefined
  var md5: js.UndefOr[String] = js.undefined
  var modificationTime: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object FileInfo {
  @scala.inline
  def apply(
    exists: `true` = null,
    isDirectory: js.UndefOr[Boolean] = js.undefined,
    md5: String = null,
    modificationTime: Int | Double = null,
    size: Int | Double = null,
    uri: String = null
  ): FileInfo = {
    val __obj = js.Dynamic.literal()
    if (exists != null) __obj.updateDynamic("exists")(exists)
    if (!js.isUndefined(isDirectory)) __obj.updateDynamic("isDirectory")(isDirectory)
    if (md5 != null) __obj.updateDynamic("md5")(md5)
    if (modificationTime != null) __obj.updateDynamic("modificationTime")(modificationTime.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[FileInfo]
  }
}

