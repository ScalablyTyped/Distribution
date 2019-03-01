package typings
package fileDashTypeLib.fileDashTypeMod.FileTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypeResult extends js.Object {
  var ext: java.lang.String
  var mime: java.lang.String
}

object FileTypeResult {
  @scala.inline
  def apply(ext: java.lang.String, mime: java.lang.String): FileTypeResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ext")(ext)
    __obj.updateDynamic("mime")(mime)
    __obj.asInstanceOf[FileTypeResult]
  }
}

