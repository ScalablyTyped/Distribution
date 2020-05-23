package typings.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelable extends js.Object {
  var cancelable: Boolean
}

object Cancelable {
  @scala.inline
  def apply(cancelable: Boolean): Cancelable = {
    val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelable]
  }
}

