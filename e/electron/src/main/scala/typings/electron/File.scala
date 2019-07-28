package typings.electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    * The real path to the file on the users filesystem
    */
  var path: String
}

object File {
  @scala.inline
  def apply(path: String): File = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[File]
  }
}

