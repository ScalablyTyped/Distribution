package typings.easyApiRequest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cb extends js.Object {
  var cb: js.Any
  var opts: js.Any
}

object Cb {
  @scala.inline
  def apply(cb: js.Any, opts: js.Any): Cb = {
    val __obj = js.Dynamic.literal(cb = cb.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cb]
  }
}

