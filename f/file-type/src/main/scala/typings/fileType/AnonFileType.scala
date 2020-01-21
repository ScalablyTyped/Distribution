package typings.fileType

import typings.fileType.mod.FileTypeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileType extends js.Object {
  val fileType: js.UndefOr[FileTypeResult] = js.undefined
}

object AnonFileType {
  @scala.inline
  def apply(fileType: FileTypeResult = null): AnonFileType = {
    val __obj = js.Dynamic.literal()
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileType]
  }
}

