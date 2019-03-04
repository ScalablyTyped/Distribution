package typings
package doublearrayLib.doublearrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue extends js.Object {
  var k: java.lang.String
  var v: scala.Double
}

object KeyValue {
  @scala.inline
  def apply(k: java.lang.String, v: scala.Double): KeyValue = {
    val __obj = js.Dynamic.literal(k = k, v = v)
  
    __obj.asInstanceOf[KeyValue]
  }
}

