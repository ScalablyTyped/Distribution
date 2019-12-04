package typings.dojo.dojox.NodeList.delegate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If a value is passed, allows seting the value property of form elements in this
  * NodeList, or properly selecting/checking the right value for radio/checkbox/select
  * elements. If no value is passed, the value of the first node in this NodeList
  * is returned.
  *
  * @param value
  */
@js.native
trait `val` extends js.Object {
  def apply(value: String): js.Any = js.native
  def apply(value: js.Array[_]): js.Any = js.native
}

