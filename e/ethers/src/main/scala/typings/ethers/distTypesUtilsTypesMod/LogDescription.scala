package typings.ethers.distTypesUtilsTypesMod

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
    val __obj = js.Dynamic.literal(name = name, signature = signature, topic = topic, values = values)
  
    __obj.asInstanceOf[LogDescription]
  }
}

