package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageData[T] extends js.Object {
  var data: T
}

object MessageData {
  @scala.inline
  def apply[T](data: T): MessageData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageData[T]]
  }
}

