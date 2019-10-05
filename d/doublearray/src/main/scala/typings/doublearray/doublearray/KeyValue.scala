package typings.doublearray.doublearray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue extends js.Object {
  var k: String
  var v: Double
}

object KeyValue {
  @scala.inline
  def apply(k: String, v: Double): KeyValue = {
    val __obj = js.Dynamic.literal(k = k, v = v)
  
    __obj.asInstanceOf[KeyValue]
  }
}

