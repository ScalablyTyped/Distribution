package typings.easyXapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Partial extends js.Object {
  var partial: Boolean
}

object Partial {
  @scala.inline
  def apply(partial: Boolean): Partial = {
    val __obj = js.Dynamic.literal(partial = partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partial]
  }
}

