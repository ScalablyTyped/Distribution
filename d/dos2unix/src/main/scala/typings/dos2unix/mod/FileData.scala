package typings.dos2unix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileData extends js.Object {
  var file: String
}

object FileData {
  @scala.inline
  def apply(file: String): FileData = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileData]
  }
}

