package typings.fileDashType

import typings.fileDashType.fileDashTypeMod.FileTypeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileType extends js.Object {
  val fileType: js.UndefOr[FileTypeResult] = js.undefined
}

object Anon_FileType {
  @scala.inline
  def apply(fileType: FileTypeResult = null): Anon_FileType = {
    val __obj = js.Dynamic.literal()
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FileType]
  }
}

