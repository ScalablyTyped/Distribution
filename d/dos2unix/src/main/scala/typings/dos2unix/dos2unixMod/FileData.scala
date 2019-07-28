package typings.dos2unix.dos2unixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileData extends js.Object {
  var file: String
}

object FileData {
  @scala.inline
  def apply(file: String): FileData = {
    val __obj = js.Dynamic.literal(file = file)
  
    __obj.asInstanceOf[FileData]
  }
}

