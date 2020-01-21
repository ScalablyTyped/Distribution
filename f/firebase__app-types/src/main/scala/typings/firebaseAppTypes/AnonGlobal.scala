package typings.firebaseAppTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobal extends js.Object {
  var global: Boolean
}

object AnonGlobal {
  @scala.inline
  def apply(global: Boolean): AnonGlobal = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGlobal]
  }
}

