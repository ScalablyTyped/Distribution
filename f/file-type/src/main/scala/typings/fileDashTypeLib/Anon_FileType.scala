package typings
package fileDashTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileType extends js.Object {
  val fileType: js.UndefOr[fileDashTypeLib.fileDashTypeMod.FileTypeResult] = js.undefined
}

object Anon_FileType {
  @scala.inline
  def apply(fileType: fileDashTypeLib.fileDashTypeMod.FileTypeResult = null): Anon_FileType = {
    val __obj = js.Dynamic.literal()
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    __obj.asInstanceOf[Anon_FileType]
  }
}

