package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDescription extends js.Object {
  val anonymous: Boolean = js.native
  val inputs: js.Array[ParamType] = js.native
  val name: String = js.native
  val signature: String = js.native
  val topic: String = js.native
  def decode(data: String): js.Any = js.native
  def decode(data: String, topics: js.Array[String]): js.Any = js.native
  def encodeTopics(params: js.Array[_]): js.Array[String] = js.native
}

