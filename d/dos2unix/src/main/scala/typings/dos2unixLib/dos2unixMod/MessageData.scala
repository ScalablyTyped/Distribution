package typings
package dos2unixLib.dos2unixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageData extends FileData {
  var message: java.lang.String
}

object MessageData {
  @scala.inline
  def apply(file: java.lang.String, message: java.lang.String): MessageData = {
    val __obj = js.Dynamic.literal(file = file, message = message)
  
    __obj.asInstanceOf[MessageData]
  }
}

