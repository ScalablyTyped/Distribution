package typings.ejson.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  var keyOrderSensitive: Boolean
}

object CloneOptions {
  @scala.inline
  def apply(keyOrderSensitive: Boolean): CloneOptions = {
    val __obj = js.Dynamic.literal(keyOrderSensitive = keyOrderSensitive)
  
    __obj.asInstanceOf[CloneOptions]
  }
}

