package typings
package ethDashSigDashUtilLib.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedMessageData[T] extends MessageData[T] {
  var sig: java.lang.String
}

object SignedMessageData {
  @scala.inline
  def apply[T](data: T, sig: java.lang.String): SignedMessageData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sig = sig)
  
    __obj.asInstanceOf[SignedMessageData[T]]
  }
}

