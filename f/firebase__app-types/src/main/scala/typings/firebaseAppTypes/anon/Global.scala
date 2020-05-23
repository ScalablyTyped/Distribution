package typings.firebaseAppTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Global extends js.Object {
  var global: Boolean
}

object Global {
  @scala.inline
  def apply(global: Boolean): Global = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
}

