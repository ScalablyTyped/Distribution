package typings.ghostStorageBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var path: String
}

object ReadOptions {
  @scala.inline
  def apply(path: String): ReadOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadOptions]
  }
}

