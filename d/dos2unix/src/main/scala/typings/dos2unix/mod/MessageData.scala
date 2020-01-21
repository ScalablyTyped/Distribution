package typings.dos2unix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageData extends FileData {
  var message: String
}

object MessageData {
  @scala.inline
  def apply(file: String, message: String): MessageData = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageData]
  }
}

