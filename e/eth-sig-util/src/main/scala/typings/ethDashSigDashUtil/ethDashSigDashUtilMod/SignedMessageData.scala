package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedMessageData[T] extends MessageData[T] {
  var sig: String
}

object SignedMessageData {
  @scala.inline
  def apply[T](data: T, sig: String): SignedMessageData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sig = sig)
  
    __obj.asInstanceOf[SignedMessageData[T]]
  }
}

