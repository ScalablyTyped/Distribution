package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDescription extends js.Object {
  val name: String
  val signature: String
  val topic: String
  val values: js.Array[_]
}

object LogDescription {
  @scala.inline
  def apply(name: String, signature: String, topic: String, values: js.Array[_]): LogDescription = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogDescription]
  }
}

