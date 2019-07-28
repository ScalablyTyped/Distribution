package typings.fingerprintjs2.fingerprintjs2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  var key: String
  var value: js.Any
}

object Component {
  @scala.inline
  def apply(key: String, value: js.Any): Component = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[Component]
  }
}

